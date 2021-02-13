// Rubén Cantos i Arnau Solà

grammar main;

@header {
    import java.io.*;
    import java.util.Vector;
}

// Atributs i mètodes de la classe ANTLR
@parser::members {
    SymTable<Registre> TS = new SymTable<Registre>(1000);
    boolean error = false;
    Bytecode x;
    int contVar = 1;
    Long saltLinia;

    //override method
    public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e)    {
         super.notifyErrorListeners(offendingToken,msg,e);
         error=true;
    }
}


// Regles sintàctiques
inici
@init   {
            x = new Bytecode("Compilat");
            saltLinia=x.addConstant("S","\n");
            Vector<Long> codeMain = new Vector<Long>(10);
        }
        : blocDeclaracioConstants? blocDeclaracioTipus? blocAccionsFuncions? p=programa blocImplementacio?
        {
            codeMain.addAll($p.codeMain);
            codeMain.add(x.RETURN);
            x.addMainCode(10L,10L,codeMain);
            x.write();
            x.show();
        };

blocDeclaracioConstants : TK_PC_CONSTANTS (vc=variableConstants)* TK_PC_FCONSTANTS;

variableConstants : tb=tipusBasic i=TK_IDENT TK_ASSIGNACIO vtb=valorTipusBasic TK_SEMI
                    {
                        if($tb.t != $vtb.t) {
                            error = true;
                            System.out.println("Error al assignar constant a la línia " + $i.line);
                            // notifyErrorListeners(variableConstants, "El tipus de tipusBasic i valorTipusBasic
                        }
                        else {
                            if(TS.existeix($i.text)) {
                                error = true;
                                System.out.println("La constant ja existeix, línia " + $i.line);
                            }
                            else
                                TS.inserir($i.text, new Registre($i.text, $tb.t, x.addConstName($i.text, String.valueOf($tb.t), $vtb.v).intValue()));
                        }
                    };

tipusBasic returns [char t] : TK_TB_BOOLEA { $t = 'Z'; }
                            | TK_TB_REAL { $t = 'F'; }
                            | TK_TB_ENTER { $t = 'I'; }
                            | TK_TB_CAR { $t = 'C'; }
                            | TK_TB_DATA { $t = 'D'; };

valorTipusBasic returns [char t, String v, Vector<Long> codeMain]
@init { $codeMain = new Vector<Long>(10); }: tk=TK_BOOLEA { $t = 'Z'; $v = $tk.text; $codeMain.add(x.BIPUSH); if($v.equals("cert")) $codeMain.add(1L); else $codeMain.add(0L); }
                                            | TK_DATA { $t = 'D'; }
                                            | ve=valorEnter {$t = $ve.t; $v = $ve.v; $codeMain.addAll($ve.codeMain); }
                                            | tk=TK_REAL
                                                {
                                                    $t = 'F';
                                                    Long adr = 0L;

                                                    if($tk.text.contains("E")) {
                                                        float resultat = 0;
                                                        int p = $tk.text.indexOf("E");
                                                        if($tk.text.charAt(p+1) == '-') {
                                                            int num = Integer.parseInt($tk.text.substring(p+2));
                                                            float valor = Float.parseFloat($tk.text.substring(0, p));

                                                            resultat = valor / (float)Math.pow(10,num);
                                                        } else {
                                                            int num = Integer.parseInt($tk.text.substring(p+1));
                                                            float valor = Float.parseFloat($tk.text.substring(0, p));

                                                            resultat = valor * (float)Math.pow(10,num);
                                                        }

                                                        adr = x.addConstant("F",String.valueOf(resultat));
                                                        $v = String.valueOf(resultat);
                                                    }
                                                    else {
                                                        adr = x.addConstant("F",$tk.text);
                                                        $v = $tk.text;
                                                    }

                                                    $codeMain.add(x.LDC_W);
                                                    $codeMain.add(x.nByte(adr,2));
                                                    $codeMain.add(x.nByte(adr,1));
                                                }
                                            | tk=TK_CAR
                                                { $t = 'C'; $v = String.valueOf($tk.text.charAt(1));
                                                Long adr = x.addConstant("C",$v);
                                                $codeMain.add(x.LDC_W);
                                                $codeMain.add(x.nByte(adr,2));
                                                $codeMain.add(x.nByte(adr,1));
                                                $codeMain.add(x.I2C);
                                                };

valorEnter returns [char t, String v, Vector<Long> codeMain] locals [Long adr]
@init { $codeMain = new Vector<Long>(10); } : TK_ZERO
                                            {
                                                $t = 'I'; $v = "0";
                                                $adr = x.addConstant("I","0");
                                                $codeMain.add(x.LDC_W);
                                                $codeMain.add(x.nByte($adr,2));
                                                $codeMain.add(x.nByte($adr,1));
                                            }
                                            | tk=TK_ENTER
                                            {
                                                $t = 'I'; $v = $tk.text;
                                                $adr = x.addConstant("I",$tk.text);
                                                $codeMain.add(x.LDC_W);
                                                $codeMain.add(x.nByte($adr,2));
                                                $codeMain.add(x.nByte($adr,1));
                                            };

blocDeclaracioTipus : TK_PC_TIPUS (tipus)* TK_PC_FTIPUS;
tipus : TK_IDENT TK_DOSPUNTS (tipusBasic | tipusBasicVector | tipusBasicTupla) TK_SEMI;
tipusBasicVector : TK_PC_VECTOR tipusBasic TK_PC_MIDA valorEnter (TK_PC_INICI valorEnter)?;
tipusBasicTupla : TK_PC_TUPLA campTupla+ TK_PC_FTUPLA;
campTupla : TK_IDENT TK_DOSPUNTS tipusBasic TK_SEMI;

blocAccionsFuncions : (declaracioFuncio | declaracioAccio)*;
declaracioFuncio : TK_PC_FUNCIO TK_IDENT TK_LPAREN parametres? TK_RPAREN TK_PC_RETORNA tipusBasic TK_SEMI;
parametres: parametre (TK_COMA parametre)*;
parametre: (TK_PC_ENT | TK_PC_ENTSOR)? TK_IDENT TK_DOSPUNTS (tipusBasic | TK_IDENT);
declaracioAccio : TK_PC_ACCIO TK_IDENT TK_LPAREN parametres? TK_RPAREN TK_SEMI;

programa returns [Vector<Long> codeMain]
@init { $codeMain = new Vector<Long>(10); } : TK_PC_PROGRAMA TK_IDENT (bdv=blocDeclaracioVariables { $codeMain.addAll($bdv.codeMain); })? (s=sentencia { $codeMain.addAll($s.codeMain); } )* TK_PC_FPROGRAMA;

blocDeclaracioVariables returns [Vector<Long> codeMain]
@init { $codeMain = new Vector<Long>(10); } : TK_PC_VARIABLES (v=variable { $codeMain.addAll($v.codeMain); } )* TK_PC_FVARIABLES;

variable returns [Vector<Long> codeMain] locals [String vars]
@init { $codeMain = new Vector<Long>(10); }: i=TK_IDENT { $vars = $i.text; } (TK_COMA j=TK_IDENT { $vars += ","+$j.text; })* TK_DOSPUNTS (tb=tipusBasic
                                {
                                    String[] v = $vars.split(",");
                                    for(int i = 0; i < v.length; i++) {
                                        if(!TS.existeix(v[i])) {
                                            Registre r = new Registre(v[i], $tb.t);
                                            TS.inserir(v[i], r);
                                        } else {
                                            error = true;
                                            System.out.println("Error al declarar una variable ja existent a la línia " + $i.line);
                                        }
                                    }
                                }
                                | TK_IDENT) TK_SEMI;

ifThenElse returns [char t, Vector<Long> codeMain]
@init { $codeMain = new Vector<Long>(10); }: c=expressio1 i=TK_INTERROGANT
            {
                if($c.t != 'Z') {
                    error = true;
                    System.out.println("Error al assignar una condició no booleana a la línia " + $i.line);
                } else {
                    $codeMain.addAll($c.codeMain);
                }
            }
            ec=expressio1 TK_DOSPUNTS ef=expressio1
            {
                if($ec.t != $ef.t && !(($ec.t == 'F' && $ef.t == 'I') || ($ec.t == 'I' && $ef.t == 'F'))) {
                    error = true;
                    System.out.println("Error de tipus a expressióCert i expressióFals a la línia " + $i.line);
                } else {

                    $codeMain.add(x.IF_ICMPGT);
                    Long salt=7L;
                    $codeMain.add(x.nByte(salt,2));
                    $codeMain.add(x.nByte(salt,1));
                    $codeMain.addAll($ef.codeMain);
                    $codeMain.add(x.GOTO);
                    salt=4L;
                    $codeMain.add(x.nByte(salt,2));
                    $codeMain.add(x.nByte(salt,1));
                    $codeMain.addAll($ec.codeMain);

                    if($ec.t != $ef.t)
                        $t = 'F';
                    else
                        $t = $ec.t;
                }
            };

expressio returns [char t, Vector<Long> codeMain]
@init { $codeMain = new Vector<Long>(10); }: ite=ifThenElse { $t = $ite.t; $codeMain.addAll($ite.codeMain); } | e=expressio1 { $t = $e.t; $codeMain.addAll($e.codeMain); System.out.println($e.t); };

expressio1 returns [char t, Vector<Long> codeMain] locals [int p]
@init { $codeMain = new Vector<Long>(10); }: e1=expressio2 { $t = $e1.t; $codeMain.addAll($e1.codeMain); }
                                            ((i=TK_AND { $p = 0; }| i=TK_OR { $p = 1; }) e2=expressio2
                                            {
                                                if($t == 'Z' && $e2.t == 'Z') {
                                                    $codeMain.addAll($e2.codeMain);

                                                    if($p == 0) {
                                                        $codeMain.add(x.IAND);

                                                        $t = 'Z';
                                                    } else {
                                                        $codeMain.add(x.IOR);

                                                        $t = 'Z';
                                                    }
                                                }
                                                else {
                                                    error = true;
                                                    System.out.println("Conflicte de tipus a la línia " + $i.line);
                                                }
                                            }
                                            )*;

expressio2 returns [char t, Vector<Long> codeMain]
@init { $codeMain = new Vector<Long>(10); } : e1=expressio3 { $t = $e1.t; $codeMain.addAll($e1.codeMain); }(op=operadorsBooleans e2=expressio3
                                {
                                    if((($t == 'I' || $t == 'F') && ($e2.t == 'I' || $e2.t == 'F')) || ($t == 'C' && $e2.t == 'C')) {
                                        if ($t == 'F' || $e2.t == 'F'){
                                            if ($t != 'F'){
                                                $codeMain.add(x.I2F);
                                            }
                                            $codeMain.addAll($e2.codeMain);
                                            if ($e2.t != 'F'){
                                                $codeMain.add(x.I2F);
                                            }
                                            $codeMain.add(x.FCMPG);
                                            if ($op.o == 0){
                                                $codeMain.add(x.IFEQ);
                                                Long salt=8L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(0L);
                                                $codeMain.add(x.GOTO);
                                                salt=5L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(1L);
                                            }
                                            else if ($op.o == 1){
                                                $codeMain.add(x.IFEQ);
                                                Long salt=8L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(1L);
                                                $codeMain.add(x.GOTO);
                                                salt=5L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(0L);
                                            }
                                            else if ($op.o == 2){
                                                $codeMain.add(x.IFLT);
                                                Long salt=8L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(0L);
                                                $codeMain.add(x.GOTO);
                                                salt=5L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(1L);
                                            }
                                            else if ($op.o == 3){
                                                $codeMain.add(x.IFLE);
                                                Long salt=8L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(0L);
                                                $codeMain.add(x.GOTO);
                                                salt=5L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(1L);
                                            }
                                            else if ($op.o == 4){
                                                $codeMain.add(x.IFGT);
                                                Long salt=8L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(0L);
                                                $codeMain.add(x.GOTO);
                                                salt=5L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(1L);
                                            }
                                            else if ($op.o == 5){
                                                $codeMain.add(x.IFGE);
                                                Long salt=8L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(0L);
                                                $codeMain.add(x.GOTO);
                                                salt=5L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(1L);
                                            }
                                        }
                                        else if (($t == 'I' && $e2.t == 'I') || ($t == 'C' && $e2.t == 'C')){
                                            $codeMain.addAll($e2.codeMain);
                                            if ($op.o == 0){
                                                $codeMain.add(x.IF_ICMPEQ);
                                                Long salt=8L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(0L);
                                                $codeMain.add(x.GOTO);
                                                salt=5L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(1L);
                                            }
                                            else if ($op.o == 1){
                                                $codeMain.add(x.IF_ICMPEQ);
                                                Long salt=8L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(1L);
                                                $codeMain.add(x.GOTO);
                                                salt=5L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(0L);
                                            }
                                            else if ($op.o == 2){
                                                $codeMain.add(x.IF_ICMPLT);
                                                Long salt=8L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(0L);
                                                $codeMain.add(x.GOTO);
                                                salt=5L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(1L);
                                            }
                                            else if ($op.o == 3){
                                                $codeMain.add(x.IF_ICMPLE);
                                                Long salt=8L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(0L);
                                                $codeMain.add(x.GOTO);
                                                salt=5L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(1L);
                                            }
                                            else if ($op.o == 4){
                                                $codeMain.add(x.IF_ICMPGT);
                                                Long salt=8L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(0L);
                                                $codeMain.add(x.GOTO);
                                                salt=5L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(1L);
                                            }
                                            else if ($op.o == 5){
                                                $codeMain.add(x.IF_ICMPGE);
                                                Long salt=8L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(0L);
                                                $codeMain.add(x.GOTO);
                                                salt=5L;
                                                $codeMain.add(x.nByte(salt,2));
                                                $codeMain.add(x.nByte(salt,1));
                                                $codeMain.add(x.BIPUSH);
                                                $codeMain.add(1L);
                                            }
                                        }
                                        $t = 'Z';
                                    }
                                    else if($t == 'Z' && $e2.t == 'Z' && ($op.o == 0 || $op.o == 1)){
                                        $codeMain.addAll($e2.codeMain);
                                        if ($op.o == 0){
                                            $codeMain.add(x.IF_ICMPEQ);
                                            Long salt=8L;
                                            $codeMain.add(x.nByte(salt,2));
                                            $codeMain.add(x.nByte(salt,1));
                                            $codeMain.add(x.BIPUSH);
                                            $codeMain.add(0L);
                                            $codeMain.add(x.GOTO);
                                            salt=5L;
                                            $codeMain.add(x.nByte(salt,2));
                                            $codeMain.add(x.nByte(salt,1));
                                            $codeMain.add(x.BIPUSH);
                                            $codeMain.add(1L);
                                        }
                                        else if ($op.o == 1){
                                            $codeMain.add(x.IF_ICMPEQ);
                                            Long salt=8L;
                                            $codeMain.add(x.nByte(salt,2));
                                            $codeMain.add(x.nByte(salt,1));
                                            $codeMain.add(x.BIPUSH);
                                            $codeMain.add(1L);
                                            $codeMain.add(x.GOTO);
                                            salt=5L;
                                            $codeMain.add(x.nByte(salt,2));
                                            $codeMain.add(x.nByte(salt,1));
                                            $codeMain.add(x.BIPUSH);
                                            $codeMain.add(0L);
                                        }

                                        $t = 'Z';

                                    }
                                    else {
                                        error = true;
                                        System.out.println("Conflicte de tipus amb operadors booleans");
                                    }
                                }
                                )*;


operadorsBooleans returns [int o]: TK_OP_IGUALTAT {$o = 0;} | TK_OP_DESIGUALTAT {$o = 1;}| TK_MESPETIT {$o = 2;}| TK_MESPETIT_IGUAL {$o = 3;}| TK_MESGRAN {$o = 4;} | TK_MESGRAN_IGUAL {$o = 5;};

expressio3 returns [char t, Vector<Long> codeMain] locals [int p]
@init { $codeMain = new Vector<Long>(10); } : e1=expressio4 { $t = $e1.t;  $codeMain.addAll($e1.codeMain); }
                                                ((i=TK_OP_PLUS { $p = 0; } | i=TK_OP_MENYS { $p = 1; }) e2=expressio4
                                                {
                                                    if(($t == 'I' || $t == 'F') && ($e2.t == 'I' || $e2.t == 'F')) {
                                                        if($p == 0) {
                                                            if($t == 'F' || $e2.t == 'F'){
                                                                if($t != 'F'){
                                                                    $codeMain.add(x.I2F);
                                                                }
                                                                $codeMain.addAll($e2.codeMain);
                                                                if ($e2.t != 'F'){
                                                                    $codeMain.add(x.I2F);
                                                                }
                                                                $codeMain.add(x.FADD);
                                                                $t = 'F';
                                                            }
                                                            else {
                                                                $codeMain.addAll($e2.codeMain);
                                                                $codeMain.add(x.IADD);
                                                                $t = 'I';
                                                            }
                                                        }
                                                        else {
                                                            if($t == 'F' || $e2.t == 'F'){
                                                                if($t != 'F'){
                                                                    $codeMain.add(x.I2F);
                                                                }
                                                                $codeMain.addAll($e2.codeMain);
                                                                if ($e2.t != 'F'){
                                                                    $codeMain.add(x.I2F);
                                                                }
                                                                $codeMain.add(x.FSUB);
                                                                $t = 'F';
                                                            }
                                                            else{
                                                                $codeMain.addAll($e2.codeMain);
                                                                $codeMain.add(x.ISUB);
                                                                $t = 'I';
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        error = true;
                                                        System.out.println("Conflicte de tipus a la línia " + $i.line);
                                                    }
                                                }
                                                )*;

expressio4 returns [char t, Vector<Long> codeMain] locals [int p]
@init { $codeMain = new Vector<Long>(10); } : e1=expressio5 { $t = $e1.t; $codeMain.addAll($e1.codeMain); }
                                            ((i=TK_STAR { $p = 0; } | i=TK_OP_DIVISIO_REAL { $p = 1; } | i=TK_OP_DIVISIO_ENTERA { $p = 2; } | i=TK_OP_MODUL { $p = 3; }) e2=expressio5
                                            {
                                                if($p == 0 && ($t == 'I' || $t == 'F') && ($e2.t == 'I' || $e2.t == 'F')) {
                                                    if($t == 'F' || $e2.t == 'F') {
                                                        if($t != 'F') {
                                                            $codeMain.add(x.I2F);
                                                        }
                                                        $codeMain.addAll($e2.codeMain);
                                                        if($e2.t != 'F') {
                                                            $codeMain.add(x.I2F);
                                                        }
                                                        $codeMain.add(x.FMUL);

                                                        $t = 'F';
                                                    } else {
                                                        $codeMain.addAll($e2.codeMain);
                                                        $codeMain.add(x.IMUL);

                                                        $t = 'I';
                                                    }
                                                }
                                                else if($p == 1 && ($t == 'I' || $t == 'F') && ($e2.t == 'I' || $e2.t == 'F')) {
                                                    if($t != 'F') {
                                                        $codeMain.add(x.I2F);
                                                    }
                                                    $codeMain.addAll($e2.codeMain);
                                                    if($e2.t != 'F') {
                                                        $codeMain.add(x.I2F);
                                                    }
                                                    $codeMain.add(x.FDIV);

                                                    $t = 'F';
                                                }
                                                else if($p == 2 && $t == 'I'&& $e2.t == 'I') {
                                                    $codeMain.addAll($e2.codeMain);
                                                    $codeMain.add(x.IDIV);

                                                    $t = 'I';
                                                }
                                                else if($p == 3 && $t == 'I'&& $e2.t == 'I') {
                                                    $codeMain.addAll($e2.codeMain);
                                                    $codeMain.add(x.IREM);

                                                    $t = 'I';
                                                }
                                                else {
                                                    error = true;
                                                    System.out.println("Conflicte de tipus a la línia " + $i.line);
                                                }
                                            }
                                            )*;

expressio5 returns [char t, Vector<Long> codeMain] locals [int p]
@init { $codeMain = new Vector<Long>(10); } : { $p = 0; }(i=TK_NEGACIO { $p = 1; } | i=TK_OP_MENYS_UNARI { $p = 2; })? e=expressio6
                            {
                                $codeMain.addAll($e.codeMain);

                                if($p == 0) {
                                    $t = $e.t;
                                }
                                else if($p == 1 && $e.t == 'Z') {
                                    $t = $e.t;

                                    $codeMain.add(x.IFEQ);
                                    Long salt = 8L;
                                    $codeMain.add(x.nByte(salt,2));
                                    $codeMain.add(x.nByte(salt,1));
                                    $codeMain.add(x.BIPUSH);
                                    $codeMain.add(0L);
                                    $codeMain.add(x.GOTO);
                                    salt=5L;
                                    $codeMain.add(x.nByte(salt,2));
                                    $codeMain.add(x.nByte(salt,1));
                                    $codeMain.add(x.BIPUSH);
                                    $codeMain.add(1L);
                                }
                                else if($p == 2 && ($e.t == 'I' || $e.t == 'F')) {
                                    $t = $e.t;
                                    if($e.t == 'I') {
                                        $codeMain.add(x.INEG);
                                    } else {
                                        $codeMain.add(x.FNEG);
                                    }
                                }
                                else {
                                    error = true;
                                    System.out.println("Conflicte de tipus a la línia " + $i.line);
                                }
                            };

expressio6 returns [char t, Vector<Long> codeMain]
@init { $codeMain = new Vector<Long>(10); } : v=valor { $t = $v.t; $codeMain.addAll($v.codeMain); } | TK_LPAREN e=expressio { $t = $e.t; $codeMain.addAll($e.codeMain); } TK_RPAREN;

valor returns [char t, Vector<Long> codeMain]
@init { $codeMain = new Vector<Long>(10); } : vtb=valorTipusBasic { $t = $vtb.t; $codeMain.addAll($vtb.codeMain); } | TK_STRING { $t = 'S'; } | i=TK_IDENT
                                                {
                                                    if(TS.existeix($i.text)) {
                                                        Registre r = TS.obtenir($i.text);
                                                        $t = r.getTipus();

                                                        if($t == 'I' || $t == 'C' || $t == 'Z') {
                                                            $codeMain.add(x.ILOAD);
                                                        } else if($t == 'F') {
                                                            $codeMain.add(x.FLOAD);
                                                        }
                                                        $codeMain.add(new Long(r.getAdreca()));
                                                    } else {
                                                        error = true;
                                                        System.out.println("No existeix la variable a la línia " + $i.line);
                                                    }
                                                }
                                                | accesTupla | accesVector | cridaFuncio;


sentencia returns [Vector<Long> codeMain]
@init { $codeMain = new Vector<Long>(10); }: (a=asignacio { $codeMain.addAll($a.codeMain); } | e=escriure { $codeMain.addAll($e.codeMain); } | eln=escriureln { $codeMain.addAll($eln.codeMain); } |
                                                condicional | per | mentre | cridaAccio | l=llegir { $codeMain.addAll($l.codeMain); });

asignacio returns [Vector<Long> codeMain]
@init { $codeMain = new Vector<Long>(10); }: (i=TK_IDENT | accesTupla | accesVector) TK_ASSIGNACIO e=expressio TK_SEMI
                            {
                                if(!(TS.existeix($i.text) && TS.obtenir($i.text).tipus == $e.t)) {
                                    error = true;
                                    System.out.println("Error al assignar un valor a una variable a la línia " + $i.line);
                                } else {
                                    Registre r = TS.obtenir($i.text);

                                    if(r.getAdreca() == 0) {
                                        r.putAdreca(contVar);
                                        contVar++;
                                    }

                                    char t = r.getTipus();

                                    $codeMain.addAll($e.codeMain);

                                    if(t == 'I' || t == 'C' || t == 'Z') {
                                        $codeMain.add(x.ISTORE);
                                    } else if(t == 'F') {
                                        $codeMain.add(x.FSTORE);
                                    }

                                    $codeMain.add(new Long(r.getAdreca()));
                                }
                            };

condicional : i=TK_PC_SI e=expressio TK_PC_LLAVORS sentencia* (TK_PC_ALTRAMENT sentencia*)? TK_PC_FSI
                            {
                                if($e.t != 'Z') {
                                    error = true;
                                    System.out.println("Error al fer un condicional a la línia " + $i.line);
                                }
                            };
per : i=TK_PC_PER TK_IDENT TK_PC_DE e1=expressio TK_PC_FINS e2=expressio TK_PC_FER sentencia* TK_PC_FPER
                            {
                                if(!($e1.t == 'I' && ($e2.t == 'I'))) {
                                    error = true;
                                    System.out.println("Error al fer un per a la línia " + $i.line);
                                }
                            };
mentre : i=TK_PC_MENTRE e=expressio TK_PC_FER sentencia*
                            {
                                if($e.t != 'Z') {
                                    error = true;
                                    System.out.println("Error al fer un while a la línia " + $i.line);
                                }
                            };

llegir returns [Vector<Long> codeMain]
@init { $codeMain = new Vector<Long>(10); }: TK_PC_LLEGIR TK_LPAREN i=TK_IDENT TK_RPAREN TK_SEMI
            {
                if(TS.existeix($i.text)) {
                    Registre r = TS.obtenir($i.text);
                    char t = r.getTipus();

                    $codeMain.add(x.INVOKESTATIC);
                    if(t == 'I') {
                        $codeMain.add(x.nByte(x.mGetInt,2));
                        $codeMain.add(x.nByte(x.mGetInt,1));
                        $codeMain.add(x.ISTORE);
                        $codeMain.add(new Long(r.getAdreca()));
                    } else if(t == 'C') {
                        $codeMain.add(x.nByte(x.mGetChar,2));
                        $codeMain.add(x.nByte(x.mGetChar,1));
                        $codeMain.add(x.ISTORE);
                        $codeMain.add(new Long(r.getAdreca()));
                    } else if(t == 'F') {
                        $codeMain.add(x.nByte(x.mGetFloat,2));
                        $codeMain.add(x.nByte(x.mGetFloat,1));
                        $codeMain.add(x.FSTORE);
                        $codeMain.add(new Long(r.getAdreca()));
                    } else if(t == 'Z') {
                        $codeMain.add(x.nByte(x.mGetBoolean,2));
                        $codeMain.add(x.nByte(x.mGetBoolean,1));
                        $codeMain.add(x.FSTORE);
                        $codeMain.add(new Long(r.getAdreca()));
                    }
                }
            };

escriure returns [Vector<Long> codeMain]
@init { $codeMain = new Vector<Long>(10); }: i=TK_PC_ESCRIURE TK_LPAREN e1=expressio
            {
                $codeMain.addAll($e1.codeMain);
                $codeMain.add(x.INVOKESTATIC);
                if($e1.t == 'I') {
                    $codeMain.add(x.nByte(x.mPutInt,2));
                    $codeMain.add(x.nByte(x.mPutInt,1));
                } else if($e1.t == 'C') {
                    $codeMain.add(x.nByte(x.mPutChar,2));
                    $codeMain.add(x.nByte(x.mPutChar,1));
                } else if($e1.t == 'F') {
                    $codeMain.add(x.nByte(x.mPutFloat,2));
                    $codeMain.add(x.nByte(x.mPutFloat,1));
                } else if($e1.t == 'Z') {
                    $codeMain.add(x.nByte(x.mPutBoolean,2));
                    $codeMain.add(x.nByte(x.mPutBoolean,1));
                } else if($e1.t == 'S') {
                    $codeMain.add(x.nByte(x.mPutString,2));
                    $codeMain.add(x.nByte(x.mPutString,1));
                }
            }
            (TK_COMA e2=expressio
            {
               {
                   $codeMain.addAll($e2.codeMain);
                   $codeMain.add(x.INVOKESTATIC);
                   if($e2.t == 'I') {
                       $codeMain.add(x.nByte(x.mPutInt,2));
                       $codeMain.add(x.nByte(x.mPutInt,1));
                   } else if($e2.t == 'C') {
                       $codeMain.add(x.nByte(x.mPutChar,2));
                       $codeMain.add(x.nByte(x.mPutChar,1));
                   } else if($e2.t == 'F') {
                       $codeMain.add(x.nByte(x.mPutFloat,2));
                       $codeMain.add(x.nByte(x.mPutFloat,1));
                   } else if($e2.t == 'Z') {
                       $codeMain.add(x.nByte(x.mPutBoolean,2));
                       $codeMain.add(x.nByte(x.mPutBoolean,1));
                   } else if($e2.t == 'S') {
                       $codeMain.add(x.nByte(x.mPutString,2));
                       $codeMain.add(x.nByte(x.mPutString,1));
                   }
               }
            }
            )* TK_RPAREN TK_SEMI;

escriureln returns [Vector<Long> codeMain]
@init { $codeMain = new Vector<Long>(10); }: i=TK_PC_ESCRIURELN TK_LPAREN (e1=expressio
            {
                $codeMain.addAll($e1.codeMain);
                $codeMain.add(x.INVOKESTATIC);
                if($e1.t == 'I') {
                    $codeMain.add(x.nByte(x.mPutInt,2));
                    $codeMain.add(x.nByte(x.mPutInt,1));
                } else if($e1.t == 'C') {
                    $codeMain.add(x.nByte(x.mPutChar,2));
                    $codeMain.add(x.nByte(x.mPutChar,1));
                } else if($e1.t == 'F') {
                    $codeMain.add(x.nByte(x.mPutFloat,2));
                    $codeMain.add(x.nByte(x.mPutFloat,1));
                } else if($e1.t == 'Z') {
                    $codeMain.add(x.nByte(x.mPutBoolean,2));
                    $codeMain.add(x.nByte(x.mPutBoolean,1));
                } else if($e1.t == 'S') {
                    $codeMain.add(x.nByte(x.mPutString,2));
                    $codeMain.add(x.nByte(x.mPutString,1));
                }
            }
            (TK_COMA e2=expressio
            {
               {
                   $codeMain.addAll($e2.codeMain);
                   $codeMain.add(x.INVOKESTATIC);
                   if($e2.t == 'I') {
                       $codeMain.add(x.nByte(x.mPutInt,2));
                       $codeMain.add(x.nByte(x.mPutInt,1));
                   } else if($e2.t == 'C') {
                       $codeMain.add(x.nByte(x.mPutChar,2));
                       $codeMain.add(x.nByte(x.mPutChar,1));
                   } else if($e2.t == 'F') {
                       $codeMain.add(x.nByte(x.mPutFloat,2));
                       $codeMain.add(x.nByte(x.mPutFloat,1));
                   } else if($e2.t == 'Z') {
                       $codeMain.add(x.nByte(x.mPutBoolean,2));
                       $codeMain.add(x.nByte(x.mPutBoolean,1));
                   } else if($e2.t == 'S') {
                       $codeMain.add(x.nByte(x.mPutString,2));
                       $codeMain.add(x.nByte(x.mPutString,1));
                   }
               }
            }
            )*)? TK_RPAREN TK_SEMI
            {
                $codeMain.add(x.LDC_W);
                $codeMain.add(x.nByte(saltLinia,2));
                $codeMain.add(x.nByte(saltLinia,1));
                $codeMain.add(x.INVOKESTATIC);
                $codeMain.add(x.nByte(x.mPutString,2));
                $codeMain.add(x.nByte(x.mPutString,1));
            };

cridaAccio : TK_IDENT TK_LPAREN (expressio (TK_COMA expressio)*)? TK_RPAREN TK_SEMI;
accesTupla : TK_IDENT TK_PUNT TK_IDENT;
accesVector : TK_IDENT TK_OVECTOR expressio TK_TVECTOR;
cridaFuncio : TK_IDENT TK_LPAREN (expressio (TK_COMA expressio)*)? TK_RPAREN;


blocImplementacio : (implementacioFuncio | implementacioAccio)*;
implementacioAccio : TK_PC_ACCIO TK_IDENT TK_LPAREN parametres? TK_RPAREN blocDeclaracioVariables? sentencia* TK_PC_FACCIO;
implementacioFuncio : TK_PC_FUNCIO TK_IDENT TK_LPAREN parametres? TK_RPAREN TK_PC_RETORNA tipusBasic blocDeclaracioVariables? sentencia* TK_PC_RETORNA expressio TK_SEMI TK_PC_FFUNCIO;


// Regles lèxiques
TK_WS: (' ' | '\t' | '\n' | '\r') -> skip;
TK_COMENTARI: ('//' (CARACTERS_ASCII | '\t' | ' ')* ('\n' | '\r') | '/*' (CARACTERS_ASCII | TK_WS)* '*/') -> skip;
TK_LPAREN: '(';
TK_RPAREN: ')';
TK_OVECTOR: '[';
TK_TVECTOR: ']';
TK_STAR: '*';
TK_OP_PLUS: '+';
TK_OP_MENYS: '-';
TK_OP_DIVISIO_REAL: '/';
TK_OP_DIVISIO_ENTERA: '\\';
TK_OP_MODUL: '%';
TK_OP_MENYS_UNARI: '~';
TK_OP_IGUALTAT: '==';
TK_OP_DESIGUALTAT: '!=';
TK_SEMI: ';';
TK_COMA: ',';
TK_PUNT: '.';
TK_PC_PROGRAMA: 'programa' { System.out.println("He reconegut el programa"); };
TK_PC_FPROGRAMA: 'fprograma';
TK_PC_PERIODE: 'periode';
TK_PC_PER: 'per';
TK_PC_FPER: 'fper';
TK_PC_DE: 'de';
TK_PC_FINS: 'fins';
TK_PC_FER: 'fer';
TK_PC_SI: 'si';
TK_PC_FSI: 'fsi';
TK_PC_LLAVORS: 'llavors';
TK_PC_ALTRAMENT: 'altrament';
TK_PC_MENTRE: 'mentre';
TK_PC_FMENTRE: 'fmentre';
TK_PC_LLEGIR: 'llegir';
TK_PC_ESCRIURE: 'escriure';
TK_PC_ESCRIURELN: 'escriureln';
TK_PC_ACCIO: 'accio';
TK_PC_FACCIO: 'faccio';
TK_PC_FUNCIO: 'funcio';
TK_PC_FFUNCIO: 'ffuncio';
TK_PC_RETORNA: 'retorna';
TK_PC_ENT: 'ent';
TK_PC_ENTSOR: 'entsor';
TK_PC_CONSTANTS: 'constants';
TK_PC_FCONSTANTS: 'fconstants';
TK_PC_TIPUS: 'tipus';
TK_PC_FTIPUS: 'ftipus';
TK_PC_VECTOR: 'vector';
TK_PC_MIDA: 'mida';
TK_PC_INICI: 'inici';
TK_PC_TUPLA: 'tupla';
TK_PC_FTUPLA: 'ftupla';
TK_PC_VARIABLES: 'variables';
TK_PC_FVARIABLES: 'fvariables';
TK_MESGRAN: '>';
TK_MESPETIT: '<';
TK_MESPETIT_IGUAL: '<=';
TK_MESGRAN_IGUAL: '>=';
TK_NEGACIO: 'no';
TK_AND: '&';
TK_OR: '|';
TK_INTERROGANT: '?';
TK_DOSPUNTS: ':';
TK_TB_ENTER: 'enter';
TK_TB_REAL: 'real';
TK_TB_CAR: 'car';
TK_TB_BOOLEA: 'boolea';
TK_TB_DATA: 'data';
TK_ASSIGNACIO: ':=';
fragment // És per fer definicions
DIGIT: '1' .. '9';
fragment
LLETRA: 'a' .. 'z' | 'A' .. 'Z';
fragment
CARACTERS_ASCII: '!' .. '~';
TK_BOOLEA: 'cert' | 'false';
TK_DATA: (DIGIT | '0') DIGIT '/' (DIGIT | '0') DIGIT '/' (DIGIT | '0') (DIGIT | '0') (DIGIT | '0') (DIGIT | '0');
TK_ZERO: '0';
TK_ENTER: DIGIT (DIGIT | '0')*;
TK_IDENT: LLETRA (LLETRA | DIGIT | '0' | '_')*;
TK_REAL: (DIGIT | '0')* '.' (DIGIT | '0')* (('E' | 'E-') TK_ENTER)?;
TK_CAR: '\'' (CARACTERS_ASCII | ' ') '\'';
TK_STRING: '"' (CARACTERS_ASCII | ' ')* '"';
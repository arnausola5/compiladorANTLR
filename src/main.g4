// Rubén Cantos i Arnau Solà

grammar main;

@header {
    import java.io.*;
}

// Atributs i mètodes de la classe ANTLR
@parser::members {
    SymTable<Registre> TS = new SymTable<Registre>(1000);
    boolean error = false;

    //override method
    public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e)    {
         super.notifyErrorListeners(offendingToken,msg,e);
         error=true;
    }
}


// Regles sintàctiques
inici: blocDeclaracioConstants? blocDeclaracioTipus? blocAccionsFuncions? programa blocImplementacio?;

blocDeclaracioConstants: TK_PC_CONSTANTS (variableConstants)* TK_PC_FCONSTANTS;
variableConstants : tb=tipusBasic i=TK_IDENT TK_ASSIGNACIO vtb=valorTipusBasic TK_SEMI
                    {
                        if($tb.t != $vtb.t) {
                            error = true;
                            System.out.println("Error al assignar constant a la línia " + $i.line);
                            // notifyErrorListeners(variableConstants, "El tipus de tipusBasic i valorTipusBasic
                        }
                    };
tipusBasic returns [char t]: TK_TB_BOOLEA { $t = 'B'; }
                                | TK_TB_REAL { $t = 'R'; }
                                | TK_TB_ENTER { $t = 'E'; }
                                | TK_TB_CAR { $t = 'C'; }
                                | TK_TB_DATA { $t = 'D'; };
valorTipusBasic returns [char t]: TK_BOOLEA { $t = 'B'; }
                                    | TK_DATA { $t = 'D'; }
                                    | ve=valorEnter {$t = $ve.t; }
                                    | TK_REAL { $t = 'R'; }
                                    | TK_CAR { $t = 'C'; };
valorEnter returns [char t]: TK_ZERO { $t = 'E'; } | TK_ENTER { $t = 'E'; };

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

programa: TK_PC_PROGRAMA TK_IDENT blocDeclaracioVariables? sentencia* TK_PC_FPROGRAMA;

blocDeclaracioVariables: TK_PC_VARIABLES variable* TK_PC_FVARIABLES;
variable locals [String vars] : i=TK_IDENT { $vars = $i.text; } (TK_COMA j=TK_IDENT { $vars += ","+$j.text; })* TK_DOSPUNTS (tb=tipusBasic
                                {
                                    String[] v = $vars.split(",");
                                    for(int i = 0; i < v.length; i++) {
                                        if(!TS.existeix(v[i])) {
                                            TS.inserir(v[i], new Registre(v[i], $tb.t));
                                        } else {
                                            error = true;
                                            System.out.println("Error al declarar una variable ja existent a la línia " + $i.line);
                                        }
                                    }
                                }
                                | TK_IDENT) TK_SEMI;

ifThenElse returns [char t] : c=expressio1 i=TK_INTERROGANT
            {
                if($c.t != 'B') {
                    error = true;
                    System.out.println("Error al assignar una condició no booleana a la línia " + $i.line);
                }
            }
            ec=expressio1 TK_DOSPUNTS ef=expressio1
            {
                if($ec.t != $ef.t && !(($ec.t == 'R' && $ef.t == 'E') || ($ec.t == 'E' && $ef.t == 'R'))) {
                    error = true;
                    System.out.println("Error de tipus a expressióCert i expressióFals a la línia " + $i.line);
                } else {
                    if($ec.t != $ef.t)
                        $t = 'R';
                    else
                        $t = $ec.t;
                }
            };
expressio returns [char t] : ite=ifThenElse { $t = $ite.t; } | e=expressio1 { $t = $e.t; };
expressio1 returns [char t] locals [int p] : e1=expressio2 { $t = $e1.t; }
                                            ((i=TK_AND { $p = 0; }| i=TK_OR { $p = 1; }) e2=expressio2
                                            {
                                                if($t == 'B' && $e2.t == 'B') {
                                                    if($p == 0)
                                                        $t = 'B';
                                                    else
                                                        $t = 'B';
                                                }
                                                else {
                                                    error = true;
                                                    System.out.println("Conflicte de tipus a la línia " + $i.line);
                                                }
                                            }
                                            )*;
expressio2 returns [char t] : e1=expressio3 { $t = $e1.t; }(operadorsBooleans e2=expressio3
                                {
                                    if(($t == 'E' || $t == 'R') && ($e2.t == 'E' || $e2.t == 'R'))
                                        $t = 'B';
                                    else if($t == 'B' && $e2.t == 'B')
                                        $t = 'B';
                                    else if($t == 'C' && $e2.t == 'C')
                                        $t = 'B';
                                    else {
                                        error = true;
                                        System.out.println("Conflicte de tipus amb operadors booleans");
                                    }


                                }
                                )*;
operadorsBooleans : TK_OP_IGUALTAT | TK_OP_DESIGUALTAT | TK_MESPETIT | TK_MESPETIT_IGUAL | TK_MESGRAN | TK_MESGRAN_IGUAL;
expressio3 returns [char t] locals [int p] : e1=expressio4 { $t = $e1.t; }
                                                            ((i=TK_OP_PLUS { $p = 0; } | i=TK_OP_MENYS { $p = 1; }) e2=expressio4
                                                            {
                                                                if(($t == 'E' || $t == 'R') && ($e2.t == 'E' || $e2.t == 'R')) {
                                                                    if($p == 0) {
                                                                        if($t == 'R' || $e2.t == 'R')
                                                                            $t = 'R';
                                                                        else
                                                                            $t = 'E';
                                                                    }
                                                                    else {
                                                                        if($t == 'R' || $e2.t == 'R')
                                                                            $t = 'R';
                                                                        else
                                                                            $t = 'E';
                                                                    }
                                                                }
                                                                else {
                                                                    error = true;
                                                                    System.out.println("Conflicte de tipus a la línia " + $i.line);
                                                                }
                                                            }
                                                            )*;
expressio4 returns [char t] locals [int p] : e1=expressio5 { $t = $e1.t; }
                                            ((i=TK_STAR { $p = 0; } | i=TK_OP_DIVISIO_REAL { $p = 1; } | i=TK_OP_DIVISIO_ENTERA { $p = 2; } | i=TK_OP_MODUL { $p = 3; }) e2=expressio5
                                            {
                                                if($p == 0 && ($t == 'E' || $t == 'R') && ($e2.t == 'E' || $e2.t == 'R')) {
                                                    if($t == 'R' || $e2.t == 'R')
                                                        $t = 'R';
                                                    else
                                                        $t = 'E';
                                                }
                                                else if($p == 1 && ($t == 'E' || $t == 'R') && ($e2.t == 'E' || $e2.t == 'R'))
                                                    $t = 'R';
                                                else if($p == 2 && $t == 'E'&& $e2.t == 'E')
                                                    $t = 'E';
                                                else if($p == 3 && $t == 'E'&& $e2.t == 'E')
                                                    $t = 'E';
                                                else {
                                                    error = true;
                                                    System.out.println("Conflicte de tipus a la línia " + $i.line);
                                                }
                                            }
                                            )*;
expressio5 returns [char t] locals [int p] : { $p = 0; }(i=TK_NEGACIO { $p = 1; } | i=TK_OP_MENYS_UNARI { $p = 2; })? e=expressio6
                            {
                                if($p == 0)
                                    $t = $e.t;
                                else if($p == 1 && $e.t == 'B')
                                    $t = $e.t;
                                else if($p == 2 && ($e.t == 'E' || $e.t == 'R'))
                                    $t = $e.t;
                                else {
                                    error = true;
                                    System.out.println("Conflicte de tipus a la línia " + $i.line);
                                }
                            };
expressio6 returns [char t] : v=valor { $t = $v.t; } | TK_LPAREN e=expressio { $t = $e.t; } TK_RPAREN;
valor returns [char t] : vtb=valorTipusBasic { $t = $vtb.t; } | TK_STRING { $t = 'S'; } | i=TK_IDENT
                        {
                            if(TS.existeix($i.text))
                                $t = TS.obtenir($i.text).getTipus();
                            else {
                                error = true;
                                System.out.println("No existeix la variable a la línia " + $i.line);
                            }
                        }
                        | accesTupla | accesVector | cridaFuncio;
accesTupla : TK_IDENT TK_PUNT TK_IDENT;
accesVector : TK_IDENT TK_OVECTOR expressio TK_TVECTOR;
cridaFuncio : TK_IDENT TK_LPAREN (expressio (TK_COMA expressio)*)? TK_RPAREN;

sentencia : (asignacio | condicional | per | mentre | cridaAccio | llegir | escriure | escriureln);

asignacio : (TK_IDENT | accesTupla | accesVector) TK_ASSIGNACIO expressio TK_SEMI;
condicional : TK_PC_SI expressio TK_PC_LLAVORS sentencia* (TK_PC_ALTRAMENT sentencia*)? TK_PC_FSI;
per : TK_PC_PER TK_IDENT TK_PC_DE expressio TK_PC_FINS expressio TK_PC_FER sentencia* TK_PC_FPER;
mentre : TK_PC_MENTRE expressio TK_PC_FER sentencia* TK_PC_FMENTRE;
cridaAccio : TK_IDENT TK_LPAREN (expressio (TK_COMA expressio)*)? TK_RPAREN TK_SEMI;

llegir : TK_PC_LLEGIR TK_LPAREN TK_IDENT TK_RPAREN TK_SEMI;
escriure : TK_PC_ESCRIURE TK_LPAREN expressio (TK_COMA expressio)* TK_RPAREN TK_SEMI;
escriureln : TK_PC_ESCRIURELN TK_LPAREN (expressio (TK_COMA expressio)*)? TK_RPAREN TK_SEMI;

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
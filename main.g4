// Rubén Cantos i Arnau Solà

grammar main;

// Regles sintàctiques
inici: blocDeclaracioConstants? blocDeclaracioTipus? blocAccionsFuncions? programa blocImplementacio?;

blocDeclaracioConstants : TK_PC_CONSTANTS (variableConstants)* TK_PC_FCONSTANTS;
variableConstants : tipusBasic TK_IDENT TK_ASSIGNACIO valorTipusBasic TK_SEMI;
tipusBasic : TK_TB_BOOLEA | TK_TB_REAL | TK_TB_ENTER | TK_TB_CAR | TK_TB_DATA;
valorTipusBasic : TK_BOOLEA | TK_DATA | valorEnter | TK_REAL | TK_CAR;
valorEnter : TK_ZERO | TK_ENTER;

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
variable : TK_IDENT (TK_COMA TK_IDENT)* TK_DOSPUNTS (tipusBasic | TK_IDENT) TK_SEMI;

ifThenElse: expressio1 TK_INTERROGANT expressio1 TK_DOSPUNTS expressio1;
expressio : ifThenElse | expressio1;
expressio1 : expressio2 ((TK_AND | TK_OR) expressio2)*;
expressio2 : expressio3 (operadorsBooleans expressio3)*;
operadorsBooleans : TK_OP_IGUALTAT | TK_OP_DESIGUALTAT | TK_MESPETIT | TK_MESPETIT_IGUAL | TK_MESGRAN | TK_MESGRAN_IGUAL;
expressio3 : expressio4 ((TK_OP_PLUS | TK_OP_MENYS) expressio4)*;
expressio4 : expressio5 ((TK_STAR | TK_OP_DIVISIO_REAL | TK_OP_DIVISIO_ENTERA | TK_OP_MODUL) expressio5)*;
expressio5 : (TK_NEGACIO | TK_OP_MENYS_UNARI)? expressio6;
expressio6 : valor | TK_LPAREN expressio TK_RPAREN;
valor: valorTipusBasic | TK_STRING | TK_IDENT | accesTupla | accesVector | cridaFuncio;
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
TK_PC_PROGRAMA: 'programa' { System.out.println("He reconegut el programa") };
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
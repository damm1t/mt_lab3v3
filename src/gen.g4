grammar gen;

program : (VAR variables)? (function)* BEGIN commands END '.';

function : h=header (VAR variables)? BEGIN commands v=returnValue END SEMICOLON {$h.name.equals($v.name)}?;


returnValue returns [String name]
    : n=NAME COLON EQ arithmetic SEMICOLON {$name = $n.getText();};

header returns [String name]
    : FUNCTION n=NAME LPAR ((VAR)? declaration SEMICOLON)* (VAR)? declaration RPAR COLON type SEMICOLON {$name = $n.getText();};

variables : (declaration SEMICOLON)+;

declaration : (NAME COMMA)* NAME COLON type;

type : INTEGER
    | LONG
    | SHORT
    | REAL;

op : PLUS
    | MINUS
    | DIV
    | MUL;

commands : (curwa | command SEMICOLON)*;

curwa : (IF | WHILE) LPAR condition RPAR THEN BEGIN commands END (els)?;

els : (ELSE BEGIN commands END);

condition : (cond condOp)* cond;

cond : part boolOp part;

part : (NAME | arithmetic);

boolOp : GE
    | LE
    | EQ
    | NOTEQ;

condOp : AND | OR;

command : NAME EQ arithmetic
    | (READ | READLN) LPAR (NAME COMMA)* NAME RPAR
    | (WRITE | WRITELN) LPAR ((arithmetic | STRING) COMMA)* (arithmetic | STRING) RPAR
    | NAME LPAR ((NAME COMMA)* NAME)? RPAR;

arithmetic : arithmetic op arithmetic
    | LPAR arithmetic RPAR
    | NAME
    | NUMBER
    | NAME LPAR ((NAME COMMA)* NAME)? RPAR;

FUNCTION : 'function';

IF : 'if';

WHILE : 'while';

ELSE : 'else';

THEN : 'then';

AND : 'and';

OR : 'or';

GE : '>';

LE : '<';

NOTEQ : '<>';

INTEGER : 'integer';

LONG : 'longint';

SHORT : 'shortint';

REAL : 'real';

BEGIN : 'begin';

END : 'end';

VAR : 'var';

READ : 'read';

READLN : 'readln';

WRITE : 'write';

WRITELN : 'writeln';

COLON : ':';

SEMICOLON : ';';

COMMA : ',';

LPAR : '(';

RPAR : ')';

AP : '\'';

PLUS : '+';

MINUS : '-';

DIV : '/';

MUL : '*';

EQ : '=';

STRING : AP ([0-9a-zA-Z*+-/=_() ])* AP;

NUMBER : [1-9][0-9]*('.' [0-9]+)?;

NAME : ([a-zA-Z_])([0-9a-zA-Z_])*;

WS : [ \t\r\n]+ -> skip;
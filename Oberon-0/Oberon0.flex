package oberon0.parser;

%%

%class OberonLexer
%unicode
%line
%column
%type String

letter = [A-z]
digit = [0-9]
newLine = \r|\n|\r\n
ident = {letter} ({letter} | {digit})*
integer = ({digit})+
number = {integer}
whitespace = {newLine}|[ \t\f]
stringDelimiter = \"

stringChars = [^\"]

comment = \(\*[^\(\)\*]*\*\)

%state STRING

%%


<YYINITIAL> {
    /*Keywords*/
    "BEGIN"         {return ("begin");}
    "END"           {return ("end");}
    "MODULE"        {return ("module");}
    "IMPORT"        {return ("import");}
    "PROCEDURE"        {return ("procedure");}

    "IF"        {return ("if");}
    "WHILE"        {return ("while");}
    "THEN"        {return ("then");}
    "DO"        {return ("do");}
    "ELSE"        {return ("else");}
    "ELSIF"        {return ("else_if");}
    "REPEAT"        {return ("repeat");}
    "UNTIL"        {return ("until");}

    "ARRAY"        {return ("array");}
    "OF"        {return ("of");}
    "RECORD"        {return ("record");}
    "VAR"        {return ("var");}
    "CONST"        {return ("const");}
    "CHAR"        {return ("char");}
    "INTEGER"        {return ("integer");}
    "LONGINT"        {return ("long");}

    "("        {return ("par_open");}
    ")"        {return ("par_close");}
    "."        {return ("dot");}
    ","        {return ("comma");}
    ":"         {return ("colon");}
    ";"        {return ("semicolon");}
    "~"        {return ("tilde");}
    "["        {return ("brack_open");}
    "]"        {return ("brack_close");}
    "|"        {return ("pipe");}

    "*"        {return ("star");}
    "DIV"        {return ("div");}
    "MOD"        {return ("mod");}
    "&"        {return ("amp");}
    "+"        {return ("plus");}
    "-"        {return ("minus");}
    "OR"        {return ("or");}

    "="        {return ("eq");}
    "#"        {return ("hash");}
    "<"        {return ("st");}
    "<="        {return ("seq");}
    ">"        {return ("gt");}
    ">="        {return ("geq");}

    ":="        {return ("assign");}

    {comment}      { /* ignore */ }

    {stringDelimiter}        { yybegin(STRING); }

    {ident}         {return ("identifier");}
    {integer}       {return ("number");}
    {number}       {return ("number");}
    {whitespace}    { /* ignore */ }
}

<STRING> {
    {stringDelimiter}   { yybegin(YYINITIAL);
                         return ("string_literal"); }
    {stringChars}      {/* ignore */}
}

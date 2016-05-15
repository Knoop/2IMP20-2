package oberon0.parser;

%%

%class OberonLexer
%unicode
%line
%column
%type String

letter = [A-z]
digit = [0-9]
newLine = \n
ident = {letter}({letter}|{digit})*
integer = ({digit})+
number = {integer}


%%


<YYINITIAL> {
    /*Keywords*/
    "BEGIN"         {return ("begin");}
    "END"           {return ("end");}
    "MODULE"        {return ("module");}
    "PROCEDURE"        {return ("procedure");}

    "IF"        {return ("if");}
    "WHILE"        {return ("while");}
    "THEN"        {return ("then");}
    "DO"        {return ("do");}
    "ELSE"        {return ("else");}
    "ELSIF"        {return ("else_if");}

    "ARRAY"        {return ("array");}
    "OF"        {return ("of");}
    "RECORD"        {return ("record");}
    "VAR"        {return ("var");}
    "CONST"        {return ("const");}
    "TYPE"        {return ("type");}

    "("        {return ("par_open");}
    ")"        {return ("par_close");}
    "."        {return ("dot");}
    ","        {return ("comma");}
    ";"        {return ("semicolon");}
    "~"        {return ("tilde");}
    "["        {return ("brack_open");}
    "]"        {return ("brack_close");}

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

    {ident}         {return ("identifier");}
    {integer}       {return ("number");}
    {number}       {return ("number");}
    {newLine}      {return ("new_line");}
}

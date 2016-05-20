package oberon0.parser;

import beaver.Symbol;
import beaver.Scanner;

import oberon0.parser.OberonParser.Terminals;

%%

%public
%class OberonScanner
%extends Scanner
%function nextToken
%type Symbol
%yylexthrow Scanner.Exception
%eofval{
	return new Symbol(Terminals.EOF);
%eofval}
%line
%column

%{
    String string;
%}

letter = [A-z]
digit = [0-9]
newLine = \r|\n|\r\n
ident = {letter} ({letter} | {digit})*
number = ({digit})+
whitespace = {newLine}|[ \t\f]
stringDelimiter = \"

stringChars = [^\"]

comment = \(\*[^\(\)\*]*\*\)

%%


<YYINITIAL> {
    /*Keywords*/
    "BEGIN"         {return new Symbol(Terminals.BEGIN);}
    "END"           {return new Symbol(Terminals.END);}
    "MODULE"        {return new Symbol(Terminals.MODULE);}
    "PROCEDURE"        {return new Symbol(Terminals.PROCEDURE);}

    "IF"        {return new Symbol(Terminals.IF);}
    "WHILE"        {return new Symbol(Terminals.WHILE);}
    "THEN"        {return new Symbol(Terminals.THEN);}
    "DO"        {return new Symbol(Terminals.DO);}
    "ELSE"        {return new Symbol(Terminals.ELSE);}
    "ELSIF"        {return new Symbol(Terminals.ELSIF);}

    "ARRAY"        {return new Symbol(Terminals.ARRAY);}
    "OF"        {return new Symbol(Terminals.OF);}
    "RECORD"        {return new Symbol(Terminals.RECORD);}
    "VAR"        {return new Symbol(Terminals.VAR);}
    "CONST"        {return new Symbol(Terminals.CONST);}
    "TYPE"          {return new Symbol(Terminals.TYPE);}

    /*separators*/
    "("        {return new Symbol(Terminals.PAR_OPEN);}
    ")"        {return new Symbol(Terminals.PAR_CLOSE);}
    "."        {return new Symbol(Terminals.DOT);}
    ","        {return new Symbol(Terminals.COMMA);}
    ":"         {return new Symbol(Terminals.COLON);}
    ";"        {return new Symbol(Terminals.SEMICOLON);}
    "["        {return new Symbol(Terminals.BRACK_OPEN);}
    "]"        {return new Symbol(Terminals.BRACK_CLOSE);}

    /*operators*/
    "*"        {return new Symbol(Terminals.STAR);}
    "DIV"        {return new Symbol(Terminals.DIV);}
    "MOD"        {return new Symbol(Terminals.MOD);}
    "&"        {return new Symbol(Terminals.AMP);}
    "+"        {return new Symbol(Terminals.PLUS);}
    "-"        {return new Symbol(Terminals.MINUS);}
    "OR"        {return new Symbol(Terminals.OR);}
    "="        {return new Symbol(Terminals.EQ);}
    "#"        {return new Symbol(Terminals.HASH);}
    "<"        {return new Symbol(Terminals.ST);}
    "<="        {return new Symbol(Terminals.SEQ);}
    ">"        {return new Symbol(Terminals.GT);}
    ">="        {return new Symbol(Terminals.GEQ);}
    "~"        {return new Symbol(Terminals.TILDE);}

    ":="        {return new Symbol(Terminals.ASSIGN);}

    {comment}      { /* ignore */ }

    {stringDelimiter}        { /* ignore */ }

    {ident}         {return new Symbol(Terminals.IDENTIFIER, yytext());}
    {number}       {return new Symbol(Terminals.NUMBER, yytext());}
    {whitespace}    { /* ignore */ }
}

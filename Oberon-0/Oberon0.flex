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
    "BEGIN"         {return new Symbol(Terminals.BEGIN, yyline, yycolumn, yylength());}
    "END"           {return new Symbol(Terminals.END, yyline, yycolumn, yylength());}
    "MODULE"        {return new Symbol(Terminals.MODULE, yyline, yycolumn, yylength());}
    "PROCEDURE"        {return new Symbol(Terminals.PROCEDURE, yyline, yycolumn, yylength());}

    "IF"        {return new Symbol(Terminals.IF, yyline, yycolumn, yylength());}
    "WHILE"        {return new Symbol(Terminals.WHILE, yyline, yycolumn, yylength());}
    "THEN"        {return new Symbol(Terminals.THEN, yyline, yycolumn, yylength());}
    "DO"        {return new Symbol(Terminals.DO, yyline, yycolumn, yylength());}
    "ELSE"        {return new Symbol(Terminals.ELSE, yyline, yycolumn, yylength());}
    "ELSIF"        {return new Symbol(Terminals.ELSIF, yyline, yycolumn, yylength());}

    "ARRAY"        {return new Symbol(Terminals.ARRAY, yyline, yycolumn, yylength());}
    "OF"        {return new Symbol(Terminals.OF, yyline, yycolumn, yylength());}
    "RECORD"        {return new Symbol(Terminals.RECORD, yyline, yycolumn, yylength());}
    "VAR"        {return new Symbol(Terminals.VAR, yyline, yycolumn, yylength());}
    "CONST"        {return new Symbol(Terminals.CONST, yyline, yycolumn, yylength());}
    "TYPE"          {return new Symbol(Terminals.TYPE, yyline, yycolumn, yylength());}

    /*separators*/
    "("        {return new Symbol(Terminals.PAR_OPEN, yyline, yycolumn, yylength());}
    ")"        {return new Symbol(Terminals.PAR_CLOSE, yyline, yycolumn, yylength());}
    "."        {return new Symbol(Terminals.DOT, yyline, yycolumn, yylength());}
    ","        {return new Symbol(Terminals.COMMA, yyline, yycolumn, yylength());}
    ":"         {return new Symbol(Terminals.COLON, yyline, yycolumn, yylength());}
    ";"        {return new Symbol(Terminals.SEMICOLON, yyline, yycolumn, yylength());}
    "["        {return new Symbol(Terminals.BRACK_OPEN, yyline, yycolumn, yylength());}
    "]"        {return new Symbol(Terminals.BRACK_CLOSE, yyline, yycolumn, yylength());}

    /*operators*/
    "*"        {return new Symbol(Terminals.STAR, yyline, yycolumn, yylength());}
    "DIV"        {return new Symbol(Terminals.DIV, yyline, yycolumn, yylength());}
    "MOD"        {return new Symbol(Terminals.MOD, yyline, yycolumn, yylength());}
    "&"        {return new Symbol(Terminals.AMP, yyline, yycolumn, yylength());}
    "+"        {return new Symbol(Terminals.PLUS, yyline, yycolumn, yylength());}
    "-"        {return new Symbol(Terminals.MINUS, yyline, yycolumn, yylength());}
    "OR"        {return new Symbol(Terminals.OR, yyline, yycolumn, yylength());}
    "="        {return new Symbol(Terminals.EQ, yyline, yycolumn, yylength());}
    "#"        {return new Symbol(Terminals.HASH, yyline, yycolumn, yylength());}
    "<"        {return new Symbol(Terminals.ST, yyline, yycolumn, yylength());}
    "<="        {return new Symbol(Terminals.SEQ, yyline, yycolumn, yylength());}
    ">"        {return new Symbol(Terminals.GT, yyline, yycolumn, yylength());}
    ">="        {return new Symbol(Terminals.GEQ, yyline, yycolumn, yylength());}
    "~"        {return new Symbol(Terminals.TILDE, yyline, yycolumn, yylength());}

    ":="        {return new Symbol(Terminals.ASSIGN, yyline, yycolumn, yylength());}

    {comment}      { /* ignore */ }

    {stringDelimiter}        { /* ignore */ }

    {ident}         {return new Symbol(Terminals.IDENTIFIER, yyline, yycolumn, yylength(), yytext());}
    {number}       {return new Symbol(Terminals.NUMBER, yyline, yycolumn, yylength(), yytext());}
    {whitespace}    { /* ignore */ }
}

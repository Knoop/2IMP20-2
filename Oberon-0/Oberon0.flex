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
	return new Symbol(Terminals.EOF, "end-of-file");
%eofval}
%line
%column

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
    "BEGIN"         {return new Symbol(Terminals.begin);}
    "END"           {return new Symbol(Terminals.end);}
    "MODULE"        {return new Symbol(Terminals.module);}
    "IMPORT"        {return new Symbol(Terminals.import_);}
    "PROCEDURE"        {return new Symbol(Terminals.procedure);}

    "IF"        {return new Symbol(Terminals.if_);}
    "WHILE"        {return new Symbol(Terminals.while_);}
    "THEN"        {return new Symbol(Terminals.then);}
    "DO"        {return new Symbol(Terminals.do_);}
    "ELSE"        {return new Symbol(Terminals.else_);}
    "ELSIF"        {return new Symbol(Terminals.else_if);}
    "REPEAT"        {return new Symbol(Terminals.repeat);}
    "UNTIL"        {return new Symbol(Terminals.until);}

    "ARRAY"        {return new Symbol(Terminals.array);}
    "OF"        {return new Symbol(Terminals.of);}
    "RECORD"        {return new Symbol(Terminals.record);}
    "VAR"        {return new Symbol(Terminals.var);}
    "CONST"        {return new Symbol(Terminals.const_);}
    "CHAR"        {return new Symbol(Terminals.char_);}
    "INTEGER"        {return new Symbol(Terminals.integer);}
    "LONGINT"        {return new Symbol(Terminals.long_);}
    "TYPE"          {return new Symbol(Terminals.type_dec);}

    /*separators*/
    "("        {return new Symbol(Terminals.par_open);}
    ")"        {return new Symbol(Terminals.par_close);}
    "."        {return new Symbol(Terminals.dot);}
    ","        {return new Symbol(Terminals.comma);}
    ":"         {return new Symbol(Terminals.colon);}
    ";"        {return new Symbol(Terminals.semicolon);}
    "["        {return new Symbol(Terminals.brack_open);}
    "]"        {return new Symbol(Terminals.brack_close);}
    "|"        {return new Symbol(Terminals.pipe);}

    /*operators*/
    "*"        {return new Symbol(Terminals.star);}
    "DIV"        {return new Symbol(Terminals.div);}
    "MOD"        {return new Symbol(Terminals.mod);}
    "&"        {return new Symbol(Terminals.amp);}
    "+"        {return new Symbol(Terminals.plus);}
    "-"        {return new Symbol(Terminals.minus);}
    "OR"        {return new Symbol(Terminals.or);}
    "="        {return new Symbol(Terminals.eq);}
    "#"        {return new Symbol(Terminals.hash);}
    "<"        {return new Symbol(Terminals.st);}
    "<="        {return new Symbol(Terminals.seq);}
    ">"        {return new Symbol(Terminals.gt);}
    ">="        {return new Symbol(Terminals.geq);}
    "~"        {return new Symbol(Terminals.tilde);}

    ":="        {return new Symbol(Terminals.assign);}

    {comment}      { /* ignore */ }

    {stringDelimiter}        { yybegin(STRING); }

    {ident}         {return new Symbol(Terminals.identifier);}
    {integer}       {return new Symbol(Terminals.number);}
    {number}       {return new Symbol(Terminals.number);}
    {whitespace}    { /* ignore */ }
}

<STRING> {
    {stringDelimiter}   { yybegin(YYINITIAL);
                         return new Symbol(Terminals.string_literal); }
    {stringChars}      {/* ignore */}
}

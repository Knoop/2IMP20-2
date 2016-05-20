package picojava;

import beaver.Scanner;
import beaver.Symbol;
import picojava.PicoJavaParser.Terminals;

/**
 * Lexer for the PicoJava language as defined in the first part of assignment 2 of course 2IMP20 given at the Eindhoven University of Technology (TU/e) in the year 2015-2016. 
 */
%%
%class PicoJavaScanner
%extends Scanner
%function nextToken
%type Symbol
%yylexthrow Scanner.Exception
%eofval{
	return new Symbol(Terminals.EOF);
%eofval}
%unicode
%line
%column

/* Whitespace characters */
EndOfLine = \n|\r|\r\n
Layout = {EndOfLine} | [\ \t]*

Comment = "//" ~EndOfLine* EndOfLine
Identifier = [a-zA-Z][a-zA-Z0-9]*

%% 

/* keywords */
"class"                        { return new Symbol(Terminals.CLASS, yyline, yycolumn, yylength()); }
"extends"                      { return new Symbol(Terminals.EXTENDS, yyline, yycolumn, yylength()); }
  
/* boolean literals */
"true"                         { return new Symbol(Terminals.TRUE, yyline, yycolumn, yylength()); }
"false"                        { return new Symbol(Terminals.FALSE, yyline, yycolumn, yylength()); }
   
"while"						   { return new Symbol(Terminals.WHILE, yyline, yycolumn, yylength()); }
  
/* separators */
"("                            { return new Symbol(Terminals.LPAREN, yyline, yycolumn, yylength()); }
")"                            { return new Symbol(Terminals.RPAREN, yyline, yycolumn, yylength()); }
"{"                            { return new Symbol(Terminals.LBRACE, yyline, yycolumn, yylength()); }
"}"                            { return new Symbol(Terminals.RBRACE, yyline, yycolumn, yylength()); }
";"                            { return new Symbol(Terminals.SEMICOLON, yyline, yycolumn, yylength()); }
"."                            { return new Symbol(Terminals.DOT, yyline, yycolumn, yylength()); }
  
/* operators */
"="                            { return new Symbol(Terminals.EQ, yyline, yycolumn, yylength()); }
"&&"                           { return new Symbol(Terminals.ANDAND, yyline, yycolumn, yylength()); }
"||"                           { return new Symbol(Terminals.OROR, yyline, yycolumn, yylength()); }
  
/* comments */
{Comment}                      { /* Do nothing with comments */ }

/* Whitespace */
{Layout}					   { /* Do nothing with layout */ } 

/* identifiers */
{Identifier}                   { return new Symbol(Terminals.IDENTIFIER, yyline, yycolumn, yylength(), yytext()); }

[^]							   { throw new Error("Illegal character <"+ yytext()+">"); }
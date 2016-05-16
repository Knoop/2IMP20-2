package picojava

import beaver.Symbol;
import beaver.Scanner;

/**
 * Lexer for the PicoJava language as defined in the first part of assignment 2 of course 2IMP20 given at the Eindhoven University of Technology (TU/e) in the year 2015-2016. 
 */
%%
%class LanguageScanner
%extends Scanner
%function nextToken
%type Symbol
%yylexthrow Scanner.Exception
%eofval{
	return new Symbol(Terminals.EOF, "end-of-file");
%eofval}
%unicode
%line
%column
%{

public enum Terminals{
	EOF, IDENTIFIER, LPAREN, RPAREN, LBRACE, RBRACE, CLASS, EXTENDS, SEMICOLON,
	WHILE, OROR, ANDAND, DOT, TRUE, FALSE, COMMENT, EQ;
}

%}

/* Whitespace characters */
EndOfLine = \n|\r|\r\n
Layout = {EndOfLine} | [\ \t]

Comment = "//" ~EndOfLine* EndOfLine
Identifier = [a-zA-Z][a-zA-Z0-9]

%state BLOCK

%% 

"{"                            { return symbol(Terminals.LBRACE);}
"}"                            { return symbol(Terminals.RBRACE); }

/* keywords */
"class"                        { return symbol(Terminals.CLASS); }
"extends"                      { return symbol(Terminals.EXTENDS); }
  
/* boolean literals */
"true"                         { return symbol(Terminals.TRUE); }
"false"                        { return symbol(Terminals.FALSE); }
   
  
/* separators */
"("                            { return symbol(Terminals.LPAREN); }
")"                            { return symbol(Terminals.RPAREN); }
"{"                            { return symbol(Terminals.LBRACE); }
"}"                            { return symbol(Terminals.RBRACE); }
";"                            { return symbol(Terminals.SEMICOLON); }
"."                            { return symbol(Terminals.DOT); }
  
/* operators */
"="                            { return symbol(Terminals.EQ); }
"&&"                           { return symbol(Terminals.ANDAND); }
"||"                           { return symbol(Terminals.OROR); }
  
/* comments */
{Comment}                      { /* Do nothing with comments */ }

/* Whitespace */
{Layout}					   { /* Do nothing with layout */ } 

/* identifiers */ 
{Identifier}                   { return symbol(Terminals.IDENTIFIER, yytext()); }  
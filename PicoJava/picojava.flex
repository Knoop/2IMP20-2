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
	return symbol(Terminals.EOF);
%eofval}
%unicode
%line
%column

%{

	private Symbol symbol(short id){
		return new Symbol(id);
	}
	
	private Symbol symbol(short id, String value){
		return new Symbol(id, value);
	}

%}

/* Whitespace characters */
EndOfLine = \n|\r|\r\n
Layout = {EndOfLine} | [\ \t]*

Comment = "//" ~EndOfLine* EndOfLine
Identifier = [a-zA-Z][a-zA-Z0-9]*

%% 

/* keywords */
"class"                        { return symbol(Terminals.CLASS); }
"extends"                      { return symbol(Terminals.EXTENDS); }
  
/* boolean literals */
"true"                         { return symbol(Terminals.TRUE); }
"false"                        { return symbol(Terminals.FALSE); }
   
"while"						   { return symbol(Terminals.WHILE); }
  
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

[^]							   { throw new Error("Illegal character <"+ yytext()+">"); }
package picojava;

import beaver.Scanner;
import picojava.lang.Token;
import picojava.lang.Token.Terminal;

/**
 * Lexer for the PicoJava language as defined in the first part of assignment 2 of course 2IMP20 given at the Eindhoven University of Technology (TU/e) in the year 2015-2016. 
 */
%%
%class PicoJavaScanner
%extends Scanner
%function nextToken
%type Token
%yylexthrow Scanner.Exception
%eofval{
	return new Token(Terminal.EOF);
%eofval}
%unicode
%line
%column

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
"class"                        { return new Token(Terminal.CLASS); }
"extends"                      { return new Token(Terminal.EXTENDS); }
  
/* boolean literals */
"true"                         { return new Token(Terminal.TRUE); }
"false"                        { return new Token(Terminal.FALSE); }
   
  
/* separators */
"("                            { return new Token(Terminal.LPAREN); }
")"                            { return new Token(Terminal.RPAREN); }
"{"                            { return new Token(Terminal.LBRACE); }
"}"                            { return new Token(Terminal.RBRACE); }
";"                            { return new Token(Terminal.SEMICOLON); }
"."                            { return new Token(Terminal.DOT); }
  
/* operators */
"="                            { return new Token(Terminal.EQ); }
"&&"                           { return new Token(Terminal.ANDAND); }
"||"                           { return new Token(Terminal.OROR); }
  
/* comments */
{Comment}                      { /* Do nothing with comments */ }

/* Whitespace */
{Layout}					   { /* Do nothing with layout */ } 

/* identifiers */
{Identifier}                   { return new Token(Terminal.IDENTIFIER, yytext()); }

[^]							   { throw new Error("Illegal character <"+
                                                        yytext()+">"); }
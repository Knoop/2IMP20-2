/*
Lorem Ipsum
*/
%%

%class OberonParser
%line
%column

letter = [A-z]
digit = [0-9]
ident = {letter}({letter}|{digit})*
integer = ({digit})+
selector = {"."{ident}|("["}
number = {integer}


ident = letter {letter | digit}.
integer = digit {digit}.
selector = {"." ident | "[" expression "]"}.
number = integer.
factor = ident selector | number | "(" expression ")" | "~" factor.
term = factor {("*" | "DIV" | "MOD" | "&") factor}.
SimpleExpression = ["+"|"-"] term {("+"|"-" | "OR") term}.
expression = SimpleExpression
 [("=" | "#" | "<" | "<=" | ">" | ">=") SimpleExpression].
assignment = ident selector ":=" expression.
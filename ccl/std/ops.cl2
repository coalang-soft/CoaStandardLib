#alias + add
#alias - sub
#alias * mul
#alias / div
#alias % mod

#alias ^ pow

#alias < lss
#alias > gtr
#alias == equals
#alias ! not

#alias => nvp
#alias & concat


//Constants
#alias true 1
#alias false 0


//Syntax
#literal () %s
#snippet import\s+([a-zA-Z0-9_\.]+)\.([a-zA-Z0-9_]+)\s* var %2$s=java("%1$s.%2$s");
#block def\s+([a-zA-Z0-9_]+)\s* (.*) var %1$s={|%2$s|%3$s};
#snippet def\s+([a-zA-Z0-9_]+)\((.*)\)\s*=(.*) def %1$s(%2$s){return %3$s;};

//Built in variables
#builtin println
#builtin java
#builtin @
#builtin undefined

//Operators
#builtin add
#builtin sub
#builtin mul
#builtin div
#builtin pow
#builtin concat

//Control
#builtin if
#builtin while
#builtin for
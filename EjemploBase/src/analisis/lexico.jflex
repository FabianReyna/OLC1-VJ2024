package analisis;

//importaciones
import java_cup.runtime.Symbol;

%%

//definicion de variables
%{
    String cadena = "";
%}

// Definiciones iniciales
%init{
    yyline = 1;
    yycolumn = 1;
%init}

//declaraciones de caracteristicas de jflex
%cup
%class scanner //nombre de la clase
%public //acceso de la clase
%line //conteo de lineas
%column //conteo de columnas
%char //conteo de caracteres
%full //reconocimiento de caracteres
%debug //depuracion
%ignorecase //quitar la distincion entre mayusculas y minusculas (case insensitive)

//estados
%state CADENA

// definir los simbolos del sistema
PAR1 = "("
PAR2 = ")"
FINCADENA = ";"
MAS = "+"
MENOS = "-"
MULT = "*"
DIV = "/"
BLANCOS = [\ \r\t\n\f]+
ENTERO = [0-9]+
DECIMAL = [0-9]+"."[0-9]+

// palabras reservadas
IMPRIMIR = "imprimir"

%%

<YYINITIAL> {IMPRIMIR}  {return new Symbol(sym.IMPRIMIR, yyline, yycolumn,yytext());}
<YYINITIAL> {DECIMAL}   {return new Symbol(sym.DECIMAL, yyline, yycolumn,yytext());}
<YYINITIAL> {ENTERO}    {return new Symbol(sym.ENTERO, yyline, yycolumn,yytext());}
<YYINITIAL> {FINCADENA} {return new Symbol(sym.FINCADENA, yyline, yycolumn,yytext());}
<YYINITIAL> {MAS}       {return new Symbol(sym.MAS, yyline, yycolumn,yytext());}
<YYINITIAL> {MENOS}     {return new Symbol(sym.MENOS, yyline, yycolumn,yytext());}
<YYINITIAL> {MULT}      {return new Symbol(sym.MULT, yyline, yycolumn,yytext());}
<YYINITIAL> {DIV}       {return new Symbol(sym.DIV, yyline, yycolumn,yytext());}
<YYINITIAL> {PAR1}      {return new Symbol(sym.PAR1, yyline, yycolumn,yytext());}
<YYINITIAL> {PAR2}      {return new Symbol(sym.PAR2, yyline, yycolumn,yytext());}
<YYINITIAL> {BLANCOS}   {}

// estado cadena
<YYINITIAL> [\"]        {cadena = ""; yybegin(CADENA);}

<CADENA> {
    [\"]    {String tmp= cadena;
            cadena="";
            yybegin(YYINITIAL);
            return new Symbol(sym.CADENA, yyline, yycolumn,tmp);}
    
    [^\"]   {cadena+=yytext();}
}

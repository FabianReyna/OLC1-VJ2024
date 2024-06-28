%{
    const Tipo = require('./simbolo/Tipo')
    const Nativo = require('./expresiones/Nativo')
    const Aritmeticas = require('./expresiones/Aritmeticas')


%}

// analizador lexico

// divectiva lex para realizar el analisis lexico
%lex
// hacemos que nuestro lenguaje sea case insensitive
%options case-insensitive

%%
// palabras reservadas

// simbolos del sistema
";" return 'PUNTOCOMA'
"+" return 'MAS';
"-" return 'MENOS';
"(" return 'PAR1';
")" return 'PAR2';
[0-9]+"."[0-9]+ return 'DECIMAL';
[0-9]+ return 'ENTERO';

// espacios en blanco
[\ \r\t\f\t] {};
[\ \n] {};

// fin de cadena
<<EOF>> return 'EOF';


%{
// codigo JS si fuese necesario
%}

//directiva para usar los tokens reconocidos arriba
/lex

// precedencias
%left 'MAS' 'MENOS'
%right 'UMENOS'

// simbolo inicial
%start INICIO

%%

// reglas de produccion
INICIO : INSTRUCCIONES EOF                  {return $1;}
;

INSTRUCCIONES : INSTRUCCIONES INSTRUCCION   {$1.push($2); $$=$1;}
                | INSTRUCCION               {$$=[$1];}
;

INSTRUCCION : EXPRESION PUNTOCOMA           {$$=$1;}
;

EXPRESION : EXPRESION MAS EXPRESION         {   $$ = new Aritmeticas.default(Aritmeticas.Operadores.SUMA, @1.first_line,@1.first_column, $1, $3 );  }
            | EXPRESION MENOS EXPRESION     {   $$ = new Aritmeticas.default(Aritmeticas.Operadores.RESTA, @1.first_line,@1.first_column, $1, $3 );  }
            | PAR1 EXPRESION PAR2           {   $$ = $2; }
            | MENOS EXPRESION %prec UMENOS  {   $$ = new Aritmeticas.default(Aritmeticas.Operadores.NEG, @1.first_line,@1.first_column, $2 );  }
            | ENTERO                        {   $$ = new Nativo.default(new Tipo.default(Tipo.tipoDato.ENTERO), $1, @1.first_line,@1.first_column );  }
            | DECIMAL                       {   $$ = new Nativo.default(new Tipo.default(Tipo.tipoDato.DECIMAL), $1, @1.first_line,@1.first_column );  }
;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instrucciones;

import abstracto.Instruccion;
import java.util.HashMap;
import java.util.LinkedList;
import simbolo.Arbol;
import simbolo.Tipo;
import simbolo.tablaSimbolos;

/**
 *
 * @author fabian
 */

/*
void ID (<PARAMS>){<INSTRUCCIONES>}
void MiMetodo(int a){println(a);}
miMetodo(10);
 */
public class Metodo extends Instruccion {

    public String id;
    public LinkedList<HashMap> parametros;
    public LinkedList<Instruccion> instrucciones;

    public Metodo(String id, LinkedList<HashMap> parametros, LinkedList<Instruccion> instrucciones, Tipo tipo, int linea, int col) {
        super(tipo, linea, col);
        this.id = id;
        this.parametros = parametros;
        this.instrucciones = instrucciones;
    }

    @Override
    public Object interpretar(Arbol arbol, tablaSimbolos tabla) {
        for (var i : this.instrucciones) {
            var resultado = i.interpretar(arbol, tabla);
            //resultado instancia de errores
            // return;
        }
        return null;
    }

    @Override
    public String generarast(Arbol arbol, String anterior) {
        return "";
    }
}

/*
int c = 120;
void MiMetodo1(){
    int a = 10;
    int b = 20;
    print(c);
}
void MiMetodo2(){
    int d = 10;
    if(true){
        miMetodo1();
    }
 miMetodo1();
}
GLOBAL <- METODO1
GLOBAL <- METODO2 <- IF 
 */

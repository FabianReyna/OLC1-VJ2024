/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instrucciones;

import abstracto.Instruccion;
import excepciones.Errores;
import simbolo.Arbol;
import simbolo.Simbolo;
import simbolo.Tipo;
import simbolo.tablaSimbolos;
import simbolo.tipoDato;

/**
 *
 * @author fabian
 */
// TIPO ID = EXPRESION ;
public class Declaracion extends Instruccion {

    public String identificador;
    public Instruccion valor;

    public Declaracion(String identificador, Instruccion valor, Tipo tipo, int linea, int col) {
        super(tipo, linea, col);
        this.identificador = identificador;
        this.valor = valor;
    }

    public Declaracion(String identificador, Tipo tipo, int linea, int col) {
        super(tipo, linea, col);
        this.identificador = identificador;
        this.valor = null;
    }

    @Override
    public Object interpretar(Arbol arbol, tablaSimbolos tabla) {
        // interpretado la expresion
        var valorInterpretado = (this.valor == null) ? this.valoresDefault() : this.valor.interpretar(arbol, tabla);

        //validamos si es error
        if (valorInterpretado instanceof Errores) {
            return valorInterpretado;
        }

        //validamos los tipo
        if (this.valor != null) {
            if (this.valor.tipo.getTipo() != this.tipo.getTipo()) {
                return new Errores("SEMANTICO", "Tipos erroneos", this.linea, this.col);
            }
        }

        Simbolo s = new Simbolo(this.tipo, this.identificador, valorInterpretado);

        boolean creacion = tabla.setVariable(s);
        if (!creacion) {
            return new Errores("SEMANTICO", "Variable ya existente", this.linea, this.col);
        }

        return null;
    }

    public Object valoresDefault() {
        return switch (this.tipo.getTipo()) {
            case tipoDato.BOOLEANO ->
                true;
            case tipoDato.CADENA ->
                "";
            case tipoDato.CARACTER ->
                '\u0000';
            case tipoDato.ENTERO ->
                0;
            case tipoDato.DECIMAL ->
                0.0;
            default ->
                null;
        };
    }

    @Override
    public String generarast(Arbol arbol, String anterior) {
        return "";
    }

}

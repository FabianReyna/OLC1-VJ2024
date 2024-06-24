/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instrucciones;

import abstracto.Instruccion;
import excepciones.Errores;
import java.util.LinkedList;
import simbolo.Arbol;
import simbolo.*;
import simbolo.tablaSimbolos;

/**
 *
 * @author fabian
 */
/*
EXECUTE -> START_WITH -> MAIN
EXECUTE <ID> ( <PARAMETROS> ) ;
 */
public class Execute extends Instruccion {

    private String id;
    private LinkedList<Instruccion> parametros;

    public Execute(String id, LinkedList<Instruccion> parametros, int linea, int col) {
        super(new Tipo(tipoDato.VOID), linea, col);
        this.id = id;
        this.parametros = parametros;
    }

    @Override
    public Object interpretar(Arbol arbol, tablaSimbolos tabla) {
        //buscar la funcion
        var busqueda = arbol.getFuncion(id);
        if (busqueda == null) {
            return new Errores("SEMANTICO", "Funcion no existente",
                    this.linea, this.col);
        }

        if (busqueda instanceof Metodo metodo) {
            var newTabla = new tablaSimbolos(arbol.getTablaGlobal());
            newTabla.setNombre("EXECUTE");

            //validacion
            if (metodo.parametros.size() != this.parametros.size()) {
                return new Errores("SEMANTICO", "Parametros erroneos",
                        this.linea, this.col);
            }

            /*
                Usamos un ciclo con index para que los parametros coincidan
                tanto en la lista de la clase metodos como en la lista de esta
                clase (Execute)
             */
            //declaramos los parametros del execute
            for (int i = 0; i < this.parametros.size(); i++) {
                var identificador = (String) metodo.parametros.get(i).get("id");
                var valor = this.parametros.get(i);
                var tipo2 = (Tipo) metodo.parametros.get(i).get("tipo");

                var declaracionParametro = new Declaracion(
                        identificador, valor, tipo2, this.linea, this.col);

                var resultadoDeclaracion = declaracionParametro.interpretar(arbol, newTabla);

                if (resultadoDeclaracion instanceof Errores) {
                    return resultadoDeclaracion;
                }
            }

            var resultadoFuncion = metodo.interpretar(arbol, newTabla);
            if (resultadoFuncion instanceof Errores) {
                return resultadoFuncion;
            }
        }
        return null;
    }

    @Override
    public String generarast(Arbol arbol, String anterior) {
        return "";
    }

}
/*
METODO
[
    {
        "id":<Valor>,
        "tipo":<Tipo>
    },
    {
        "id":<Valor>,
        "tipo":<Tipo>
    }

]

EXECUTE
    [ <EXP>, <EXP> ]


void main(int a, string b){
    println(a);
}

EXECUTE main(1, "hola mundo");
 */

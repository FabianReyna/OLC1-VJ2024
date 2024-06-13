package patroninterprete;

import abstracto.Instruccion;
import analisis.parser;
import analisis.scanner;
import excepciones.Errores;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.LinkedList;
import simbolo.Arbol;
import simbolo.tablaSimbolos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author fabian
 */
public class PatronInterprete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String texto = ""
                    + "inT a = 10;"
                    + "bool b = true;"
                    + "bool c = false;"
                    + "if(b){"
                    + "     int a = 20;"
                    + "     imprimir(a);"
                    + "     if(b){"
                    + "         int a = 30;"
                    + "         imprimir(a);"
                    + "     }"
                    + "}"
                    + "imprimir(a);"
                    + "imprimir(c);"
                    + "";
            scanner s = new scanner(new BufferedReader(new StringReader(texto)));
            parser p = new parser(s);
            var resultado = p.parse();
            var ast = new Arbol((LinkedList<Instruccion>) resultado.value);
            var tabla = new tablaSimbolos();
            tabla.setNombre("GLOBAL");
            ast.setConsola("");
            LinkedList<Errores> lista = new LinkedList<>();
            lista.addAll(s.listaErrores);
            lista.addAll(p.listaErrores);
            for (var a : ast.getInstrucciones()) {
                if (a == null) {
                    continue;
                }

                var res = a.interpretar(ast, tabla);
                if (res instanceof Errores) {
                    lista.add((Errores) res);
                }
            }
            System.out.println(ast.getConsola());

            for (var i : lista) {
                System.out.println(i);
            }

        } catch (Exception ex) {
            System.out.println("Algo salio mal");
            System.out.println(ex);
        }
    }

}

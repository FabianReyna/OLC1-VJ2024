/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplobase;

import analisis.parser;
import analisis.scanner;
import java.io.BufferedReader;
import java.io.StringReader;

/**
 *
 * @author fabian
 */
public class EjemploBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            String texto = "imprimir(1+2+3+4+5-20/2.0);imprimir(\"Cadena a Imprimir\");";
            parser p = new parser(new scanner(new BufferedReader(new StringReader(texto))));
            var resultado = p.parse();
            System.out.println(resultado.value);
        }catch(Exception ex){
            System.out.println("Algo salio mal");
        }
    }

}

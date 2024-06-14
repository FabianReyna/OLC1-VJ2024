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
        Principal p = new Principal();
        p.setVisible(true);
        
        
    }

}

import Arbol from "./simbolo/Arbol";
import tablaSimbolo from "./simbolo/tablaSimbolos";

class ejemploJison {
    start(): any {
        try {
            let parser = require('./analizador.js')
            let resultado = parser.parse(('12+1;-5+1;-100+100-1;'));
            let ast = new Arbol(resultado)
            let tabla = new tablaSimbolo();
            tabla.setNombre("")
            ast.setTablaGlobal(tabla)
            ast.setConsola("")

            for (let i of ast.getInstrucciones()) {
                var resultado2 = i.interpretar(ast, tabla)
                console.log(resultado2)
            }
            //console.log(resultado)
        } catch (e: any) {
            console.log(e);
        }
    }
}

export const ejemploJison2 = new ejemploJison();
ejemploJison2.start();
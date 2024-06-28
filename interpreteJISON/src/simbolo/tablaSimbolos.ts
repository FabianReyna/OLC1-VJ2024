import Simbolo from "./Simbolo";
import Tipo, { tipoDato } from "./Tipo";

export default class tablaSimbolo {
    private tablaAnterior: tablaSimbolo | any
    private tablaActual: Map<String, Simbolo>
    private nombreDato: string

    constructor(anterior?: tablaSimbolo) {
        this.tablaActual = new Map<String, Simbolo>()
        this.nombreDato = ""
        this.tablaAnterior = anterior
    }

    public getAnterior(): tablaSimbolo {
        return this.tablaAnterior
    }

    public setAnterior(anterior: tablaSimbolo): void {
        this.tablaAnterior = anterior
    }

    public getTabla(): Map<String, Simbolo> {
        return this.tablaActual;
    }

    public setTabla(tabla: Map<String, Simbolo>) {
        this.tablaActual = tabla
    }

    public getVariable(id: string) {
        return ""
    }

    public setVariable(simbolo: Simbolo) {
    }

    public getNombre(): string {
        return this.nombreDato
    }

    public setNombre(nombre: string): void {
        this.nombreDato = nombre
    }

}
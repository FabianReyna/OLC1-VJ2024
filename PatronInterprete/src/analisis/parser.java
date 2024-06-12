
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analisis;

import java_cup.runtime.Symbol;
import java.util.LinkedList;
import abstracto.Instruccion;
import simbolo.Tipo;
import simbolo.tipoDato;
import excepciones.Errores;
import instrucciones.Print;
import instrucciones.Declaracion;
import instrucciones.AsignacionVar;
import expresiones.Nativo;
import expresiones.Aritmeticas;
import expresiones.OperadoresAritmeticos;
import expresiones.Relacionales;
import expresiones.OperadoresRelacionales;
import expresiones.AccesoVar;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\025\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\004\004\000\002\005\007\000" +
    "\002\006\007\000\002\007\006\000\002\010\003\000\002" +
    "\010\003\000\002\010\003\000\002\011\004\000\002\011" +
    "\005\000\002\011\006\000\002\011\003\000\002\011\003" +
    "\000\002\011\003\000\002\011\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\047\000\016\003\016\007\012\011\017\012\005\013" +
    "\011\014\010\001\002\000\020\002\ufffe\003\ufffe\007\ufffe" +
    "\011\ufffe\012\ufffe\013\ufffe\014\ufffe\001\002\000\004\007" +
    "\ufff6\001\002\000\020\002\ufffc\003\ufffc\007\ufffc\011\ufffc" +
    "\012\ufffc\013\ufffc\014\ufffc\001\002\000\004\002\051\001" +
    "\002\000\004\007\ufff4\001\002\000\004\007\ufff5\001\002" +
    "\000\004\022\046\001\002\000\020\002\ufffb\003\ufffb\007" +
    "\ufffb\011\ufffb\012\ufffb\013\ufffb\014\ufffb\001\002\000\020" +
    "\002\ufffd\003\ufffd\007\ufffd\011\ufffd\012\ufffd\013\ufffd\014" +
    "\ufffd\001\002\000\020\002\000\003\016\007\012\011\017" +
    "\012\005\013\011\014\010\001\002\000\004\010\044\001" +
    "\002\000\004\015\040\001\002\000\004\007\021\001\002" +
    "\000\004\022\022\001\002\000\014\004\030\005\027\006" +
    "\026\007\023\020\024\001\002\000\012\010\uffed\016\uffed" +
    "\017\uffed\022\uffed\001\002\000\014\004\030\005\027\006" +
    "\026\007\023\020\024\001\002\000\010\010\032\017\031" +
    "\022\033\001\002\000\012\010\uffef\016\uffef\017\uffef\022" +
    "\uffef\001\002\000\012\010\ufff0\016\ufff0\017\ufff0\022\ufff0" +
    "\001\002\000\012\010\uffee\016\uffee\017\uffee\022\uffee\001" +
    "\002\000\014\004\030\005\027\006\026\007\023\020\024" +
    "\001\002\000\020\002\ufff8\003\ufff8\007\ufff8\011\ufff8\012" +
    "\ufff8\013\ufff8\014\ufff8\001\002\000\004\022\034\001\002" +
    "\000\014\004\030\005\027\006\026\007\023\020\024\001" +
    "\002\000\012\010\ufff1\016\ufff1\017\031\022\ufff1\001\002" +
    "\000\012\010\ufff2\016\ufff2\017\ufff2\022\ufff2\001\002\000" +
    "\012\010\ufff3\016\ufff3\017\ufff3\022\ufff3\001\002\000\014" +
    "\004\030\005\027\006\026\007\023\020\024\001\002\000" +
    "\010\016\042\017\031\022\033\001\002\000\004\010\043" +
    "\001\002\000\020\002\ufff9\003\ufff9\007\ufff9\011\ufff9\012" +
    "\ufff9\013\ufff9\014\ufff9\001\002\000\020\002\ufffa\003\ufffa" +
    "\007\ufffa\011\ufffa\012\ufffa\013\ufffa\014\ufffa\001\002\000" +
    "\020\002\uffff\003\uffff\007\uffff\011\uffff\012\uffff\013\uffff" +
    "\014\uffff\001\002\000\014\004\030\005\027\006\026\007" +
    "\023\020\024\001\002\000\010\010\050\017\031\022\033" +
    "\001\002\000\020\002\ufff7\003\ufff7\007\ufff7\011\ufff7\012" +
    "\ufff7\013\ufff7\014\ufff7\001\002\000\004\002\001\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\047\000\020\002\006\003\014\004\003\005\013\006" +
    "\005\007\012\010\017\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\014\004\044\005\013\006\005\007" +
    "\012\010\017\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\011\024\001" +
    "\001\000\002\001\001\000\004\011\036\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\011\035\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\011\034\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\011\040\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\011\046\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    scanner s;
    parser(scanner s){this.s = s;}

    public LinkedList<Errores> listaErrores = new LinkedList<>();
    
    public void syntax_error(Symbol s){
        listaErrores.add(new Errores("SINTACTICO RECUPERABLE",
                        "No se esperaba el componente "+s.value,
                        s.left,
                        s.right));
    }

    public void unrecovered_syntax_error (Symbol s){
        listaErrores.add(new Errores("SINTACTICO NO RECUPERABLE",
                        "No se esperaba el componente "+s.value,
                        s.left,
                        s.right));
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {



  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LinkedList<Instruccion> start_val = (LinkedList<Instruccion>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= INSTRUCCIONES 
            {
              LinkedList<Instruccion> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		LinkedList<Instruccion> a = (LinkedList<Instruccion>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		   RESULT = a;   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INSTRUCCIONES ::= INSTRUCCIONES INSTRUCCION 
            {
              LinkedList<Instruccion> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LinkedList<Instruccion> a = (LinkedList<Instruccion>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruccion b = (Instruccion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = a; RESULT.add(b); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCIONES",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INSTRUCCIONES ::= INSTRUCCION 
            {
              LinkedList<Instruccion> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruccion a = (Instruccion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new LinkedList<>(); RESULT.add(a); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCIONES",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // INSTRUCCION ::= IMPRESION 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruccion a = (Instruccion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		   RESULT=a;   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // INSTRUCCION ::= DECLARACION 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruccion a = (Instruccion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		   RESULT=a;   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // INSTRUCCION ::= ASIGNACION 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruccion a = (Instruccion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		   RESULT=a;   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // INSTRUCCION ::= error FINCADENA 
            {
              Instruccion RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // IMPRESION ::= IMPRIMIR PAR1 EXPRESION PAR2 FINCADENA 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Instruccion a = (Instruccion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		   RESULT = new Print(a, aleft, aright);   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("IMPRESION",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // DECLARACION ::= TIPOS ID IGUAL EXPRESION FINCADENA 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Tipo a = (Tipo)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Instruccion c = (Instruccion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		   RESULT = new Declaracion(b, c, a, aleft, aright);   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("DECLARACION",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // ASIGNACION ::= ID IGUAL EXPRESION FINCADENA 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Instruccion b = (Instruccion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		   RESULT=new AsignacionVar(a, b, aleft, aright);  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ASIGNACION",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // TIPOS ::= INT 
            {
              Tipo RESULT =null;
		   RESULT=new Tipo(tipoDato.ENTERO);   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPOS",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // TIPOS ::= DOUBLE 
            {
              Tipo RESULT =null;
		   RESULT=new Tipo(tipoDato.DECIMAL);   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPOS",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // TIPOS ::= STRING 
            {
              Tipo RESULT =null;
		   RESULT=new Tipo(tipoDato.CADENA);   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("TIPOS",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // EXPRESION ::= MENOS EXPRESION 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruccion a = (Instruccion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		   RESULT = new Aritmeticas(a, OperadoresAritmeticos.NEGACION, aleft, aright);   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // EXPRESION ::= EXPRESION MAS EXPRESION 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Instruccion a = (Instruccion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruccion b = (Instruccion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		   RESULT = new Aritmeticas(a, b, OperadoresAritmeticos.SUMA, aleft, aright);   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // EXPRESION ::= EXPRESION IGUAL IGUAL EXPRESION 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		Instruccion a = (Instruccion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruccion b = (Instruccion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		    RESULT = new Relacionales(a, b, OperadoresRelacionales.EQUALS, aleft, aright);    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // EXPRESION ::= ENTERO 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		   RESULT = new Nativo(Integer.parseInt(a), new Tipo(tipoDato.ENTERO), aleft, aright );   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // EXPRESION ::= DECIMAL 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		   RESULT = new Nativo(new Double(a), new Tipo(tipoDato.DECIMAL), aleft, aright );   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // EXPRESION ::= CADENA 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		   RESULT = new Nativo(a, new Tipo(tipoDato.CADENA), aleft, aright );   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // EXPRESION ::= ID 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		   RESULT = new AccesoVar(a, aleft, aright);   
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}

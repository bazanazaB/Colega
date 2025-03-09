    grammar semantica;

    @header {
        import java.util.HashMap;
    }

    @members {
        HashMap TSG = new HashMap();
        HashMap TSL = new HashMap();

    public void pushTSG(String id, String tipo) {
        Integer se_encuentra = (Integer) TSG.get(id);
        
        if (se_encuentra == null) {
        
            if (tipo.compareTo("int") == 0) {
                TSG.put(id, 1);  
            } 
            else if (tipo.compareTo("double") == 0) {
                TSG.put(id, 2); 
            } 
            else if (tipo.compareTo("class") == 0) {  
                TSG.put(id, 3);  
            } 
            else if (tipo.compareTo("metodo") == 0) {
                TSG.put(id, 4);  
            }
        } else {
            if (tipo.compareTo("metodo") == 0 && se_encuentra == 4) {
                System.err.println("Error: Método duplicado: " + id);
            } else if (tipo.compareTo("class") == 0 && se_encuentra == 3) {
                System.err.println("Error: Clase duplicada: " + id);
            } else {
                System.err.println("Error redeclarando: " + id);
            }
        }
    }

        public void pushTSL(String id, String tipo){
            Integer se_encuentra = (Integer) TSL.get(id);
            
            if (se_encuentra == null) {
                if (tipo.compareTo("int") == 0) TSL.put(id, 1);
                else if (tipo.compareTo("double") == 0) TSL.put(id, 2);
                else System.err.println("Tipo desconocido... " + id);
            }
            else System.err.println("Error redeclarando: " + id);
        }
    }

    program : clase+ ;

    clase : modificAcceso 'class' ID {pushTSG($ID.text, "class");} '{'
        miembro*
    '}';

    miembro : metodo | atributo; 

    metodo : modificAcceso tipo id1=ID '(' decl_args? ')'
            { 
                pushTSG($id1.text,"metodo"); 
            }  
            '{'  
                instruccion*
            '}' {TSL.clear();} ;

atributo : modificAcceso? tipo id1=ID { pushTSG($id1.text, $tipo.text); } 
           (COMMA id2=ID { pushTSG($id2.text, $tipo.text); })* 
           SEMICOLON;

    instruccion : asignacion | decl_local;

    asignacion : ID '=' expr {
        Integer tipoVar = (Integer) TSL.get($ID.text);
        
        if (tipoVar == null) {  
            tipoVar = (Integer) TSG.get($ID.text);
        }
        
        if (tipoVar == null) {  
            System.err.println("Error: Variable '" + $ID.text + "' no fue declarada.");
        } else if (tipoVar == 3 || $expr.tipo == 3) { 
            System.err.println("Error en asignación a '" + $ID.text + "' debido a error en la expresión.");
        } else if (tipoVar != $expr.tipo) {  
            System.err.println("Error: Tipos incompatibles en asignación a '" + $ID.text + "' (" + 
                            (tipoVar == 1 ? "int" : "double") + " = " + 
                            ($expr.tipo == 1 ? "int" : "double") + ").");
        }
    } SEMICOLON;

    decl_args : tipo1=tipo id1=ID {pushTSL($id1.text, $tipo1.text);}  
        (COMMA tipo2=tipo id2=ID {pushTSL($id2.text, $tipo2.text);})*;

    decl_local : tipo id1=ID {pushTSL($id1.text, $tipo.text);} (','  id2=ID {pushTSL($id2.text, $tipo.text);})* SEMICOLON;


    expr returns [int tipo]  
        : m1=multExpr { 
            $tipo = $m1.tipo;
        } 
        (op=('+' | '-') m2=multExpr { 
            if (($tipo != $m2.tipo) && ($tipo != 3) && ($m2.tipo != 3)) {  
                System.err.println("Error: Operación con tipos incompatibles (" + 
                                ($tipo == 1 ? "int" : "double") + " y " + 
                                ($m2.tipo == 1 ? "int" : "double") + ").");
                $tipo = 3;  
            }
        })*;

    multExpr returns [int tipo]  
        : a1=atom { 
            $tipo = $a1.tipo; 
        }  
        (op=('*' | '/') a2=atom { 
            if (($tipo != $a2.tipo) && ($tipo != 3) && ($a2.tipo != 3)) {  
                System.err.println("Error: Operación con tipos incompatibles (" + 
                                ($tipo == 1 ? "int" : "double") + " y " + 
                                ($a2.tipo == 1 ? "int" : "double") + ").");
                $tipo = 3;  
            }
        })*;

    atom returns [int tipo] 
        : ID {
            Integer tipoVar = (Integer) TSL.get($ID.text);
            
            if (tipoVar == null) {  
                tipoVar = (Integer) TSG.get($ID.text);
                
                if (tipoVar == null) {  
                    System.err.println("Error: Variable '" + $ID.text + "' no fue declarada.");
                    $tipo = 3; 
                } else {
                    $tipo = tipoVar;  // Variable encontrada en TSG
                }
            } else {
                $tipo = tipoVar;  // Variable encontrada en TSL
            }
        }
        | CINT      { $tipo = 1; } 
        | CDOUBLE   { $tipo = 2; } 
        | '(' expr  { $tipo = $expr.tipo; } ')'
    ;


    modificAcceso : PUBLIC | PRIVATE | PROTECTED ;
    tipo : INT | DOUBLE | VOID;

    INT : 'int' ;
    DOUBLE : 'double';
    PUBLIC : 'public'; 
    PRIVATE : 'private';
    PROTECTED : 'protected';
    SEMICOLON : ';';
    COMMA : ',';
    VOID : 'void';

    ID : ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9')*;
    CDOUBLE : ('0'..'9') '.' ('0'..'9')+;
    CINT : ('0'..'9')+; 

    WS : (' ' | '\n' | '\t' | '\r')+ 
        { $channel = HIDDEN; };

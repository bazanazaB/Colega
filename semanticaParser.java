// $ANTLR 3.5.2 semantica.g 2025-03-08 13:18:45

    import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class semanticaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CDOUBLE", "CINT", "COMMA", "DOUBLE", 
		"ID", "INT", "PRIVATE", "PROTECTED", "PUBLIC", "SEMICOLON", "WS", "'('", 
		"')'", "'*'", "'+'", "'-'", "'/'", "'='", "'class'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int CDOUBLE=4;
	public static final int CINT=5;
	public static final int COMMA=6;
	public static final int DOUBLE=7;
	public static final int ID=8;
	public static final int INT=9;
	public static final int PRIVATE=10;
	public static final int PROTECTED=11;
	public static final int PUBLIC=12;
	public static final int SEMICOLON=13;
	public static final int WS=14;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public semanticaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public semanticaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return semanticaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "semantica.g"; }


	    HashMap TSG = new HashMap();
	    HashMap TSL = new HashMap();

	   public void pushTSG(String id, String tipo) {
	    // Verificamos si ya existe en la tabla de símbolos
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



	// $ANTLR start "program"
	// semantica.g:52:1: program : ( clase )+ ;
	public final void program() throws RecognitionException {
		try {
			// semantica.g:52:9: ( ( clase )+ )
			// semantica.g:52:11: ( clase )+
			{
			// semantica.g:52:11: ( clase )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= PRIVATE && LA1_0 <= PUBLIC)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// semantica.g:52:11: clase
					{
					pushFollow(FOLLOW_clase_in_program22);
					clase();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "clase"
	// semantica.g:54:1: clase : modificAcceso 'class' ID '{' ( miembro )* '}' ;
	public final void clase() throws RecognitionException {
		Token ID1=null;

		try {
			// semantica.g:54:7: ( modificAcceso 'class' ID '{' ( miembro )* '}' )
			// semantica.g:54:9: modificAcceso 'class' ID '{' ( miembro )* '}'
			{
			pushFollow(FOLLOW_modificAcceso_in_clase32);
			modificAcceso();
			state._fsp--;

			match(input,22,FOLLOW_22_in_clase34); 
			ID1=(Token)match(input,ID,FOLLOW_ID_in_clase36); 
			pushTSG((ID1!=null?ID1.getText():null), "class");
			match(input,23,FOLLOW_23_in_clase40); 
			// semantica.g:55:5: ( miembro )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==DOUBLE||(LA2_0 >= INT && LA2_0 <= PUBLIC)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// semantica.g:55:5: miembro
					{
					pushFollow(FOLLOW_miembro_in_clase46);
					miembro();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input,24,FOLLOW_24_in_clase49); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "clase"



	// $ANTLR start "miembro"
	// semantica.g:58:1: miembro : ( metodo | atributo );
	public final void miembro() throws RecognitionException {
		try {
			// semantica.g:58:9: ( metodo | atributo )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= PRIVATE && LA3_0 <= PUBLIC)) ) {
				alt3=1;
			}
			else if ( (LA3_0==DOUBLE||LA3_0==INT) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// semantica.g:58:11: metodo
					{
					pushFollow(FOLLOW_metodo_in_miembro57);
					metodo();
					state._fsp--;

					}
					break;
				case 2 :
					// semantica.g:58:20: atributo
					{
					pushFollow(FOLLOW_atributo_in_miembro61);
					atributo();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "miembro"



	// $ANTLR start "metodo"
	// semantica.g:60:1: metodo : modificAcceso tipo id1= ID '(' ( decl_args )? ')' '{' ( instruccion )* '}' ;
	public final void metodo() throws RecognitionException {
		Token id1=null;

		try {
			// semantica.g:60:8: ( modificAcceso tipo id1= ID '(' ( decl_args )? ')' '{' ( instruccion )* '}' )
			// semantica.g:60:10: modificAcceso tipo id1= ID '(' ( decl_args )? ')' '{' ( instruccion )* '}'
			{
			pushFollow(FOLLOW_modificAcceso_in_metodo70);
			modificAcceso();
			state._fsp--;

			pushFollow(FOLLOW_tipo_in_metodo72);
			tipo();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_metodo76); 
			match(input,15,FOLLOW_15_in_metodo78); 
			// semantica.g:60:40: ( decl_args )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==DOUBLE||LA4_0==INT) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// semantica.g:60:40: decl_args
					{
					pushFollow(FOLLOW_decl_args_in_metodo80);
					decl_args();
					state._fsp--;

					}
					break;

			}

			match(input,16,FOLLOW_16_in_metodo83); 
			 
			            pushTSG((id1!=null?id1.getText():null),"metodo"); 
			        
			match(input,23,FOLLOW_23_in_metodo105); 
			// semantica.g:65:13: ( instruccion )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= DOUBLE && LA5_0 <= INT)) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// semantica.g:65:13: instruccion
					{
					pushFollow(FOLLOW_instruccion_in_metodo121);
					instruccion();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			match(input,24,FOLLOW_24_in_metodo132); 
			TSL.clear();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "metodo"



	// $ANTLR start "atributo"
	// semantica.g:68:1: atributo : tipo ID SEMICOLON ;
	public final void atributo() throws RecognitionException {
		Token ID2=null;
		ParserRuleReturnScope tipo3 =null;

		try {
			// semantica.g:68:10: ( tipo ID SEMICOLON )
			// semantica.g:68:12: tipo ID SEMICOLON
			{
			pushFollow(FOLLOW_tipo_in_atributo143);
			tipo3=tipo();
			state._fsp--;

			ID2=(Token)match(input,ID,FOLLOW_ID_in_atributo145); 
			 pushTSG((ID2!=null?ID2.getText():null), (tipo3!=null?input.toString(tipo3.start,tipo3.stop):null)); 
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_atributo149); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "atributo"



	// $ANTLR start "instruccion"
	// semantica.g:70:1: instruccion : ( asignacion | decl_local );
	public final void instruccion() throws RecognitionException {
		try {
			// semantica.g:70:13: ( asignacion | decl_local )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				alt6=1;
			}
			else if ( (LA6_0==DOUBLE||LA6_0==INT) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// semantica.g:70:15: asignacion
					{
					pushFollow(FOLLOW_asignacion_in_instruccion157);
					asignacion();
					state._fsp--;

					}
					break;
				case 2 :
					// semantica.g:70:28: decl_local
					{
					pushFollow(FOLLOW_decl_local_in_instruccion161);
					decl_local();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "instruccion"



	// $ANTLR start "asignacion"
	// semantica.g:71:1: asignacion : ID '=' expr SEMICOLON ;
	public final void asignacion() throws RecognitionException {
		Token ID4=null;
		int expr5 =0;

		try {
			// semantica.g:71:12: ( ID '=' expr SEMICOLON )
			// semantica.g:71:14: ID '=' expr SEMICOLON
			{
			ID4=(Token)match(input,ID,FOLLOW_ID_in_asignacion168); 
			match(input,21,FOLLOW_21_in_asignacion170); 
			pushFollow(FOLLOW_expr_in_asignacion172);
			expr5=expr();
			state._fsp--;


			    Integer tipoVar = (Integer) TSL.get((ID4!=null?ID4.getText():null));
			    
			    if (tipoVar == null) {  
			        tipoVar = (Integer) TSG.get((ID4!=null?ID4.getText():null));
			    }
			    
			    if (tipoVar == null) {  
			        System.err.println("Error: Variable '" + (ID4!=null?ID4.getText():null) + "' no fue declarada.");
			    } else if (tipoVar == 3 || expr5 == 3) { 
			        System.err.println("Error en asignación a '" + (ID4!=null?ID4.getText():null) + "' debido a error en la expresión.");
			    } else if (tipoVar != expr5) {  
			        System.err.println("Error: Tipos incompatibles en asignación a '" + (ID4!=null?ID4.getText():null) + "' (" + 
			                           (tipoVar == 1 ? "int" : "double") + " = " + 
			                           (expr5 == 1 ? "int" : "double") + ").");
			    }

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_asignacion176); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "asignacion"



	// $ANTLR start "decl_args"
	// semantica.g:89:1: decl_args : tipo1= tipo id1= ID ( COMMA tipo2= tipo id2= ID )* ;
	public final void decl_args() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope tipo1 =null;
		ParserRuleReturnScope tipo2 =null;

		try {
			// semantica.g:89:11: (tipo1= tipo id1= ID ( COMMA tipo2= tipo id2= ID )* )
			// semantica.g:89:13: tipo1= tipo id1= ID ( COMMA tipo2= tipo id2= ID )*
			{
			pushFollow(FOLLOW_tipo_in_decl_args186);
			tipo1=tipo();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_decl_args190); 
			pushTSL((id1!=null?id1.getText():null), (tipo1!=null?input.toString(tipo1.start,tipo1.stop):null));
			// semantica.g:90:5: ( COMMA tipo2= tipo id2= ID )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// semantica.g:90:6: COMMA tipo2= tipo id2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_decl_args201); 
					pushFollow(FOLLOW_tipo_in_decl_args205);
					tipo2=tipo();
					state._fsp--;

					id2=(Token)match(input,ID,FOLLOW_ID_in_decl_args209); 
					pushTSL((id2!=null?id2.getText():null), (tipo2!=null?input.toString(tipo2.start,tipo2.stop):null));
					}
					break;

				default :
					break loop7;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decl_args"



	// $ANTLR start "decl_local"
	// semantica.g:92:1: decl_local : tipo id1= ID ( ',' id2= ID )* SEMICOLON ;
	public final void decl_local() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope tipo6 =null;

		try {
			// semantica.g:92:12: ( tipo id1= ID ( ',' id2= ID )* SEMICOLON )
			// semantica.g:92:14: tipo id1= ID ( ',' id2= ID )* SEMICOLON
			{
			pushFollow(FOLLOW_tipo_in_decl_local221);
			tipo6=tipo();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_decl_local225); 
			pushTSL((id1!=null?id1.getText():null), (tipo6!=null?input.toString(tipo6.start,tipo6.stop):null));
			// semantica.g:92:60: ( ',' id2= ID )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMMA) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// semantica.g:92:61: ',' id2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_decl_local230); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_decl_local235); 
					pushTSL((id2!=null?id2.getText():null), (tipo6!=null?input.toString(tipo6.start,tipo6.stop):null));
					}
					break;

				default :
					break loop8;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_decl_local241); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decl_local"



	// $ANTLR start "expr"
	// semantica.g:95:1: expr returns [int tipo] : m1= multExpr (op= ( '+' | '-' ) m2= multExpr )* ;
	public final int expr() throws RecognitionException {
		int tipo = 0;


		Token op=null;
		int m1 =0;
		int m2 =0;

		try {
			// semantica.g:96:5: (m1= multExpr (op= ( '+' | '-' ) m2= multExpr )* )
			// semantica.g:96:7: m1= multExpr (op= ( '+' | '-' ) m2= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr262);
			m1=multExpr();
			state._fsp--;

			 
			        tipo = m1;
			    
			// semantica.g:99:7: (op= ( '+' | '-' ) m2= multExpr )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= 18 && LA9_0 <= 19)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// semantica.g:99:8: op= ( '+' | '-' ) m2= multExpr
					{
					op=input.LT(1);
					if ( (input.LA(1) >= 18 && input.LA(1) <= 19) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_expr286);
					m2=multExpr();
					state._fsp--;

					 
					        if ((tipo != m2) && (tipo != 3) && (m2 != 3)) {  
					            System.err.println("Error: Operación con tipos incompatibles (" + 
					                               (tipo == 1 ? "int" : "double") + " y " + 
					                               (m2 == 1 ? "int" : "double") + ").");
					            tipo = 3;  
					        }
					      
					}
					break;

				default :
					break loop9;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tipo;
	}
	// $ANTLR end "expr"



	// $ANTLR start "multExpr"
	// semantica.g:108:1: multExpr returns [int tipo] : a1= atom (op= ( '*' | '/' ) a2= atom )* ;
	public final int multExpr() throws RecognitionException {
		int tipo = 0;


		Token op=null;
		int a1 =0;
		int a2 =0;

		try {
			// semantica.g:109:5: (a1= atom (op= ( '*' | '/' ) a2= atom )* )
			// semantica.g:109:7: a1= atom (op= ( '*' | '/' ) a2= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr310);
			a1=atom();
			state._fsp--;

			 
			        tipo = a1; 
			    
			// semantica.g:112:7: (op= ( '*' | '/' ) a2= atom )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==17||LA10_0==20) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// semantica.g:112:8: op= ( '*' | '/' ) a2= atom
					{
					op=input.LT(1);
					if ( input.LA(1)==17||input.LA(1)==20 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_atom_in_multExpr335);
					a2=atom();
					state._fsp--;

					 
					        if ((tipo != a2) && (tipo != 3) && (a2 != 3)) {  
					            System.err.println("Error: Operación con tipos incompatibles (" + 
					                               (tipo == 1 ? "int" : "double") + " y " + 
					                               (a2 == 1 ? "int" : "double") + ").");
					            tipo = 3;  
					        }
					      
					}
					break;

				default :
					break loop10;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tipo;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// semantica.g:121:1: atom returns [int tipo] : ( ID | CINT | CDOUBLE | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int tipo = 0;


		Token ID7=null;
		int expr8 =0;

		try {
			// semantica.g:122:5: ( ID | CINT | CDOUBLE | '(' expr ')' )
			int alt11=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt11=1;
				}
				break;
			case CINT:
				{
				alt11=2;
				}
				break;
			case CDOUBLE:
				{
				alt11=3;
				}
				break;
			case 15:
				{
				alt11=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// semantica.g:122:7: ID
					{
					ID7=(Token)match(input,ID,FOLLOW_ID_in_atom356); 

					        // Buscar en TSL (variables locales y argumentos)
					        Integer tipoVar = (Integer) TSL.get((ID7!=null?ID7.getText():null));
					        
					        if (tipoVar == null) {  // Si no está en TSL, buscar en TSG
					            tipoVar = (Integer) TSG.get((ID7!=null?ID7.getText():null));
					            
					            if (tipoVar == null) {  // No está en ninguna tabla → ERROR
					                System.err.println("Error: Variable '" + (ID7!=null?ID7.getText():null) + "' no fue declarada.");
					                tipo = 3;  // Devolver 3 como tipo de error
					            } else {
					                tipo = tipoVar;  // Variable encontrada en TSG
					            }
					        } else {
					            tipo = tipoVar;  // Variable encontrada en TSL
					        }
					    
					}
					break;
				case 2 :
					// semantica.g:139:7: CINT
					{
					match(input,CINT,FOLLOW_CINT_in_atom366); 
					 tipo = 1; 
					}
					break;
				case 3 :
					// semantica.g:140:7: CDOUBLE
					{
					match(input,CDOUBLE,FOLLOW_CDOUBLE_in_atom382); 
					 tipo = 2; 
					}
					break;
				case 4 :
					// semantica.g:141:7: '(' expr ')'
					{
					match(input,15,FOLLOW_15_in_atom395); 
					pushFollow(FOLLOW_expr_in_atom397);
					expr8=expr();
					state._fsp--;

					 tipo = expr8; 
					match(input,16,FOLLOW_16_in_atom402); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tipo;
	}
	// $ANTLR end "atom"



	// $ANTLR start "modificAcceso"
	// semantica.g:145:1: modificAcceso : ( PUBLIC | PRIVATE | PROTECTED );
	public final void modificAcceso() throws RecognitionException {
		try {
			// semantica.g:145:15: ( PUBLIC | PRIVATE | PROTECTED )
			// semantica.g:
			{
			if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "modificAcceso"


	public static class tipo_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "tipo"
	// semantica.g:146:1: tipo : ( INT | DOUBLE );
	public final semanticaParser.tipo_return tipo() throws RecognitionException {
		semanticaParser.tipo_return retval = new semanticaParser.tipo_return();
		retval.start = input.LT(1);

		try {
			// semantica.g:146:6: ( INT | DOUBLE )
			// semantica.g:
			{
			if ( input.LA(1)==DOUBLE||input.LA(1)==INT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tipo"

	// Delegated rules



	public static final BitSet FOLLOW_clase_in_program22 = new BitSet(new long[]{0x0000000000001C02L});
	public static final BitSet FOLLOW_modificAcceso_in_clase32 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_clase34 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_clase36 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_clase40 = new BitSet(new long[]{0x0000000001001E80L});
	public static final BitSet FOLLOW_miembro_in_clase46 = new BitSet(new long[]{0x0000000001001E80L});
	public static final BitSet FOLLOW_24_in_clase49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_metodo_in_miembro57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atributo_in_miembro61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modificAcceso_in_metodo70 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_tipo_in_metodo72 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_metodo76 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_metodo78 = new BitSet(new long[]{0x0000000000010280L});
	public static final BitSet FOLLOW_decl_args_in_metodo80 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_metodo83 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_metodo105 = new BitSet(new long[]{0x0000000001000380L});
	public static final BitSet FOLLOW_instruccion_in_metodo121 = new BitSet(new long[]{0x0000000001000380L});
	public static final BitSet FOLLOW_24_in_metodo132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipo_in_atributo143 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_atributo145 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_SEMICOLON_in_atributo149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_asignacion_in_instruccion157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_local_in_instruccion161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_asignacion168 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_asignacion170 = new BitSet(new long[]{0x0000000000008130L});
	public static final BitSet FOLLOW_expr_in_asignacion172 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_SEMICOLON_in_asignacion176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipo_in_decl_args186 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_decl_args190 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_decl_args201 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_tipo_in_decl_args205 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_decl_args209 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_tipo_in_decl_local221 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_decl_local225 = new BitSet(new long[]{0x0000000000002040L});
	public static final BitSet FOLLOW_COMMA_in_decl_local230 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_decl_local235 = new BitSet(new long[]{0x0000000000002040L});
	public static final BitSet FOLLOW_SEMICOLON_in_decl_local241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr262 = new BitSet(new long[]{0x00000000000C0002L});
	public static final BitSet FOLLOW_set_in_expr276 = new BitSet(new long[]{0x0000000000008130L});
	public static final BitSet FOLLOW_multExpr_in_expr286 = new BitSet(new long[]{0x00000000000C0002L});
	public static final BitSet FOLLOW_atom_in_multExpr310 = new BitSet(new long[]{0x0000000000120002L});
	public static final BitSet FOLLOW_set_in_multExpr325 = new BitSet(new long[]{0x0000000000008130L});
	public static final BitSet FOLLOW_atom_in_multExpr335 = new BitSet(new long[]{0x0000000000120002L});
	public static final BitSet FOLLOW_ID_in_atom356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CINT_in_atom366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CDOUBLE_in_atom382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_atom395 = new BitSet(new long[]{0x0000000000008130L});
	public static final BitSet FOLLOW_expr_in_atom397 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_atom402 = new BitSet(new long[]{0x0000000000000002L});
}

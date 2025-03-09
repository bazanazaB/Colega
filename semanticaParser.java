// $ANTLR 3.5.2 semantica.g 2025-03-09 09:41:26

        import java.util.HashMap;
    

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class semanticaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CDOUBLE", "CINT", "COMMA", "DOUBLE", 
		"ID", "INT", "PRIVATE", "PROTECTED", "PUBLIC", "SEMICOLON", "VOID", "WS", 
		"'('", "')'", "'*'", "'+'", "'-'", "'/'", "'='", "'class'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
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
	public static final int VOID=14;
	public static final int WS=15;

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
	// semantica.g:51:5: program : ( clase )+ ;
	public final void program() throws RecognitionException {
		try {
			// semantica.g:51:13: ( ( clase )+ )
			// semantica.g:51:15: ( clase )+
			{
			// semantica.g:51:15: ( clase )+
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
					// semantica.g:51:15: clase
					{
					pushFollow(FOLLOW_clase_in_program38);
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
	// semantica.g:53:5: clase : modificAcceso 'class' ID '{' ( miembro )* '}' ;
	public final void clase() throws RecognitionException {
		Token ID1=null;

		try {
			// semantica.g:53:11: ( modificAcceso 'class' ID '{' ( miembro )* '}' )
			// semantica.g:53:13: modificAcceso 'class' ID '{' ( miembro )* '}'
			{
			pushFollow(FOLLOW_modificAcceso_in_clase52);
			modificAcceso();
			state._fsp--;

			match(input,23,FOLLOW_23_in_clase54); 
			ID1=(Token)match(input,ID,FOLLOW_ID_in_clase56); 
			pushTSG((ID1!=null?ID1.getText():null), "class");
			match(input,24,FOLLOW_24_in_clase60); 
			// semantica.g:54:9: ( miembro )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==DOUBLE||(LA2_0 >= INT && LA2_0 <= PUBLIC)||LA2_0==VOID) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// semantica.g:54:9: miembro
					{
					pushFollow(FOLLOW_miembro_in_clase70);
					miembro();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input,25,FOLLOW_25_in_clase77); 
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
	// semantica.g:57:5: miembro : ( metodo | atributo );
	public final void miembro() throws RecognitionException {
		try {
			// semantica.g:57:13: ( metodo | atributo )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= PRIVATE && LA3_0 <= PUBLIC)) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==DOUBLE||LA3_1==INT||LA3_1==VOID) ) {
					int LA3_2 = input.LA(3);
					if ( (LA3_2==ID) ) {
						int LA3_3 = input.LA(4);
						if ( (LA3_3==16) ) {
							alt3=1;
						}
						else if ( (LA3_3==COMMA||LA3_3==SEMICOLON) ) {
							alt3=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA3_0==DOUBLE||LA3_0==INT||LA3_0==VOID) ) {
				int LA3_2 = input.LA(2);
				if ( (LA3_2==ID) ) {
					int LA3_3 = input.LA(3);
					if ( (LA3_3==16) ) {
						alt3=1;
					}
					else if ( (LA3_3==COMMA||LA3_3==SEMICOLON) ) {
						alt3=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// semantica.g:57:15: metodo
					{
					pushFollow(FOLLOW_metodo_in_miembro89);
					metodo();
					state._fsp--;

					}
					break;
				case 2 :
					// semantica.g:57:24: atributo
					{
					pushFollow(FOLLOW_atributo_in_miembro93);
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
	// semantica.g:59:5: metodo : ( modificAcceso )? tipo id1= ID '(' ( decl_args )? ')' '{' ( instruccion )* '}' ;
	public final void metodo() throws RecognitionException {
		Token id1=null;

		try {
			// semantica.g:59:12: ( ( modificAcceso )? tipo id1= ID '(' ( decl_args )? ')' '{' ( instruccion )* '}' )
			// semantica.g:59:14: ( modificAcceso )? tipo id1= ID '(' ( decl_args )? ')' '{' ( instruccion )* '}'
			{
			// semantica.g:59:14: ( modificAcceso )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= PRIVATE && LA4_0 <= PUBLIC)) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// semantica.g:59:14: modificAcceso
					{
					pushFollow(FOLLOW_modificAcceso_in_metodo106);
					modificAcceso();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_tipo_in_metodo109);
			tipo();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_metodo113); 
			match(input,16,FOLLOW_16_in_metodo115); 
			// semantica.g:59:45: ( decl_args )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==DOUBLE||LA5_0==INT||LA5_0==VOID) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// semantica.g:59:45: decl_args
					{
					pushFollow(FOLLOW_decl_args_in_metodo117);
					decl_args();
					state._fsp--;

					}
					break;

			}

			match(input,17,FOLLOW_17_in_metodo120); 
			 
			                pushTSG((id1!=null?id1.getText():null),"metodo"); 
			            
			match(input,24,FOLLOW_24_in_metodo150); 
			// semantica.g:64:17: ( instruccion )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= DOUBLE && LA6_0 <= INT)||LA6_0==VOID) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// semantica.g:64:17: instruccion
					{
					pushFollow(FOLLOW_instruccion_in_metodo170);
					instruccion();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			match(input,25,FOLLOW_25_in_metodo185); 
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
	// semantica.g:67:1: atributo : ( modificAcceso )? tipo id1= ID ( COMMA id2= ID )* SEMICOLON ;
	public final void atributo() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope tipo2 =null;

		try {
			// semantica.g:67:10: ( ( modificAcceso )? tipo id1= ID ( COMMA id2= ID )* SEMICOLON )
			// semantica.g:67:12: ( modificAcceso )? tipo id1= ID ( COMMA id2= ID )* SEMICOLON
			{
			// semantica.g:67:12: ( modificAcceso )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= PRIVATE && LA7_0 <= PUBLIC)) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// semantica.g:67:12: modificAcceso
					{
					pushFollow(FOLLOW_modificAcceso_in_atributo196);
					modificAcceso();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_tipo_in_atributo199);
			tipo2=tipo();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_atributo203); 
			 pushTSG((id1!=null?id1.getText():null), (tipo2!=null?input.toString(tipo2.start,tipo2.stop):null)); 
			// semantica.g:68:12: ( COMMA id2= ID )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMMA) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// semantica.g:68:13: COMMA id2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_atributo220); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_atributo224); 
					 pushTSG((id2!=null?id2.getText():null), (tipo2!=null?input.toString(tipo2.start,tipo2.stop):null)); 
					}
					break;

				default :
					break loop8;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_atributo242); 
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
	// semantica.g:71:5: instruccion : ( asignacion | decl_local );
	public final void instruccion() throws RecognitionException {
		try {
			// semantica.g:71:17: ( asignacion | decl_local )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ID) ) {
				alt9=1;
			}
			else if ( (LA9_0==DOUBLE||LA9_0==INT||LA9_0==VOID) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// semantica.g:71:19: asignacion
					{
					pushFollow(FOLLOW_asignacion_in_instruccion254);
					asignacion();
					state._fsp--;

					}
					break;
				case 2 :
					// semantica.g:71:32: decl_local
					{
					pushFollow(FOLLOW_decl_local_in_instruccion258);
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
	// semantica.g:73:5: asignacion : ID '=' expr SEMICOLON ;
	public final void asignacion() throws RecognitionException {
		Token ID3=null;
		int expr4 =0;

		try {
			// semantica.g:73:16: ( ID '=' expr SEMICOLON )
			// semantica.g:73:18: ID '=' expr SEMICOLON
			{
			ID3=(Token)match(input,ID,FOLLOW_ID_in_asignacion270); 
			match(input,22,FOLLOW_22_in_asignacion272); 
			pushFollow(FOLLOW_expr_in_asignacion274);
			expr4=expr();
			state._fsp--;


			        Integer tipoVar = (Integer) TSL.get((ID3!=null?ID3.getText():null));
			        
			        if (tipoVar == null) {  
			            tipoVar = (Integer) TSG.get((ID3!=null?ID3.getText():null));
			        }
			        
			        if (tipoVar == null) {  
			            System.err.println("Error: Variable '" + (ID3!=null?ID3.getText():null) + "' no fue declarada.");
			        } else if (tipoVar == 3 || expr4 == 3) { 
			            System.err.println("Error en asignación a '" + (ID3!=null?ID3.getText():null) + "' debido a error en la expresión.");
			        } else if (tipoVar != expr4) {  
			            System.err.println("Error: Tipos incompatibles en asignación a '" + (ID3!=null?ID3.getText():null) + "' (" + 
			                            (tipoVar == 1 ? "int" : "double") + " = " + 
			                            (expr4 == 1 ? "int" : "double") + ").");
			        }
			    
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_asignacion278); 
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
	// semantica.g:91:5: decl_args : tipo1= tipo id1= ID ( COMMA tipo2= tipo id2= ID )* ;
	public final void decl_args() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope tipo1 =null;
		ParserRuleReturnScope tipo2 =null;

		try {
			// semantica.g:91:15: (tipo1= tipo id1= ID ( COMMA tipo2= tipo id2= ID )* )
			// semantica.g:91:17: tipo1= tipo id1= ID ( COMMA tipo2= tipo id2= ID )*
			{
			pushFollow(FOLLOW_tipo_in_decl_args292);
			tipo1=tipo();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_decl_args296); 
			pushTSL((id1!=null?id1.getText():null), (tipo1!=null?input.toString(tipo1.start,tipo1.stop):null));
			// semantica.g:92:9: ( COMMA tipo2= tipo id2= ID )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==COMMA) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// semantica.g:92:10: COMMA tipo2= tipo id2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_decl_args311); 
					pushFollow(FOLLOW_tipo_in_decl_args315);
					tipo2=tipo();
					state._fsp--;

					id2=(Token)match(input,ID,FOLLOW_ID_in_decl_args319); 
					pushTSL((id2!=null?id2.getText():null), (tipo2!=null?input.toString(tipo2.start,tipo2.stop):null));
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
	}
	// $ANTLR end "decl_args"



	// $ANTLR start "decl_local"
	// semantica.g:94:5: decl_local : tipo id1= ID ( ',' id2= ID )* SEMICOLON ;
	public final void decl_local() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope tipo5 =null;

		try {
			// semantica.g:94:16: ( tipo id1= ID ( ',' id2= ID )* SEMICOLON )
			// semantica.g:94:18: tipo id1= ID ( ',' id2= ID )* SEMICOLON
			{
			pushFollow(FOLLOW_tipo_in_decl_local335);
			tipo5=tipo();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_decl_local339); 
			pushTSL((id1!=null?id1.getText():null), (tipo5!=null?input.toString(tipo5.start,tipo5.stop):null));
			// semantica.g:94:64: ( ',' id2= ID )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==COMMA) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// semantica.g:94:65: ',' id2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_decl_local344); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_decl_local349); 
					pushTSL((id2!=null?id2.getText():null), (tipo5!=null?input.toString(tipo5.start,tipo5.stop):null));
					}
					break;

				default :
					break loop11;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_decl_local355); 
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
	// semantica.g:97:5: expr returns [int tipo] : m1= multExpr (op= ( '+' | '-' ) m2= multExpr )* ;
	public final int expr() throws RecognitionException {
		int tipo = 0;


		Token op=null;
		int m1 =0;
		int m2 =0;

		try {
			// semantica.g:98:9: (m1= multExpr (op= ( '+' | '-' ) m2= multExpr )* )
			// semantica.g:98:11: m1= multExpr (op= ( '+' | '-' ) m2= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr384);
			m1=multExpr();
			state._fsp--;

			 
			            tipo = m1;
			        
			// semantica.g:101:9: (op= ( '+' | '-' ) m2= multExpr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= 19 && LA12_0 <= 20)) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// semantica.g:101:10: op= ( '+' | '-' ) m2= multExpr
					{
					op=input.LT(1);
					if ( (input.LA(1) >= 19 && input.LA(1) <= 20) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_expr410);
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
					break loop12;
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
	// semantica.g:110:5: multExpr returns [int tipo] : a1= atom (op= ( '*' | '/' ) a2= atom )* ;
	public final int multExpr() throws RecognitionException {
		int tipo = 0;


		Token op=null;
		int a1 =0;
		int a2 =0;

		try {
			// semantica.g:111:9: (a1= atom (op= ( '*' | '/' ) a2= atom )* )
			// semantica.g:111:11: a1= atom (op= ( '*' | '/' ) a2= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr442);
			a1=atom();
			state._fsp--;

			 
			            tipo = a1; 
			        
			// semantica.g:114:9: (op= ( '*' | '/' ) a2= atom )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==18||LA13_0==21) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// semantica.g:114:10: op= ( '*' | '/' ) a2= atom
					{
					op=input.LT(1);
					if ( input.LA(1)==18||input.LA(1)==21 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_atom_in_multExpr469);
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
					break loop13;
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
	// semantica.g:123:5: atom returns [int tipo] : ( ID | CINT | CDOUBLE | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int tipo = 0;


		Token ID6=null;
		int expr7 =0;

		try {
			// semantica.g:124:9: ( ID | CINT | CDOUBLE | '(' expr ')' )
			int alt14=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt14=1;
				}
				break;
			case CINT:
				{
				alt14=2;
				}
				break;
			case CDOUBLE:
				{
				alt14=3;
				}
				break;
			case 16:
				{
				alt14=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// semantica.g:124:11: ID
					{
					ID6=(Token)match(input,ID,FOLLOW_ID_in_atom498); 

					            Integer tipoVar = (Integer) TSL.get((ID6!=null?ID6.getText():null));
					            
					            if (tipoVar == null) {  
					                tipoVar = (Integer) TSG.get((ID6!=null?ID6.getText():null));
					                
					                if (tipoVar == null) {  
					                    System.err.println("Error: Variable '" + (ID6!=null?ID6.getText():null) + "' no fue declarada.");
					                    tipo = 3; 
					                } else {
					                    tipo = tipoVar;  // Variable encontrada en TSG
					                }
					            } else {
					                tipo = tipoVar;  // Variable encontrada en TSL
					            }
					        
					}
					break;
				case 2 :
					// semantica.g:140:11: CINT
					{
					match(input,CINT,FOLLOW_CINT_in_atom512); 
					 tipo = 1; 
					}
					break;
				case 3 :
					// semantica.g:141:11: CDOUBLE
					{
					match(input,CDOUBLE,FOLLOW_CDOUBLE_in_atom532); 
					 tipo = 2; 
					}
					break;
				case 4 :
					// semantica.g:142:11: '(' expr ')'
					{
					match(input,16,FOLLOW_16_in_atom549); 
					pushFollow(FOLLOW_expr_in_atom551);
					expr7=expr();
					state._fsp--;

					 tipo = expr7; 
					match(input,17,FOLLOW_17_in_atom556); 
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
	// semantica.g:146:5: modificAcceso : ( PUBLIC | PRIVATE | PROTECTED );
	public final void modificAcceso() throws RecognitionException {
		try {
			// semantica.g:146:19: ( PUBLIC | PRIVATE | PROTECTED )
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
	// semantica.g:147:5: tipo : ( INT | DOUBLE | VOID );
	public final semanticaParser.tipo_return tipo() throws RecognitionException {
		semanticaParser.tipo_return retval = new semanticaParser.tipo_return();
		retval.start = input.LT(1);

		try {
			// semantica.g:147:10: ( INT | DOUBLE | VOID )
			// semantica.g:
			{
			if ( input.LA(1)==DOUBLE||input.LA(1)==INT||input.LA(1)==VOID ) {
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



	public static final BitSet FOLLOW_clase_in_program38 = new BitSet(new long[]{0x0000000000001C02L});
	public static final BitSet FOLLOW_modificAcceso_in_clase52 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_clase54 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_clase56 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_clase60 = new BitSet(new long[]{0x0000000002005E80L});
	public static final BitSet FOLLOW_miembro_in_clase70 = new BitSet(new long[]{0x0000000002005E80L});
	public static final BitSet FOLLOW_25_in_clase77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_metodo_in_miembro89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atributo_in_miembro93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modificAcceso_in_metodo106 = new BitSet(new long[]{0x0000000000004280L});
	public static final BitSet FOLLOW_tipo_in_metodo109 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_metodo113 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_metodo115 = new BitSet(new long[]{0x0000000000024280L});
	public static final BitSet FOLLOW_decl_args_in_metodo117 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_metodo120 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_metodo150 = new BitSet(new long[]{0x0000000002004380L});
	public static final BitSet FOLLOW_instruccion_in_metodo170 = new BitSet(new long[]{0x0000000002004380L});
	public static final BitSet FOLLOW_25_in_metodo185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modificAcceso_in_atributo196 = new BitSet(new long[]{0x0000000000004280L});
	public static final BitSet FOLLOW_tipo_in_atributo199 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_atributo203 = new BitSet(new long[]{0x0000000000002040L});
	public static final BitSet FOLLOW_COMMA_in_atributo220 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_atributo224 = new BitSet(new long[]{0x0000000000002040L});
	public static final BitSet FOLLOW_SEMICOLON_in_atributo242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_asignacion_in_instruccion254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_local_in_instruccion258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_asignacion270 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_asignacion272 = new BitSet(new long[]{0x0000000000010130L});
	public static final BitSet FOLLOW_expr_in_asignacion274 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_SEMICOLON_in_asignacion278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipo_in_decl_args292 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_decl_args296 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_decl_args311 = new BitSet(new long[]{0x0000000000004280L});
	public static final BitSet FOLLOW_tipo_in_decl_args315 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_decl_args319 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_tipo_in_decl_local335 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_decl_local339 = new BitSet(new long[]{0x0000000000002040L});
	public static final BitSet FOLLOW_COMMA_in_decl_local344 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_decl_local349 = new BitSet(new long[]{0x0000000000002040L});
	public static final BitSet FOLLOW_SEMICOLON_in_decl_local355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr384 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_set_in_expr400 = new BitSet(new long[]{0x0000000000010130L});
	public static final BitSet FOLLOW_multExpr_in_expr410 = new BitSet(new long[]{0x0000000000180002L});
	public static final BitSet FOLLOW_atom_in_multExpr442 = new BitSet(new long[]{0x0000000000240002L});
	public static final BitSet FOLLOW_set_in_multExpr459 = new BitSet(new long[]{0x0000000000010130L});
	public static final BitSet FOLLOW_atom_in_multExpr469 = new BitSet(new long[]{0x0000000000240002L});
	public static final BitSet FOLLOW_ID_in_atom498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CINT_in_atom512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CDOUBLE_in_atom532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_atom549 = new BitSet(new long[]{0x0000000000010130L});
	public static final BitSet FOLLOW_expr_in_atom551 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_atom556 = new BitSet(new long[]{0x0000000000000002L});
}

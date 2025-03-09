// $ANTLR 3.5.2 semantica.g 2025-03-09 09:37:11

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class semanticaLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public semanticaLexer() {} 
	public semanticaLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public semanticaLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "semantica.g"; }

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:2:7: ( '(' )
			// semantica.g:2:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:3:7: ( ')' )
			// semantica.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:4:7: ( '*' )
			// semantica.g:4:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:5:7: ( '+' )
			// semantica.g:5:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:6:7: ( '-' )
			// semantica.g:6:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:7:7: ( '/' )
			// semantica.g:7:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:8:7: ( '=' )
			// semantica.g:8:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:9:7: ( 'class' )
			// semantica.g:9:9: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:10:7: ( '{' )
			// semantica.g:10:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:11:7: ( '}' )
			// semantica.g:11:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:149:5: ( 'int' )
			// semantica.g:149:7: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:150:8: ( 'double' )
			// semantica.g:150:10: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "PUBLIC"
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:151:8: ( 'public' )
			// semantica.g:151:10: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUBLIC"

	// $ANTLR start "PRIVATE"
	public final void mPRIVATE() throws RecognitionException {
		try {
			int _type = PRIVATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:152:9: ( 'private' )
			// semantica.g:152:11: 'private'
			{
			match("private"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRIVATE"

	// $ANTLR start "PROTECTED"
	public final void mPROTECTED() throws RecognitionException {
		try {
			int _type = PROTECTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:153:11: ( 'protected' )
			// semantica.g:153:13: 'protected'
			{
			match("protected"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROTECTED"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:154:11: ( ';' )
			// semantica.g:154:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:155:7: ( ',' )
			// semantica.g:155:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:156:6: ( 'void' )
			// semantica.g:156:8: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:158:4: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// semantica.g:158:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// semantica.g:158:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// semantica.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "CDOUBLE"
	public final void mCDOUBLE() throws RecognitionException {
		try {
			int _type = CDOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:159:9: ( ( '0' .. '9' ) '.' ( '0' .. '9' )+ )
			// semantica.g:159:11: ( '0' .. '9' ) '.' ( '0' .. '9' )+
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match('.'); 
			// semantica.g:159:26: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// semantica.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CDOUBLE"

	// $ANTLR start "CINT"
	public final void mCINT() throws RecognitionException {
		try {
			int _type = CINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:160:6: ( ( '0' .. '9' )+ )
			// semantica.g:160:8: ( '0' .. '9' )+
			{
			// semantica.g:160:8: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// semantica.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CINT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// semantica.g:162:4: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
			// semantica.g:162:6: ( ' ' | '\\n' | '\\t' | '\\r' )+
			{
			// semantica.g:162:6: ( ' ' | '\\n' | '\\t' | '\\r' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// semantica.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// semantica.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | INT | DOUBLE | PUBLIC | PRIVATE | PROTECTED | SEMICOLON | COMMA | VOID | ID | CDOUBLE | CINT | WS )
		int alt5=22;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// semantica.g:1:10: T__16
				{
				mT__16(); 

				}
				break;
			case 2 :
				// semantica.g:1:16: T__17
				{
				mT__17(); 

				}
				break;
			case 3 :
				// semantica.g:1:22: T__18
				{
				mT__18(); 

				}
				break;
			case 4 :
				// semantica.g:1:28: T__19
				{
				mT__19(); 

				}
				break;
			case 5 :
				// semantica.g:1:34: T__20
				{
				mT__20(); 

				}
				break;
			case 6 :
				// semantica.g:1:40: T__21
				{
				mT__21(); 

				}
				break;
			case 7 :
				// semantica.g:1:46: T__22
				{
				mT__22(); 

				}
				break;
			case 8 :
				// semantica.g:1:52: T__23
				{
				mT__23(); 

				}
				break;
			case 9 :
				// semantica.g:1:58: T__24
				{
				mT__24(); 

				}
				break;
			case 10 :
				// semantica.g:1:64: T__25
				{
				mT__25(); 

				}
				break;
			case 11 :
				// semantica.g:1:70: INT
				{
				mINT(); 

				}
				break;
			case 12 :
				// semantica.g:1:74: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 13 :
				// semantica.g:1:81: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 14 :
				// semantica.g:1:88: PRIVATE
				{
				mPRIVATE(); 

				}
				break;
			case 15 :
				// semantica.g:1:96: PROTECTED
				{
				mPROTECTED(); 

				}
				break;
			case 16 :
				// semantica.g:1:106: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 17 :
				// semantica.g:1:116: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 18 :
				// semantica.g:1:122: VOID
				{
				mVOID(); 

				}
				break;
			case 19 :
				// semantica.g:1:127: ID
				{
				mID(); 

				}
				break;
			case 20 :
				// semantica.g:1:130: CDOUBLE
				{
				mCDOUBLE(); 

				}
				break;
			case 21 :
				// semantica.g:1:138: CINT
				{
				mCINT(); 

				}
				break;
			case 22 :
				// semantica.g:1:143: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\10\uffff\1\21\2\uffff\3\21\2\uffff\1\21\1\uffff\1\33\1\uffff\6\21\2\uffff"+
		"\1\21\1\44\6\21\1\uffff\4\21\1\57\1\60\4\21\2\uffff\1\65\1\66\2\21\2\uffff"+
		"\1\71\1\21\1\uffff\1\21\1\74\1\uffff";
	static final String DFA5_eofS =
		"\75\uffff";
	static final String DFA5_minS =
		"\1\11\7\uffff\1\154\2\uffff\1\156\1\157\1\162\2\uffff\1\157\1\uffff\1"+
		"\56\1\uffff\1\141\1\164\1\165\1\142\2\151\2\uffff\1\163\1\60\1\142\1\154"+
		"\1\166\1\164\1\144\1\163\1\uffff\1\154\1\151\1\141\1\145\2\60\1\145\1"+
		"\143\1\164\1\143\2\uffff\2\60\1\145\1\164\2\uffff\1\60\1\145\1\uffff\1"+
		"\144\1\60\1\uffff";
	static final String DFA5_maxS =
		"\1\175\7\uffff\1\154\2\uffff\1\156\1\157\1\165\2\uffff\1\157\1\uffff\1"+
		"\56\1\uffff\1\141\1\164\1\165\1\142\1\157\1\151\2\uffff\1\163\1\172\1"+
		"\142\1\154\1\166\1\164\1\144\1\163\1\uffff\1\154\1\151\1\141\1\145\2\172"+
		"\1\145\1\143\1\164\1\143\2\uffff\2\172\1\145\1\164\2\uffff\1\172\1\145"+
		"\1\uffff\1\144\1\172\1\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\12\3\uffff\1\20\1"+
		"\21\1\uffff\1\23\1\uffff\1\26\6\uffff\1\24\1\25\10\uffff\1\13\12\uffff"+
		"\1\22\1\10\4\uffff\1\14\1\15\2\uffff\1\16\2\uffff\1\17";
	static final String DFA5_specialS =
		"\75\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\23\2\uffff\1\23\22\uffff\1\23\7\uffff\1\1\1\2\1\3\1\4\1\17\1\5\1\uffff"+
			"\1\6\12\22\1\uffff\1\16\1\uffff\1\7\3\uffff\32\21\6\uffff\2\21\1\10\1"+
			"\14\4\21\1\13\6\21\1\15\5\21\1\20\4\21\1\11\1\uffff\1\12",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\24",
			"",
			"",
			"\1\25",
			"\1\26",
			"\1\30\2\uffff\1\27",
			"",
			"",
			"\1\31",
			"",
			"\1\32",
			"",
			"\1\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\40\5\uffff\1\41",
			"\1\42",
			"",
			"",
			"\1\43",
			"\12\21\7\uffff\32\21\6\uffff\32\21",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\12\21\7\uffff\32\21\6\uffff\32\21",
			"\12\21\7\uffff\32\21\6\uffff\32\21",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"",
			"",
			"\12\21\7\uffff\32\21\6\uffff\32\21",
			"\12\21\7\uffff\32\21\6\uffff\32\21",
			"\1\67",
			"\1\70",
			"",
			"",
			"\12\21\7\uffff\32\21\6\uffff\32\21",
			"\1\72",
			"",
			"\1\73",
			"\12\21\7\uffff\32\21\6\uffff\32\21",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | INT | DOUBLE | PUBLIC | PRIVATE | PROTECTED | SEMICOLON | COMMA | VOID | ID | CDOUBLE | CINT | WS );";
		}
	}

}

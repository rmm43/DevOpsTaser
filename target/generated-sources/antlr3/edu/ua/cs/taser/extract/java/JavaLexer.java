// $ANTLR 3.5 edu/ua/cs/taser/extract/java/JavaLexer.g 2017-05-10 08:21:12

    package edu.ua.cs.taser.javatext;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JavaLexer extends BaseJavaLexer {
	public static final int EOF=-1;
	public static final int ABSTRACT=4;
	public static final int ADD=5;
	public static final int AND=6;
	public static final int ASG=7;
	public static final int ASGADD=8;
	public static final int ASGBITAND=9;
	public static final int ASGBITOR=10;
	public static final int ASGBITXOR=11;
	public static final int ASGDIV=12;
	public static final int ASGMUL=13;
	public static final int ASGREM=14;
	public static final int ASGSUB=15;
	public static final int ASSERT=16;
	public static final int AT=17;
	public static final int BITAND=18;
	public static final int BITNOT=19;
	public static final int BITOR=20;
	public static final int BITXOR=21;
	public static final int BLOCK_COMMENT=22;
	public static final int BOOLEAN=23;
	public static final int BREAK=24;
	public static final int BYTE=25;
	public static final int CASE=26;
	public static final int CATCH=27;
	public static final int CHAR=28;
	public static final int CLASS=29;
	public static final int COLON=30;
	public static final int COMMA=31;
	public static final int CONTINUE=32;
	public static final int CharacterLiteral=33;
	public static final int DEC=34;
	public static final int DEFAULT=35;
	public static final int DIV=36;
	public static final int DO=37;
	public static final int DOT=38;
	public static final int DOUBLE=39;
	public static final int DecimalLiteral=40;
	public static final int ELLIPSIS=41;
	public static final int ELSE=42;
	public static final int ENUM=43;
	public static final int EQ=44;
	public static final int EXTENDS=45;
	public static final int EscapeSequence=46;
	public static final int Exponent=47;
	public static final int FALSE=48;
	public static final int FINAL=49;
	public static final int FINALLY=50;
	public static final int FLOAT=51;
	public static final int FOR=52;
	public static final int FloatTypeSuffix=53;
	public static final int FloatingPointLiteral=54;
	public static final int GT=55;
	public static final int HexDigit=56;
	public static final int HexLiteral=57;
	public static final int IF=58;
	public static final int IMPLEMENTS=59;
	public static final int IMPORT=60;
	public static final int INC=61;
	public static final int INSTANCEOF=62;
	public static final int INT=63;
	public static final int INTERFACE=64;
	public static final int Identifier=65;
	public static final int IntegerTypeSuffix=66;
	public static final int JavaIDDigit=67;
	public static final int LBRACE=68;
	public static final int LBRACKET=69;
	public static final int LINE_COMMENT=70;
	public static final int LONG=71;
	public static final int LPAREN=72;
	public static final int LT=73;
	public static final int Letter=74;
	public static final int MUL=75;
	public static final int NATIVE=76;
	public static final int NE=77;
	public static final int NEW=78;
	public static final int NOT=79;
	public static final int NULL=80;
	public static final int OR=81;
	public static final int OctalEscape=82;
	public static final int OctalLiteral=83;
	public static final int PACKAGE=84;
	public static final int PRIVATE=85;
	public static final int PROTECTED=86;
	public static final int PUBLIC=87;
	public static final int QUESTIONMARK=88;
	public static final int RBRACE=89;
	public static final int RBRACKET=90;
	public static final int REM=91;
	public static final int RETURN=92;
	public static final int RPAREN=93;
	public static final int SEMICOLON=94;
	public static final int SHORT=95;
	public static final int STATIC=96;
	public static final int STRICTFP=97;
	public static final int SUB=98;
	public static final int SUPER=99;
	public static final int SWITCH=100;
	public static final int SYNCHRONIZED=101;
	public static final int StringLiteral=102;
	public static final int THIS=103;
	public static final int THROW=104;
	public static final int THROWS=105;
	public static final int TRANSIENT=106;
	public static final int TRUE=107;
	public static final int TRY=108;
	public static final int UnicodeEscape=109;
	public static final int VOID=110;
	public static final int VOLATILE=111;
	public static final int WHILE=112;
	public static final int WS=113;

	// delegates
	// delegators
	public BaseJavaLexer[] getDelegates() {
		return new BaseJavaLexer[] {};
	}

	public JavaLexer() {} 
	public JavaLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public JavaLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "edu/ua/cs/taser/extract/java/JavaLexer.g"; }

	// $ANTLR start "ABSTRACT"
	public final void mABSTRACT() throws RecognitionException {
		try {
			int _type = ABSTRACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:12:10: ( 'abstract' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:12:12: 'abstract'
			{
			match("abstract"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ABSTRACT"

	// $ANTLR start "ASSERT"
	public final void mASSERT() throws RecognitionException {
		try {
			int _type = ASSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:13:8: ( 'assert' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:13:10: 'assert'
			{
			match("assert"); 

			 if (!assertIsKeyword()) _type = Identifier; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSERT"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:14:9: ( 'boolean' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:14:11: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:15:7: ( 'break' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:15:9: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "BYTE"
	public final void mBYTE() throws RecognitionException {
		try {
			int _type = BYTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:16:6: ( 'byte' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:16:8: 'byte'
			{
			match("byte"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BYTE"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:17:6: ( 'case' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:17:8: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "CATCH"
	public final void mCATCH() throws RecognitionException {
		try {
			int _type = CATCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:18:7: ( 'catch' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:18:9: 'catch'
			{
			match("catch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CATCH"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:19:6: ( 'char' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:19:8: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:20:7: ( 'class' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:20:9: 'class'
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
	// $ANTLR end "CLASS"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:21:10: ( 'continue' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:21:12: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE"

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:22:9: ( 'default' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:22:11: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:23:4: ( 'do' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:23:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:24:8: ( 'double' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:24:10: 'double'
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

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:25:6: ( 'else' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:25:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "ENUM"
	public final void mENUM() throws RecognitionException {
		try {
			int _type = ENUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:26:6: ( 'enum' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:26:8: 'enum'
			{
			match("enum"); 

			 if (!enumIsKeyword()) _type = Identifier; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENUM"

	// $ANTLR start "EXTENDS"
	public final void mEXTENDS() throws RecognitionException {
		try {
			int _type = EXTENDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:27:9: ( 'extends' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:27:11: 'extends'
			{
			match("extends"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXTENDS"

	// $ANTLR start "FINAL"
	public final void mFINAL() throws RecognitionException {
		try {
			int _type = FINAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:28:7: ( 'final' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:28:9: 'final'
			{
			match("final"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FINAL"

	// $ANTLR start "FINALLY"
	public final void mFINALLY() throws RecognitionException {
		try {
			int _type = FINALLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:29:9: ( 'finally' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:29:11: 'finally'
			{
			match("finally"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FINALLY"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:30:7: ( 'float' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:30:9: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:31:5: ( 'for' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:31:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:32:4: ( 'if' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:32:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "IMPLEMENTS"
	public final void mIMPLEMENTS() throws RecognitionException {
		try {
			int _type = IMPLEMENTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:33:12: ( 'implements' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:33:14: 'implements'
			{
			match("implements"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPLEMENTS"

	// $ANTLR start "IMPORT"
	public final void mIMPORT() throws RecognitionException {
		try {
			int _type = IMPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:34:8: ( 'import' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:34:10: 'import'
			{
			match("import"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPORT"

	// $ANTLR start "INSTANCEOF"
	public final void mINSTANCEOF() throws RecognitionException {
		try {
			int _type = INSTANCEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:35:12: ( 'instanceof' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:35:14: 'instanceof'
			{
			match("instanceof"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INSTANCEOF"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:36:5: ( 'int' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:36:7: 'int'
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

	// $ANTLR start "INTERFACE"
	public final void mINTERFACE() throws RecognitionException {
		try {
			int _type = INTERFACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:37:11: ( 'interface' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:37:13: 'interface'
			{
			match("interface"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTERFACE"

	// $ANTLR start "LONG"
	public final void mLONG() throws RecognitionException {
		try {
			int _type = LONG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:38:6: ( 'long' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:38:8: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG"

	// $ANTLR start "NATIVE"
	public final void mNATIVE() throws RecognitionException {
		try {
			int _type = NATIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:39:8: ( 'native' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:39:10: 'native'
			{
			match("native"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NATIVE"

	// $ANTLR start "NEW"
	public final void mNEW() throws RecognitionException {
		try {
			int _type = NEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:40:5: ( 'new' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:40:7: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW"

	// $ANTLR start "PACKAGE"
	public final void mPACKAGE() throws RecognitionException {
		try {
			int _type = PACKAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:41:9: ( 'package' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:41:11: 'package'
			{
			match("package"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PACKAGE"

	// $ANTLR start "PRIVATE"
	public final void mPRIVATE() throws RecognitionException {
		try {
			int _type = PRIVATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:42:9: ( 'private' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:42:11: 'private'
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
			// edu/ua/cs/taser/extract/java/JavaLexer.g:43:11: ( 'protected' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:43:13: 'protected'
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

	// $ANTLR start "PUBLIC"
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:44:8: ( 'public' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:44:10: 'public'
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

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:45:8: ( 'return' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:45:10: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "SHORT"
	public final void mSHORT() throws RecognitionException {
		try {
			int _type = SHORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:46:7: ( 'short' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:46:9: 'short'
			{
			match("short"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHORT"

	// $ANTLR start "STATIC"
	public final void mSTATIC() throws RecognitionException {
		try {
			int _type = STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:47:8: ( 'static' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:47:10: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATIC"

	// $ANTLR start "STRICTFP"
	public final void mSTRICTFP() throws RecognitionException {
		try {
			int _type = STRICTFP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:48:10: ( 'strictfp' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:48:12: 'strictfp'
			{
			match("strictfp"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRICTFP"

	// $ANTLR start "SUPER"
	public final void mSUPER() throws RecognitionException {
		try {
			int _type = SUPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:49:7: ( 'super' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:49:9: 'super'
			{
			match("super"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUPER"

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:50:8: ( 'switch' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:50:10: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH"

	// $ANTLR start "SYNCHRONIZED"
	public final void mSYNCHRONIZED() throws RecognitionException {
		try {
			int _type = SYNCHRONIZED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:51:14: ( 'synchronized' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:51:16: 'synchronized'
			{
			match("synchronized"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYNCHRONIZED"

	// $ANTLR start "THIS"
	public final void mTHIS() throws RecognitionException {
		try {
			int _type = THIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:52:6: ( 'this' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:52:8: 'this'
			{
			match("this"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THIS"

	// $ANTLR start "THROW"
	public final void mTHROW() throws RecognitionException {
		try {
			int _type = THROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:53:7: ( 'throw' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:53:9: 'throw'
			{
			match("throw"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THROW"

	// $ANTLR start "THROWS"
	public final void mTHROWS() throws RecognitionException {
		try {
			int _type = THROWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:54:8: ( 'throws' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:54:10: 'throws'
			{
			match("throws"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THROWS"

	// $ANTLR start "TRANSIENT"
	public final void mTRANSIENT() throws RecognitionException {
		try {
			int _type = TRANSIENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:55:11: ( 'transient' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:55:13: 'transient'
			{
			match("transient"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRANSIENT"

	// $ANTLR start "TRY"
	public final void mTRY() throws RecognitionException {
		try {
			int _type = TRY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:56:5: ( 'try' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:56:7: 'try'
			{
			match("try"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRY"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:57:6: ( 'void' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:57:8: 'void'
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

	// $ANTLR start "VOLATILE"
	public final void mVOLATILE() throws RecognitionException {
		try {
			int _type = VOLATILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:58:10: ( 'volatile' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:58:12: 'volatile'
			{
			match("volatile"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOLATILE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:59:7: ( 'while' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:59:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:61:7: ( 'false' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:61:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:62:6: ( 'null' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:62:8: 'null'
			{
			match("null"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULL"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:63:6: ( 'true' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:63:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:65:8: ( '(' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:65:10: '('
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
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:66:8: ( ')' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:66:10: ')'
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
	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACE"
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:67:8: ( '{' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:67:10: '{'
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
	// $ANTLR end "LBRACE"

	// $ANTLR start "RBRACE"
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:68:8: ( '}' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:68:10: '}'
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
	// $ANTLR end "RBRACE"

	// $ANTLR start "LBRACKET"
	public final void mLBRACKET() throws RecognitionException {
		try {
			int _type = LBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:69:10: ( '[' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:69:12: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACKET"

	// $ANTLR start "RBRACKET"
	public final void mRBRACKET() throws RecognitionException {
		try {
			int _type = RBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:70:10: ( ']' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:70:12: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACKET"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:71:11: ( ';' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:71:13: ';'
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
			// edu/ua/cs/taser/extract/java/JavaLexer.g:72:7: ( ',' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:72:9: ','
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

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:73:5: ( '.' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:73:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "ASG"
	public final void mASG() throws RecognitionException {
		try {
			int _type = ASG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:75:5: ( '=' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:75:7: '='
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
	// $ANTLR end "ASG"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:76:4: ( '<' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:76:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:77:4: ( '>' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:77:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:78:5: ( '!' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:78:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "BITNOT"
	public final void mBITNOT() throws RecognitionException {
		try {
			int _type = BITNOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:79:8: ( '~' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:79:10: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITNOT"

	// $ANTLR start "QUESTIONMARK"
	public final void mQUESTIONMARK() throws RecognitionException {
		try {
			int _type = QUESTIONMARK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:80:14: ( '?' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:80:16: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTIONMARK"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:81:7: ( ':' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:81:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:83:4: ( '==' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:83:6: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NE"
	public final void mNE() throws RecognitionException {
		try {
			int _type = NE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:84:4: ( '!=' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:84:6: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:85:5: ( '&&' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:85:7: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:86:4: ( '||' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:86:6: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "INC"
	public final void mINC() throws RecognitionException {
		try {
			int _type = INC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:87:5: ( '++' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:87:7: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INC"

	// $ANTLR start "DEC"
	public final void mDEC() throws RecognitionException {
		try {
			int _type = DEC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:88:5: ( '--' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:88:7: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:90:5: ( '+' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:90:7: '+'
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
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:91:5: ( '-' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:91:7: '-'
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
	// $ANTLR end "SUB"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:92:5: ( '*' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:92:7: '*'
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
	// $ANTLR end "MUL"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:93:5: ( '/' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:93:7: '/'
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
	// $ANTLR end "DIV"

	// $ANTLR start "BITAND"
	public final void mBITAND() throws RecognitionException {
		try {
			int _type = BITAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:94:8: ( '&' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:94:10: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITAND"

	// $ANTLR start "BITOR"
	public final void mBITOR() throws RecognitionException {
		try {
			int _type = BITOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:95:7: ( '|' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:95:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITOR"

	// $ANTLR start "BITXOR"
	public final void mBITXOR() throws RecognitionException {
		try {
			int _type = BITXOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:96:8: ( '^' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:96:10: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITXOR"

	// $ANTLR start "REM"
	public final void mREM() throws RecognitionException {
		try {
			int _type = REM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:97:5: ( '%' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:97:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REM"

	// $ANTLR start "ASGADD"
	public final void mASGADD() throws RecognitionException {
		try {
			int _type = ASGADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:99:8: ( '+=' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:99:10: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASGADD"

	// $ANTLR start "ASGSUB"
	public final void mASGSUB() throws RecognitionException {
		try {
			int _type = ASGSUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:100:8: ( '-=' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:100:10: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASGSUB"

	// $ANTLR start "ASGMUL"
	public final void mASGMUL() throws RecognitionException {
		try {
			int _type = ASGMUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:101:8: ( '*=' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:101:10: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASGMUL"

	// $ANTLR start "ASGDIV"
	public final void mASGDIV() throws RecognitionException {
		try {
			int _type = ASGDIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:102:8: ( '/=' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:102:10: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASGDIV"

	// $ANTLR start "ASGBITAND"
	public final void mASGBITAND() throws RecognitionException {
		try {
			int _type = ASGBITAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:103:11: ( '&=' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:103:13: '&='
			{
			match("&="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASGBITAND"

	// $ANTLR start "ASGBITOR"
	public final void mASGBITOR() throws RecognitionException {
		try {
			int _type = ASGBITOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:104:10: ( '|=' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:104:12: '|='
			{
			match("|="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASGBITOR"

	// $ANTLR start "ASGBITXOR"
	public final void mASGBITXOR() throws RecognitionException {
		try {
			int _type = ASGBITXOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:105:11: ( '^=' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:105:13: '^='
			{
			match("^="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASGBITXOR"

	// $ANTLR start "ASGREM"
	public final void mASGREM() throws RecognitionException {
		try {
			int _type = ASGREM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:106:8: ( '%=' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:106:10: '%='
			{
			match("%="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASGREM"

	// $ANTLR start "ELLIPSIS"
	public final void mELLIPSIS() throws RecognitionException {
		try {
			int _type = ELLIPSIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:108:10: ( '...' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:108:12: '...'
			{
			match("..."); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELLIPSIS"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:109:4: ( '@' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:109:6: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// edu/ua/cs/taser/extract/java/JavaLexer.g:112:5: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexDigit"

	// $ANTLR start "IntegerTypeSuffix"
	public final void mIntegerTypeSuffix() throws RecognitionException {
		try {
			// edu/ua/cs/taser/extract/java/JavaLexer.g:116:5: ( ( 'l' | 'L' ) )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IntegerTypeSuffix"

	// $ANTLR start "HexLiteral"
	public final void mHexLiteral() throws RecognitionException {
		try {
			int _type = HexLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:120:5: ( '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )? )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:120:9: '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )?
			{
			match('0'); 
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// edu/ua/cs/taser/extract/java/JavaLexer.g:120:23: ( HexDigit )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'F')||(LA1_0 >= 'a' && LA1_0 <= 'f')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// edu/ua/cs/taser/extract/java/JavaLexer.g:120:33: ( IntegerTypeSuffix )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='L'||LA2_0=='l') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:
					{
					if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexLiteral"

	// $ANTLR start "DecimalLiteral"
	public final void mDecimalLiteral() throws RecognitionException {
		try {
			int _type = DecimalLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:124:5: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )? )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:124:9: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )?
			{
			// edu/ua/cs/taser/extract/java/JavaLexer.g:124:9: ( '0' | '1' .. '9' ( '0' .. '9' )* )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='0') ) {
				alt4=1;
			}
			else if ( ((LA4_0 >= '1' && LA4_0 <= '9')) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:124:10: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:124:16: '1' .. '9' ( '0' .. '9' )*
					{
					matchRange('1','9'); 
					// edu/ua/cs/taser/extract/java/JavaLexer.g:124:25: ( '0' .. '9' )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaLexer.g:
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
							break loop3;
						}
					}

					}
					break;

			}

			// edu/ua/cs/taser/extract/java/JavaLexer.g:124:36: ( IntegerTypeSuffix )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='L'||LA5_0=='l') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:
					{
					if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DecimalLiteral"

	// $ANTLR start "OctalLiteral"
	public final void mOctalLiteral() throws RecognitionException {
		try {
			int _type = OctalLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:128:5: ( '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )? )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:128:9: '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )?
			{
			match('0'); 
			// edu/ua/cs/taser/extract/java/JavaLexer.g:128:13: ( '0' .. '7' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '7')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			// edu/ua/cs/taser/extract/java/JavaLexer.g:128:25: ( IntegerTypeSuffix )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='L'||LA7_0=='l') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:
					{
					if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OctalLiteral"

	// $ANTLR start "Exponent"
	public final void mExponent() throws RecognitionException {
		try {
			// edu/ua/cs/taser/extract/java/JavaLexer.g:132:5: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:132:9: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// edu/ua/cs/taser/extract/java/JavaLexer.g:132:19: ( '+' | '-' )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='+'||LA8_0=='-') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// edu/ua/cs/taser/extract/java/JavaLexer.g:132:30: ( '0' .. '9' )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:
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
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Exponent"

	// $ANTLR start "FloatTypeSuffix"
	public final void mFloatTypeSuffix() throws RecognitionException {
		try {
			// edu/ua/cs/taser/extract/java/JavaLexer.g:136:5: ( ( 'f' | 'F' | 'd' | 'D' ) )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FloatTypeSuffix"

	// $ANTLR start "FloatingPointLiteral"
	public final void mFloatingPointLiteral() throws RecognitionException {
		try {
			int _type = FloatingPointLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:140:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ FloatTypeSuffix )
			int alt20=4;
			alt20 = dfa20.predict(input);
			switch (alt20) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:140:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )?
					{
					// edu/ua/cs/taser/extract/java/JavaLexer.g:140:9: ( '0' .. '9' )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaLexer.g:
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
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					match('.'); 
					// edu/ua/cs/taser/extract/java/JavaLexer.g:140:25: ( '0' .. '9' )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaLexer.g:
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
							break loop11;
						}
					}

					// edu/ua/cs/taser/extract/java/JavaLexer.g:140:37: ( Exponent )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='E'||LA12_0=='e') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaLexer.g:140:37: Exponent
							{
							mExponent(); 

							}
							break;

					}

					// edu/ua/cs/taser/extract/java/JavaLexer.g:140:47: ( FloatTypeSuffix )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0=='D'||LA13_0=='F'||LA13_0=='d'||LA13_0=='f') ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaLexer.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:141:9: '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )?
					{
					match('.'); 
					// edu/ua/cs/taser/extract/java/JavaLexer.g:141:13: ( '0' .. '9' )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaLexer.g:
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
							if ( cnt14 >= 1 ) break loop14;
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					// edu/ua/cs/taser/extract/java/JavaLexer.g:141:25: ( Exponent )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0=='E'||LA15_0=='e') ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaLexer.g:141:25: Exponent
							{
							mExponent(); 

							}
							break;

					}

					// edu/ua/cs/taser/extract/java/JavaLexer.g:141:35: ( FloatTypeSuffix )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0=='D'||LA16_0=='F'||LA16_0=='d'||LA16_0=='f') ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaLexer.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:142:9: ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )?
					{
					// edu/ua/cs/taser/extract/java/JavaLexer.g:142:9: ( '0' .. '9' )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaLexer.g:
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
							if ( cnt17 >= 1 ) break loop17;
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					mExponent(); 

					// edu/ua/cs/taser/extract/java/JavaLexer.g:142:30: ( FloatTypeSuffix )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0=='D'||LA18_0=='F'||LA18_0=='d'||LA18_0=='f') ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaLexer.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 4 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:143:9: ( '0' .. '9' )+ FloatTypeSuffix
					{
					// edu/ua/cs/taser/extract/java/JavaLexer.g:143:9: ( '0' .. '9' )+
					int cnt19=0;
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaLexer.g:
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
							if ( cnt19 >= 1 ) break loop19;
							EarlyExitException eee = new EarlyExitException(19, input);
							throw eee;
						}
						cnt19++;
					}

					mFloatTypeSuffix(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FloatingPointLiteral"

	// $ANTLR start "OctalEscape"
	public final void mOctalEscape() throws RecognitionException {
		try {
			// edu/ua/cs/taser/extract/java/JavaLexer.g:147:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt21=3;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='\\') ) {
				int LA21_1 = input.LA(2);
				if ( ((LA21_1 >= '0' && LA21_1 <= '3')) ) {
					int LA21_2 = input.LA(3);
					if ( ((LA21_2 >= '0' && LA21_2 <= '7')) ) {
						int LA21_4 = input.LA(4);
						if ( ((LA21_4 >= '0' && LA21_4 <= '7')) ) {
							alt21=1;
						}

						else {
							alt21=2;
						}

					}

					else {
						alt21=3;
					}

				}
				else if ( ((LA21_1 >= '4' && LA21_1 <= '7')) ) {
					int LA21_3 = input.LA(3);
					if ( ((LA21_3 >= '0' && LA21_3 <= '7')) ) {
						alt21=2;
					}

					else {
						alt21=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:147:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:148:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:149:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OctalEscape"

	// $ANTLR start "UnicodeEscape"
	public final void mUnicodeEscape() throws RecognitionException {
		try {
			// edu/ua/cs/taser/extract/java/JavaLexer.g:153:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:153:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
			{
			match('\\'); 
			match('u'); 
			mHexDigit(); 

			mHexDigit(); 

			mHexDigit(); 

			mHexDigit(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UnicodeEscape"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// edu/ua/cs/taser/extract/java/JavaLexer.g:157:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
			int alt22=3;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt22=1;
					}
					break;
				case 'u':
					{
					alt22=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt22=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:157:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:158:9: UnicodeEscape
					{
					mUnicodeEscape(); 

					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:159:9: OctalEscape
					{
					mOctalEscape(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "CharacterLiteral"
	public final void mCharacterLiteral() throws RecognitionException {
		try {
			int _type = CharacterLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:163:5: ( '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:163:9: '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// edu/ua/cs/taser/extract/java/JavaLexer.g:163:14: ( EscapeSequence |~ ( '\\'' | '\\\\' ) )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0=='\\') ) {
				alt23=1;
			}
			else if ( ((LA23_0 >= '\u0000' && LA23_0 <= '&')||(LA23_0 >= '(' && LA23_0 <= '[')||(LA23_0 >= ']' && LA23_0 <= '\uFFFF')) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:163:16: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:163:33: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CharacterLiteral"

	// $ANTLR start "StringLiteral"
	public final void mStringLiteral() throws RecognitionException {
		try {
			int _type = StringLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:167:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:167:9: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// edu/ua/cs/taser/extract/java/JavaLexer.g:167:13: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
			loop24:
			while (true) {
				int alt24=3;
				int LA24_0 = input.LA(1);
				if ( (LA24_0=='\\') ) {
					alt24=1;
				}
				else if ( ((LA24_0 >= '\u0000' && LA24_0 <= '!')||(LA24_0 >= '#' && LA24_0 <= '[')||(LA24_0 >= ']' && LA24_0 <= '\uFFFF')) ) {
					alt24=2;
				}

				switch (alt24) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:167:15: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:167:32: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
					break loop24;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "StringLiteral"

	// $ANTLR start "Letter"
	public final void mLetter() throws RecognitionException {
		try {
			// edu/ua/cs/taser/extract/java/JavaLexer.g:171:5: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Letter"

	// $ANTLR start "JavaIDDigit"
	public final void mJavaIDDigit() throws RecognitionException {
		try {
			// edu/ua/cs/taser/extract/java/JavaLexer.g:187:5: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' .. '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' | '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' .. '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' | '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' .. '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= '\u0660' && input.LA(1) <= '\u0669')||(input.LA(1) >= '\u06F0' && input.LA(1) <= '\u06F9')||(input.LA(1) >= '\u0966' && input.LA(1) <= '\u096F')||(input.LA(1) >= '\u09E6' && input.LA(1) <= '\u09EF')||(input.LA(1) >= '\u0A66' && input.LA(1) <= '\u0A6F')||(input.LA(1) >= '\u0AE6' && input.LA(1) <= '\u0AEF')||(input.LA(1) >= '\u0B66' && input.LA(1) <= '\u0B6F')||(input.LA(1) >= '\u0BE7' && input.LA(1) <= '\u0BEF')||(input.LA(1) >= '\u0C66' && input.LA(1) <= '\u0C6F')||(input.LA(1) >= '\u0CE6' && input.LA(1) <= '\u0CEF')||(input.LA(1) >= '\u0D66' && input.LA(1) <= '\u0D6F')||(input.LA(1) >= '\u0E50' && input.LA(1) <= '\u0E59')||(input.LA(1) >= '\u0ED0' && input.LA(1) <= '\u0ED9')||(input.LA(1) >= '\u1040' && input.LA(1) <= '\u1049') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JavaIDDigit"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:205:5: ( Letter ( Letter | JavaIDDigit )* )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:205:9: Letter ( Letter | JavaIDDigit )*
			{
			mLetter(); 

			// edu/ua/cs/taser/extract/java/JavaLexer.g:205:16: ( Letter | JavaIDDigit )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0=='$'||(LA25_0 >= '0' && LA25_0 <= '9')||(LA25_0 >= 'A' && LA25_0 <= 'Z')||LA25_0=='_'||(LA25_0 >= 'a' && LA25_0 <= 'z')||(LA25_0 >= '\u00C0' && LA25_0 <= '\u00D6')||(LA25_0 >= '\u00D8' && LA25_0 <= '\u00F6')||(LA25_0 >= '\u00F8' && LA25_0 <= '\u1FFF')||(LA25_0 >= '\u3040' && LA25_0 <= '\u318F')||(LA25_0 >= '\u3300' && LA25_0 <= '\u337F')||(LA25_0 >= '\u3400' && LA25_0 <= '\u3D2D')||(LA25_0 >= '\u4E00' && LA25_0 <= '\u9FFF')||(LA25_0 >= '\uF900' && LA25_0 <= '\uFAFF')) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
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
					break loop25;
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
	// $ANTLR end "Identifier"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:208:4: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:208:6: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
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

	// $ANTLR start "BLOCK_COMMENT"
	public final void mBLOCK_COMMENT() throws RecognitionException {
		try {
			int _type = BLOCK_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:210:15: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:210:17: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// edu/ua/cs/taser/extract/java/JavaLexer.g:210:22: ( options {greedy=false; } : . )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0=='*') ) {
					int LA26_1 = input.LA(2);
					if ( (LA26_1=='/') ) {
						alt26=2;
					}
					else if ( ((LA26_1 >= '\u0000' && LA26_1 <= '.')||(LA26_1 >= '0' && LA26_1 <= '\uFFFF')) ) {
						alt26=1;
					}

				}
				else if ( ((LA26_0 >= '\u0000' && LA26_0 <= ')')||(LA26_0 >= '+' && LA26_0 <= '\uFFFF')) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:210:50: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop26;
				}
			}

			match("*/"); 

			 _channel = COMMENT_CHANNEL; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BLOCK_COMMENT"

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// edu/ua/cs/taser/extract/java/JavaLexer.g:212:14: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? ( '\\n' | EOF ) )
			// edu/ua/cs/taser/extract/java/JavaLexer.g:212:16: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? ( '\\n' | EOF )
			{
			match("//"); 

			// edu/ua/cs/taser/extract/java/JavaLexer.g:212:21: (~ ( '\\n' | '\\r' ) )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( ((LA27_0 >= '\u0000' && LA27_0 <= '\t')||(LA27_0 >= '\u000B' && LA27_0 <= '\f')||(LA27_0 >= '\u000E' && LA27_0 <= '\uFFFF')) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
					break loop27;
				}
			}

			// edu/ua/cs/taser/extract/java/JavaLexer.g:212:35: ( '\\r' )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0=='\r') ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:212:35: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			// edu/ua/cs/taser/extract/java/JavaLexer.g:212:41: ( '\\n' | EOF )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0=='\n') ) {
				alt29=1;
			}

			else {
				alt29=2;
			}

			switch (alt29) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:212:42: '\\n'
					{
					match('\n'); 
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaLexer.g:212:47: EOF
					{
					match(EOF); 

					}
					break;

			}

			 _channel = COMMENT_CHANNEL; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaLexer.g:1:8: ( ABSTRACT | ASSERT | BOOLEAN | BREAK | BYTE | CASE | CATCH | CHAR | CLASS | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTENDS | FINAL | FINALLY | FLOAT | FOR | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INT | INTERFACE | LONG | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SHORT | STATIC | STRICTFP | SUPER | SWITCH | SYNCHRONIZED | THIS | THROW | THROWS | TRANSIENT | TRY | VOID | VOLATILE | WHILE | FALSE | NULL | TRUE | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | SEMICOLON | COMMA | DOT | ASG | LT | GT | NOT | BITNOT | QUESTIONMARK | COLON | EQ | NE | AND | OR | INC | DEC | ADD | SUB | MUL | DIV | BITAND | BITOR | BITXOR | REM | ASGADD | ASGSUB | ASGMUL | ASGDIV | ASGBITAND | ASGBITOR | ASGBITXOR | ASGREM | ELLIPSIS | AT | HexLiteral | DecimalLiteral | OctalLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | Identifier | WS | BLOCK_COMMENT | LINE_COMMENT )
		int alt30=101;
		alt30 = dfa30.predict(input);
		switch (alt30) {
			case 1 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:10: ABSTRACT
				{
				mABSTRACT(); 

				}
				break;
			case 2 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:19: ASSERT
				{
				mASSERT(); 

				}
				break;
			case 3 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:26: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 4 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:34: BREAK
				{
				mBREAK(); 

				}
				break;
			case 5 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:40: BYTE
				{
				mBYTE(); 

				}
				break;
			case 6 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:45: CASE
				{
				mCASE(); 

				}
				break;
			case 7 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:50: CATCH
				{
				mCATCH(); 

				}
				break;
			case 8 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:56: CHAR
				{
				mCHAR(); 

				}
				break;
			case 9 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:61: CLASS
				{
				mCLASS(); 

				}
				break;
			case 10 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:67: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 11 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:76: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 12 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:84: DO
				{
				mDO(); 

				}
				break;
			case 13 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:87: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 14 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:94: ELSE
				{
				mELSE(); 

				}
				break;
			case 15 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:99: ENUM
				{
				mENUM(); 

				}
				break;
			case 16 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:104: EXTENDS
				{
				mEXTENDS(); 

				}
				break;
			case 17 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:112: FINAL
				{
				mFINAL(); 

				}
				break;
			case 18 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:118: FINALLY
				{
				mFINALLY(); 

				}
				break;
			case 19 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:126: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 20 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:132: FOR
				{
				mFOR(); 

				}
				break;
			case 21 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:136: IF
				{
				mIF(); 

				}
				break;
			case 22 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:139: IMPLEMENTS
				{
				mIMPLEMENTS(); 

				}
				break;
			case 23 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:150: IMPORT
				{
				mIMPORT(); 

				}
				break;
			case 24 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:157: INSTANCEOF
				{
				mINSTANCEOF(); 

				}
				break;
			case 25 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:168: INT
				{
				mINT(); 

				}
				break;
			case 26 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:172: INTERFACE
				{
				mINTERFACE(); 

				}
				break;
			case 27 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:182: LONG
				{
				mLONG(); 

				}
				break;
			case 28 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:187: NATIVE
				{
				mNATIVE(); 

				}
				break;
			case 29 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:194: NEW
				{
				mNEW(); 

				}
				break;
			case 30 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:198: PACKAGE
				{
				mPACKAGE(); 

				}
				break;
			case 31 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:206: PRIVATE
				{
				mPRIVATE(); 

				}
				break;
			case 32 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:214: PROTECTED
				{
				mPROTECTED(); 

				}
				break;
			case 33 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:224: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 34 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:231: RETURN
				{
				mRETURN(); 

				}
				break;
			case 35 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:238: SHORT
				{
				mSHORT(); 

				}
				break;
			case 36 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:244: STATIC
				{
				mSTATIC(); 

				}
				break;
			case 37 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:251: STRICTFP
				{
				mSTRICTFP(); 

				}
				break;
			case 38 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:260: SUPER
				{
				mSUPER(); 

				}
				break;
			case 39 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:266: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 40 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:273: SYNCHRONIZED
				{
				mSYNCHRONIZED(); 

				}
				break;
			case 41 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:286: THIS
				{
				mTHIS(); 

				}
				break;
			case 42 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:291: THROW
				{
				mTHROW(); 

				}
				break;
			case 43 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:297: THROWS
				{
				mTHROWS(); 

				}
				break;
			case 44 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:304: TRANSIENT
				{
				mTRANSIENT(); 

				}
				break;
			case 45 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:314: TRY
				{
				mTRY(); 

				}
				break;
			case 46 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:318: VOID
				{
				mVOID(); 

				}
				break;
			case 47 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:323: VOLATILE
				{
				mVOLATILE(); 

				}
				break;
			case 48 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:332: WHILE
				{
				mWHILE(); 

				}
				break;
			case 49 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:338: FALSE
				{
				mFALSE(); 

				}
				break;
			case 50 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:344: NULL
				{
				mNULL(); 

				}
				break;
			case 51 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:349: TRUE
				{
				mTRUE(); 

				}
				break;
			case 52 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:354: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 53 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:361: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 54 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:368: LBRACE
				{
				mLBRACE(); 

				}
				break;
			case 55 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:375: RBRACE
				{
				mRBRACE(); 

				}
				break;
			case 56 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:382: LBRACKET
				{
				mLBRACKET(); 

				}
				break;
			case 57 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:391: RBRACKET
				{
				mRBRACKET(); 

				}
				break;
			case 58 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:400: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 59 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:410: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 60 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:416: DOT
				{
				mDOT(); 

				}
				break;
			case 61 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:420: ASG
				{
				mASG(); 

				}
				break;
			case 62 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:424: LT
				{
				mLT(); 

				}
				break;
			case 63 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:427: GT
				{
				mGT(); 

				}
				break;
			case 64 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:430: NOT
				{
				mNOT(); 

				}
				break;
			case 65 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:434: BITNOT
				{
				mBITNOT(); 

				}
				break;
			case 66 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:441: QUESTIONMARK
				{
				mQUESTIONMARK(); 

				}
				break;
			case 67 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:454: COLON
				{
				mCOLON(); 

				}
				break;
			case 68 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:460: EQ
				{
				mEQ(); 

				}
				break;
			case 69 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:463: NE
				{
				mNE(); 

				}
				break;
			case 70 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:466: AND
				{
				mAND(); 

				}
				break;
			case 71 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:470: OR
				{
				mOR(); 

				}
				break;
			case 72 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:473: INC
				{
				mINC(); 

				}
				break;
			case 73 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:477: DEC
				{
				mDEC(); 

				}
				break;
			case 74 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:481: ADD
				{
				mADD(); 

				}
				break;
			case 75 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:485: SUB
				{
				mSUB(); 

				}
				break;
			case 76 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:489: MUL
				{
				mMUL(); 

				}
				break;
			case 77 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:493: DIV
				{
				mDIV(); 

				}
				break;
			case 78 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:497: BITAND
				{
				mBITAND(); 

				}
				break;
			case 79 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:504: BITOR
				{
				mBITOR(); 

				}
				break;
			case 80 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:510: BITXOR
				{
				mBITXOR(); 

				}
				break;
			case 81 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:517: REM
				{
				mREM(); 

				}
				break;
			case 82 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:521: ASGADD
				{
				mASGADD(); 

				}
				break;
			case 83 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:528: ASGSUB
				{
				mASGSUB(); 

				}
				break;
			case 84 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:535: ASGMUL
				{
				mASGMUL(); 

				}
				break;
			case 85 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:542: ASGDIV
				{
				mASGDIV(); 

				}
				break;
			case 86 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:549: ASGBITAND
				{
				mASGBITAND(); 

				}
				break;
			case 87 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:559: ASGBITOR
				{
				mASGBITOR(); 

				}
				break;
			case 88 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:568: ASGBITXOR
				{
				mASGBITXOR(); 

				}
				break;
			case 89 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:578: ASGREM
				{
				mASGREM(); 

				}
				break;
			case 90 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:585: ELLIPSIS
				{
				mELLIPSIS(); 

				}
				break;
			case 91 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:594: AT
				{
				mAT(); 

				}
				break;
			case 92 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:597: HexLiteral
				{
				mHexLiteral(); 

				}
				break;
			case 93 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:608: DecimalLiteral
				{
				mDecimalLiteral(); 

				}
				break;
			case 94 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:623: OctalLiteral
				{
				mOctalLiteral(); 

				}
				break;
			case 95 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:636: FloatingPointLiteral
				{
				mFloatingPointLiteral(); 

				}
				break;
			case 96 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:657: CharacterLiteral
				{
				mCharacterLiteral(); 

				}
				break;
			case 97 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:674: StringLiteral
				{
				mStringLiteral(); 

				}
				break;
			case 98 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:688: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 99 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:699: WS
				{
				mWS(); 

				}
				break;
			case 100 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:702: BLOCK_COMMENT
				{
				mBLOCK_COMMENT(); 

				}
				break;
			case 101 :
				// edu/ua/cs/taser/extract/java/JavaLexer.g:1:716: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;

		}
	}


	protected DFA20 dfa20 = new DFA20(this);
	protected DFA30 dfa30 = new DFA30(this);
	static final String DFA20_eotS =
		"\6\uffff";
	static final String DFA20_eofS =
		"\6\uffff";
	static final String DFA20_minS =
		"\2\56\4\uffff";
	static final String DFA20_maxS =
		"\1\71\1\146\4\uffff";
	static final String DFA20_acceptS =
		"\2\uffff\1\2\1\1\1\3\1\4";
	static final String DFA20_specialS =
		"\6\uffff}>";
	static final String[] DFA20_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\12\uffff\1\5\1\4\1\5\35\uffff\1\5\1\4\1\5",
			"",
			"",
			"",
			""
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	protected class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "139:1: FloatingPointLiteral : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ FloatTypeSuffix );";
		}
	}

	static final String DFA30_eotS =
		"\1\uffff\17\55\10\uffff\1\126\1\131\2\uffff\1\133\3\uffff\1\136\1\141"+
		"\1\144\1\147\1\151\1\155\1\157\1\161\1\uffff\2\163\4\uffff\12\55\1\u0082"+
		"\7\55\1\u008a\23\55\37\uffff\1\u00a5\1\163\14\55\1\uffff\5\55\1\u00b7"+
		"\1\55\1\uffff\2\55\1\u00bd\2\55\1\u00c0\17\55\1\u00d0\4\55\1\uffff\4\55"+
		"\1\u00d9\1\u00da\1\55\1\u00dc\4\55\1\u00e1\1\u00e2\3\55\1\uffff\5\55\1"+
		"\uffff\1\u00eb\1\55\1\uffff\1\u00ed\13\55\1\u00f9\2\55\1\uffff\1\u00fc"+
		"\1\u00fd\5\55\1\u0103\2\uffff\1\u0104\1\uffff\1\u0105\3\55\2\uffff\1\55"+
		"\1\u010b\1\u010c\1\u010d\4\55\1\uffff\1\55\1\uffff\5\55\1\u0118\2\55\1"+
		"\u011b\2\55\1\uffff\1\u011f\1\55\2\uffff\1\55\1\u0122\1\55\1\u0124\1\55"+
		"\3\uffff\2\55\1\u0128\2\55\3\uffff\1\55\1\u012c\2\55\1\u012f\3\55\1\u0133"+
		"\1\u0134\1\uffff\1\u0135\1\55\1\uffff\1\u0137\1\55\1\u0139\1\uffff\2\55"+
		"\1\uffff\1\55\1\uffff\1\u013d\1\55\1\u013f\1\uffff\1\u0140\1\u0141\1\55"+
		"\1\uffff\2\55\1\uffff\1\u0145\1\u0146\1\55\3\uffff\1\55\1\uffff\1\55\1"+
		"\uffff\2\55\1\u014c\1\uffff\1\u014d\3\uffff\3\55\2\uffff\1\55\1\u0152"+
		"\2\55\1\u0155\2\uffff\2\55\1\u0158\1\u0159\1\uffff\1\55\1\u015b\1\uffff"+
		"\1\u015c\1\u015d\2\uffff\1\55\3\uffff\1\55\1\u0160\1\uffff";
	static final String DFA30_eofS =
		"\u0161\uffff";
	static final String DFA30_minS =
		"\1\11\1\142\1\157\1\141\1\145\1\154\1\141\1\146\1\157\2\141\1\145\2\150"+
		"\1\157\1\150\10\uffff\1\56\1\75\2\uffff\1\75\3\uffff\1\46\1\75\1\53\1"+
		"\55\1\75\1\52\2\75\1\uffff\2\56\4\uffff\2\163\1\157\1\145\1\164\1\163"+
		"\2\141\1\156\1\146\1\44\1\163\1\165\1\164\1\156\1\157\1\162\1\154\1\44"+
		"\1\160\1\163\1\156\1\164\1\167\1\154\1\143\1\151\1\142\1\164\1\157\1\141"+
		"\1\160\1\151\1\156\1\151\1\141\2\151\37\uffff\2\56\1\164\1\145\1\154\1"+
		"\141\2\145\1\143\1\162\1\163\1\164\1\141\1\142\1\uffff\1\145\1\155\1\145"+
		"\2\141\1\44\1\163\1\uffff\1\154\1\164\1\44\1\147\1\151\1\44\1\154\1\153"+
		"\1\166\1\164\1\154\1\165\1\162\1\164\1\151\1\145\1\164\1\143\1\163\1\157"+
		"\1\156\1\44\1\145\1\144\1\141\1\154\1\uffff\2\162\1\145\1\153\2\44\1\150"+
		"\1\44\1\163\1\151\1\165\1\154\2\44\1\156\1\154\1\164\1\uffff\2\145\1\162"+
		"\1\141\1\162\1\uffff\1\44\1\166\1\uffff\1\44\2\141\1\145\1\151\1\162\1"+
		"\164\1\151\1\143\1\162\1\143\1\150\1\44\1\167\1\163\1\uffff\2\44\1\164"+
		"\1\145\1\141\1\164\1\141\1\44\2\uffff\1\44\1\uffff\1\44\1\156\1\154\1"+
		"\145\2\uffff\1\144\3\44\1\155\1\164\1\156\1\146\1\uffff\1\145\1\uffff"+
		"\1\147\1\164\2\143\1\156\1\44\1\143\1\164\1\44\1\150\1\162\1\uffff\1\44"+
		"\1\151\2\uffff\1\151\1\44\1\143\1\44\1\156\3\uffff\1\165\1\164\1\44\1"+
		"\163\1\171\3\uffff\1\145\1\44\1\143\1\141\1\44\2\145\1\164\2\44\1\uffff"+
		"\1\44\1\146\1\uffff\1\44\1\157\1\44\1\uffff\1\145\1\154\1\uffff\1\164"+
		"\1\uffff\1\44\1\145\1\44\1\uffff\2\44\1\156\1\uffff\1\145\1\143\1\uffff"+
		"\2\44\1\145\3\uffff\1\160\1\uffff\1\156\1\uffff\1\156\1\145\1\44\1\uffff"+
		"\1\44\3\uffff\1\164\1\157\1\145\2\uffff\1\144\1\44\1\151\1\164\1\44\2"+
		"\uffff\1\163\1\146\2\44\1\uffff\1\172\1\44\1\uffff\2\44\2\uffff\1\145"+
		"\3\uffff\1\144\1\44\1\uffff";
	static final String DFA30_maxS =
		"\1\ufaff\1\163\1\171\2\157\1\170\1\157\1\156\1\157\2\165\1\145\1\171\1"+
		"\162\1\157\1\150\10\uffff\1\71\1\75\2\uffff\1\75\3\uffff\1\75\1\174\6"+
		"\75\1\uffff\1\170\1\146\4\uffff\2\163\1\157\1\145\2\164\2\141\1\156\1"+
		"\146\1\ufaff\1\163\1\165\1\164\1\156\1\157\1\162\1\154\1\ufaff\1\160\1"+
		"\164\1\156\1\164\1\167\1\154\1\143\1\157\1\142\1\164\1\157\1\162\1\160"+
		"\1\151\1\156\1\162\1\171\1\154\1\151\37\uffff\2\146\1\164\1\145\1\154"+
		"\1\141\2\145\1\143\1\162\1\163\1\164\1\141\1\142\1\uffff\1\145\1\155\1"+
		"\145\2\141\1\ufaff\1\163\1\uffff\1\157\1\164\1\ufaff\1\147\1\151\1\ufaff"+
		"\1\154\1\153\1\166\1\164\1\154\1\165\1\162\1\164\1\151\1\145\1\164\1\143"+
		"\1\163\1\157\1\156\1\ufaff\1\145\1\144\1\141\1\154\1\uffff\2\162\1\145"+
		"\1\153\2\ufaff\1\150\1\ufaff\1\163\1\151\1\165\1\154\2\ufaff\1\156\1\154"+
		"\1\164\1\uffff\2\145\1\162\1\141\1\162\1\uffff\1\ufaff\1\166\1\uffff\1"+
		"\ufaff\2\141\1\145\1\151\1\162\1\164\1\151\1\143\1\162\1\143\1\150\1\ufaff"+
		"\1\167\1\163\1\uffff\2\ufaff\1\164\1\145\1\141\1\164\1\141\1\ufaff\2\uffff"+
		"\1\ufaff\1\uffff\1\ufaff\1\156\1\154\1\145\2\uffff\1\144\3\ufaff\1\155"+
		"\1\164\1\156\1\146\1\uffff\1\145\1\uffff\1\147\1\164\2\143\1\156\1\ufaff"+
		"\1\143\1\164\1\ufaff\1\150\1\162\1\uffff\1\ufaff\1\151\2\uffff\1\151\1"+
		"\ufaff\1\143\1\ufaff\1\156\3\uffff\1\165\1\164\1\ufaff\1\163\1\171\3\uffff"+
		"\1\145\1\ufaff\1\143\1\141\1\ufaff\2\145\1\164\2\ufaff\1\uffff\1\ufaff"+
		"\1\146\1\uffff\1\ufaff\1\157\1\ufaff\1\uffff\1\145\1\154\1\uffff\1\164"+
		"\1\uffff\1\ufaff\1\145\1\ufaff\1\uffff\2\ufaff\1\156\1\uffff\1\145\1\143"+
		"\1\uffff\2\ufaff\1\145\3\uffff\1\160\1\uffff\1\156\1\uffff\1\156\1\145"+
		"\1\ufaff\1\uffff\1\ufaff\3\uffff\1\164\1\157\1\145\2\uffff\1\144\1\ufaff"+
		"\1\151\1\164\1\ufaff\2\uffff\1\163\1\146\2\ufaff\1\uffff\1\172\1\ufaff"+
		"\1\uffff\2\ufaff\2\uffff\1\145\3\uffff\1\144\1\ufaff\1\uffff";
	static final String DFA30_acceptS =
		"\20\uffff\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\2\uffff\1\76\1\77\1"+
		"\uffff\1\101\1\102\1\103\10\uffff\1\133\2\uffff\1\140\1\141\1\142\1\143"+
		"\46\uffff\1\132\1\74\1\137\1\104\1\75\1\105\1\100\1\106\1\126\1\116\1"+
		"\107\1\127\1\117\1\110\1\122\1\112\1\111\1\123\1\113\1\124\1\114\1\125"+
		"\1\144\1\145\1\115\1\130\1\120\1\131\1\121\1\134\1\135\16\uffff\1\14\7"+
		"\uffff\1\25\32\uffff\1\136\21\uffff\1\24\5\uffff\1\31\2\uffff\1\35\17"+
		"\uffff\1\55\10\uffff\1\5\1\6\1\uffff\1\10\4\uffff\1\16\1\17\10\uffff\1"+
		"\33\1\uffff\1\62\13\uffff\1\51\2\uffff\1\63\1\56\5\uffff\1\4\1\7\1\11"+
		"\5\uffff\1\21\1\23\1\61\12\uffff\1\43\2\uffff\1\46\3\uffff\1\52\2\uffff"+
		"\1\60\1\uffff\1\2\3\uffff\1\15\3\uffff\1\27\2\uffff\1\34\3\uffff\1\41"+
		"\1\42\1\44\1\uffff\1\47\1\uffff\1\53\3\uffff\1\3\1\uffff\1\13\1\20\1\22"+
		"\3\uffff\1\36\1\37\5\uffff\1\1\1\12\4\uffff\1\45\2\uffff\1\57\2\uffff"+
		"\1\32\1\40\1\uffff\1\54\1\26\1\30\2\uffff\1\50";
	static final String DFA30_specialS =
		"\u0161\uffff}>";
	static final String[] DFA30_transitionS = {
			"\2\56\1\uffff\2\56\22\uffff\1\56\1\34\1\54\1\uffff\1\55\1\47\1\40\1\53"+
			"\1\20\1\21\1\44\1\42\1\27\1\43\1\30\1\45\1\51\11\52\1\37\1\26\1\32\1"+
			"\31\1\33\1\36\1\50\32\55\1\24\1\uffff\1\25\1\46\1\55\1\uffff\1\1\1\2"+
			"\1\3\1\4\1\5\1\6\2\55\1\7\2\55\1\10\1\55\1\11\1\55\1\12\1\55\1\13\1\14"+
			"\1\15\1\55\1\16\1\17\3\55\1\22\1\41\1\23\1\35\101\uffff\27\55\1\uffff"+
			"\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff\u0080\55\u0080"+
			"\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200\55",
			"\1\57\20\uffff\1\60",
			"\1\61\2\uffff\1\62\6\uffff\1\63",
			"\1\64\6\uffff\1\65\3\uffff\1\66\2\uffff\1\67",
			"\1\70\11\uffff\1\71",
			"\1\72\1\uffff\1\73\11\uffff\1\74",
			"\1\100\7\uffff\1\75\2\uffff\1\76\2\uffff\1\77",
			"\1\101\6\uffff\1\102\1\103",
			"\1\104",
			"\1\105\3\uffff\1\106\17\uffff\1\107",
			"\1\110\20\uffff\1\111\2\uffff\1\112",
			"\1\113",
			"\1\114\13\uffff\1\115\1\116\1\uffff\1\117\1\uffff\1\120",
			"\1\121\11\uffff\1\122",
			"\1\123",
			"\1\124",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\125\1\uffff\12\127",
			"\1\130",
			"",
			"",
			"\1\132",
			"",
			"",
			"",
			"\1\134\26\uffff\1\135",
			"\1\140\76\uffff\1\137",
			"\1\142\21\uffff\1\143",
			"\1\145\17\uffff\1\146",
			"\1\150",
			"\1\153\4\uffff\1\154\15\uffff\1\152",
			"\1\156",
			"\1\160",
			"",
			"\1\127\1\uffff\10\164\2\127\12\uffff\3\127\21\uffff\1\162\13\uffff\3"+
			"\127\21\uffff\1\162",
			"\1\127\1\uffff\12\165\12\uffff\3\127\35\uffff\3\127",
			"",
			"",
			"",
			"",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\24\55\1\u0081"+
			"\5\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150"+
			"\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900"+
			"\uffff\u0200\55",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u008b",
			"\1\u008c\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093\5\uffff\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098\20\uffff\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d\10\uffff\1\u009e",
			"\1\u009f\23\uffff\1\u00a1\3\uffff\1\u00a0",
			"\1\u00a2\2\uffff\1\u00a3",
			"\1\u00a4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\127\1\uffff\10\164\2\127\12\uffff\3\127\35\uffff\3\127",
			"\1\127\1\uffff\12\165\12\uffff\3\127\35\uffff\3\127",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u00b8",
			"",
			"\1\u00b9\2\uffff\1\u00ba",
			"\1\u00bb",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00bc"+
			"\25\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150"+
			"\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900"+
			"\uffff\u0200\55",
			"\1\u00be",
			"\1\u00bf",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u00db",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u00ec",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u00fa",
			"\1\u00fb",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"",
			"",
			"\1\u0109",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u010a"+
			"\16\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150"+
			"\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900"+
			"\uffff\u0200\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u010e",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"",
			"\1\u0112",
			"",
			"\1\u0113",
			"\1\u0114",
			"\1\u0115",
			"\1\u0116",
			"\1\u0117",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u0119",
			"\1\u011a",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u011c",
			"\1\u011d",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u011e"+
			"\7\55\105\uffff\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150"+
			"\55\u0170\uffff\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900"+
			"\uffff\u0200\55",
			"\1\u0120",
			"",
			"",
			"\1\u0121",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u0123",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u0125",
			"",
			"",
			"",
			"\1\u0126",
			"\1\u0127",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u0129",
			"\1\u012a",
			"",
			"",
			"",
			"\1\u012b",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u012d",
			"\1\u012e",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u0136",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u0138",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"",
			"\1\u013a",
			"\1\u013b",
			"",
			"\1\u013c",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u013e",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u0142",
			"",
			"\1\u0143",
			"\1\u0144",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u0147",
			"",
			"",
			"",
			"\1\u0148",
			"",
			"\1\u0149",
			"",
			"\1\u014a",
			"\1\u014b",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"",
			"",
			"",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"",
			"",
			"\1\u0151",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\u0153",
			"\1\u0154",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"",
			"",
			"\1\u0156",
			"\1\u0157",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"",
			"\1\u015a",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			"",
			"",
			"\1\u015e",
			"",
			"",
			"",
			"\1\u015f",
			"\1\55\13\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55\105\uffff"+
			"\27\55\1\uffff\37\55\1\uffff\u1f08\55\u1040\uffff\u0150\55\u0170\uffff"+
			"\u0080\55\u0080\uffff\u092e\55\u10d2\uffff\u5200\55\u5900\uffff\u0200"+
			"\55",
			""
	};

	static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
	static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
	static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
	static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
	static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
	static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
	static final short[][] DFA30_transition;

	static {
		int numStates = DFA30_transitionS.length;
		DFA30_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
		}
	}

	protected class DFA30 extends DFA {

		public DFA30(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 30;
			this.eot = DFA30_eot;
			this.eof = DFA30_eof;
			this.min = DFA30_min;
			this.max = DFA30_max;
			this.accept = DFA30_accept;
			this.special = DFA30_special;
			this.transition = DFA30_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( ABSTRACT | ASSERT | BOOLEAN | BREAK | BYTE | CASE | CATCH | CHAR | CLASS | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTENDS | FINAL | FINALLY | FLOAT | FOR | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INT | INTERFACE | LONG | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SHORT | STATIC | STRICTFP | SUPER | SWITCH | SYNCHRONIZED | THIS | THROW | THROWS | TRANSIENT | TRY | VOID | VOLATILE | WHILE | FALSE | NULL | TRUE | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | SEMICOLON | COMMA | DOT | ASG | LT | GT | NOT | BITNOT | QUESTIONMARK | COLON | EQ | NE | AND | OR | INC | DEC | ADD | SUB | MUL | DIV | BITAND | BITOR | BITXOR | REM | ASGADD | ASGSUB | ASGMUL | ASGDIV | ASGBITAND | ASGBITOR | ASGBITXOR | ASGREM | ELLIPSIS | AT | HexLiteral | DecimalLiteral | OctalLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | Identifier | WS | BLOCK_COMMENT | LINE_COMMENT );";
		}
	}

}

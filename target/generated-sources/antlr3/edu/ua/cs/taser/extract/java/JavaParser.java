// $ANTLR 3.5 edu/ua/cs/taser/extract/java/JavaParser.g 2017-05-10 08:21:15

package edu.ua.cs.taser.javatext;

import edu.ua.cs.taser.document.EntityType;
import edu.ua.cs.taser.document.Entities;
import edu.ua.cs.taser.document.JavaEntity;
import edu.ua.cs.taser.io.Filenames;
import edu.ua.cs.taser.token.JavaToken;
import edu.ua.cs.taser.token.TokenType;
import edu.ua.cs.taser.util.Stacks;
import edu.ua.cs.taser.util.position.Position;
import edu.ua.cs.taser.util.position.Positions;

import java.io.File;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class JavaParser extends BaseJavaParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ADD", "AND", "ASG", 
		"ASGADD", "ASGBITAND", "ASGBITOR", "ASGBITXOR", "ASGDIV", "ASGMUL", "ASGREM", 
		"ASGSUB", "ASSERT", "AT", "BITAND", "BITNOT", "BITOR", "BITXOR", "BLOCK_COMMENT", 
		"BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "COLON", 
		"COMMA", "CONTINUE", "CharacterLiteral", "DEC", "DEFAULT", "DIV", "DO", 
		"DOT", "DOUBLE", "DecimalLiteral", "ELLIPSIS", "ELSE", "ENUM", "EQ", "EXTENDS", 
		"EscapeSequence", "Exponent", "FALSE", "FINAL", "FINALLY", "FLOAT", "FOR", 
		"FloatTypeSuffix", "FloatingPointLiteral", "GT", "HexDigit", "HexLiteral", 
		"IF", "IMPLEMENTS", "IMPORT", "INC", "INSTANCEOF", "INT", "INTERFACE", 
		"Identifier", "IntegerTypeSuffix", "JavaIDDigit", "LBRACE", "LBRACKET", 
		"LINE_COMMENT", "LONG", "LPAREN", "LT", "Letter", "MUL", "NATIVE", "NE", 
		"NEW", "NOT", "NULL", "OR", "OctalEscape", "OctalLiteral", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "QUESTIONMARK", "RBRACE", "RBRACKET", 
		"REM", "RETURN", "RPAREN", "SEMICOLON", "SHORT", "STATIC", "STRICTFP", 
		"SUB", "SUPER", "SWITCH", "SYNCHRONIZED", "StringLiteral", "THIS", "THROW", 
		"THROWS", "TRANSIENT", "TRUE", "TRY", "UnicodeEscape", "VOID", "VOLATILE", 
		"WHILE", "WS"
	};
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
	public BaseJavaParser[] getDelegates() {
		return new BaseJavaParser[] {};
	}

	// delegators

	protected static class RefTypeBody_scope {
		Position start;
	}
	protected Stack<RefTypeBody_scope> RefTypeBody_stack = new Stack<RefTypeBody_scope>();


	public JavaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public JavaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[406+1];


	}

	@Override public String[] getTokenNames() { return JavaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "edu/ua/cs/taser/extract/java/JavaParser.g"; }



	// $ANTLR start "compilationUnit"
	// edu/ua/cs/taser/extract/java/JavaParser.g:38:1: compilationUnit[final String filename, final EntityType type] returns [List<JavaToken> lstok] : ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) | ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* );
	public final List<JavaToken> compilationUnit(final String filename, final EntityType type) throws RecognitionException {
		List<JavaToken> lstok = null;

		int compilationUnit_StartIndex = input.index();


		    JavaEntity cue = Entities.newJavaEntity(type, null, filename, Positions.position(0, 0));
		    Stacks.push(entityStack, cue);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return lstok; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:66:5: ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) | ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==AT) ) {
				int LA8_1 = input.LA(2);
				if ( (synpred5_JavaParser()) ) {
					alt8=1;
				}
				else if ( (true) ) {
					alt8=2;
				}

			}
			else if ( (LA8_0==EOF||LA8_0==ABSTRACT||LA8_0==CLASS||LA8_0==ENUM||LA8_0==FINAL||LA8_0==IMPORT||LA8_0==INTERFACE||(LA8_0 >= PACKAGE && LA8_0 <= PUBLIC)||LA8_0==SEMICOLON||(LA8_0 >= STATIC && LA8_0 <= STRICTFP)) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return lstok;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:66:9: annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
					{
					pushFollow(FOLLOW_annotations_in_compilationUnit112);
					annotations();
					state._fsp--;
					if (state.failed) return lstok;
					// edu/ua/cs/taser/extract/java/JavaParser.g:67:9: ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==PACKAGE) ) {
						alt4=1;
					}
					else if ( (LA4_0==ABSTRACT||LA4_0==AT||LA4_0==CLASS||LA4_0==ENUM||LA4_0==FINAL||LA4_0==INTERFACE||(LA4_0 >= PRIVATE && LA4_0 <= PUBLIC)||(LA4_0 >= STATIC && LA4_0 <= STRICTFP)) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return lstok;}
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:67:13: packageDeclaration ( importDeclaration )* ( typeDeclaration )*
							{
							pushFollow(FOLLOW_packageDeclaration_in_compilationUnit126);
							packageDeclaration();
							state._fsp--;
							if (state.failed) return lstok;
							// edu/ua/cs/taser/extract/java/JavaParser.g:67:32: ( importDeclaration )*
							loop1:
							while (true) {
								int alt1=2;
								int LA1_0 = input.LA(1);
								if ( (LA1_0==IMPORT) ) {
									alt1=1;
								}

								switch (alt1) {
								case 1 :
									// edu/ua/cs/taser/extract/java/JavaParser.g:67:32: importDeclaration
									{
									pushFollow(FOLLOW_importDeclaration_in_compilationUnit128);
									importDeclaration();
									state._fsp--;
									if (state.failed) return lstok;
									}
									break;

								default :
									break loop1;
								}
							}

							// edu/ua/cs/taser/extract/java/JavaParser.g:67:51: ( typeDeclaration )*
							loop2:
							while (true) {
								int alt2=2;
								int LA2_0 = input.LA(1);
								if ( (LA2_0==ABSTRACT||LA2_0==AT||LA2_0==CLASS||LA2_0==ENUM||LA2_0==FINAL||LA2_0==INTERFACE||(LA2_0 >= PRIVATE && LA2_0 <= PUBLIC)||LA2_0==SEMICOLON||(LA2_0 >= STATIC && LA2_0 <= STRICTFP)) ) {
									alt2=1;
								}

								switch (alt2) {
								case 1 :
									// edu/ua/cs/taser/extract/java/JavaParser.g:67:51: typeDeclaration
									{
									pushFollow(FOLLOW_typeDeclaration_in_compilationUnit131);
									typeDeclaration();
									state._fsp--;
									if (state.failed) return lstok;
									}
									break;

								default :
									break loop2;
								}
							}

							}
							break;
						case 2 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:68:13: classOrInterfaceDeclaration ( typeDeclaration )*
							{
							pushFollow(FOLLOW_classOrInterfaceDeclaration_in_compilationUnit146);
							classOrInterfaceDeclaration();
							state._fsp--;
							if (state.failed) return lstok;
							// edu/ua/cs/taser/extract/java/JavaParser.g:68:41: ( typeDeclaration )*
							loop3:
							while (true) {
								int alt3=2;
								int LA3_0 = input.LA(1);
								if ( (LA3_0==ABSTRACT||LA3_0==AT||LA3_0==CLASS||LA3_0==ENUM||LA3_0==FINAL||LA3_0==INTERFACE||(LA3_0 >= PRIVATE && LA3_0 <= PUBLIC)||LA3_0==SEMICOLON||(LA3_0 >= STATIC && LA3_0 <= STRICTFP)) ) {
									alt3=1;
								}

								switch (alt3) {
								case 1 :
									// edu/ua/cs/taser/extract/java/JavaParser.g:68:41: typeDeclaration
									{
									pushFollow(FOLLOW_typeDeclaration_in_compilationUnit148);
									typeDeclaration();
									state._fsp--;
									if (state.failed) return lstok;
									}
									break;

								default :
									break loop3;
								}
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:70:9: ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )*
					{
					// edu/ua/cs/taser/extract/java/JavaParser.g:70:9: ( packageDeclaration )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==PACKAGE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:70:9: packageDeclaration
							{
							pushFollow(FOLLOW_packageDeclaration_in_compilationUnit169);
							packageDeclaration();
							state._fsp--;
							if (state.failed) return lstok;
							}
							break;

					}

					// edu/ua/cs/taser/extract/java/JavaParser.g:70:29: ( importDeclaration )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==IMPORT) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:70:29: importDeclaration
							{
							pushFollow(FOLLOW_importDeclaration_in_compilationUnit172);
							importDeclaration();
							state._fsp--;
							if (state.failed) return lstok;
							}
							break;

						default :
							break loop6;
						}
					}

					// edu/ua/cs/taser/extract/java/JavaParser.g:70:48: ( typeDeclaration )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==ABSTRACT||LA7_0==AT||LA7_0==CLASS||LA7_0==ENUM||LA7_0==FINAL||LA7_0==INTERFACE||(LA7_0 >= PRIVATE && LA7_0 <= PUBLIC)||LA7_0==SEMICOLON||(LA7_0 >= STATIC && LA7_0 <= STRICTFP)) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:70:48: typeDeclaration
							{
							pushFollow(FOLLOW_typeDeclaration_in_compilationUnit175);
							typeDeclaration();
							state._fsp--;
							if (state.failed) return lstok;
							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {
			    cUnit.append(".").append(Filenames.getBasename(filename, "java"));

			    Stacks.pop(entityStack);
			    Token firstInputToken = input.get(0);
			    int lastIndex = input.size() - 2;
			    while (lastIndex < 0) ++lastIndex;
			    Token lastInputToken = input.get(lastIndex);
			    String lastInputTokenText = lastInputToken.getText();
			    int end = lastInputTokenText.length();
			    while (end != 0 && Character.isWhitespace(lastInputTokenText.charAt(end - 1))) {
			        end--;
			    }
			    lastInputTokenText = lastInputTokenText.substring(0, end);
			    Position cueEnd = Positions.position(
			        lastInputToken.getLine(),
			        lastInputToken.getCharPositionInLine() + lastInputTokenText.length()
			        );
			    cue.setPosition(cue.getPosition().withEnd(cueEnd));
			    addEntity(cue);
			    connectCommentsToEntities();
			    lstok = tokens;
			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, compilationUnit_StartIndex); }

		}
		return lstok;
	}
	// $ANTLR end "compilationUnit"



	// $ANTLR start "packageDeclaration"
	// edu/ua/cs/taser/extract/java/JavaParser.g:73:1: packageDeclaration : PACKAGE pkgTop= Identifier ( DOT pkgSub= Identifier )* SEMICOLON ;
	public final void packageDeclaration() throws RecognitionException {
		int packageDeclaration_StartIndex = input.index();

		Token pkgTop=null;
		Token pkgSub=null;


		    StringBuilder pkgName = new StringBuilder();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:77:5: ( PACKAGE pkgTop= Identifier ( DOT pkgSub= Identifier )* SEMICOLON )
			// edu/ua/cs/taser/extract/java/JavaParser.g:77:9: PACKAGE pkgTop= Identifier ( DOT pkgSub= Identifier )* SEMICOLON
			{
			match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDeclaration200); if (state.failed) return;
			pkgTop=(Token)match(input,Identifier,FOLLOW_Identifier_in_packageDeclaration204); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            pkgName.append(pkgTop.getText());
			            cUnit.append(pkgTop.getText());
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:82:9: ( DOT pkgSub= Identifier )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==DOT) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:82:10: DOT pkgSub= Identifier
					{
					match(input,DOT,FOLLOW_DOT_in_packageDeclaration229); if (state.failed) return;
					pkgSub=(Token)match(input,Identifier,FOLLOW_Identifier_in_packageDeclaration233); if (state.failed) return;
					if ( state.backtracking==0 ) {
					            pkgName.append(".").append(pkgSub.getText());
					            cUnit.append(".").append(pkgSub.getText());
					            }
					}
					break;

				default :
					break loop9;
				}
			}

			if ( state.backtracking==0 ) {
			            Stacks.push(qualifiedNameStack, pkgName.toString());
			            }
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_packageDeclaration282); if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, packageDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "packageDeclaration"



	// $ANTLR start "importDeclaration"
	// edu/ua/cs/taser/extract/java/JavaParser.g:94:1: importDeclaration : IMPORT ( STATIC )? Identifier ( DOT Identifier )* ( DOT MUL )? SEMICOLON ;
	public final void importDeclaration() throws RecognitionException {
		int importDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:95:5: ( IMPORT ( STATIC )? Identifier ( DOT Identifier )* ( DOT MUL )? SEMICOLON )
			// edu/ua/cs/taser/extract/java/JavaParser.g:95:9: IMPORT ( STATIC )? Identifier ( DOT Identifier )* ( DOT MUL )? SEMICOLON
			{
			match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration301); if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:95:16: ( STATIC )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==STATIC) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:95:16: STATIC
					{
					match(input,STATIC,FOLLOW_STATIC_in_importDeclaration303); if (state.failed) return;
					}
					break;

			}

			match(input,Identifier,FOLLOW_Identifier_in_importDeclaration306); if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:95:35: ( DOT Identifier )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==DOT) ) {
					int LA11_1 = input.LA(2);
					if ( (LA11_1==Identifier) ) {
						alt11=1;
					}

				}

				switch (alt11) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:95:36: DOT Identifier
					{
					match(input,DOT,FOLLOW_DOT_in_importDeclaration309); if (state.failed) return;
					match(input,Identifier,FOLLOW_Identifier_in_importDeclaration311); if (state.failed) return;
					}
					break;

				default :
					break loop11;
				}
			}

			// edu/ua/cs/taser/extract/java/JavaParser.g:95:53: ( DOT MUL )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==DOT) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:95:54: DOT MUL
					{
					match(input,DOT,FOLLOW_DOT_in_importDeclaration316); if (state.failed) return;
					match(input,MUL,FOLLOW_MUL_in_importDeclaration318); if (state.failed) return;
					}
					break;

			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_importDeclaration322); if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, importDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "importDeclaration"



	// $ANTLR start "typeDeclaration"
	// edu/ua/cs/taser/extract/java/JavaParser.g:98:1: typeDeclaration : ( classOrInterfaceDeclaration | SEMICOLON );
	public final void typeDeclaration() throws RecognitionException {
		int typeDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:99:5: ( classOrInterfaceDeclaration | SEMICOLON )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ABSTRACT||LA13_0==AT||LA13_0==CLASS||LA13_0==ENUM||LA13_0==FINAL||LA13_0==INTERFACE||(LA13_0 >= PRIVATE && LA13_0 <= PUBLIC)||(LA13_0 >= STATIC && LA13_0 <= STRICTFP)) ) {
				alt13=1;
			}
			else if ( (LA13_0==SEMICOLON) ) {
				alt13=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:99:9: classOrInterfaceDeclaration
					{
					pushFollow(FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration341);
					classOrInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:100:9: SEMICOLON
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_typeDeclaration351); if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, typeDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "typeDeclaration"



	// $ANTLR start "classOrInterfaceDeclaration"
	// edu/ua/cs/taser/extract/java/JavaParser.g:103:1: classOrInterfaceDeclaration : classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration ) ;
	public final void classOrInterfaceDeclaration() throws RecognitionException {
		int classOrInterfaceDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:104:5: ( classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration ) )
			// edu/ua/cs/taser/extract/java/JavaParser.g:105:13: classOrInterfaceModifiers ( classDeclaration | interfaceDeclaration )
			{
			if ( state.backtracking==0 ) {
			            JavaEntity top = Stacks.top(entityStack);
			            Stacks.push(entityStack, Entities.newJavaEntity(EntityType.CLASS, Stacks.top(entityStack)));
			            }
			pushFollow(FOLLOW_classOrInterfaceModifiers_in_classOrInterfaceDeclaration390);
			classOrInterfaceModifiers();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:109:35: ( classDeclaration | interfaceDeclaration )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==CLASS||LA14_0==ENUM) ) {
				alt14=1;
			}
			else if ( (LA14_0==AT||LA14_0==INTERFACE) ) {
				alt14=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:109:36: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_classOrInterfaceDeclaration393);
					classDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:109:55: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration397);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			if ( state.backtracking==0 ) {
			            addEntity(Stacks.pop(entityStack));
			            Stacks.pop(qualifiedNameStack);
			            }
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, classOrInterfaceDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "classOrInterfaceDeclaration"



	// $ANTLR start "classOrInterfaceModifiers"
	// edu/ua/cs/taser/extract/java/JavaParser.g:116:1: classOrInterfaceModifiers : ( classOrInterfaceModifier )* ;
	public final void classOrInterfaceModifiers() throws RecognitionException {
		int classOrInterfaceModifiers_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:117:5: ( ( classOrInterfaceModifier )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:117:9: ( classOrInterfaceModifier )*
			{
			// edu/ua/cs/taser/extract/java/JavaParser.g:117:9: ( classOrInterfaceModifier )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==AT) ) {
					int LA15_2 = input.LA(2);
					if ( (LA15_2==Identifier) ) {
						alt15=1;
					}

				}
				else if ( (LA15_0==ABSTRACT||LA15_0==FINAL||(LA15_0 >= PRIVATE && LA15_0 <= PUBLIC)||(LA15_0 >= STATIC && LA15_0 <= STRICTFP)) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:117:9: classOrInterfaceModifier
					{
					pushFollow(FOLLOW_classOrInterfaceModifier_in_classOrInterfaceModifiers431);
					classOrInterfaceModifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop15;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, classOrInterfaceModifiers_StartIndex); }

		}
	}
	// $ANTLR end "classOrInterfaceModifiers"



	// $ANTLR start "classOrInterfaceModifier"
	// edu/ua/cs/taser/extract/java/JavaParser.g:120:1: classOrInterfaceModifier : ( annotation |mod= PUBLIC |mod= PROTECTED |mod= PRIVATE |mod= ABSTRACT |mod= STATIC |mod= FINAL |mod= STRICTFP );
	public final void classOrInterfaceModifier() throws RecognitionException {
		int classOrInterfaceModifier_StartIndex = input.index();

		Token mod=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:142:5: ( annotation |mod= PUBLIC |mod= PROTECTED |mod= PRIVATE |mod= ABSTRACT |mod= STATIC |mod= FINAL |mod= STRICTFP )
			int alt16=8;
			switch ( input.LA(1) ) {
			case AT:
				{
				alt16=1;
				}
				break;
			case PUBLIC:
				{
				alt16=2;
				}
				break;
			case PROTECTED:
				{
				alt16=3;
				}
				break;
			case PRIVATE:
				{
				alt16=4;
				}
				break;
			case ABSTRACT:
				{
				alt16=5;
				}
				break;
			case STATIC:
				{
				alt16=6;
				}
				break;
			case FINAL:
				{
				alt16=7;
				}
				break;
			case STRICTFP:
				{
				alt16=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:142:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_classOrInterfaceModifier456);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:143:9: mod= PUBLIC
					{
					mod=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_classOrInterfaceModifier468); if (state.failed) return;
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:144:9: mod= PROTECTED
					{
					mod=(Token)match(input,PROTECTED,FOLLOW_PROTECTED_in_classOrInterfaceModifier480); if (state.failed) return;
					}
					break;
				case 4 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:145:9: mod= PRIVATE
					{
					mod=(Token)match(input,PRIVATE,FOLLOW_PRIVATE_in_classOrInterfaceModifier492); if (state.failed) return;
					}
					break;
				case 5 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:146:9: mod= ABSTRACT
					{
					mod=(Token)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_classOrInterfaceModifier504); if (state.failed) return;
					}
					break;
				case 6 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:147:9: mod= STATIC
					{
					mod=(Token)match(input,STATIC,FOLLOW_STATIC_in_classOrInterfaceModifier516); if (state.failed) return;
					}
					break;
				case 7 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:148:9: mod= FINAL
					{
					mod=(Token)match(input,FINAL,FOLLOW_FINAL_in_classOrInterfaceModifier528); if (state.failed) return;
					}
					break;
				case 8 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:149:9: mod= STRICTFP
					{
					mod=(Token)match(input,STRICTFP,FOLLOW_STRICTFP_in_classOrInterfaceModifier540); if (state.failed) return;
					}
					break;

			}
			if ( state.backtracking==0 ) {
			    if (mod != null) {
			        // Found modifier
			        Position modPos = positionOf(mod);
			        if (RefTypeBody_stack.size() == 0) {
			            // Not nested in a reference type body
			            JavaEntity top = Stacks.top(entityStack);
			            Position topPos = top.getPosition();
			            if (modPos.precedes(topPos)) {
			                // First modifier
			                top.setPosition(topPos.withStart(modPos));
			            }
			        } else {
			            // Nested in a reference type body
			            if (modPos.precedes(RefTypeBody_stack.peek().start)) {
			                // First modifier
			                RefTypeBody_stack.peek().start = modPos;
			            }
			        }
			    }
			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, classOrInterfaceModifier_StartIndex); }

		}
	}
	// $ANTLR end "classOrInterfaceModifier"



	// $ANTLR start "modifiers"
	// edu/ua/cs/taser/extract/java/JavaParser.g:152:1: modifiers : ( modifier )* ;
	public final void modifiers() throws RecognitionException {
		int modifiers_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:153:5: ( ( modifier )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:153:9: ( modifier )*
			{
			// edu/ua/cs/taser/extract/java/JavaParser.g:153:9: ( modifier )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==AT) ) {
					int LA17_2 = input.LA(2);
					if ( (LA17_2==Identifier) ) {
						alt17=1;
					}

				}
				else if ( (LA17_0==ABSTRACT||LA17_0==FINAL||LA17_0==NATIVE||(LA17_0 >= PRIVATE && LA17_0 <= PUBLIC)||(LA17_0 >= STATIC && LA17_0 <= STRICTFP)||LA17_0==SYNCHRONIZED||LA17_0==TRANSIENT||LA17_0==VOLATILE) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:153:9: modifier
					{
					pushFollow(FOLLOW_modifier_in_modifiers559);
					modifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop17;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, modifiers_StartIndex); }

		}
	}
	// $ANTLR end "modifiers"



	// $ANTLR start "classDeclaration"
	// edu/ua/cs/taser/extract/java/JavaParser.g:156:1: classDeclaration : ( normalClassDeclaration | enumDeclaration );
	public final void classDeclaration() throws RecognitionException {
		int classDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:157:5: ( normalClassDeclaration | enumDeclaration )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==CLASS) ) {
				alt18=1;
			}
			else if ( (LA18_0==ENUM) ) {
				alt18=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:157:9: normalClassDeclaration
					{
					pushFollow(FOLLOW_normalClassDeclaration_in_classDeclaration579);
					normalClassDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:158:9: enumDeclaration
					{
					pushFollow(FOLLOW_enumDeclaration_in_classDeclaration589);
					enumDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, classDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "classDeclaration"



	// $ANTLR start "normalClassDeclaration"
	// edu/ua/cs/taser/extract/java/JavaParser.g:161:1: normalClassDeclaration : k= CLASS i= Identifier ( typeParameters )? ( EXTENDS type )? ( IMPLEMENTS typeList )? classBody ;
	public final void normalClassDeclaration() throws RecognitionException {
		int normalClassDeclaration_StartIndex = input.index();

		Token k=null;
		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:162:5: (k= CLASS i= Identifier ( typeParameters )? ( EXTENDS type )? ( IMPLEMENTS typeList )? classBody )
			// edu/ua/cs/taser/extract/java/JavaParser.g:162:9: k= CLASS i= Identifier ( typeParameters )? ( EXTENDS type )? ( IMPLEMENTS typeList )? classBody
			{
			k=(Token)match(input,CLASS,FOLLOW_CLASS_in_normalClassDeclaration610); if (state.failed) return;
			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_normalClassDeclaration614); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            Position kwPos = positionOf(k);
			            JavaEntity top = Stacks.top(entityStack);
			            Position topPos = top.getPosition();
			            if (kwPos.precedes(topPos)) {
			                top.setPosition(topPos.withStart(kwPos));
			            }
			            String text = i.getText();
			            Stacks.push(qualifiedNameStack, text);
			            top.setName(createQualifiedName());
			            addToken(makeToken(i, TokenType.CLASS_NAME, top, text));
			        }
			// edu/ua/cs/taser/extract/java/JavaParser.g:175:9: ( typeParameters )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==LT) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:175:10: typeParameters
					{
					pushFollow(FOLLOW_typeParameters_in_normalClassDeclaration635);
					typeParameters();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					            appendString(createTypeParametersString());
					            }
					}
					break;

			}

			// edu/ua/cs/taser/extract/java/JavaParser.g:179:13: ( EXTENDS type )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==EXTENDS) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:179:14: EXTENDS type
					{
					match(input,EXTENDS,FOLLOW_EXTENDS_in_normalClassDeclaration664); if (state.failed) return;
					pushFollow(FOLLOW_type_in_normalClassDeclaration666);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// edu/ua/cs/taser/extract/java/JavaParser.g:179:30: ( IMPLEMENTS typeList )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==IMPLEMENTS) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:179:31: IMPLEMENTS typeList
					{
					match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_normalClassDeclaration672); if (state.failed) return;
					pushFollow(FOLLOW_typeList_in_normalClassDeclaration674);
					typeList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_classBody_in_normalClassDeclaration679);
			classBody();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, normalClassDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "normalClassDeclaration"



	// $ANTLR start "typeParameters"
	// edu/ua/cs/taser/extract/java/JavaParser.g:182:1: typeParameters : o= LT typeParameter ( COMMA typeParameter )* GT ;
	public final void typeParameters() throws RecognitionException {
		int typeParameters_StartIndex = input.index();

		Token o=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:183:5: (o= LT typeParameter ( COMMA typeParameter )* GT )
			// edu/ua/cs/taser/extract/java/JavaParser.g:183:9: o= LT typeParameter ( COMMA typeParameter )* GT
			{
			o=(Token)match(input,LT,FOLLOW_LT_in_typeParameters700); if (state.failed) return;
			pushFollow(FOLLOW_typeParameter_in_typeParameters702);
			typeParameter();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:183:28: ( COMMA typeParameter )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==COMMA) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:183:29: COMMA typeParameter
					{
					match(input,COMMA,FOLLOW_COMMA_in_typeParameters705); if (state.failed) return;
					pushFollow(FOLLOW_typeParameter_in_typeParameters707);
					typeParameter();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop22;
				}
			}

			match(input,GT,FOLLOW_GT_in_typeParameters711); if (state.failed) return;
			if ( state.backtracking==0 ) {
			                if (RefTypeBody_stack.size() > 0) {
			                    Position ltPos = positionOf(o);
			                    if (ltPos.precedes(RefTypeBody_stack.peek().start)) {
			                        RefTypeBody_stack.peek().start = ltPos;
			                    }
			                }
			            }
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, typeParameters_StartIndex); }

		}
	}
	// $ANTLR end "typeParameters"



	// $ANTLR start "typeParameter"
	// edu/ua/cs/taser/extract/java/JavaParser.g:194:1: typeParameter : i= Identifier ( EXTENDS typeBound )? ;
	public final void typeParameter() throws RecognitionException {
		int typeParameter_StartIndex = input.index();

		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:195:5: (i= Identifier ( EXTENDS typeBound )? )
			// edu/ua/cs/taser/extract/java/JavaParser.g:195:9: i= Identifier ( EXTENDS typeBound )?
			{
			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_typeParameter746); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            String text = i.getText();
			            addToken(makeToken(i, TokenType.TYPE_PARAMETER_NAME, Stacks.top(entityStack), text));
			            typeParameters.add(text);
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:201:9: ( EXTENDS typeBound )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==EXTENDS) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:201:10: EXTENDS typeBound
					{
					match(input,EXTENDS,FOLLOW_EXTENDS_in_typeParameter771); if (state.failed) return;
					pushFollow(FOLLOW_typeBound_in_typeParameter773);
					typeBound();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, typeParameter_StartIndex); }

		}
	}
	// $ANTLR end "typeParameter"



	// $ANTLR start "typeBound"
	// edu/ua/cs/taser/extract/java/JavaParser.g:204:1: typeBound : type ( BITAND type )* ;
	public final void typeBound() throws RecognitionException {
		int typeBound_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:205:5: ( type ( BITAND type )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:205:9: type ( BITAND type )*
			{
			pushFollow(FOLLOW_type_in_typeBound794);
			type();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:205:14: ( BITAND type )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==BITAND) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:205:15: BITAND type
					{
					match(input,BITAND,FOLLOW_BITAND_in_typeBound797); if (state.failed) return;
					pushFollow(FOLLOW_type_in_typeBound799);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop24;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, typeBound_StartIndex); }

		}
	}
	// $ANTLR end "typeBound"



	// $ANTLR start "enumDeclaration"
	// edu/ua/cs/taser/extract/java/JavaParser.g:208:1: enumDeclaration : ENUM i= Identifier ( IMPLEMENTS typeList )? enumBody ;
	public final void enumDeclaration() throws RecognitionException {
		int enumDeclaration_StartIndex = input.index();

		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:209:5: ( ENUM i= Identifier ( IMPLEMENTS typeList )? enumBody )
			// edu/ua/cs/taser/extract/java/JavaParser.g:209:9: ENUM i= Identifier ( IMPLEMENTS typeList )? enumBody
			{
			match(input,ENUM,FOLLOW_ENUM_in_enumDeclaration820); if (state.failed) return;
			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_enumDeclaration824); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            String text = i.getText();
			            Stacks.push(qualifiedNameStack, text);
			            JavaEntity top = Stacks.top(entityStack);
			            top.setType(EntityType.ENUM);
			            top.setName(createQualifiedName());
			            addToken(makeToken(i, TokenType.ENUM_NAME, top, text));
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:218:9: ( IMPLEMENTS typeList )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==IMPLEMENTS) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:218:10: IMPLEMENTS typeList
					{
					match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_enumDeclaration849); if (state.failed) return;
					pushFollow(FOLLOW_typeList_in_enumDeclaration851);
					typeList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_enumBody_in_enumDeclaration855);
			enumBody();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, enumDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "enumDeclaration"



	// $ANTLR start "enumBody"
	// edu/ua/cs/taser/extract/java/JavaParser.g:221:1: enumBody : o= LBRACE ( enumConstants )? ( COMMA )? ( enumBodyDeclarations )? c= RBRACE ;
	public final void enumBody() throws RecognitionException {
		int enumBody_StartIndex = input.index();

		Token o=null;
		Token c=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:222:5: (o= LBRACE ( enumConstants )? ( COMMA )? ( enumBodyDeclarations )? c= RBRACE )
			// edu/ua/cs/taser/extract/java/JavaParser.g:222:9: o= LBRACE ( enumConstants )? ( COMMA )? ( enumBodyDeclarations )? c= RBRACE
			{
			o=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumBody876); if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:222:18: ( enumConstants )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==AT||LA26_0==Identifier) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:222:18: enumConstants
					{
					pushFollow(FOLLOW_enumConstants_in_enumBody878);
					enumConstants();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// edu/ua/cs/taser/extract/java/JavaParser.g:222:33: ( COMMA )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==COMMA) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:222:33: COMMA
					{
					match(input,COMMA,FOLLOW_COMMA_in_enumBody881); if (state.failed) return;
					}
					break;

			}

			// edu/ua/cs/taser/extract/java/JavaParser.g:222:40: ( enumBodyDeclarations )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==SEMICOLON) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:222:40: enumBodyDeclarations
					{
					pushFollow(FOLLOW_enumBodyDeclarations_in_enumBody884);
					enumBodyDeclarations();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			c=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumBody889); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            Stacks.top(entityStack).setPosition(rangePositionOf(o, c));
			            }
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, enumBody_StartIndex); }

		}
	}
	// $ANTLR end "enumBody"



	// $ANTLR start "enumConstants"
	// edu/ua/cs/taser/extract/java/JavaParser.g:228:1: enumConstants : enumConstant ( COMMA enumConstant )* ;
	public final void enumConstants() throws RecognitionException {
		int enumConstants_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:229:5: ( enumConstant ( COMMA enumConstant )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:229:9: enumConstant ( COMMA enumConstant )*
			{
			pushFollow(FOLLOW_enumConstant_in_enumConstants922);
			enumConstant();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:229:22: ( COMMA enumConstant )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==COMMA) ) {
					int LA29_1 = input.LA(2);
					if ( (LA29_1==AT||LA29_1==Identifier) ) {
						alt29=1;
					}

				}

				switch (alt29) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:229:23: COMMA enumConstant
					{
					match(input,COMMA,FOLLOW_COMMA_in_enumConstants925); if (state.failed) return;
					pushFollow(FOLLOW_enumConstant_in_enumConstants927);
					enumConstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop29;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, enumConstants_StartIndex); }

		}
	}
	// $ANTLR end "enumConstants"



	// $ANTLR start "enumConstant"
	// edu/ua/cs/taser/extract/java/JavaParser.g:232:1: enumConstant : ( annotations )? i= Identifier ( arguments )? ( classBody )? ;
	public final void enumConstant() throws RecognitionException {
		int enumConstant_StartIndex = input.index();

		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:233:5: ( ( annotations )? i= Identifier ( arguments )? ( classBody )? )
			// edu/ua/cs/taser/extract/java/JavaParser.g:233:9: ( annotations )? i= Identifier ( arguments )? ( classBody )?
			{
			// edu/ua/cs/taser/extract/java/JavaParser.g:233:9: ( annotations )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==AT) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:233:9: annotations
					{
					pushFollow(FOLLOW_annotations_in_enumConstant948);
					annotations();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_enumConstant953); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            addToken(makeToken(i, TokenType.ENUM_CONSTANT_NAME, Stacks.top(entityStack)));
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:237:9: ( arguments )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==LPAREN) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:237:9: arguments
					{
					pushFollow(FOLLOW_arguments_in_enumConstant977);
					arguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// edu/ua/cs/taser/extract/java/JavaParser.g:237:20: ( classBody )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==LBRACE) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:237:20: classBody
					{
					pushFollow(FOLLOW_classBody_in_enumConstant980);
					classBody();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, enumConstant_StartIndex); }

		}
	}
	// $ANTLR end "enumConstant"



	// $ANTLR start "enumBodyDeclarations"
	// edu/ua/cs/taser/extract/java/JavaParser.g:240:1: enumBodyDeclarations : SEMICOLON ( classBodyDeclaration )* ;
	public final void enumBodyDeclarations() throws RecognitionException {
		int enumBodyDeclarations_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:241:5: ( SEMICOLON ( classBodyDeclaration )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:241:9: SEMICOLON ( classBodyDeclaration )*
			{
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_enumBodyDeclarations1000); if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:241:19: ( classBodyDeclaration )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==ABSTRACT||LA33_0==AT||LA33_0==BOOLEAN||LA33_0==BYTE||(LA33_0 >= CHAR && LA33_0 <= CLASS)||LA33_0==DOUBLE||LA33_0==ENUM||LA33_0==FINAL||LA33_0==FLOAT||(LA33_0 >= INT && LA33_0 <= Identifier)||LA33_0==LBRACE||LA33_0==LONG||LA33_0==LT||LA33_0==NATIVE||(LA33_0 >= PRIVATE && LA33_0 <= PUBLIC)||(LA33_0 >= SEMICOLON && LA33_0 <= STRICTFP)||LA33_0==SYNCHRONIZED||LA33_0==TRANSIENT||(LA33_0 >= VOID && LA33_0 <= VOLATILE)) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:241:20: classBodyDeclaration
					{
					pushFollow(FOLLOW_classBodyDeclaration_in_enumBodyDeclarations1003);
					classBodyDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop33;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, enumBodyDeclarations_StartIndex); }

		}
	}
	// $ANTLR end "enumBodyDeclarations"



	// $ANTLR start "interfaceDeclaration"
	// edu/ua/cs/taser/extract/java/JavaParser.g:244:1: interfaceDeclaration : ( normalInterfaceDeclaration | annotationTypeDeclaration );
	public final void interfaceDeclaration() throws RecognitionException {
		int interfaceDeclaration_StartIndex = input.index();


		    JavaEntity top = Stacks.top(entityStack);
		    top.setType(EntityType.INTERFACE);

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:249:5: ( normalInterfaceDeclaration | annotationTypeDeclaration )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==INTERFACE) ) {
				alt34=1;
			}
			else if ( (LA34_0==AT) ) {
				alt34=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:249:9: normalInterfaceDeclaration
					{
					pushFollow(FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration1029);
					normalInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:250:9: annotationTypeDeclaration
					{
					pushFollow(FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration1039);
					annotationTypeDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, interfaceDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "interfaceDeclaration"



	// $ANTLR start "normalInterfaceDeclaration"
	// edu/ua/cs/taser/extract/java/JavaParser.g:253:1: normalInterfaceDeclaration : n= INTERFACE i= Identifier ( typeParameters )? ( EXTENDS typeList )? interfaceBody ;
	public final void normalInterfaceDeclaration() throws RecognitionException {
		int normalInterfaceDeclaration_StartIndex = input.index();

		Token n=null;
		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:254:5: (n= INTERFACE i= Identifier ( typeParameters )? ( EXTENDS typeList )? interfaceBody )
			// edu/ua/cs/taser/extract/java/JavaParser.g:254:9: n= INTERFACE i= Identifier ( typeParameters )? ( EXTENDS typeList )? interfaceBody
			{
			n=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_normalInterfaceDeclaration1060); if (state.failed) return;
			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_normalInterfaceDeclaration1064); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            Position interfacePos = positionOf(n);
			            JavaEntity top = Stacks.top(entityStack);
			            Position topPos = top.getPosition();
			            if (interfacePos.precedes(topPos)) {
			                top.setPosition(topPos.withStart(interfacePos));
			            }
			            String text = i.getText();
			            Stacks.push(qualifiedNameStack, text);
			            top.setName(createQualifiedName());
			            addToken(makeToken(i, TokenType.INTERFACE_NAME, top, text));
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:267:9: ( typeParameters )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==LT) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:267:10: typeParameters
					{
					pushFollow(FOLLOW_typeParameters_in_normalInterfaceDeclaration1089);
					typeParameters();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					            appendString(createTypeParametersString());
					            }
					}
					break;

			}

			// edu/ua/cs/taser/extract/java/JavaParser.g:271:12: ( EXTENDS typeList )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==EXTENDS) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:271:13: EXTENDS typeList
					{
					match(input,EXTENDS,FOLLOW_EXTENDS_in_normalInterfaceDeclaration1117); if (state.failed) return;
					pushFollow(FOLLOW_typeList_in_normalInterfaceDeclaration1119);
					typeList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_interfaceBody_in_normalInterfaceDeclaration1123);
			interfaceBody();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, normalInterfaceDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "normalInterfaceDeclaration"



	// $ANTLR start "typeList"
	// edu/ua/cs/taser/extract/java/JavaParser.g:274:1: typeList : type ( COMMA type )* ;
	public final void typeList() throws RecognitionException {
		int typeList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:275:5: ( type ( COMMA type )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:275:9: type ( COMMA type )*
			{
			pushFollow(FOLLOW_type_in_typeList1142);
			type();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:275:14: ( COMMA type )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==COMMA) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:275:15: COMMA type
					{
					match(input,COMMA,FOLLOW_COMMA_in_typeList1145); if (state.failed) return;
					pushFollow(FOLLOW_type_in_typeList1147);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop37;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, typeList_StartIndex); }

		}
	}
	// $ANTLR end "typeList"



	// $ANTLR start "classBody"
	// edu/ua/cs/taser/extract/java/JavaParser.g:278:1: classBody returns [Position pos] :o= LBRACE ( classBodyDeclaration )* c= RBRACE ;
	public final Position classBody() throws RecognitionException {
		Position pos = null;

		int classBody_StartIndex = input.index();

		Token o=null;
		Token c=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return pos; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:279:5: (o= LBRACE ( classBodyDeclaration )* c= RBRACE )
			// edu/ua/cs/taser/extract/java/JavaParser.g:280:13: o= LBRACE ( classBodyDeclaration )* c= RBRACE
			{
			if ( state.backtracking==0 ) {
			            Stacks.push(anonStack, 1);
			            }
			o=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBody1194); if (state.failed) return pos;
			if ( state.backtracking==0 ) {
			                JavaEntity top = Stacks.top(entityStack);
			                Position topPos = top.getPosition();
			                top.setPosition(topPos.withStart(
			                    findFirstPosition(
			                        (RefTypeBody_stack.size() > 0) ? RefTypeBody_stack.peek().start : Positions.tailPosition(),
			                        (topPos.isDefined() ? topPos.getStart() : topPos),
			                        positionOf(o)
			                    )
			                ));
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:295:13: ( classBodyDeclaration )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==ABSTRACT||LA38_0==AT||LA38_0==BOOLEAN||LA38_0==BYTE||(LA38_0 >= CHAR && LA38_0 <= CLASS)||LA38_0==DOUBLE||LA38_0==ENUM||LA38_0==FINAL||LA38_0==FLOAT||(LA38_0 >= INT && LA38_0 <= Identifier)||LA38_0==LBRACE||LA38_0==LONG||LA38_0==LT||LA38_0==NATIVE||(LA38_0 >= PRIVATE && LA38_0 <= PUBLIC)||(LA38_0 >= SEMICOLON && LA38_0 <= STRICTFP)||LA38_0==SYNCHRONIZED||LA38_0==TRANSIENT||(LA38_0 >= VOID && LA38_0 <= VOLATILE)) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:295:13: classBodyDeclaration
					{
					pushFollow(FOLLOW_classBodyDeclaration_in_classBody1222);
					classBodyDeclaration();
					state._fsp--;
					if (state.failed) return pos;
					}
					break;

				default :
					break loop38;
				}
			}

			c=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBody1227); if (state.failed) return pos;
			if ( state.backtracking==0 ) {
			            Stacks.pop(anonStack);
			            JavaEntity top = Stacks.top(entityStack);
			            top.setPosition(top.getPosition().withEnd(positionOf(c)));

			            pos = rangePositionOf(o, c);
			            }
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, classBody_StartIndex); }

		}
		return pos;
	}
	// $ANTLR end "classBody"



	// $ANTLR start "interfaceBody"
	// edu/ua/cs/taser/extract/java/JavaParser.g:305:1: interfaceBody :o= LBRACE ( interfaceBodyDeclaration )* c= RBRACE ;
	public final void interfaceBody() throws RecognitionException {
		int interfaceBody_StartIndex = input.index();

		Token o=null;
		Token c=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:306:5: (o= LBRACE ( interfaceBodyDeclaration )* c= RBRACE )
			// edu/ua/cs/taser/extract/java/JavaParser.g:307:13: o= LBRACE ( interfaceBodyDeclaration )* c= RBRACE
			{
			if ( state.backtracking==0 ) {
			            Stacks.push(anonStack, 1);
			            }
			o=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceBody1282); if (state.failed) return;
			if ( state.backtracking==0 ) {
			                JavaEntity top = Stacks.top(entityStack);
			                Position topPos = top.getPosition();
			                top.setPosition(topPos.withStart(
			                    findFirstPosition(
			                        (RefTypeBody_stack.size() > 0) ? RefTypeBody_stack.peek().start : Positions.tailPosition(),
			                        (topPos.isDefined() ? topPos.getStart() : topPos),
			                        positionOf(o)
			                    )
			                ));
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:322:9: ( interfaceBodyDeclaration )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==ABSTRACT||LA39_0==AT||LA39_0==BOOLEAN||LA39_0==BYTE||(LA39_0 >= CHAR && LA39_0 <= CLASS)||LA39_0==DOUBLE||LA39_0==ENUM||LA39_0==FINAL||LA39_0==FLOAT||(LA39_0 >= INT && LA39_0 <= Identifier)||LA39_0==LONG||LA39_0==LT||LA39_0==NATIVE||(LA39_0 >= PRIVATE && LA39_0 <= PUBLIC)||(LA39_0 >= SEMICOLON && LA39_0 <= STRICTFP)||LA39_0==SYNCHRONIZED||LA39_0==TRANSIENT||(LA39_0 >= VOID && LA39_0 <= VOLATILE)) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:322:9: interfaceBodyDeclaration
					{
					pushFollow(FOLLOW_interfaceBodyDeclaration_in_interfaceBody1306);
					interfaceBodyDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop39;
				}
			}

			c=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceBody1311); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            Stacks.pop(anonStack);
			            JavaEntity top = Stacks.top(entityStack);
			            top.setPosition(top.getPosition().withEnd(positionOf(c)));
			            }
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, interfaceBody_StartIndex); }

		}
	}
	// $ANTLR end "interfaceBody"



	// $ANTLR start "classBodyDeclaration"
	// edu/ua/cs/taser/extract/java/JavaParser.g:330:1: classBodyDeclaration : ( SEMICOLON | ( STATIC )? block | modifiers memberDecl );
	public final void classBodyDeclaration() throws RecognitionException {
		RefTypeBody_stack.push(new RefTypeBody_scope());

		int classBodyDeclaration_StartIndex = input.index();


		    RefTypeBody_stack.peek().start = Positions.tailPosition();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:335:5: ( SEMICOLON | ( STATIC )? block | modifiers memberDecl )
			int alt41=3;
			switch ( input.LA(1) ) {
			case SEMICOLON:
				{
				alt41=1;
				}
				break;
			case STATIC:
				{
				int LA41_2 = input.LA(2);
				if ( (LA41_2==LBRACE) ) {
					alt41=2;
				}
				else if ( (LA41_2==ABSTRACT||LA41_2==AT||LA41_2==BOOLEAN||LA41_2==BYTE||(LA41_2 >= CHAR && LA41_2 <= CLASS)||LA41_2==DOUBLE||LA41_2==ENUM||LA41_2==FINAL||LA41_2==FLOAT||(LA41_2 >= INT && LA41_2 <= Identifier)||LA41_2==LONG||LA41_2==LT||LA41_2==NATIVE||(LA41_2 >= PRIVATE && LA41_2 <= PUBLIC)||(LA41_2 >= SHORT && LA41_2 <= STRICTFP)||LA41_2==SYNCHRONIZED||LA41_2==TRANSIENT||(LA41_2 >= VOID && LA41_2 <= VOLATILE)) ) {
					alt41=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LBRACE:
				{
				alt41=2;
				}
				break;
			case ABSTRACT:
			case AT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case Identifier:
			case LONG:
			case LT:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
				{
				alt41=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:335:9: SEMICOLON
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_classBodyDeclaration1354); if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:336:9: ( STATIC )? block
					{
					// edu/ua/cs/taser/extract/java/JavaParser.g:336:9: ( STATIC )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==STATIC) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:336:9: STATIC
							{
							match(input,STATIC,FOLLOW_STATIC_in_classBodyDeclaration1364); if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_block_in_classBodyDeclaration1367);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:337:9: modifiers memberDecl
					{
					pushFollow(FOLLOW_modifiers_in_classBodyDeclaration1377);
					modifiers();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_memberDecl_in_classBodyDeclaration1379);
					memberDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, classBodyDeclaration_StartIndex); }

			RefTypeBody_stack.pop();

		}
	}
	// $ANTLR end "classBodyDeclaration"



	// $ANTLR start "memberDecl"
	// edu/ua/cs/taser/extract/java/JavaParser.g:340:1: memberDecl : ( genericMethodOrConstructorDecl | memberDeclaration |v= VOID i= Identifier voidMethodDeclaratorRest |i= Identifier constructorDeclaratorRest | interfaceDeclaration | classDeclaration );
	public final void memberDecl() throws RecognitionException {
		int memberDecl_StartIndex = input.index();

		Token v=null;
		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:341:5: ( genericMethodOrConstructorDecl | memberDeclaration |v= VOID i= Identifier voidMethodDeclaratorRest |i= Identifier constructorDeclaratorRest | interfaceDeclaration | classDeclaration )
			int alt42=6;
			switch ( input.LA(1) ) {
			case LT:
				{
				alt42=1;
				}
				break;
			case Identifier:
				{
				int LA42_2 = input.LA(2);
				if ( (LA42_2==DOT||LA42_2==Identifier||LA42_2==LBRACKET||LA42_2==LT) ) {
					alt42=2;
				}
				else if ( (LA42_2==LPAREN) ) {
					alt42=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 42, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				alt42=2;
				}
				break;
			case VOID:
				{
				alt42=3;
				}
				break;
			case AT:
			case INTERFACE:
				{
				alt42=5;
				}
				break;
			case CLASS:
			case ENUM:
				{
				alt42=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:341:9: genericMethodOrConstructorDecl
					{
					pushFollow(FOLLOW_genericMethodOrConstructorDecl_in_memberDecl1398);
					genericMethodOrConstructorDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:342:9: memberDeclaration
					{
					pushFollow(FOLLOW_memberDeclaration_in_memberDecl1408);
					memberDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:343:9: v= VOID i= Identifier voidMethodDeclaratorRest
					{
					v=(Token)match(input,VOID,FOLLOW_VOID_in_memberDecl1420); if (state.failed) return;
					i=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberDecl1424); if (state.failed) return;
					if ( state.backtracking==0 ) {
					                Position voidPos = positionOf(v);
					                if (voidPos.precedes(RefTypeBody_stack.peek().start)) {
					                    // No modifier
					                    RefTypeBody_stack.peek().start = voidPos;
					                }
					                String text = i.getText();
					                Stacks.push(qualifiedNameStack, text);
					                JavaEntity entity = Entities.newJavaEntity(EntityType.METHOD, Stacks.top(entityStack), createQualifiedName());
					                Stacks.push(entityStack, entity);
					                addToken(makeToken(i, TokenType.METHOD_NAME, entity, text));
					            }
					pushFollow(FOLLOW_voidMethodDeclaratorRest_in_memberDecl1448);
					voidMethodDeclaratorRest();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					                addEntity(Stacks.pop(entityStack));
					                Stacks.pop(qualifiedNameStack);
					            }
					}
					break;
				case 4 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:361:9: i= Identifier constructorDeclaratorRest
					{
					i=(Token)match(input,Identifier,FOLLOW_Identifier_in_memberDecl1474); if (state.failed) return;
					if ( state.backtracking==0 ) {
					            Position iPos = positionOf(i);
					            if (iPos.precedes(RefTypeBody_stack.peek().start)) {
					                // No modifier
					                RefTypeBody_stack.peek().start = iPos;
					            }
					            String text = i.getText();
					            Stacks.push(qualifiedNameStack, text);
					            JavaEntity entity = Entities.newJavaEntity(EntityType.METHOD, Stacks.top(entityStack), createQualifiedName());
					            Stacks.push(entityStack, entity);
					            addToken(makeToken(i, TokenType.METHOD_NAME, entity, text));
					        }
					pushFollow(FOLLOW_constructorDeclaratorRest_in_memberDecl1494);
					constructorDeclaratorRest();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					            addEntity(Stacks.pop(entityStack));
					            Stacks.pop(qualifiedNameStack);
					        }
					}
					break;
				case 5 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:379:9: interfaceDeclaration
					{
					if ( state.backtracking==0 ) {
					            Stacks.push(entityStack, Entities.newJavaEntity(EntityType.INTERFACE, Stacks.top(entityStack)));

					        }
					pushFollow(FOLLOW_interfaceDeclaration_in_memberDecl1524);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					            addEntity(Stacks.pop(entityStack));
					            Stacks.pop(qualifiedNameStack);
					        }
					}
					break;
				case 6 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:388:9: classDeclaration
					{
					if ( state.backtracking==0 ) {
					            Stacks.push(entityStack, Entities.newJavaEntity(EntityType.CLASS, Stacks.top(entityStack)));
					        }
					pushFollow(FOLLOW_classDeclaration_in_memberDecl1554);
					classDeclaration();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					            addEntity(Stacks.pop(entityStack));
					            Stacks.pop(qualifiedNameStack);
					        }
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, memberDecl_StartIndex); }

		}
	}
	// $ANTLR end "memberDecl"



	// $ANTLR start "memberDeclaration"
	// edu/ua/cs/taser/extract/java/JavaParser.g:398:1: memberDeclaration : ( type methodDeclaration | type fieldDeclaration );
	public final void memberDeclaration() throws RecognitionException {
		int memberDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:399:5: ( type methodDeclaration | type fieldDeclaration )
			int alt43=2;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA43_1 = input.LA(2);
				if ( (synpred54_JavaParser()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}

				}
				break;
			case BOOLEAN:
				{
				int LA43_2 = input.LA(2);
				if ( (synpred54_JavaParser()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}

				}
				break;
			case CHAR:
				{
				int LA43_3 = input.LA(2);
				if ( (synpred54_JavaParser()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}

				}
				break;
			case BYTE:
				{
				int LA43_4 = input.LA(2);
				if ( (synpred54_JavaParser()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}

				}
				break;
			case SHORT:
				{
				int LA43_5 = input.LA(2);
				if ( (synpred54_JavaParser()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}

				}
				break;
			case INT:
				{
				int LA43_6 = input.LA(2);
				if ( (synpred54_JavaParser()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}

				}
				break;
			case LONG:
				{
				int LA43_7 = input.LA(2);
				if ( (synpred54_JavaParser()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}

				}
				break;
			case FLOAT:
				{
				int LA43_8 = input.LA(2);
				if ( (synpred54_JavaParser()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}

				}
				break;
			case DOUBLE:
				{
				int LA43_9 = input.LA(2);
				if ( (synpred54_JavaParser()) ) {
					alt43=1;
				}
				else if ( (true) ) {
					alt43=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:400:13: type methodDeclaration
					{
					if ( state.backtracking==0 ) {
					            Stacks.push(entityStack, Entities.newJavaEntity(EntityType.METHOD, Stacks.top(entityStack)));
					            }
					pushFollow(FOLLOW_type_in_memberDeclaration1603);
					type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_methodDeclaration_in_memberDeclaration1605);
					methodDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:404:9: type fieldDeclaration
					{
					pushFollow(FOLLOW_type_in_memberDeclaration1615);
					type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_fieldDeclaration_in_memberDeclaration1617);
					fieldDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, memberDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "memberDeclaration"



	// $ANTLR start "genericMethodOrConstructorDecl"
	// edu/ua/cs/taser/extract/java/JavaParser.g:407:1: genericMethodOrConstructorDecl : typeParameters genericMethodOrConstructorRest ;
	public final void genericMethodOrConstructorDecl() throws RecognitionException {
		int genericMethodOrConstructorDecl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:408:5: ( typeParameters genericMethodOrConstructorRest )
			// edu/ua/cs/taser/extract/java/JavaParser.g:409:13: typeParameters genericMethodOrConstructorRest
			{
			if ( state.backtracking==0 ) {
			            Stacks.push(entityStack, Entities.newJavaEntity(EntityType.METHOD, Stacks.top(entityStack)));
			            }
			pushFollow(FOLLOW_typeParameters_in_genericMethodOrConstructorDecl1656);
			typeParameters();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_genericMethodOrConstructorRest_in_genericMethodOrConstructorDecl1658);
			genericMethodOrConstructorRest();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			            addEntity(Stacks.pop(entityStack));
			            Stacks.pop(qualifiedNameStack);
			            }
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, genericMethodOrConstructorDecl_StartIndex); }

		}
	}
	// $ANTLR end "genericMethodOrConstructorDecl"



	// $ANTLR start "genericMethodOrConstructorRest"
	// edu/ua/cs/taser/extract/java/JavaParser.g:419:1: genericMethodOrConstructorRest : ( ( type |v= VOID ) i= Identifier methodDeclaratorRest |i= Identifier constructorDeclaratorRest );
	public final void genericMethodOrConstructorRest() throws RecognitionException {
		int genericMethodOrConstructorRest_StartIndex = input.index();

		Token v=null;
		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:420:5: ( ( type |v= VOID ) i= Identifier methodDeclaratorRest |i= Identifier constructorDeclaratorRest )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==Identifier) ) {
				int LA45_1 = input.LA(2);
				if ( (LA45_1==DOT||LA45_1==Identifier||LA45_1==LBRACKET||LA45_1==LT) ) {
					alt45=1;
				}
				else if ( (LA45_1==LPAREN) ) {
					alt45=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA45_0==BOOLEAN||LA45_0==BYTE||LA45_0==CHAR||LA45_0==DOUBLE||LA45_0==FLOAT||LA45_0==INT||LA45_0==LONG||LA45_0==SHORT||LA45_0==VOID) ) {
				alt45=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}

			switch (alt45) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:420:9: ( type |v= VOID ) i= Identifier methodDeclaratorRest
					{
					// edu/ua/cs/taser/extract/java/JavaParser.g:420:9: ( type |v= VOID )
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==BOOLEAN||LA44_0==BYTE||LA44_0==CHAR||LA44_0==DOUBLE||LA44_0==FLOAT||LA44_0==INT||LA44_0==Identifier||LA44_0==LONG||LA44_0==SHORT) ) {
						alt44=1;
					}
					else if ( (LA44_0==VOID) ) {
						alt44=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 44, 0, input);
						throw nvae;
					}

					switch (alt44) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:420:10: type
							{
							pushFollow(FOLLOW_type_in_genericMethodOrConstructorRest1692);
							type();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:420:17: v= VOID
							{
							v=(Token)match(input,VOID,FOLLOW_VOID_in_genericMethodOrConstructorRest1698); if (state.failed) return;
							if ( state.backtracking==0 ) {
							                Position voidPos = positionOf(v);
							                if (voidPos.precedes(RefTypeBody_stack.peek().start)) {
							                    // No modifier
							                    RefTypeBody_stack.peek().start = voidPos;
							                }
							            }
							}
							break;

					}

					i=(Token)match(input,Identifier,FOLLOW_Identifier_in_genericMethodOrConstructorRest1726); if (state.failed) return;
					if ( state.backtracking==0 ) {
					            String text = i.getText();
					            Stacks.push(qualifiedNameStack, text);
					            JavaEntity top = Stacks.top(entityStack);
					            top.setName(createQualifiedName());
					            addToken(makeToken(i, TokenType.METHOD_NAME, top, text));
					            }
					pushFollow(FOLLOW_methodDeclaratorRest_in_genericMethodOrConstructorRest1750);
					methodDeclaratorRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:437:9: i= Identifier constructorDeclaratorRest
					{
					i=(Token)match(input,Identifier,FOLLOW_Identifier_in_genericMethodOrConstructorRest1762); if (state.failed) return;
					if ( state.backtracking==0 ) {
					                Position iPos = positionOf(i);
					                if (iPos.precedes(RefTypeBody_stack.peek().start)) {
					                    // No modifier
					                    RefTypeBody_stack.peek().start = iPos;
					                }
					                String text = i.getText();
					                Stacks.push(qualifiedNameStack, text);
					                JavaEntity top = Stacks.top(entityStack);
					                top.setName(createQualifiedName());
					                addToken(makeToken(i, TokenType.METHOD_NAME, top, text));
					            }
					pushFollow(FOLLOW_constructorDeclaratorRest_in_genericMethodOrConstructorRest1786);
					constructorDeclaratorRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, genericMethodOrConstructorRest_StartIndex); }

		}
	}
	// $ANTLR end "genericMethodOrConstructorRest"



	// $ANTLR start "methodDeclaration"
	// edu/ua/cs/taser/extract/java/JavaParser.g:453:1: methodDeclaration : i= Identifier methodDeclaratorRest ;
	public final void methodDeclaration() throws RecognitionException {
		int methodDeclaration_StartIndex = input.index();

		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:454:5: (i= Identifier methodDeclaratorRest )
			// edu/ua/cs/taser/extract/java/JavaParser.g:454:9: i= Identifier methodDeclaratorRest
			{
			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_methodDeclaration1807); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            String text = i.getText();
			            Stacks.push(qualifiedNameStack, text);
			            JavaEntity top = Stacks.top(entityStack);
			            top.setName(createQualifiedName());
			            addToken(makeToken(i, TokenType.METHOD_NAME, top, text));
			            }
			pushFollow(FOLLOW_methodDeclaratorRest_in_methodDeclaration1831);
			methodDeclaratorRest();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			            addEntity(Stacks.pop(entityStack));
			            Stacks.pop(qualifiedNameStack);
			            }
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, methodDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "methodDeclaration"



	// $ANTLR start "fieldDeclaration"
	// edu/ua/cs/taser/extract/java/JavaParser.g:469:1: fieldDeclaration : variableDeclarators SEMICOLON ;
	public final void fieldDeclaration() throws RecognitionException {
		int fieldDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:470:5: ( variableDeclarators SEMICOLON )
			// edu/ua/cs/taser/extract/java/JavaParser.g:470:9: variableDeclarators SEMICOLON
			{
			pushFollow(FOLLOW_variableDeclarators_in_fieldDeclaration1864);
			variableDeclarators();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_fieldDeclaration1866); if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, fieldDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "fieldDeclaration"



	// $ANTLR start "interfaceBodyDeclaration"
	// edu/ua/cs/taser/extract/java/JavaParser.g:473:1: interfaceBodyDeclaration : ( modifiers interfaceMemberDecl | SEMICOLON );
	public final void interfaceBodyDeclaration() throws RecognitionException {
		RefTypeBody_stack.push(new RefTypeBody_scope());

		int interfaceBodyDeclaration_StartIndex = input.index();


		    RefTypeBody_stack.peek().start = Positions.tailPosition();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:478:5: ( modifiers interfaceMemberDecl | SEMICOLON )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==ABSTRACT||LA46_0==AT||LA46_0==BOOLEAN||LA46_0==BYTE||(LA46_0 >= CHAR && LA46_0 <= CLASS)||LA46_0==DOUBLE||LA46_0==ENUM||LA46_0==FINAL||LA46_0==FLOAT||(LA46_0 >= INT && LA46_0 <= Identifier)||LA46_0==LONG||LA46_0==LT||LA46_0==NATIVE||(LA46_0 >= PRIVATE && LA46_0 <= PUBLIC)||(LA46_0 >= SHORT && LA46_0 <= STRICTFP)||LA46_0==SYNCHRONIZED||LA46_0==TRANSIENT||(LA46_0 >= VOID && LA46_0 <= VOLATILE)) ) {
				alt46=1;
			}
			else if ( (LA46_0==SEMICOLON) ) {
				alt46=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:478:9: modifiers interfaceMemberDecl
					{
					pushFollow(FOLLOW_modifiers_in_interfaceBodyDeclaration1895);
					modifiers();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_interfaceMemberDecl_in_interfaceBodyDeclaration1897);
					interfaceMemberDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:479:9: SEMICOLON
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_interfaceBodyDeclaration1907); if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, interfaceBodyDeclaration_StartIndex); }

			RefTypeBody_stack.pop();

		}
	}
	// $ANTLR end "interfaceBodyDeclaration"



	// $ANTLR start "interfaceMemberDecl"
	// edu/ua/cs/taser/extract/java/JavaParser.g:482:1: interfaceMemberDecl : ( interfaceMethodOrFieldDecl | interfaceGenericMethodDecl |v= VOID i= Identifier voidInterfaceMethodDeclaratorRest | interfaceDeclaration | classDeclaration );
	public final void interfaceMemberDecl() throws RecognitionException {
		int interfaceMemberDecl_StartIndex = input.index();

		Token v=null;
		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:483:5: ( interfaceMethodOrFieldDecl | interfaceGenericMethodDecl |v= VOID i= Identifier voidInterfaceMethodDeclaratorRest | interfaceDeclaration | classDeclaration )
			int alt47=5;
			switch ( input.LA(1) ) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case Identifier:
			case LONG:
			case SHORT:
				{
				alt47=1;
				}
				break;
			case LT:
				{
				alt47=2;
				}
				break;
			case VOID:
				{
				alt47=3;
				}
				break;
			case AT:
			case INTERFACE:
				{
				alt47=4;
				}
				break;
			case CLASS:
			case ENUM:
				{
				alt47=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:483:9: interfaceMethodOrFieldDecl
					{
					pushFollow(FOLLOW_interfaceMethodOrFieldDecl_in_interfaceMemberDecl1926);
					interfaceMethodOrFieldDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:484:9: interfaceGenericMethodDecl
					{
					pushFollow(FOLLOW_interfaceGenericMethodDecl_in_interfaceMemberDecl1936);
					interfaceGenericMethodDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:486:13: v= VOID i= Identifier voidInterfaceMethodDeclaratorRest
					{
					if ( state.backtracking==0 ) {
					            Stacks.push(entityStack, Entities.newJavaEntity(EntityType.METHOD, Stacks.top(entityStack)));
					            }
					v=(Token)match(input,VOID,FOLLOW_VOID_in_interfaceMemberDecl1968); if (state.failed) return;
					i=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceMemberDecl1972); if (state.failed) return;
					if ( state.backtracking==0 ) {
					                Position voidPos = positionOf(v);
					                if (voidPos.precedes(RefTypeBody_stack.peek().start)) {
					                    // No modifier
					                    RefTypeBody_stack.peek().start = voidPos;
					                }
					                String text = i.getText();
					                Stacks.push(qualifiedNameStack, text);
					                JavaEntity top = Stacks.top(entityStack);
					                top.setName(createQualifiedName());
					                addToken(makeToken(i, TokenType.METHOD_NAME, top, text));
					            }
					pushFollow(FOLLOW_voidInterfaceMethodDeclaratorRest_in_interfaceMemberDecl1996);
					voidInterfaceMethodDeclaratorRest();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					            addEntity(Stacks.pop(entityStack));
					            Stacks.pop(qualifiedNameStack);
					            }
					}
					break;
				case 4 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:508:13: interfaceDeclaration
					{
					if ( state.backtracking==0 ) {
					            Stacks.push(entityStack, Entities.newJavaEntity(EntityType.INTERFACE, Stacks.top(entityStack)));
					            }
					pushFollow(FOLLOW_interfaceDeclaration_in_interfaceMemberDecl2040);
					interfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					            addEntity(Stacks.pop(entityStack));
					            Stacks.pop(qualifiedNameStack);
					            }
					}
					break;
				case 5 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:517:13: classDeclaration
					{
					if ( state.backtracking==0 ) {
					            Stacks.push(entityStack, Entities.newJavaEntity(EntityType.CLASS, Stacks.top(entityStack)));
					            }
					pushFollow(FOLLOW_classDeclaration_in_interfaceMemberDecl2084);
					classDeclaration();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					            addEntity(Stacks.pop(entityStack));
					            Stacks.pop(qualifiedNameStack);
					            }
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, interfaceMemberDecl_StartIndex); }

		}
	}
	// $ANTLR end "interfaceMemberDecl"



	// $ANTLR start "interfaceMethodOrFieldDecl"
	// edu/ua/cs/taser/extract/java/JavaParser.g:527:1: interfaceMethodOrFieldDecl : ( type i= Identifier constantDeclaratorsRest SEMICOLON | type i= Identifier interfaceMethodDeclaratorRest );
	public final void interfaceMethodOrFieldDecl() throws RecognitionException {
		int interfaceMethodOrFieldDecl_StartIndex = input.index();

		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:528:5: ( type i= Identifier constantDeclaratorsRest SEMICOLON | type i= Identifier interfaceMethodDeclaratorRest )
			int alt48=2;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA48_1 = input.LA(2);
				if ( (synpred62_JavaParser()) ) {
					alt48=1;
				}
				else if ( (true) ) {
					alt48=2;
				}

				}
				break;
			case BOOLEAN:
				{
				int LA48_2 = input.LA(2);
				if ( (synpred62_JavaParser()) ) {
					alt48=1;
				}
				else if ( (true) ) {
					alt48=2;
				}

				}
				break;
			case CHAR:
				{
				int LA48_3 = input.LA(2);
				if ( (synpred62_JavaParser()) ) {
					alt48=1;
				}
				else if ( (true) ) {
					alt48=2;
				}

				}
				break;
			case BYTE:
				{
				int LA48_4 = input.LA(2);
				if ( (synpred62_JavaParser()) ) {
					alt48=1;
				}
				else if ( (true) ) {
					alt48=2;
				}

				}
				break;
			case SHORT:
				{
				int LA48_5 = input.LA(2);
				if ( (synpred62_JavaParser()) ) {
					alt48=1;
				}
				else if ( (true) ) {
					alt48=2;
				}

				}
				break;
			case INT:
				{
				int LA48_6 = input.LA(2);
				if ( (synpred62_JavaParser()) ) {
					alt48=1;
				}
				else if ( (true) ) {
					alt48=2;
				}

				}
				break;
			case LONG:
				{
				int LA48_7 = input.LA(2);
				if ( (synpred62_JavaParser()) ) {
					alt48=1;
				}
				else if ( (true) ) {
					alt48=2;
				}

				}
				break;
			case FLOAT:
				{
				int LA48_8 = input.LA(2);
				if ( (synpred62_JavaParser()) ) {
					alt48=1;
				}
				else if ( (true) ) {
					alt48=2;
				}

				}
				break;
			case DOUBLE:
				{
				int LA48_9 = input.LA(2);
				if ( (synpred62_JavaParser()) ) {
					alt48=1;
				}
				else if ( (true) ) {
					alt48=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:528:9: type i= Identifier constantDeclaratorsRest SEMICOLON
					{
					pushFollow(FOLLOW_type_in_interfaceMethodOrFieldDecl2117);
					type();
					state._fsp--;
					if (state.failed) return;
					i=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceMethodOrFieldDecl2121); if (state.failed) return;
					if ( state.backtracking==0 ) {
					                addToken(makeToken(i, TokenType.FIELD_NAME, Stacks.top(entityStack)));
					            }
					pushFollow(FOLLOW_constantDeclaratorsRest_in_interfaceMethodOrFieldDecl2145);
					constantDeclaratorsRest();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_interfaceMethodOrFieldDecl2147); if (state.failed) return;
					if ( state.backtracking==0 ) {
					                RefTypeBody_stack.peek().start = Positions.tailPosition();
					            }
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:537:13: type i= Identifier interfaceMethodDeclaratorRest
					{
					if ( state.backtracking==0 ) {
					            Stacks.push(entityStack, Entities.newJavaEntity(EntityType.METHOD, Stacks.top(entityStack)));
					            }
					pushFollow(FOLLOW_type_in_interfaceMethodOrFieldDecl2191);
					type();
					state._fsp--;
					if (state.failed) return;
					i=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceMethodOrFieldDecl2195); if (state.failed) return;
					if ( state.backtracking==0 ) {
					            String text = i.getText();
					            Stacks.push(qualifiedNameStack, text);
					            JavaEntity top = Stacks.top(entityStack);
					            top.setName(createQualifiedName());
					            addToken(makeToken(i, TokenType.METHOD_NAME, top, text));
					            }
					pushFollow(FOLLOW_interfaceMethodDeclaratorRest_in_interfaceMethodOrFieldDecl2219);
					interfaceMethodDeclaratorRest();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					            addEntity(Stacks.pop(entityStack));
					            Stacks.pop(qualifiedNameStack);
					            }
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, interfaceMethodOrFieldDecl_StartIndex); }

		}
	}
	// $ANTLR end "interfaceMethodOrFieldDecl"



	// $ANTLR start "methodDeclaratorRest"
	// edu/ua/cs/taser/extract/java/JavaParser.g:555:1: methodDeclaratorRest : formalParameters ( LBRACKET RBRACKET )* ( THROWS qualifiedNameList )? ( methodBody |c= SEMICOLON ) ;
	public final void methodDeclaratorRest() throws RecognitionException {
		int methodDeclaratorRest_StartIndex = input.index();

		Token c=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:556:5: ( formalParameters ( LBRACKET RBRACKET )* ( THROWS qualifiedNameList )? ( methodBody |c= SEMICOLON ) )
			// edu/ua/cs/taser/extract/java/JavaParser.g:556:9: formalParameters ( LBRACKET RBRACKET )* ( THROWS qualifiedNameList )? ( methodBody |c= SEMICOLON )
			{
			pushFollow(FOLLOW_formalParameters_in_methodDeclaratorRest2252);
			formalParameters();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:556:26: ( LBRACKET RBRACKET )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==LBRACKET) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:556:27: LBRACKET RBRACKET
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_methodDeclaratorRest2255); if (state.failed) return;
					match(input,RBRACKET,FOLLOW_RBRACKET_in_methodDeclaratorRest2257); if (state.failed) return;
					}
					break;

				default :
					break loop49;
				}
			}

			if ( state.backtracking==0 ) {
			                appendString(createFormalsString());
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:560:9: ( THROWS qualifiedNameList )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==THROWS) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:560:10: THROWS qualifiedNameList
					{
					match(input,THROWS,FOLLOW_THROWS_in_methodDeclaratorRest2284); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedNameList_in_methodDeclaratorRest2286);
					qualifiedNameList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// edu/ua/cs/taser/extract/java/JavaParser.g:561:9: ( methodBody |c= SEMICOLON )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==LBRACE) ) {
				alt51=1;
			}
			else if ( (LA51_0==SEMICOLON) ) {
				alt51=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:561:13: methodBody
					{
					pushFollow(FOLLOW_methodBody_in_methodDeclaratorRest2302);
					methodBody();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:562:13: c= SEMICOLON
					{
					c=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_methodDeclaratorRest2318); if (state.failed) return;
					if ( state.backtracking==0 ) {
					                    JavaEntity top = Stacks.top(entityStack);
					                    top.setPosition(RefTypeBody_stack.peek().start.withEnd(positionOf(c)));
					                    RefTypeBody_stack.peek().start = Positions.tailPosition();
					                }
					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, methodDeclaratorRest_StartIndex); }

		}
	}
	// $ANTLR end "methodDeclaratorRest"



	// $ANTLR start "voidMethodDeclaratorRest"
	// edu/ua/cs/taser/extract/java/JavaParser.g:571:1: voidMethodDeclaratorRest : formalParameters ( THROWS qualifiedNameList )? ( methodBody |c= SEMICOLON ) ;
	public final void voidMethodDeclaratorRest() throws RecognitionException {
		int voidMethodDeclaratorRest_StartIndex = input.index();

		Token c=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:572:5: ( formalParameters ( THROWS qualifiedNameList )? ( methodBody |c= SEMICOLON ) )
			// edu/ua/cs/taser/extract/java/JavaParser.g:572:9: formalParameters ( THROWS qualifiedNameList )? ( methodBody |c= SEMICOLON )
			{
			pushFollow(FOLLOW_formalParameters_in_voidMethodDeclaratorRest2365);
			formalParameters();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			                appendString(createFormalsString());
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:576:9: ( THROWS qualifiedNameList )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==THROWS) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:576:10: THROWS qualifiedNameList
					{
					match(input,THROWS,FOLLOW_THROWS_in_voidMethodDeclaratorRest2390); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedNameList_in_voidMethodDeclaratorRest2392);
					qualifiedNameList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// edu/ua/cs/taser/extract/java/JavaParser.g:577:9: ( methodBody |c= SEMICOLON )
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==LBRACE) ) {
				alt53=1;
			}
			else if ( (LA53_0==SEMICOLON) ) {
				alt53=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}

			switch (alt53) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:577:13: methodBody
					{
					pushFollow(FOLLOW_methodBody_in_voidMethodDeclaratorRest2408);
					methodBody();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:578:13: c= SEMICOLON
					{
					c=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_voidMethodDeclaratorRest2424); if (state.failed) return;
					if ( state.backtracking==0 ) {
					                    JavaEntity top = Stacks.top(entityStack);
					                    top.setPosition(RefTypeBody_stack.peek().start.withEnd(positionOf(c)));
					                    RefTypeBody_stack.peek().start = Positions.tailPosition();
					                }
					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, voidMethodDeclaratorRest_StartIndex); }

		}
	}
	// $ANTLR end "voidMethodDeclaratorRest"



	// $ANTLR start "interfaceMethodDeclaratorRest"
	// edu/ua/cs/taser/extract/java/JavaParser.g:587:1: interfaceMethodDeclaratorRest : formalParameters ( LBRACKET RBRACKET )* ( THROWS qualifiedNameList )? c= SEMICOLON ;
	public final void interfaceMethodDeclaratorRest() throws RecognitionException {
		int interfaceMethodDeclaratorRest_StartIndex = input.index();

		Token c=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:588:5: ( formalParameters ( LBRACKET RBRACKET )* ( THROWS qualifiedNameList )? c= SEMICOLON )
			// edu/ua/cs/taser/extract/java/JavaParser.g:588:9: formalParameters ( LBRACKET RBRACKET )* ( THROWS qualifiedNameList )? c= SEMICOLON
			{
			pushFollow(FOLLOW_formalParameters_in_interfaceMethodDeclaratorRest2471);
			formalParameters();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			                appendString(createFormalsString());
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:592:9: ( LBRACKET RBRACKET )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==LBRACKET) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:592:10: LBRACKET RBRACKET
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_interfaceMethodDeclaratorRest2496); if (state.failed) return;
					match(input,RBRACKET,FOLLOW_RBRACKET_in_interfaceMethodDeclaratorRest2498); if (state.failed) return;
					}
					break;

				default :
					break loop54;
				}
			}

			// edu/ua/cs/taser/extract/java/JavaParser.g:592:30: ( THROWS qualifiedNameList )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==THROWS) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:592:31: THROWS qualifiedNameList
					{
					match(input,THROWS,FOLLOW_THROWS_in_interfaceMethodDeclaratorRest2503); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedNameList_in_interfaceMethodDeclaratorRest2505);
					qualifiedNameList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			c=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_interfaceMethodDeclaratorRest2511); if (state.failed) return;
			if ( state.backtracking==0 ) {
			                JavaEntity top = Stacks.top(entityStack);
			                top.setPosition(RefTypeBody_stack.peek().start.withEnd(positionOf(c)));
			                RefTypeBody_stack.peek().start = Positions.tailPosition();
			            }
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, interfaceMethodDeclaratorRest_StartIndex); }

		}
	}
	// $ANTLR end "interfaceMethodDeclaratorRest"



	// $ANTLR start "interfaceGenericMethodDecl"
	// edu/ua/cs/taser/extract/java/JavaParser.g:600:1: interfaceGenericMethodDecl : typeParameters ( type | VOID ) i= Identifier interfaceMethodDeclaratorRest ;
	public final void interfaceGenericMethodDecl() throws RecognitionException {
		int interfaceGenericMethodDecl_StartIndex = input.index();

		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:601:5: ( typeParameters ( type | VOID ) i= Identifier interfaceMethodDeclaratorRest )
			// edu/ua/cs/taser/extract/java/JavaParser.g:602:13: typeParameters ( type | VOID ) i= Identifier interfaceMethodDeclaratorRest
			{
			if ( state.backtracking==0 ) {
			            Stacks.push(entityStack, Entities.newJavaEntity(EntityType.METHOD, Stacks.top(entityStack)));
			            }
			pushFollow(FOLLOW_typeParameters_in_interfaceGenericMethodDecl2564);
			typeParameters();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:605:24: ( type | VOID )
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==BOOLEAN||LA56_0==BYTE||LA56_0==CHAR||LA56_0==DOUBLE||LA56_0==FLOAT||LA56_0==INT||LA56_0==Identifier||LA56_0==LONG||LA56_0==SHORT) ) {
				alt56=1;
			}
			else if ( (LA56_0==VOID) ) {
				alt56=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}

			switch (alt56) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:605:25: type
					{
					pushFollow(FOLLOW_type_in_interfaceGenericMethodDecl2567);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:605:32: VOID
					{
					match(input,VOID,FOLLOW_VOID_in_interfaceGenericMethodDecl2571); if (state.failed) return;
					}
					break;

			}

			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_interfaceGenericMethodDecl2576); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            String text = i.getText();
			            Stacks.push(qualifiedNameStack, text);
			            JavaEntity top = Stacks.top(entityStack);
			            top.setName(createQualifiedName());
			            addToken(makeToken(i, TokenType.METHOD_NAME, top, text));
			            }
			pushFollow(FOLLOW_interfaceMethodDeclaratorRest_in_interfaceGenericMethodDecl2600);
			interfaceMethodDeclaratorRest();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			            addEntity(Stacks.pop(entityStack));
			            Stacks.pop(qualifiedNameStack);
			            }
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, interfaceGenericMethodDecl_StartIndex); }

		}
	}
	// $ANTLR end "interfaceGenericMethodDecl"



	// $ANTLR start "voidInterfaceMethodDeclaratorRest"
	// edu/ua/cs/taser/extract/java/JavaParser.g:620:1: voidInterfaceMethodDeclaratorRest : formalParameters ( THROWS qualifiedNameList )? c= SEMICOLON ;
	public final void voidInterfaceMethodDeclaratorRest() throws RecognitionException {
		int voidInterfaceMethodDeclaratorRest_StartIndex = input.index();

		Token c=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:621:5: ( formalParameters ( THROWS qualifiedNameList )? c= SEMICOLON )
			// edu/ua/cs/taser/extract/java/JavaParser.g:621:9: formalParameters ( THROWS qualifiedNameList )? c= SEMICOLON
			{
			pushFollow(FOLLOW_formalParameters_in_voidInterfaceMethodDeclaratorRest2633);
			formalParameters();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			            appendString(createFormalsString());
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:625:9: ( THROWS qualifiedNameList )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==THROWS) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:625:10: THROWS qualifiedNameList
					{
					match(input,THROWS,FOLLOW_THROWS_in_voidInterfaceMethodDeclaratorRest2658); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedNameList_in_voidInterfaceMethodDeclaratorRest2660);
					qualifiedNameList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			c=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_voidInterfaceMethodDeclaratorRest2666); if (state.failed) return;
			if ( state.backtracking==0 ) {
			                JavaEntity top = Stacks.top(entityStack);
			                top.setPosition(RefTypeBody_stack.peek().start.withEnd(positionOf(c)));
			                RefTypeBody_stack.peek().start = Positions.tailPosition();
			            }
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, voidInterfaceMethodDeclaratorRest_StartIndex); }

		}
	}
	// $ANTLR end "voidInterfaceMethodDeclaratorRest"



	// $ANTLR start "constructorDeclaratorRest"
	// edu/ua/cs/taser/extract/java/JavaParser.g:633:1: constructorDeclaratorRest : formalParameters ( THROWS qualifiedNameList )? constructorBody ;
	public final void constructorDeclaratorRest() throws RecognitionException {
		int constructorDeclaratorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:634:5: ( formalParameters ( THROWS qualifiedNameList )? constructorBody )
			// edu/ua/cs/taser/extract/java/JavaParser.g:634:9: formalParameters ( THROWS qualifiedNameList )? constructorBody
			{
			pushFollow(FOLLOW_formalParameters_in_constructorDeclaratorRest2699);
			formalParameters();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			            appendString(createFormalsString());
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:638:9: ( THROWS qualifiedNameList )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==THROWS) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:638:10: THROWS qualifiedNameList
					{
					match(input,THROWS,FOLLOW_THROWS_in_constructorDeclaratorRest2724); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedNameList_in_constructorDeclaratorRest2726);
					qualifiedNameList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			pushFollow(FOLLOW_constructorBody_in_constructorDeclaratorRest2730);
			constructorBody();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, constructorDeclaratorRest_StartIndex); }

		}
	}
	// $ANTLR end "constructorDeclaratorRest"



	// $ANTLR start "constantDeclarator"
	// edu/ua/cs/taser/extract/java/JavaParser.g:641:1: constantDeclarator : i= Identifier constantDeclaratorRest ;
	public final void constantDeclarator() throws RecognitionException {
		int constantDeclarator_StartIndex = input.index();

		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:642:5: (i= Identifier constantDeclaratorRest )
			// edu/ua/cs/taser/extract/java/JavaParser.g:642:9: i= Identifier constantDeclaratorRest
			{
			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantDeclarator2751); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            addToken(makeToken(i, TokenType.FIELD_NAME, Stacks.top(entityStack)));
			            }
			pushFollow(FOLLOW_constantDeclaratorRest_in_constantDeclarator2775);
			constantDeclaratorRest();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, constantDeclarator_StartIndex); }

		}
	}
	// $ANTLR end "constantDeclarator"



	// $ANTLR start "variableDeclarators"
	// edu/ua/cs/taser/extract/java/JavaParser.g:649:1: variableDeclarators : variableDeclarator ( COMMA variableDeclarator )* ;
	public final void variableDeclarators() throws RecognitionException {
		int variableDeclarators_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:650:5: ( variableDeclarator ( COMMA variableDeclarator )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:650:9: variableDeclarator ( COMMA variableDeclarator )*
			{
			pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators2794);
			variableDeclarator();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:650:28: ( COMMA variableDeclarator )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==COMMA) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:650:29: COMMA variableDeclarator
					{
					match(input,COMMA,FOLLOW_COMMA_in_variableDeclarators2797); if (state.failed) return;
					pushFollow(FOLLOW_variableDeclarator_in_variableDeclarators2799);
					variableDeclarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop59;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, variableDeclarators_StartIndex); }

		}
	}
	// $ANTLR end "variableDeclarators"



	// $ANTLR start "variableDeclarator"
	// edu/ua/cs/taser/extract/java/JavaParser.g:653:1: variableDeclarator : variableDeclaratorId ( ASG variableInitializer )? ;
	public final void variableDeclarator() throws RecognitionException {
		int variableDeclarator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:654:5: ( variableDeclaratorId ( ASG variableInitializer )? )
			// edu/ua/cs/taser/extract/java/JavaParser.g:654:9: variableDeclaratorId ( ASG variableInitializer )?
			{
			pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator2820);
			variableDeclaratorId();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			            lastVariableDeclaratorId = null;
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:658:9: ( ASG variableInitializer )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==ASG) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:658:10: ASG variableInitializer
					{
					match(input,ASG,FOLLOW_ASG_in_variableDeclarator2845); if (state.failed) return;
					pushFollow(FOLLOW_variableInitializer_in_variableDeclarator2847);
					variableInitializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, variableDeclarator_StartIndex); }

		}
	}
	// $ANTLR end "variableDeclarator"



	// $ANTLR start "constantDeclaratorsRest"
	// edu/ua/cs/taser/extract/java/JavaParser.g:661:1: constantDeclaratorsRest : constantDeclaratorRest ( COMMA constantDeclarator )* ;
	public final void constantDeclaratorsRest() throws RecognitionException {
		int constantDeclaratorsRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:662:5: ( constantDeclaratorRest ( COMMA constantDeclarator )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:662:9: constantDeclaratorRest ( COMMA constantDeclarator )*
			{
			pushFollow(FOLLOW_constantDeclaratorRest_in_constantDeclaratorsRest2868);
			constantDeclaratorRest();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:662:32: ( COMMA constantDeclarator )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==COMMA) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:662:33: COMMA constantDeclarator
					{
					match(input,COMMA,FOLLOW_COMMA_in_constantDeclaratorsRest2871); if (state.failed) return;
					pushFollow(FOLLOW_constantDeclarator_in_constantDeclaratorsRest2873);
					constantDeclarator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop61;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, constantDeclaratorsRest_StartIndex); }

		}
	}
	// $ANTLR end "constantDeclaratorsRest"



	// $ANTLR start "constantDeclaratorRest"
	// edu/ua/cs/taser/extract/java/JavaParser.g:665:1: constantDeclaratorRest : ( LBRACKET RBRACKET )* ASG variableInitializer ;
	public final void constantDeclaratorRest() throws RecognitionException {
		int constantDeclaratorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:666:5: ( ( LBRACKET RBRACKET )* ASG variableInitializer )
			// edu/ua/cs/taser/extract/java/JavaParser.g:666:9: ( LBRACKET RBRACKET )* ASG variableInitializer
			{
			// edu/ua/cs/taser/extract/java/JavaParser.g:666:9: ( LBRACKET RBRACKET )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==LBRACKET) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:666:10: LBRACKET RBRACKET
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_constantDeclaratorRest2895); if (state.failed) return;
					match(input,RBRACKET,FOLLOW_RBRACKET_in_constantDeclaratorRest2897); if (state.failed) return;
					}
					break;

				default :
					break loop62;
				}
			}

			match(input,ASG,FOLLOW_ASG_in_constantDeclaratorRest2901); if (state.failed) return;
			pushFollow(FOLLOW_variableInitializer_in_constantDeclaratorRest2903);
			variableInitializer();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, constantDeclaratorRest_StartIndex); }

		}
	}
	// $ANTLR end "constantDeclaratorRest"



	// $ANTLR start "variableDeclaratorId"
	// edu/ua/cs/taser/extract/java/JavaParser.g:669:1: variableDeclaratorId : i= Identifier ( LBRACKET RBRACKET )* ;
	public final void variableDeclaratorId() throws RecognitionException {
		int variableDeclaratorId_StartIndex = input.index();

		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:670:5: (i= Identifier ( LBRACKET RBRACKET )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:670:9: i= Identifier ( LBRACKET RBRACKET )*
			{
			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDeclaratorId2924); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            JavaEntity entity = Stacks.top(entityStack);
			            TokenType type = (entity.getType().isClassType()) ? TokenType.FIELD_NAME : TokenType.LOCAL_VARIABLE_NAME;
			            lastVariableDeclaratorId = makeToken(i, type, entity);
			            addToken(lastVariableDeclaratorId);
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:677:9: ( LBRACKET RBRACKET )*
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==LBRACKET) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:677:10: LBRACKET RBRACKET
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_variableDeclaratorId2949); if (state.failed) return;
					match(input,RBRACKET,FOLLOW_RBRACKET_in_variableDeclaratorId2951); if (state.failed) return;
					}
					break;

				default :
					break loop63;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, variableDeclaratorId_StartIndex); }

		}
	}
	// $ANTLR end "variableDeclaratorId"



	// $ANTLR start "variableInitializer"
	// edu/ua/cs/taser/extract/java/JavaParser.g:680:1: variableInitializer : ( arrayInitializer | expression );
	public final void variableInitializer() throws RecognitionException {
		int variableInitializer_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:681:5: ( arrayInitializer | expression )
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==LBRACE) ) {
				alt64=1;
			}
			else if ( (LA64_0==ADD||LA64_0==BITNOT||LA64_0==BOOLEAN||LA64_0==BYTE||LA64_0==CHAR||(LA64_0 >= CharacterLiteral && LA64_0 <= DEC)||(LA64_0 >= DOUBLE && LA64_0 <= DecimalLiteral)||LA64_0==FALSE||LA64_0==FLOAT||LA64_0==FloatingPointLiteral||LA64_0==HexLiteral||LA64_0==INC||LA64_0==INT||LA64_0==Identifier||(LA64_0 >= LONG && LA64_0 <= LPAREN)||(LA64_0 >= NEW && LA64_0 <= NULL)||LA64_0==OctalLiteral||LA64_0==SHORT||(LA64_0 >= SUB && LA64_0 <= SUPER)||(LA64_0 >= StringLiteral && LA64_0 <= THIS)||LA64_0==TRUE||LA64_0==VOID) ) {
				alt64=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:681:9: arrayInitializer
					{
					pushFollow(FOLLOW_arrayInitializer_in_variableInitializer2972);
					arrayInitializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:682:9: expression
					{
					pushFollow(FOLLOW_expression_in_variableInitializer2982);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, variableInitializer_StartIndex); }

		}
	}
	// $ANTLR end "variableInitializer"



	// $ANTLR start "arrayInitializer"
	// edu/ua/cs/taser/extract/java/JavaParser.g:685:1: arrayInitializer : o= LBRACE ( variableInitializer ( COMMA variableInitializer )* ( COMMA )? )? c= RBRACE ;
	public final void arrayInitializer() throws RecognitionException {
		int arrayInitializer_StartIndex = input.index();

		Token o=null;
		Token c=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:686:5: (o= LBRACE ( variableInitializer ( COMMA variableInitializer )* ( COMMA )? )? c= RBRACE )
			// edu/ua/cs/taser/extract/java/JavaParser.g:686:9: o= LBRACE ( variableInitializer ( COMMA variableInitializer )* ( COMMA )? )? c= RBRACE
			{
			o=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_arrayInitializer3003); if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:686:18: ( variableInitializer ( COMMA variableInitializer )* ( COMMA )? )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==ADD||LA67_0==BITNOT||LA67_0==BOOLEAN||LA67_0==BYTE||LA67_0==CHAR||(LA67_0 >= CharacterLiteral && LA67_0 <= DEC)||(LA67_0 >= DOUBLE && LA67_0 <= DecimalLiteral)||LA67_0==FALSE||LA67_0==FLOAT||LA67_0==FloatingPointLiteral||LA67_0==HexLiteral||LA67_0==INC||LA67_0==INT||LA67_0==Identifier||LA67_0==LBRACE||(LA67_0 >= LONG && LA67_0 <= LPAREN)||(LA67_0 >= NEW && LA67_0 <= NULL)||LA67_0==OctalLiteral||LA67_0==SHORT||(LA67_0 >= SUB && LA67_0 <= SUPER)||(LA67_0 >= StringLiteral && LA67_0 <= THIS)||LA67_0==TRUE||LA67_0==VOID) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:686:19: variableInitializer ( COMMA variableInitializer )* ( COMMA )?
					{
					pushFollow(FOLLOW_variableInitializer_in_arrayInitializer3006);
					variableInitializer();
					state._fsp--;
					if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:686:39: ( COMMA variableInitializer )*
					loop65:
					while (true) {
						int alt65=2;
						int LA65_0 = input.LA(1);
						if ( (LA65_0==COMMA) ) {
							int LA65_1 = input.LA(2);
							if ( (LA65_1==ADD||LA65_1==BITNOT||LA65_1==BOOLEAN||LA65_1==BYTE||LA65_1==CHAR||(LA65_1 >= CharacterLiteral && LA65_1 <= DEC)||(LA65_1 >= DOUBLE && LA65_1 <= DecimalLiteral)||LA65_1==FALSE||LA65_1==FLOAT||LA65_1==FloatingPointLiteral||LA65_1==HexLiteral||LA65_1==INC||LA65_1==INT||LA65_1==Identifier||LA65_1==LBRACE||(LA65_1 >= LONG && LA65_1 <= LPAREN)||(LA65_1 >= NEW && LA65_1 <= NULL)||LA65_1==OctalLiteral||LA65_1==SHORT||(LA65_1 >= SUB && LA65_1 <= SUPER)||(LA65_1 >= StringLiteral && LA65_1 <= THIS)||LA65_1==TRUE||LA65_1==VOID) ) {
								alt65=1;
							}

						}

						switch (alt65) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:686:40: COMMA variableInitializer
							{
							match(input,COMMA,FOLLOW_COMMA_in_arrayInitializer3009); if (state.failed) return;
							pushFollow(FOLLOW_variableInitializer_in_arrayInitializer3011);
							variableInitializer();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop65;
						}
					}

					// edu/ua/cs/taser/extract/java/JavaParser.g:686:68: ( COMMA )?
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( (LA66_0==COMMA) ) {
						alt66=1;
					}
					switch (alt66) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:686:69: COMMA
							{
							match(input,COMMA,FOLLOW_COMMA_in_arrayInitializer3016); if (state.failed) return;
							}
							break;

					}

					}
					break;

			}

			c=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_arrayInitializer3025); if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 47, arrayInitializer_StartIndex); }

		}
	}
	// $ANTLR end "arrayInitializer"



	// $ANTLR start "modifier"
	// edu/ua/cs/taser/extract/java/JavaParser.g:689:1: modifier : ( annotation |mod= PUBLIC |mod= PROTECTED |mod= PRIVATE |mod= STATIC |mod= ABSTRACT |mod= FINAL |mod= NATIVE |mod= SYNCHRONIZED |mod= TRANSIENT |mod= VOLATILE |mod= STRICTFP );
	public final void modifier() throws RecognitionException {
		int modifier_StartIndex = input.index();

		Token mod=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:711:5: ( annotation |mod= PUBLIC |mod= PROTECTED |mod= PRIVATE |mod= STATIC |mod= ABSTRACT |mod= FINAL |mod= NATIVE |mod= SYNCHRONIZED |mod= TRANSIENT |mod= VOLATILE |mod= STRICTFP )
			int alt68=12;
			switch ( input.LA(1) ) {
			case AT:
				{
				alt68=1;
				}
				break;
			case PUBLIC:
				{
				alt68=2;
				}
				break;
			case PROTECTED:
				{
				alt68=3;
				}
				break;
			case PRIVATE:
				{
				alt68=4;
				}
				break;
			case STATIC:
				{
				alt68=5;
				}
				break;
			case ABSTRACT:
				{
				alt68=6;
				}
				break;
			case FINAL:
				{
				alt68=7;
				}
				break;
			case NATIVE:
				{
				alt68=8;
				}
				break;
			case SYNCHRONIZED:
				{
				alt68=9;
				}
				break;
			case TRANSIENT:
				{
				alt68=10;
				}
				break;
			case VOLATILE:
				{
				alt68=11;
				}
				break;
			case STRICTFP:
				{
				alt68=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}
			switch (alt68) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:711:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_modifier3049);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:712:9: mod= PUBLIC
					{
					mod=(Token)match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier3061); if (state.failed) return;
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:713:9: mod= PROTECTED
					{
					mod=(Token)match(input,PROTECTED,FOLLOW_PROTECTED_in_modifier3073); if (state.failed) return;
					}
					break;
				case 4 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:714:9: mod= PRIVATE
					{
					mod=(Token)match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier3085); if (state.failed) return;
					}
					break;
				case 5 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:715:9: mod= STATIC
					{
					mod=(Token)match(input,STATIC,FOLLOW_STATIC_in_modifier3097); if (state.failed) return;
					}
					break;
				case 6 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:716:9: mod= ABSTRACT
					{
					mod=(Token)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifier3109); if (state.failed) return;
					}
					break;
				case 7 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:717:9: mod= FINAL
					{
					mod=(Token)match(input,FINAL,FOLLOW_FINAL_in_modifier3121); if (state.failed) return;
					}
					break;
				case 8 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:718:9: mod= NATIVE
					{
					mod=(Token)match(input,NATIVE,FOLLOW_NATIVE_in_modifier3133); if (state.failed) return;
					}
					break;
				case 9 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:719:9: mod= SYNCHRONIZED
					{
					mod=(Token)match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_modifier3145); if (state.failed) return;
					}
					break;
				case 10 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:720:9: mod= TRANSIENT
					{
					mod=(Token)match(input,TRANSIENT,FOLLOW_TRANSIENT_in_modifier3157); if (state.failed) return;
					}
					break;
				case 11 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:721:9: mod= VOLATILE
					{
					mod=(Token)match(input,VOLATILE,FOLLOW_VOLATILE_in_modifier3169); if (state.failed) return;
					}
					break;
				case 12 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:722:9: mod= STRICTFP
					{
					mod=(Token)match(input,STRICTFP,FOLLOW_STRICTFP_in_modifier3181); if (state.failed) return;
					}
					break;

			}
			if ( state.backtracking==0 ) {
			    if (mod != null) {
			        // Found modifier
			        Position modPos = positionOf(mod);
			        if (RefTypeBody_stack.size() == 0) {
			            // Not nested in a reference type body
			            JavaEntity top = Stacks.top(entityStack);
			            Position topPos = top.getPosition();
			            if (modPos.precedes(topPos)) {
			                // First modifier
			                top.setPosition(topPos.withStart(modPos));
			            }
			        } else {
			            // Nested in a reference type body
			            if (modPos.precedes(RefTypeBody_stack.peek().start)) {
			                // First modifier
			                RefTypeBody_stack.peek().start = modPos;
			            }
			        }
			    }
			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, modifier_StartIndex); }

		}
	}
	// $ANTLR end "modifier"



	// $ANTLR start "enumConstantName"
	// edu/ua/cs/taser/extract/java/JavaParser.g:725:1: enumConstantName : i= Identifier ;
	public final void enumConstantName() throws RecognitionException {
		int enumConstantName_StartIndex = input.index();

		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:726:5: (i= Identifier )
			// edu/ua/cs/taser/extract/java/JavaParser.g:726:9: i= Identifier
			{
			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_enumConstantName3202); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            addToken(makeToken(i, TokenType.ENUM_CONSTANT_REF, Stacks.top(entityStack)));
			            }
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, enumConstantName_StartIndex); }

		}
	}
	// $ANTLR end "enumConstantName"



	// $ANTLR start "type"
	// edu/ua/cs/taser/extract/java/JavaParser.g:732:1: type returns [String name] : (t= classOrInterfaceType ( LBRACKET RBRACKET )* |t= primitiveType ( LBRACKET RBRACKET )* );
	public final String type() throws RecognitionException {
		String name = null;

		int type_StartIndex = input.index();

		String t =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return name; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:733:5: (t= classOrInterfaceType ( LBRACKET RBRACKET )* |t= primitiveType ( LBRACKET RBRACKET )* )
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==Identifier) ) {
				alt71=1;
			}
			else if ( (LA71_0==BOOLEAN||LA71_0==BYTE||LA71_0==CHAR||LA71_0==DOUBLE||LA71_0==FLOAT||LA71_0==INT||LA71_0==LONG||LA71_0==SHORT) ) {
				alt71=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return name;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:733:9: t= classOrInterfaceType ( LBRACKET RBRACKET )*
					{
					pushFollow(FOLLOW_classOrInterfaceType_in_type3241);
					t=classOrInterfaceType();
					state._fsp--;
					if (state.failed) return name;
					if ( state.backtracking==0 ) { name = t; }
					// edu/ua/cs/taser/extract/java/JavaParser.g:735:9: ( LBRACKET RBRACKET )*
					loop69:
					while (true) {
						int alt69=2;
						int LA69_0 = input.LA(1);
						if ( (LA69_0==LBRACKET) ) {
							alt69=1;
						}

						switch (alt69) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:735:10: LBRACKET RBRACKET
							{
							match(input,LBRACKET,FOLLOW_LBRACKET_in_type3266); if (state.failed) return name;
							if ( state.backtracking==0 ) { name += "["; }
							match(input,RBRACKET,FOLLOW_RBRACKET_in_type3290); if (state.failed) return name;
							if ( state.backtracking==0 ) { name += "]"; }
							}
							break;

						default :
							break loop69;
						}
					}

					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:740:9: t= primitiveType ( LBRACKET RBRACKET )*
					{
					pushFollow(FOLLOW_primitiveType_in_type3327);
					t=primitiveType();
					state._fsp--;
					if (state.failed) return name;
					if ( state.backtracking==0 ) { name = t; }
					// edu/ua/cs/taser/extract/java/JavaParser.g:742:9: ( LBRACKET RBRACKET )*
					loop70:
					while (true) {
						int alt70=2;
						int LA70_0 = input.LA(1);
						if ( (LA70_0==LBRACKET) ) {
							alt70=1;
						}

						switch (alt70) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:742:10: LBRACKET RBRACKET
							{
							match(input,LBRACKET,FOLLOW_LBRACKET_in_type3352); if (state.failed) return name;
							if ( state.backtracking==0 ) { name += "["; }
							match(input,RBRACKET,FOLLOW_RBRACKET_in_type3376); if (state.failed) return name;
							if ( state.backtracking==0 ) { name += "]"; }
							}
							break;

						default :
							break loop70;
						}
					}

					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, type_StartIndex); }

		}
		return name;
	}
	// $ANTLR end "type"



	// $ANTLR start "classOrInterfaceType"
	// edu/ua/cs/taser/extract/java/JavaParser.g:749:1: classOrInterfaceType returns [String name] : i= Identifier ( typeArguments )? ( DOT j= Identifier ( typeArguments )? )* ;
	public final String classOrInterfaceType() throws RecognitionException {
		String name = null;

		int classOrInterfaceType_StartIndex = input.index();

		Token i=null;
		Token j=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return name; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:750:5: (i= Identifier ( typeArguments )? ( DOT j= Identifier ( typeArguments )? )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:750:9: i= Identifier ( typeArguments )? ( DOT j= Identifier ( typeArguments )? )*
			{
			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_classOrInterfaceType3426); if (state.failed) return name;
			if ( state.backtracking==0 ) {
			                if (RefTypeBody_stack.size() > 0) {
			                    // Nested in a reference type body
			                    Position iPos = positionOf(i);
			                    if (iPos.precedes(RefTypeBody_stack.peek().start)) {
			                        // No modifier
			                        RefTypeBody_stack.peek().start = iPos;
			                    }
			                }
			                addToken(makeToken(i, TokenType.CLASS_OR_INTERFACE_REF, Stacks.top(entityStack)));
			                name = i.getText();
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:763:9: ( typeArguments )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==LT) ) {
				int LA72_1 = input.LA(2);
				if ( (LA72_1==BOOLEAN||LA72_1==BYTE||LA72_1==CHAR||LA72_1==DOUBLE||LA72_1==FLOAT||LA72_1==INT||LA72_1==Identifier||LA72_1==LONG||LA72_1==QUESTIONMARK||LA72_1==SHORT) ) {
					alt72=1;
				}
			}
			switch (alt72) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:763:10: typeArguments
					{
					pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType3451);
					typeArguments();
					state._fsp--;
					if (state.failed) return name;
					if ( state.backtracking==0 ) {
					            String gs = createTypeArgumentsString();
					            name += gs;
					            }
					}
					break;

			}

			// edu/ua/cs/taser/extract/java/JavaParser.g:768:12: ( DOT j= Identifier ( typeArguments )? )*
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==DOT) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:768:13: DOT j= Identifier ( typeArguments )?
					{
					match(input,DOT,FOLLOW_DOT_in_classOrInterfaceType3479); if (state.failed) return name;
					j=(Token)match(input,Identifier,FOLLOW_Identifier_in_classOrInterfaceType3483); if (state.failed) return name;
					if ( state.backtracking==0 ) {
					            String text = j.getText();
					            addToken(makeToken(j, TokenType.CLASS_OR_INTERFACE_REF, Stacks.top(entityStack), text));
					            name += ("." + text);
					            }
					// edu/ua/cs/taser/extract/java/JavaParser.g:774:9: ( typeArguments )?
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==LT) ) {
						int LA73_1 = input.LA(2);
						if ( (LA73_1==BOOLEAN||LA73_1==BYTE||LA73_1==CHAR||LA73_1==DOUBLE||LA73_1==FLOAT||LA73_1==INT||LA73_1==Identifier||LA73_1==LONG||LA73_1==QUESTIONMARK||LA73_1==SHORT) ) {
							alt73=1;
						}
					}
					switch (alt73) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:774:10: typeArguments
							{
							pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType3508);
							typeArguments();
							state._fsp--;
							if (state.failed) return name;
							if ( state.backtracking==0 ) {
							            String gs = createTypeArgumentsString();
							            name += gs;
							            }
							}
							break;

					}

					}
					break;

				default :
					break loop74;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, classOrInterfaceType_StartIndex); }

		}
		return name;
	}
	// $ANTLR end "classOrInterfaceType"



	// $ANTLR start "primitiveType"
	// edu/ua/cs/taser/extract/java/JavaParser.g:782:1: primitiveType returns [String name] : (t= BOOLEAN |t= CHAR |t= BYTE |t= SHORT |t= INT |t= LONG |t= FLOAT |t= DOUBLE );
	public final String primitiveType() throws RecognitionException {
		String name = null;

		int primitiveType_StartIndex = input.index();

		Token t=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return name; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:792:5: (t= BOOLEAN |t= CHAR |t= BYTE |t= SHORT |t= INT |t= LONG |t= FLOAT |t= DOUBLE )
			int alt75=8;
			switch ( input.LA(1) ) {
			case BOOLEAN:
				{
				alt75=1;
				}
				break;
			case CHAR:
				{
				alt75=2;
				}
				break;
			case BYTE:
				{
				alt75=3;
				}
				break;
			case SHORT:
				{
				alt75=4;
				}
				break;
			case INT:
				{
				alt75=5;
				}
				break;
			case LONG:
				{
				alt75=6;
				}
				break;
			case FLOAT:
				{
				alt75=7;
				}
				break;
			case DOUBLE:
				{
				alt75=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return name;}
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}
			switch (alt75) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:792:9: t= BOOLEAN
					{
					t=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primitiveType3566); if (state.failed) return name;
					if ( state.backtracking==0 ) { name = "boolean"; }
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:794:9: t= CHAR
					{
					t=(Token)match(input,CHAR,FOLLOW_CHAR_in_primitiveType3588); if (state.failed) return name;
					if ( state.backtracking==0 ) { name = "char"; }
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:796:9: t= BYTE
					{
					t=(Token)match(input,BYTE,FOLLOW_BYTE_in_primitiveType3610); if (state.failed) return name;
					if ( state.backtracking==0 ) { name = "byte"; }
					}
					break;
				case 4 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:798:9: t= SHORT
					{
					t=(Token)match(input,SHORT,FOLLOW_SHORT_in_primitiveType3632); if (state.failed) return name;
					if ( state.backtracking==0 ) { name = "short"; }
					}
					break;
				case 5 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:800:9: t= INT
					{
					t=(Token)match(input,INT,FOLLOW_INT_in_primitiveType3654); if (state.failed) return name;
					if ( state.backtracking==0 ) { name = "int"; }
					}
					break;
				case 6 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:802:9: t= LONG
					{
					t=(Token)match(input,LONG,FOLLOW_LONG_in_primitiveType3676); if (state.failed) return name;
					if ( state.backtracking==0 ) { name = "long"; }
					}
					break;
				case 7 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:804:9: t= FLOAT
					{
					t=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType3698); if (state.failed) return name;
					if ( state.backtracking==0 ) { name = "float"; }
					}
					break;
				case 8 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:806:9: t= DOUBLE
					{
					t=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType3720); if (state.failed) return name;
					if ( state.backtracking==0 ) { name = "double"; }
					}
					break;

			}
			if ( state.backtracking==0 ) {
			    if (RefTypeBody_stack.size() > 0) {
			        Position typePos = positionOf(t);
			        if (typePos.precedes(RefTypeBody_stack.peek().start)) {
			            // No modifier
			            RefTypeBody_stack.peek().start = typePos;
			        }
			    }
			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 52, primitiveType_StartIndex); }

		}
		return name;
	}
	// $ANTLR end "primitiveType"



	// $ANTLR start "variableModifier"
	// edu/ua/cs/taser/extract/java/JavaParser.g:810:1: variableModifier : ( FINAL | annotation );
	public final void variableModifier() throws RecognitionException {
		int variableModifier_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:811:5: ( FINAL | annotation )
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==FINAL) ) {
				alt76=1;
			}
			else if ( (LA76_0==AT) ) {
				alt76=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}

			switch (alt76) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:811:9: FINAL
					{
					match(input,FINAL,FOLLOW_FINAL_in_variableModifier3749); if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:812:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_variableModifier3759);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 53, variableModifier_StartIndex); }

		}
	}
	// $ANTLR end "variableModifier"



	// $ANTLR start "typeArguments"
	// edu/ua/cs/taser/extract/java/JavaParser.g:815:1: typeArguments : LT typeArgument ( COMMA typeArgument )* GT ;
	public final void typeArguments() throws RecognitionException {
		int typeArguments_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:816:5: ( LT typeArgument ( COMMA typeArgument )* GT )
			// edu/ua/cs/taser/extract/java/JavaParser.g:816:9: LT typeArgument ( COMMA typeArgument )* GT
			{
			match(input,LT,FOLLOW_LT_in_typeArguments3778); if (state.failed) return;
			pushFollow(FOLLOW_typeArgument_in_typeArguments3780);
			typeArgument();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:816:25: ( COMMA typeArgument )*
			loop77:
			while (true) {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==COMMA) ) {
					alt77=1;
				}

				switch (alt77) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:816:26: COMMA typeArgument
					{
					match(input,COMMA,FOLLOW_COMMA_in_typeArguments3783); if (state.failed) return;
					pushFollow(FOLLOW_typeArgument_in_typeArguments3785);
					typeArgument();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop77;
				}
			}

			match(input,GT,FOLLOW_GT_in_typeArguments3789); if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 54, typeArguments_StartIndex); }

		}
	}
	// $ANTLR end "typeArguments"



	// $ANTLR start "typeArgument"
	// edu/ua/cs/taser/extract/java/JavaParser.g:819:1: typeArgument : (t= type | QUESTIONMARK ( ( EXTENDS | SUPER ) type )? );
	public final void typeArgument() throws RecognitionException {
		int typeArgument_StartIndex = input.index();

		String t =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:820:5: (t= type | QUESTIONMARK ( ( EXTENDS | SUPER ) type )? )
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==BOOLEAN||LA79_0==BYTE||LA79_0==CHAR||LA79_0==DOUBLE||LA79_0==FLOAT||LA79_0==INT||LA79_0==Identifier||LA79_0==LONG||LA79_0==SHORT) ) {
				alt79=1;
			}
			else if ( (LA79_0==QUESTIONMARK) ) {
				alt79=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:820:9: t= type
					{
					pushFollow(FOLLOW_type_in_typeArgument3810);
					t=type();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					            typeArguments.add(t);
					            }
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:824:9: QUESTIONMARK ( ( EXTENDS | SUPER ) type )?
					{
					match(input,QUESTIONMARK,FOLLOW_QUESTIONMARK_in_typeArgument3834); if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:824:22: ( ( EXTENDS | SUPER ) type )?
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==EXTENDS||LA78_0==SUPER) ) {
						alt78=1;
					}
					switch (alt78) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:824:23: ( EXTENDS | SUPER ) type
							{
							if ( input.LA(1)==EXTENDS||input.LA(1)==SUPER ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							pushFollow(FOLLOW_type_in_typeArgument3845);
							type();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 55, typeArgument_StartIndex); }

		}
	}
	// $ANTLR end "typeArgument"



	// $ANTLR start "qualifiedNameList"
	// edu/ua/cs/taser/extract/java/JavaParser.g:827:1: qualifiedNameList : qualifiedName ( COMMA qualifiedName )* ;
	public final void qualifiedNameList() throws RecognitionException {
		int qualifiedNameList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:828:5: ( qualifiedName ( COMMA qualifiedName )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:828:9: qualifiedName ( COMMA qualifiedName )*
			{
			pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList3866);
			qualifiedName();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:828:23: ( COMMA qualifiedName )*
			loop80:
			while (true) {
				int alt80=2;
				int LA80_0 = input.LA(1);
				if ( (LA80_0==COMMA) ) {
					alt80=1;
				}

				switch (alt80) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:828:24: COMMA qualifiedName
					{
					match(input,COMMA,FOLLOW_COMMA_in_qualifiedNameList3869); if (state.failed) return;
					pushFollow(FOLLOW_qualifiedName_in_qualifiedNameList3871);
					qualifiedName();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop80;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 56, qualifiedNameList_StartIndex); }

		}
	}
	// $ANTLR end "qualifiedNameList"



	// $ANTLR start "formalParameters"
	// edu/ua/cs/taser/extract/java/JavaParser.g:831:1: formalParameters : o= LPAREN ( formalParameterDecls )? c= RPAREN ;
	public final void formalParameters() throws RecognitionException {
		int formalParameters_StartIndex = input.index();

		Token o=null;
		Token c=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:832:5: (o= LPAREN ( formalParameterDecls )? c= RPAREN )
			// edu/ua/cs/taser/extract/java/JavaParser.g:832:9: o= LPAREN ( formalParameterDecls )? c= RPAREN
			{
			o=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_formalParameters3894); if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:832:18: ( formalParameterDecls )?
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==AT||LA81_0==BOOLEAN||LA81_0==BYTE||LA81_0==CHAR||LA81_0==DOUBLE||LA81_0==FINAL||LA81_0==FLOAT||LA81_0==INT||LA81_0==Identifier||LA81_0==LONG||LA81_0==SHORT) ) {
				alt81=1;
			}
			switch (alt81) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:832:18: formalParameterDecls
					{
					pushFollow(FOLLOW_formalParameterDecls_in_formalParameters3896);
					formalParameterDecls();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			c=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_formalParameters3901); if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 57, formalParameters_StartIndex); }

		}
	}
	// $ANTLR end "formalParameters"



	// $ANTLR start "formalParameterDecls"
	// edu/ua/cs/taser/extract/java/JavaParser.g:835:1: formalParameterDecls : variableModifiers t= type formalParameterDeclsRest ;
	public final void formalParameterDecls() throws RecognitionException {
		int formalParameterDecls_StartIndex = input.index();

		String t =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:836:5: ( variableModifiers t= type formalParameterDeclsRest )
			// edu/ua/cs/taser/extract/java/JavaParser.g:836:9: variableModifiers t= type formalParameterDeclsRest
			{
			pushFollow(FOLLOW_variableModifiers_in_formalParameterDecls3920);
			variableModifiers();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			            isCollectingTypeParts = true;
			            }
			pushFollow(FOLLOW_type_in_formalParameterDecls3946);
			t=type();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			            Stacks.push(formalsStack, t);
			            isCollectingTypeParts = false;
			            for (JavaToken token : typeParts) {
			                token.setType(TokenType.PARAMETER_TYPE);
			            }
			            typeParts.clear();
			            }
			pushFollow(FOLLOW_formalParameterDeclsRest_in_formalParameterDecls3970);
			formalParameterDeclsRest();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 58, formalParameterDecls_StartIndex); }

		}
	}
	// $ANTLR end "formalParameterDecls"



	// $ANTLR start "formalParameterDeclsRest"
	// edu/ua/cs/taser/extract/java/JavaParser.g:852:1: formalParameterDeclsRest : ( variableDeclaratorId ( COMMA formalParameterDecls )? | ELLIPSIS variableDeclaratorId );
	public final void formalParameterDeclsRest() throws RecognitionException {
		int formalParameterDeclsRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:853:5: ( variableDeclaratorId ( COMMA formalParameterDecls )? | ELLIPSIS variableDeclaratorId )
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==Identifier) ) {
				alt83=1;
			}
			else if ( (LA83_0==ELLIPSIS) ) {
				alt83=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}

			switch (alt83) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:853:9: variableDeclaratorId ( COMMA formalParameterDecls )?
					{
					pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest3989);
					variableDeclaratorId();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					            if (lastVariableDeclaratorId != null) {
					                lastVariableDeclaratorId.setType(TokenType.PARAMETER_NAME);
					                lastVariableDeclaratorId = null;
					            }
					            }
					// edu/ua/cs/taser/extract/java/JavaParser.g:860:9: ( COMMA formalParameterDecls )?
					int alt82=2;
					int LA82_0 = input.LA(1);
					if ( (LA82_0==COMMA) ) {
						alt82=1;
					}
					switch (alt82) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:860:10: COMMA formalParameterDecls
							{
							match(input,COMMA,FOLLOW_COMMA_in_formalParameterDeclsRest4014); if (state.failed) return;
							pushFollow(FOLLOW_formalParameterDecls_in_formalParameterDeclsRest4016);
							formalParameterDecls();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:861:9: ELLIPSIS variableDeclaratorId
					{
					match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_formalParameterDeclsRest4028); if (state.failed) return;
					pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest4030);
					variableDeclaratorId();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					            if (lastVariableDeclaratorId != null) {
					                lastVariableDeclaratorId.setType(TokenType.PARAMETER_NAME);
					                lastVariableDeclaratorId = null;
					            }
					            }
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 59, formalParameterDeclsRest_StartIndex); }

		}
	}
	// $ANTLR end "formalParameterDeclsRest"



	// $ANTLR start "methodBody"
	// edu/ua/cs/taser/extract/java/JavaParser.g:870:1: methodBody : block ;
	public final void methodBody() throws RecognitionException {
		int methodBody_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:871:5: ( block )
			// edu/ua/cs/taser/extract/java/JavaParser.g:871:9: block
			{
			pushFollow(FOLLOW_block_in_methodBody4063);
			block();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 60, methodBody_StartIndex); }

		}
	}
	// $ANTLR end "methodBody"



	// $ANTLR start "constructorBody"
	// edu/ua/cs/taser/extract/java/JavaParser.g:874:1: constructorBody : o= LBRACE ( explicitConstructorInvocation )? ( blockStatement )* c= RBRACE ;
	public final void constructorBody() throws RecognitionException {
		int constructorBody_StartIndex = input.index();

		Token o=null;
		Token c=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:875:5: (o= LBRACE ( explicitConstructorInvocation )? ( blockStatement )* c= RBRACE )
			// edu/ua/cs/taser/extract/java/JavaParser.g:875:9: o= LBRACE ( explicitConstructorInvocation )? ( blockStatement )* c= RBRACE
			{
			o=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_constructorBody4084); if (state.failed) return;
			if ( state.backtracking==0 ) {
			                JavaEntity top = Stacks.top(entityStack);
			                Position topPos = top.getPosition();
			                top.setPosition(topPos.withStart(
			                    findFirstPosition(
			                        RefTypeBody_stack.peek().start,
			                        (topPos.isDefined() ? topPos.getStart() : topPos),
			                        positionOf(o)
			                    )
			                ));
			                RefTypeBody_stack.peek().start = Positions.tailPosition();
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:888:9: ( explicitConstructorInvocation )?
			int alt84=2;
			switch ( input.LA(1) ) {
				case LT:
					{
					alt84=1;
					}
					break;
				case THIS:
					{
					int LA84_2 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case LPAREN:
					{
					int LA84_3 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case SUPER:
					{
					int LA84_4 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case DecimalLiteral:
				case HexLiteral:
				case OctalLiteral:
					{
					int LA84_5 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case FloatingPointLiteral:
					{
					int LA84_6 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case CharacterLiteral:
					{
					int LA84_7 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case StringLiteral:
					{
					int LA84_8 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case FALSE:
				case TRUE:
					{
					int LA84_9 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case NULL:
					{
					int LA84_10 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case NEW:
					{
					int LA84_11 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case Identifier:
					{
					int LA84_12 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case BOOLEAN:
					{
					int LA84_13 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case CHAR:
					{
					int LA84_14 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case BYTE:
					{
					int LA84_15 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case SHORT:
					{
					int LA84_16 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case INT:
					{
					int LA84_17 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case LONG:
					{
					int LA84_18 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case FLOAT:
					{
					int LA84_19 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case DOUBLE:
					{
					int LA84_20 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
				case VOID:
					{
					int LA84_21 = input.LA(2);
					if ( (synpred115_JavaParser()) ) {
						alt84=1;
					}
					}
					break;
			}
			switch (alt84) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:888:9: explicitConstructorInvocation
					{
					pushFollow(FOLLOW_explicitConstructorInvocation_in_constructorBody4108);
					explicitConstructorInvocation();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// edu/ua/cs/taser/extract/java/JavaParser.g:888:40: ( blockStatement )*
			loop85:
			while (true) {
				int alt85=2;
				int LA85_0 = input.LA(1);
				if ( ((LA85_0 >= ABSTRACT && LA85_0 <= ADD)||(LA85_0 >= ASSERT && LA85_0 <= AT)||LA85_0==BITNOT||(LA85_0 >= BOOLEAN && LA85_0 <= BYTE)||(LA85_0 >= CHAR && LA85_0 <= CLASS)||(LA85_0 >= CONTINUE && LA85_0 <= DEC)||LA85_0==DO||(LA85_0 >= DOUBLE && LA85_0 <= DecimalLiteral)||LA85_0==ENUM||(LA85_0 >= FALSE && LA85_0 <= FINAL)||(LA85_0 >= FLOAT && LA85_0 <= FOR)||LA85_0==FloatingPointLiteral||(LA85_0 >= HexLiteral && LA85_0 <= IF)||LA85_0==INC||(LA85_0 >= INT && LA85_0 <= Identifier)||LA85_0==LBRACE||(LA85_0 >= LONG && LA85_0 <= LPAREN)||(LA85_0 >= NEW && LA85_0 <= NULL)||LA85_0==OctalLiteral||(LA85_0 >= PRIVATE && LA85_0 <= PUBLIC)||LA85_0==RETURN||(LA85_0 >= SEMICOLON && LA85_0 <= THROW)||(LA85_0 >= TRUE && LA85_0 <= TRY)||LA85_0==VOID||LA85_0==WHILE) ) {
					alt85=1;
				}

				switch (alt85) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:888:40: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_constructorBody4111);
					blockStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop85;
				}
			}

			c=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_constructorBody4116); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            JavaEntity top = Stacks.top(entityStack);
			            top.setPosition(top.getPosition().withEnd(positionOf(c)));
			            }
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 61, constructorBody_StartIndex); }

		}
	}
	// $ANTLR end "constructorBody"



	// $ANTLR start "explicitConstructorInvocation"
	// edu/ua/cs/taser/extract/java/JavaParser.g:895:1: explicitConstructorInvocation : ( ( nonWildcardTypeArguments )? ( THIS | SUPER ) arguments SEMICOLON | primary DOT ( nonWildcardTypeArguments )? SUPER arguments SEMICOLON );
	public final void explicitConstructorInvocation() throws RecognitionException {
		int explicitConstructorInvocation_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:896:5: ( ( nonWildcardTypeArguments )? ( THIS | SUPER ) arguments SEMICOLON | primary DOT ( nonWildcardTypeArguments )? SUPER arguments SEMICOLON )
			int alt88=2;
			switch ( input.LA(1) ) {
			case LT:
				{
				alt88=1;
				}
				break;
			case THIS:
				{
				int LA88_2 = input.LA(2);
				if ( (synpred119_JavaParser()) ) {
					alt88=1;
				}
				else if ( (true) ) {
					alt88=2;
				}

				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CharacterLiteral:
			case DOUBLE:
			case DecimalLiteral:
			case FALSE:
			case FLOAT:
			case FloatingPointLiteral:
			case HexLiteral:
			case INT:
			case Identifier:
			case LONG:
			case LPAREN:
			case NEW:
			case NULL:
			case OctalLiteral:
			case SHORT:
			case StringLiteral:
			case TRUE:
			case VOID:
				{
				alt88=2;
				}
				break;
			case SUPER:
				{
				int LA88_4 = input.LA(2);
				if ( (synpred119_JavaParser()) ) {
					alt88=1;
				}
				else if ( (true) ) {
					alt88=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}
			switch (alt88) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:896:9: ( nonWildcardTypeArguments )? ( THIS | SUPER ) arguments SEMICOLON
					{
					// edu/ua/cs/taser/extract/java/JavaParser.g:896:9: ( nonWildcardTypeArguments )?
					int alt86=2;
					int LA86_0 = input.LA(1);
					if ( (LA86_0==LT) ) {
						alt86=1;
					}
					switch (alt86) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:896:9: nonWildcardTypeArguments
							{
							pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation4149);
							nonWildcardTypeArguments();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					if ( input.LA(1)==SUPER||input.LA(1)==THIS ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation4160);
					arguments();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_explicitConstructorInvocation4162); if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:897:9: primary DOT ( nonWildcardTypeArguments )? SUPER arguments SEMICOLON
					{
					pushFollow(FOLLOW_primary_in_explicitConstructorInvocation4172);
					primary();
					state._fsp--;
					if (state.failed) return;
					match(input,DOT,FOLLOW_DOT_in_explicitConstructorInvocation4174); if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:897:21: ( nonWildcardTypeArguments )?
					int alt87=2;
					int LA87_0 = input.LA(1);
					if ( (LA87_0==LT) ) {
						alt87=1;
					}
					switch (alt87) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:897:21: nonWildcardTypeArguments
							{
							pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation4176);
							nonWildcardTypeArguments();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,SUPER,FOLLOW_SUPER_in_explicitConstructorInvocation4179); if (state.failed) return;
					pushFollow(FOLLOW_arguments_in_explicitConstructorInvocation4181);
					arguments();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_explicitConstructorInvocation4183); if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 62, explicitConstructorInvocation_StartIndex); }

		}
	}
	// $ANTLR end "explicitConstructorInvocation"



	// $ANTLR start "qualifiedName"
	// edu/ua/cs/taser/extract/java/JavaParser.g:901:1: qualifiedName : i= Identifier ( DOT j= Identifier )* ;
	public final void qualifiedName() throws RecognitionException {
		int qualifiedName_StartIndex = input.index();

		Token i=null;
		Token j=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:902:5: (i= Identifier ( DOT j= Identifier )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:902:9: i= Identifier ( DOT j= Identifier )*
			{
			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName4205); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            addToken(makeToken(i, TokenType.THROWS, Stacks.top(entityStack)));
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:906:9: ( DOT j= Identifier )*
			loop89:
			while (true) {
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( (LA89_0==DOT) ) {
					alt89=1;
				}

				switch (alt89) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:906:10: DOT j= Identifier
					{
					match(input,DOT,FOLLOW_DOT_in_qualifiedName4230); if (state.failed) return;
					j=(Token)match(input,Identifier,FOLLOW_Identifier_in_qualifiedName4234); if (state.failed) return;
					if ( state.backtracking==0 ) {
					            addToken(makeToken(j, TokenType.THROWS, Stacks.top(entityStack)));
					            }
					}
					break;

				default :
					break loop89;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 63, qualifiedName_StartIndex); }

		}
	}
	// $ANTLR end "qualifiedName"



	// $ANTLR start "literal"
	// edu/ua/cs/taser/extract/java/JavaParser.g:913:1: literal : ( integerLiteral | FloatingPointLiteral | CharacterLiteral |s= StringLiteral | booleanLiteral | NULL );
	public final void literal() throws RecognitionException {
		int literal_StartIndex = input.index();

		Token s=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:914:5: ( integerLiteral | FloatingPointLiteral | CharacterLiteral |s= StringLiteral | booleanLiteral | NULL )
			int alt90=6;
			switch ( input.LA(1) ) {
			case DecimalLiteral:
			case HexLiteral:
			case OctalLiteral:
				{
				alt90=1;
				}
				break;
			case FloatingPointLiteral:
				{
				alt90=2;
				}
				break;
			case CharacterLiteral:
				{
				alt90=3;
				}
				break;
			case StringLiteral:
				{
				alt90=4;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt90=5;
				}
				break;
			case NULL:
				{
				alt90=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				throw nvae;
			}
			switch (alt90) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:914:9: integerLiteral
					{
					pushFollow(FOLLOW_integerLiteral_in_literal4279);
					integerLiteral();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:915:9: FloatingPointLiteral
					{
					match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal4289); if (state.failed) return;
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:916:9: CharacterLiteral
					{
					match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal4299); if (state.failed) return;
					}
					break;
				case 4 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:917:9: s= StringLiteral
					{
					s=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal4311); if (state.failed) return;
					if ( state.backtracking==0 ) {
					            addToken(makeToken(s, TokenType.STRING_LITERAL, Stacks.top(entityStack)));
					            }
					}
					break;
				case 5 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:921:9: booleanLiteral
					{
					pushFollow(FOLLOW_booleanLiteral_in_literal4335);
					booleanLiteral();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:922:9: NULL
					{
					match(input,NULL,FOLLOW_NULL_in_literal4345); if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 64, literal_StartIndex); }

		}
	}
	// $ANTLR end "literal"



	// $ANTLR start "integerLiteral"
	// edu/ua/cs/taser/extract/java/JavaParser.g:925:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
	public final void integerLiteral() throws RecognitionException {
		int integerLiteral_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:926:5: ( HexLiteral | OctalLiteral | DecimalLiteral )
			// edu/ua/cs/taser/extract/java/JavaParser.g:
			{
			if ( input.LA(1)==DecimalLiteral||input.LA(1)==HexLiteral||input.LA(1)==OctalLiteral ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 65, integerLiteral_StartIndex); }

		}
	}
	// $ANTLR end "integerLiteral"



	// $ANTLR start "booleanLiteral"
	// edu/ua/cs/taser/extract/java/JavaParser.g:931:1: booleanLiteral : ( TRUE | FALSE );
	public final void booleanLiteral() throws RecognitionException {
		int booleanLiteral_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:932:5: ( TRUE | FALSE )
			// edu/ua/cs/taser/extract/java/JavaParser.g:
			{
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 66, booleanLiteral_StartIndex); }

		}
	}
	// $ANTLR end "booleanLiteral"



	// $ANTLR start "annotations"
	// edu/ua/cs/taser/extract/java/JavaParser.g:938:1: annotations : ( annotation )+ ;
	public final void annotations() throws RecognitionException {
		int annotations_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:939:5: ( ( annotation )+ )
			// edu/ua/cs/taser/extract/java/JavaParser.g:939:9: ( annotation )+
			{
			// edu/ua/cs/taser/extract/java/JavaParser.g:939:9: ( annotation )+
			int cnt91=0;
			loop91:
			while (true) {
				int alt91=2;
				int LA91_0 = input.LA(1);
				if ( (LA91_0==AT) ) {
					int LA91_2 = input.LA(2);
					if ( (LA91_2==Identifier) ) {
						int LA91_3 = input.LA(3);
						if ( (synpred130_JavaParser()) ) {
							alt91=1;
						}

					}

				}

				switch (alt91) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:939:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_annotations4434);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt91 >= 1 ) break loop91;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(91, input);
					throw eee;
				}
				cnt91++;
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 67, annotations_StartIndex); }

		}
	}
	// $ANTLR end "annotations"



	// $ANTLR start "annotation"
	// edu/ua/cs/taser/extract/java/JavaParser.g:942:1: annotation : AT annotationName ( LPAREN ( elementValuePairs | elementValue )? RPAREN )? ;
	public final void annotation() throws RecognitionException {
		int annotation_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:943:5: ( AT annotationName ( LPAREN ( elementValuePairs | elementValue )? RPAREN )? )
			// edu/ua/cs/taser/extract/java/JavaParser.g:943:9: AT annotationName ( LPAREN ( elementValuePairs | elementValue )? RPAREN )?
			{
			match(input,AT,FOLLOW_AT_in_annotation4454); if (state.failed) return;
			pushFollow(FOLLOW_annotationName_in_annotation4456);
			annotationName();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:943:27: ( LPAREN ( elementValuePairs | elementValue )? RPAREN )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==LPAREN) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:943:29: LPAREN ( elementValuePairs | elementValue )? RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_annotation4460); if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:943:36: ( elementValuePairs | elementValue )?
					int alt92=3;
					int LA92_0 = input.LA(1);
					if ( (LA92_0==Identifier) ) {
						int LA92_1 = input.LA(2);
						if ( (LA92_1==ASG) ) {
							alt92=1;
						}
						else if ( ((LA92_1 >= ADD && LA92_1 <= AND)||LA92_1==BITAND||(LA92_1 >= BITOR && LA92_1 <= BITXOR)||LA92_1==DEC||LA92_1==DIV||LA92_1==DOT||LA92_1==EQ||LA92_1==GT||(LA92_1 >= INC && LA92_1 <= INSTANCEOF)||LA92_1==LBRACKET||(LA92_1 >= LPAREN && LA92_1 <= LT)||LA92_1==MUL||LA92_1==NE||LA92_1==OR||LA92_1==QUESTIONMARK||LA92_1==REM||LA92_1==RPAREN||LA92_1==SUB) ) {
							alt92=2;
						}
					}
					else if ( (LA92_0==ADD||LA92_0==AT||LA92_0==BITNOT||LA92_0==BOOLEAN||LA92_0==BYTE||LA92_0==CHAR||(LA92_0 >= CharacterLiteral && LA92_0 <= DEC)||(LA92_0 >= DOUBLE && LA92_0 <= DecimalLiteral)||LA92_0==FALSE||LA92_0==FLOAT||LA92_0==FloatingPointLiteral||LA92_0==HexLiteral||LA92_0==INC||LA92_0==INT||LA92_0==LBRACE||(LA92_0 >= LONG && LA92_0 <= LPAREN)||(LA92_0 >= NEW && LA92_0 <= NULL)||LA92_0==OctalLiteral||LA92_0==SHORT||(LA92_0 >= SUB && LA92_0 <= SUPER)||(LA92_0 >= StringLiteral && LA92_0 <= THIS)||LA92_0==TRUE||LA92_0==VOID) ) {
						alt92=2;
					}
					switch (alt92) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:943:38: elementValuePairs
							{
							pushFollow(FOLLOW_elementValuePairs_in_annotation4464);
							elementValuePairs();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:943:58: elementValue
							{
							pushFollow(FOLLOW_elementValue_in_annotation4468);
							elementValue();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_annotation4473); if (state.failed) return;
					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 68, annotation_StartIndex); }

		}
	}
	// $ANTLR end "annotation"



	// $ANTLR start "annotationName"
	// edu/ua/cs/taser/extract/java/JavaParser.g:946:1: annotationName : i= Identifier ( DOT j= Identifier )* ;
	public final void annotationName() throws RecognitionException {
		int annotationName_StartIndex = input.index();

		Token i=null;
		Token j=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:947:5: (i= Identifier ( DOT j= Identifier )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:947:9: i= Identifier ( DOT j= Identifier )*
			{
			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_annotationName4497); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            addToken(makeToken(i, TokenType.ANNOTATION_REF, Stacks.top(entityStack)));
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:951:9: ( DOT j= Identifier )*
			loop94:
			while (true) {
				int alt94=2;
				int LA94_0 = input.LA(1);
				if ( (LA94_0==DOT) ) {
					alt94=1;
				}

				switch (alt94) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:951:10: DOT j= Identifier
					{
					match(input,DOT,FOLLOW_DOT_in_annotationName4522); if (state.failed) return;
					j=(Token)match(input,Identifier,FOLLOW_Identifier_in_annotationName4526); if (state.failed) return;
					if ( state.backtracking==0 ) {
					            addToken(makeToken(j, TokenType.ANNOTATION_REF, Stacks.top(entityStack)));
					            }
					}
					break;

				default :
					break loop94;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 69, annotationName_StartIndex); }

		}
	}
	// $ANTLR end "annotationName"



	// $ANTLR start "elementValuePairs"
	// edu/ua/cs/taser/extract/java/JavaParser.g:958:1: elementValuePairs : elementValuePair ( COMMA elementValuePair )* ;
	public final void elementValuePairs() throws RecognitionException {
		int elementValuePairs_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:959:5: ( elementValuePair ( COMMA elementValuePair )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:959:9: elementValuePair ( COMMA elementValuePair )*
			{
			pushFollow(FOLLOW_elementValuePair_in_elementValuePairs4570);
			elementValuePair();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:959:26: ( COMMA elementValuePair )*
			loop95:
			while (true) {
				int alt95=2;
				int LA95_0 = input.LA(1);
				if ( (LA95_0==COMMA) ) {
					alt95=1;
				}

				switch (alt95) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:959:27: COMMA elementValuePair
					{
					match(input,COMMA,FOLLOW_COMMA_in_elementValuePairs4573); if (state.failed) return;
					pushFollow(FOLLOW_elementValuePair_in_elementValuePairs4575);
					elementValuePair();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop95;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 70, elementValuePairs_StartIndex); }

		}
	}
	// $ANTLR end "elementValuePairs"



	// $ANTLR start "elementValuePair"
	// edu/ua/cs/taser/extract/java/JavaParser.g:962:1: elementValuePair : i= Identifier ASG elementValue ;
	public final void elementValuePair() throws RecognitionException {
		int elementValuePair_StartIndex = input.index();

		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:963:5: (i= Identifier ASG elementValue )
			// edu/ua/cs/taser/extract/java/JavaParser.g:963:9: i= Identifier ASG elementValue
			{
			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_elementValuePair4598); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            addToken(makeToken(i, TokenType.ANNOTATION_ELEMENT_REF, Stacks.top(entityStack)));
			            }
			match(input,ASG,FOLLOW_ASG_in_elementValuePair4622); if (state.failed) return;
			pushFollow(FOLLOW_elementValue_in_elementValuePair4624);
			elementValue();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 71, elementValuePair_StartIndex); }

		}
	}
	// $ANTLR end "elementValuePair"



	// $ANTLR start "elementValue"
	// edu/ua/cs/taser/extract/java/JavaParser.g:970:1: elementValue : ( conditionalExpression | annotation | elementValueArrayInitializer );
	public final void elementValue() throws RecognitionException {
		int elementValue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:971:5: ( conditionalExpression | annotation | elementValueArrayInitializer )
			int alt96=3;
			switch ( input.LA(1) ) {
			case ADD:
			case BITNOT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CharacterLiteral:
			case DEC:
			case DOUBLE:
			case DecimalLiteral:
			case FALSE:
			case FLOAT:
			case FloatingPointLiteral:
			case HexLiteral:
			case INC:
			case INT:
			case Identifier:
			case LONG:
			case LPAREN:
			case NEW:
			case NOT:
			case NULL:
			case OctalLiteral:
			case SHORT:
			case SUB:
			case SUPER:
			case StringLiteral:
			case THIS:
			case TRUE:
			case VOID:
				{
				alt96=1;
				}
				break;
			case AT:
				{
				alt96=2;
				}
				break;
			case LBRACE:
				{
				alt96=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				throw nvae;
			}
			switch (alt96) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:971:9: conditionalExpression
					{
					pushFollow(FOLLOW_conditionalExpression_in_elementValue4643);
					conditionalExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:972:9: annotation
					{
					pushFollow(FOLLOW_annotation_in_elementValue4653);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:973:9: elementValueArrayInitializer
					{
					pushFollow(FOLLOW_elementValueArrayInitializer_in_elementValue4663);
					elementValueArrayInitializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 72, elementValue_StartIndex); }

		}
	}
	// $ANTLR end "elementValue"



	// $ANTLR start "elementValueArrayInitializer"
	// edu/ua/cs/taser/extract/java/JavaParser.g:976:1: elementValueArrayInitializer : o= LBRACE ( elementValue ( COMMA elementValue )* )? ( COMMA )? c= RBRACE ;
	public final void elementValueArrayInitializer() throws RecognitionException {
		int elementValueArrayInitializer_StartIndex = input.index();

		Token o=null;
		Token c=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:977:5: (o= LBRACE ( elementValue ( COMMA elementValue )* )? ( COMMA )? c= RBRACE )
			// edu/ua/cs/taser/extract/java/JavaParser.g:977:9: o= LBRACE ( elementValue ( COMMA elementValue )* )? ( COMMA )? c= RBRACE
			{
			o=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_elementValueArrayInitializer4684); if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:977:18: ( elementValue ( COMMA elementValue )* )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==ADD||LA98_0==AT||LA98_0==BITNOT||LA98_0==BOOLEAN||LA98_0==BYTE||LA98_0==CHAR||(LA98_0 >= CharacterLiteral && LA98_0 <= DEC)||(LA98_0 >= DOUBLE && LA98_0 <= DecimalLiteral)||LA98_0==FALSE||LA98_0==FLOAT||LA98_0==FloatingPointLiteral||LA98_0==HexLiteral||LA98_0==INC||LA98_0==INT||LA98_0==Identifier||LA98_0==LBRACE||(LA98_0 >= LONG && LA98_0 <= LPAREN)||(LA98_0 >= NEW && LA98_0 <= NULL)||LA98_0==OctalLiteral||LA98_0==SHORT||(LA98_0 >= SUB && LA98_0 <= SUPER)||(LA98_0 >= StringLiteral && LA98_0 <= THIS)||LA98_0==TRUE||LA98_0==VOID) ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:977:19: elementValue ( COMMA elementValue )*
					{
					pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer4687);
					elementValue();
					state._fsp--;
					if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:977:32: ( COMMA elementValue )*
					loop97:
					while (true) {
						int alt97=2;
						int LA97_0 = input.LA(1);
						if ( (LA97_0==COMMA) ) {
							int LA97_1 = input.LA(2);
							if ( (LA97_1==ADD||LA97_1==AT||LA97_1==BITNOT||LA97_1==BOOLEAN||LA97_1==BYTE||LA97_1==CHAR||(LA97_1 >= CharacterLiteral && LA97_1 <= DEC)||(LA97_1 >= DOUBLE && LA97_1 <= DecimalLiteral)||LA97_1==FALSE||LA97_1==FLOAT||LA97_1==FloatingPointLiteral||LA97_1==HexLiteral||LA97_1==INC||LA97_1==INT||LA97_1==Identifier||LA97_1==LBRACE||(LA97_1 >= LONG && LA97_1 <= LPAREN)||(LA97_1 >= NEW && LA97_1 <= NULL)||LA97_1==OctalLiteral||LA97_1==SHORT||(LA97_1 >= SUB && LA97_1 <= SUPER)||(LA97_1 >= StringLiteral && LA97_1 <= THIS)||LA97_1==TRUE||LA97_1==VOID) ) {
								alt97=1;
							}

						}

						switch (alt97) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:977:33: COMMA elementValue
							{
							match(input,COMMA,FOLLOW_COMMA_in_elementValueArrayInitializer4690); if (state.failed) return;
							pushFollow(FOLLOW_elementValue_in_elementValueArrayInitializer4692);
							elementValue();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop97;
						}
					}

					}
					break;

			}

			// edu/ua/cs/taser/extract/java/JavaParser.g:977:56: ( COMMA )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==COMMA) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:977:57: COMMA
					{
					match(input,COMMA,FOLLOW_COMMA_in_elementValueArrayInitializer4699); if (state.failed) return;
					}
					break;

			}

			c=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_elementValueArrayInitializer4705); if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 73, elementValueArrayInitializer_StartIndex); }

		}
	}
	// $ANTLR end "elementValueArrayInitializer"



	// $ANTLR start "annotationTypeDeclaration"
	// edu/ua/cs/taser/extract/java/JavaParser.g:980:1: annotationTypeDeclaration : AT INTERFACE i= Identifier annotationTypeBody ;
	public final void annotationTypeDeclaration() throws RecognitionException {
		int annotationTypeDeclaration_StartIndex = input.index();

		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:981:5: ( AT INTERFACE i= Identifier annotationTypeBody )
			// edu/ua/cs/taser/extract/java/JavaParser.g:981:9: AT INTERFACE i= Identifier annotationTypeBody
			{
			match(input,AT,FOLLOW_AT_in_annotationTypeDeclaration4724); if (state.failed) return;
			match(input,INTERFACE,FOLLOW_INTERFACE_in_annotationTypeDeclaration4726); if (state.failed) return;
			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_annotationTypeDeclaration4730); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            String text = i.getText();
			            Stacks.push(qualifiedNameStack, text);
			            JavaEntity top = Stacks.top(entityStack);
			            top.setName(createQualifiedName());
			            addToken(makeToken(i, TokenType.ANNOTATION_NAME, top, text));
			            }
			pushFollow(FOLLOW_annotationTypeBody_in_annotationTypeDeclaration4754);
			annotationTypeBody();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 74, annotationTypeDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "annotationTypeDeclaration"



	// $ANTLR start "annotationTypeBody"
	// edu/ua/cs/taser/extract/java/JavaParser.g:992:1: annotationTypeBody : o= LBRACE ( annotationTypeElementDeclaration )* c= RBRACE ;
	public final void annotationTypeBody() throws RecognitionException {
		int annotationTypeBody_StartIndex = input.index();

		Token o=null;
		Token c=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:993:5: (o= LBRACE ( annotationTypeElementDeclaration )* c= RBRACE )
			// edu/ua/cs/taser/extract/java/JavaParser.g:993:9: o= LBRACE ( annotationTypeElementDeclaration )* c= RBRACE
			{
			o=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_annotationTypeBody4775); if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:993:18: ( annotationTypeElementDeclaration )*
			loop100:
			while (true) {
				int alt100=2;
				int LA100_0 = input.LA(1);
				if ( (LA100_0==ABSTRACT||LA100_0==AT||LA100_0==BOOLEAN||LA100_0==BYTE||(LA100_0 >= CHAR && LA100_0 <= CLASS)||LA100_0==DOUBLE||LA100_0==ENUM||LA100_0==FINAL||LA100_0==FLOAT||(LA100_0 >= INT && LA100_0 <= Identifier)||LA100_0==LONG||LA100_0==LT||LA100_0==NATIVE||(LA100_0 >= PRIVATE && LA100_0 <= PUBLIC)||(LA100_0 >= SHORT && LA100_0 <= STRICTFP)||LA100_0==SYNCHRONIZED||LA100_0==TRANSIENT||(LA100_0 >= VOID && LA100_0 <= VOLATILE)) ) {
					alt100=1;
				}

				switch (alt100) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:993:19: annotationTypeElementDeclaration
					{
					pushFollow(FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody4778);
					annotationTypeElementDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop100;
				}
			}

			c=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_annotationTypeBody4784); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            Stacks.top(entityStack).setPosition(rangePositionOf(o, c));
			            }
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 75, annotationTypeBody_StartIndex); }

		}
	}
	// $ANTLR end "annotationTypeBody"



	// $ANTLR start "annotationTypeElementDeclaration"
	// edu/ua/cs/taser/extract/java/JavaParser.g:999:1: annotationTypeElementDeclaration : modifiers annotationTypeElementRest ;
	public final void annotationTypeElementDeclaration() throws RecognitionException {
		int annotationTypeElementDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1000:5: ( modifiers annotationTypeElementRest )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1000:9: modifiers annotationTypeElementRest
			{
			pushFollow(FOLLOW_modifiers_in_annotationTypeElementDeclaration4817);
			modifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_annotationTypeElementRest_in_annotationTypeElementDeclaration4819);
			annotationTypeElementRest();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 76, annotationTypeElementDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "annotationTypeElementDeclaration"



	// $ANTLR start "annotationTypeElementRest"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1003:1: annotationTypeElementRest : ( type annotationMethodOrConstantRest SEMICOLON | normalClassDeclaration ( SEMICOLON )? | normalInterfaceDeclaration ( SEMICOLON )? | enumDeclaration ( SEMICOLON )? | annotationTypeDeclaration ( SEMICOLON )? );
	public final void annotationTypeElementRest() throws RecognitionException {
		int annotationTypeElementRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1004:5: ( type annotationMethodOrConstantRest SEMICOLON | normalClassDeclaration ( SEMICOLON )? | normalInterfaceDeclaration ( SEMICOLON )? | enumDeclaration ( SEMICOLON )? | annotationTypeDeclaration ( SEMICOLON )? )
			int alt105=5;
			switch ( input.LA(1) ) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case Identifier:
			case LONG:
			case SHORT:
				{
				alt105=1;
				}
				break;
			case CLASS:
				{
				alt105=2;
				}
				break;
			case INTERFACE:
				{
				alt105=3;
				}
				break;
			case ENUM:
				{
				alt105=4;
				}
				break;
			case AT:
				{
				alt105=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 105, 0, input);
				throw nvae;
			}
			switch (alt105) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1004:9: type annotationMethodOrConstantRest SEMICOLON
					{
					pushFollow(FOLLOW_type_in_annotationTypeElementRest4838);
					type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_annotationMethodOrConstantRest_in_annotationTypeElementRest4840);
					annotationMethodOrConstantRest();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_annotationTypeElementRest4842); if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1005:9: normalClassDeclaration ( SEMICOLON )?
					{
					pushFollow(FOLLOW_normalClassDeclaration_in_annotationTypeElementRest4852);
					normalClassDeclaration();
					state._fsp--;
					if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1005:32: ( SEMICOLON )?
					int alt101=2;
					int LA101_0 = input.LA(1);
					if ( (LA101_0==SEMICOLON) ) {
						alt101=1;
					}
					switch (alt101) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1005:32: SEMICOLON
							{
							match(input,SEMICOLON,FOLLOW_SEMICOLON_in_annotationTypeElementRest4854); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1006:9: normalInterfaceDeclaration ( SEMICOLON )?
					{
					pushFollow(FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementRest4865);
					normalInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1006:36: ( SEMICOLON )?
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==SEMICOLON) ) {
						alt102=1;
					}
					switch (alt102) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1006:36: SEMICOLON
							{
							match(input,SEMICOLON,FOLLOW_SEMICOLON_in_annotationTypeElementRest4867); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 4 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1007:9: enumDeclaration ( SEMICOLON )?
					{
					pushFollow(FOLLOW_enumDeclaration_in_annotationTypeElementRest4878);
					enumDeclaration();
					state._fsp--;
					if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1007:25: ( SEMICOLON )?
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==SEMICOLON) ) {
						alt103=1;
					}
					switch (alt103) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1007:25: SEMICOLON
							{
							match(input,SEMICOLON,FOLLOW_SEMICOLON_in_annotationTypeElementRest4880); if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 5 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1008:9: annotationTypeDeclaration ( SEMICOLON )?
					{
					pushFollow(FOLLOW_annotationTypeDeclaration_in_annotationTypeElementRest4891);
					annotationTypeDeclaration();
					state._fsp--;
					if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1008:35: ( SEMICOLON )?
					int alt104=2;
					int LA104_0 = input.LA(1);
					if ( (LA104_0==SEMICOLON) ) {
						alt104=1;
					}
					switch (alt104) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1008:35: SEMICOLON
							{
							match(input,SEMICOLON,FOLLOW_SEMICOLON_in_annotationTypeElementRest4893); if (state.failed) return;
							}
							break;

					}

					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 77, annotationTypeElementRest_StartIndex); }

		}
	}
	// $ANTLR end "annotationTypeElementRest"



	// $ANTLR start "annotationMethodOrConstantRest"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1011:1: annotationMethodOrConstantRest : ( annotationMethodRest | annotationConstantRest );
	public final void annotationMethodOrConstantRest() throws RecognitionException {
		int annotationMethodOrConstantRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1012:5: ( annotationMethodRest | annotationConstantRest )
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==Identifier) ) {
				int LA106_1 = input.LA(2);
				if ( (LA106_1==LPAREN) ) {
					alt106=1;
				}
				else if ( (LA106_1==ASG||LA106_1==COMMA||LA106_1==LBRACKET||LA106_1==SEMICOLON) ) {
					alt106=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 106, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 106, 0, input);
				throw nvae;
			}

			switch (alt106) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1012:9: annotationMethodRest
					{
					pushFollow(FOLLOW_annotationMethodRest_in_annotationMethodOrConstantRest4913);
					annotationMethodRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1013:9: annotationConstantRest
					{
					pushFollow(FOLLOW_annotationConstantRest_in_annotationMethodOrConstantRest4923);
					annotationConstantRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 78, annotationMethodOrConstantRest_StartIndex); }

		}
	}
	// $ANTLR end "annotationMethodOrConstantRest"



	// $ANTLR start "annotationMethodRest"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1016:1: annotationMethodRest : i= Identifier LPAREN RPAREN ( defaultValue )? ;
	public final void annotationMethodRest() throws RecognitionException {
		int annotationMethodRest_StartIndex = input.index();

		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1017:5: (i= Identifier LPAREN RPAREN ( defaultValue )? )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1017:9: i= Identifier LPAREN RPAREN ( defaultValue )?
			{
			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_annotationMethodRest4944); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            addToken(makeToken(i, TokenType.ANNOTATION_ELEMENT_NAME, Stacks.top(entityStack)));
			            }
			match(input,LPAREN,FOLLOW_LPAREN_in_annotationMethodRest4968); if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_annotationMethodRest4970); if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1021:23: ( defaultValue )?
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==DEFAULT) ) {
				alt107=1;
			}
			switch (alt107) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1021:23: defaultValue
					{
					pushFollow(FOLLOW_defaultValue_in_annotationMethodRest4972);
					defaultValue();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 79, annotationMethodRest_StartIndex); }

		}
	}
	// $ANTLR end "annotationMethodRest"



	// $ANTLR start "annotationConstantRest"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1024:1: annotationConstantRest : variableDeclarators ;
	public final void annotationConstantRest() throws RecognitionException {
		int annotationConstantRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1025:5: ( variableDeclarators )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1025:9: variableDeclarators
			{
			pushFollow(FOLLOW_variableDeclarators_in_annotationConstantRest4992);
			variableDeclarators();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 80, annotationConstantRest_StartIndex); }

		}
	}
	// $ANTLR end "annotationConstantRest"



	// $ANTLR start "defaultValue"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1028:1: defaultValue : DEFAULT elementValue ;
	public final void defaultValue() throws RecognitionException {
		int defaultValue_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1029:5: ( DEFAULT elementValue )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1029:9: DEFAULT elementValue
			{
			match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultValue5011); if (state.failed) return;
			pushFollow(FOLLOW_elementValue_in_defaultValue5013);
			elementValue();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 81, defaultValue_StartIndex); }

		}
	}
	// $ANTLR end "defaultValue"



	// $ANTLR start "block"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1034:1: block : o= LBRACE ( blockStatement )* c= RBRACE ;
	public final void block() throws RecognitionException {
		int block_StartIndex = input.index();

		Token o=null;
		Token c=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1035:5: (o= LBRACE ( blockStatement )* c= RBRACE )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1035:9: o= LBRACE ( blockStatement )* c= RBRACE
			{
			o=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block5036); if (state.failed) return;
			if ( state.backtracking==0 ) {
			                JavaEntity top = Stacks.top(entityStack);
			                Position topPos = top.getPosition();
			                top.setPosition(topPos.withStart(
			                    findFirstPosition(
			                        RefTypeBody_stack.peek().start,
			                        (topPos.isDefined() ? topPos.getStart() : topPos),
			                        positionOf(o)
			                    )
			                ));
			                RefTypeBody_stack.peek().start = Positions.tailPosition();
			            }
			// edu/ua/cs/taser/extract/java/JavaParser.g:1048:9: ( blockStatement )*
			loop108:
			while (true) {
				int alt108=2;
				int LA108_0 = input.LA(1);
				if ( ((LA108_0 >= ABSTRACT && LA108_0 <= ADD)||(LA108_0 >= ASSERT && LA108_0 <= AT)||LA108_0==BITNOT||(LA108_0 >= BOOLEAN && LA108_0 <= BYTE)||(LA108_0 >= CHAR && LA108_0 <= CLASS)||(LA108_0 >= CONTINUE && LA108_0 <= DEC)||LA108_0==DO||(LA108_0 >= DOUBLE && LA108_0 <= DecimalLiteral)||LA108_0==ENUM||(LA108_0 >= FALSE && LA108_0 <= FINAL)||(LA108_0 >= FLOAT && LA108_0 <= FOR)||LA108_0==FloatingPointLiteral||(LA108_0 >= HexLiteral && LA108_0 <= IF)||LA108_0==INC||(LA108_0 >= INT && LA108_0 <= Identifier)||LA108_0==LBRACE||(LA108_0 >= LONG && LA108_0 <= LPAREN)||(LA108_0 >= NEW && LA108_0 <= NULL)||LA108_0==OctalLiteral||(LA108_0 >= PRIVATE && LA108_0 <= PUBLIC)||LA108_0==RETURN||(LA108_0 >= SEMICOLON && LA108_0 <= THROW)||(LA108_0 >= TRUE && LA108_0 <= TRY)||LA108_0==VOID||LA108_0==WHILE) ) {
					alt108=1;
				}

				switch (alt108) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1048:9: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_block5060);
					blockStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop108;
				}
			}

			c=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block5065); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            JavaEntity top = Stacks.top(entityStack);
			            top.setPosition(top.getPosition().withEnd(positionOf(c)));
			            }
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 82, block_StartIndex); }

		}
	}
	// $ANTLR end "block"



	// $ANTLR start "blockStatement"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1055:1: blockStatement : ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement );
	public final void blockStatement() throws RecognitionException {
		int blockStatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1056:5: ( localVariableDeclarationStatement | classOrInterfaceDeclaration | statement )
			int alt109=3;
			switch ( input.LA(1) ) {
			case FINAL:
				{
				int LA109_1 = input.LA(2);
				if ( (synpred153_JavaParser()) ) {
					alt109=1;
				}
				else if ( (synpred154_JavaParser()) ) {
					alt109=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 109, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AT:
				{
				int LA109_2 = input.LA(2);
				if ( (synpred153_JavaParser()) ) {
					alt109=1;
				}
				else if ( (synpred154_JavaParser()) ) {
					alt109=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 109, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Identifier:
				{
				int LA109_3 = input.LA(2);
				if ( (synpred153_JavaParser()) ) {
					alt109=1;
				}
				else if ( (true) ) {
					alt109=3;
				}

				}
				break;
			case BOOLEAN:
				{
				int LA109_4 = input.LA(2);
				if ( (synpred153_JavaParser()) ) {
					alt109=1;
				}
				else if ( (true) ) {
					alt109=3;
				}

				}
				break;
			case CHAR:
				{
				int LA109_5 = input.LA(2);
				if ( (synpred153_JavaParser()) ) {
					alt109=1;
				}
				else if ( (true) ) {
					alt109=3;
				}

				}
				break;
			case BYTE:
				{
				int LA109_6 = input.LA(2);
				if ( (synpred153_JavaParser()) ) {
					alt109=1;
				}
				else if ( (true) ) {
					alt109=3;
				}

				}
				break;
			case SHORT:
				{
				int LA109_7 = input.LA(2);
				if ( (synpred153_JavaParser()) ) {
					alt109=1;
				}
				else if ( (true) ) {
					alt109=3;
				}

				}
				break;
			case INT:
				{
				int LA109_8 = input.LA(2);
				if ( (synpred153_JavaParser()) ) {
					alt109=1;
				}
				else if ( (true) ) {
					alt109=3;
				}

				}
				break;
			case LONG:
				{
				int LA109_9 = input.LA(2);
				if ( (synpred153_JavaParser()) ) {
					alt109=1;
				}
				else if ( (true) ) {
					alt109=3;
				}

				}
				break;
			case FLOAT:
				{
				int LA109_10 = input.LA(2);
				if ( (synpred153_JavaParser()) ) {
					alt109=1;
				}
				else if ( (true) ) {
					alt109=3;
				}

				}
				break;
			case DOUBLE:
				{
				int LA109_11 = input.LA(2);
				if ( (synpred153_JavaParser()) ) {
					alt109=1;
				}
				else if ( (true) ) {
					alt109=3;
				}

				}
				break;
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				{
				alt109=2;
				}
				break;
			case ADD:
			case ASSERT:
			case BITNOT:
			case BREAK:
			case CONTINUE:
			case CharacterLiteral:
			case DEC:
			case DO:
			case DecimalLiteral:
			case FALSE:
			case FOR:
			case FloatingPointLiteral:
			case HexLiteral:
			case IF:
			case INC:
			case LBRACE:
			case LPAREN:
			case NEW:
			case NOT:
			case NULL:
			case OctalLiteral:
			case RETURN:
			case SEMICOLON:
			case SUB:
			case SUPER:
			case SWITCH:
			case SYNCHRONIZED:
			case StringLiteral:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case VOID:
			case WHILE:
				{
				alt109=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}
			switch (alt109) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1056:9: localVariableDeclarationStatement
					{
					pushFollow(FOLLOW_localVariableDeclarationStatement_in_blockStatement5098);
					localVariableDeclarationStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1057:9: classOrInterfaceDeclaration
					{
					pushFollow(FOLLOW_classOrInterfaceDeclaration_in_blockStatement5108);
					classOrInterfaceDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1058:9: statement
					{
					pushFollow(FOLLOW_statement_in_blockStatement5118);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 83, blockStatement_StartIndex); }

		}
	}
	// $ANTLR end "blockStatement"



	// $ANTLR start "localVariableDeclarationStatement"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1061:1: localVariableDeclarationStatement : localVariableDeclaration SEMICOLON ;
	public final void localVariableDeclarationStatement() throws RecognitionException {
		int localVariableDeclarationStatement_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1062:5: ( localVariableDeclaration SEMICOLON )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1062:10: localVariableDeclaration SEMICOLON
			{
			pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement5138);
			localVariableDeclaration();
			state._fsp--;
			if (state.failed) return;
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_localVariableDeclarationStatement5140); if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 84, localVariableDeclarationStatement_StartIndex); }

		}
	}
	// $ANTLR end "localVariableDeclarationStatement"



	// $ANTLR start "localVariableDeclaration"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1065:1: localVariableDeclaration : variableModifiers type variableDeclarators ;
	public final void localVariableDeclaration() throws RecognitionException {
		int localVariableDeclaration_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1066:5: ( variableModifiers type variableDeclarators )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1066:9: variableModifiers type variableDeclarators
			{
			pushFollow(FOLLOW_variableModifiers_in_localVariableDeclaration5159);
			variableModifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_localVariableDeclaration5161);
			type();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_variableDeclarators_in_localVariableDeclaration5163);
			variableDeclarators();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 85, localVariableDeclaration_StartIndex); }

		}
	}
	// $ANTLR end "localVariableDeclaration"



	// $ANTLR start "variableModifiers"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1069:1: variableModifiers : ( variableModifier )* ;
	public final void variableModifiers() throws RecognitionException {
		int variableModifiers_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1070:5: ( ( variableModifier )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1070:9: ( variableModifier )*
			{
			// edu/ua/cs/taser/extract/java/JavaParser.g:1070:9: ( variableModifier )*
			loop110:
			while (true) {
				int alt110=2;
				int LA110_0 = input.LA(1);
				if ( (LA110_0==AT||LA110_0==FINAL) ) {
					alt110=1;
				}

				switch (alt110) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1070:9: variableModifier
					{
					pushFollow(FOLLOW_variableModifier_in_variableModifiers5182);
					variableModifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop110;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 86, variableModifiers_StartIndex); }

		}
	}
	// $ANTLR end "variableModifiers"



	// $ANTLR start "statement"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1073:1: statement : ( block | ASSERT expression ( COLON expression )? SEMICOLON | IF parExpression statement ( options {k=1; } : ELSE statement )? | FOR o= LPAREN forControl c= RPAREN statement | WHILE parExpression statement | DO statement WHILE parExpression SEMICOLON | TRY block ( catches FINALLY block | catches | FINALLY block ) | SWITCH parExpression o= LBRACE switchBlockStatementGroups c= RBRACE | SYNCHRONIZED parExpression block | RETURN ( expression )? SEMICOLON | THROW expression SEMICOLON | BREAK (i= Identifier )? SEMICOLON | CONTINUE (i= Identifier )? SEMICOLON | SEMICOLON | statementExpression SEMICOLON |i= Identifier COLON statement );
	public final void statement() throws RecognitionException {
		int statement_StartIndex = input.index();

		Token o=null;
		Token c=null;
		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1074:5: ( block | ASSERT expression ( COLON expression )? SEMICOLON | IF parExpression statement ( options {k=1; } : ELSE statement )? | FOR o= LPAREN forControl c= RPAREN statement | WHILE parExpression statement | DO statement WHILE parExpression SEMICOLON | TRY block ( catches FINALLY block | catches | FINALLY block ) | SWITCH parExpression o= LBRACE switchBlockStatementGroups c= RBRACE | SYNCHRONIZED parExpression block | RETURN ( expression )? SEMICOLON | THROW expression SEMICOLON | BREAK (i= Identifier )? SEMICOLON | CONTINUE (i= Identifier )? SEMICOLON | SEMICOLON | statementExpression SEMICOLON |i= Identifier COLON statement )
			int alt117=16;
			switch ( input.LA(1) ) {
			case LBRACE:
				{
				alt117=1;
				}
				break;
			case ASSERT:
				{
				alt117=2;
				}
				break;
			case IF:
				{
				alt117=3;
				}
				break;
			case FOR:
				{
				alt117=4;
				}
				break;
			case WHILE:
				{
				alt117=5;
				}
				break;
			case DO:
				{
				alt117=6;
				}
				break;
			case TRY:
				{
				alt117=7;
				}
				break;
			case SWITCH:
				{
				alt117=8;
				}
				break;
			case SYNCHRONIZED:
				{
				alt117=9;
				}
				break;
			case RETURN:
				{
				alt117=10;
				}
				break;
			case THROW:
				{
				alt117=11;
				}
				break;
			case BREAK:
				{
				alt117=12;
				}
				break;
			case CONTINUE:
				{
				alt117=13;
				}
				break;
			case SEMICOLON:
				{
				alt117=14;
				}
				break;
			case ADD:
			case BITNOT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CharacterLiteral:
			case DEC:
			case DOUBLE:
			case DecimalLiteral:
			case FALSE:
			case FLOAT:
			case FloatingPointLiteral:
			case HexLiteral:
			case INC:
			case INT:
			case LONG:
			case LPAREN:
			case NEW:
			case NOT:
			case NULL:
			case OctalLiteral:
			case SHORT:
			case SUB:
			case SUPER:
			case StringLiteral:
			case THIS:
			case TRUE:
			case VOID:
				{
				alt117=15;
				}
				break;
			case Identifier:
				{
				int LA117_16 = input.LA(2);
				if ( ((LA117_16 >= ADD && LA117_16 <= ASGSUB)||LA117_16==BITAND||(LA117_16 >= BITOR && LA117_16 <= BITXOR)||LA117_16==DEC||LA117_16==DIV||LA117_16==DOT||LA117_16==EQ||LA117_16==GT||(LA117_16 >= INC && LA117_16 <= INSTANCEOF)||LA117_16==LBRACKET||(LA117_16 >= LPAREN && LA117_16 <= LT)||LA117_16==MUL||LA117_16==NE||LA117_16==OR||LA117_16==QUESTIONMARK||LA117_16==REM||LA117_16==SEMICOLON||LA117_16==SUB) ) {
					alt117=15;
				}
				else if ( (LA117_16==COLON) ) {
					alt117=16;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 117, 16, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 117, 0, input);
				throw nvae;
			}
			switch (alt117) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1074:7: block
					{
					pushFollow(FOLLOW_block_in_statement5200);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1075:9: ASSERT expression ( COLON expression )? SEMICOLON
					{
					match(input,ASSERT,FOLLOW_ASSERT_in_statement5210); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_statement5212);
					expression();
					state._fsp--;
					if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1075:27: ( COLON expression )?
					int alt111=2;
					int LA111_0 = input.LA(1);
					if ( (LA111_0==COLON) ) {
						alt111=1;
					}
					switch (alt111) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1075:28: COLON expression
							{
							match(input,COLON,FOLLOW_COLON_in_statement5215); if (state.failed) return;
							pushFollow(FOLLOW_expression_in_statement5217);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement5221); if (state.failed) return;
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1076:9: IF parExpression statement ( options {k=1; } : ELSE statement )?
					{
					match(input,IF,FOLLOW_IF_in_statement5231); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement5233);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement5235);
					statement();
					state._fsp--;
					if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1076:36: ( options {k=1; } : ELSE statement )?
					int alt112=2;
					int LA112_0 = input.LA(1);
					if ( (LA112_0==ELSE) ) {
						int LA112_1 = input.LA(2);
						if ( (synpred159_JavaParser()) ) {
							alt112=1;
						}
					}
					switch (alt112) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1076:52: ELSE statement
							{
							match(input,ELSE,FOLLOW_ELSE_in_statement5245); if (state.failed) return;
							pushFollow(FOLLOW_statement_in_statement5247);
							statement();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 4 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1077:9: FOR o= LPAREN forControl c= RPAREN statement
					{
					match(input,FOR,FOLLOW_FOR_in_statement5259); if (state.failed) return;
					o=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement5263); if (state.failed) return;
					pushFollow(FOLLOW_forControl_in_statement5265);
					forControl();
					state._fsp--;
					if (state.failed) return;
					c=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement5269); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement5279);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1079:9: WHILE parExpression statement
					{
					match(input,WHILE,FOLLOW_WHILE_in_statement5289); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement5291);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement5293);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1080:9: DO statement WHILE parExpression SEMICOLON
					{
					match(input,DO,FOLLOW_DO_in_statement5303); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement5305);
					statement();
					state._fsp--;
					if (state.failed) return;
					match(input,WHILE,FOLLOW_WHILE_in_statement5307); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement5309);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement5311); if (state.failed) return;
					}
					break;
				case 7 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1081:9: TRY block ( catches FINALLY block | catches | FINALLY block )
					{
					match(input,TRY,FOLLOW_TRY_in_statement5321); if (state.failed) return;
					pushFollow(FOLLOW_block_in_statement5323);
					block();
					state._fsp--;
					if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1082:9: ( catches FINALLY block | catches | FINALLY block )
					int alt113=3;
					int LA113_0 = input.LA(1);
					if ( (LA113_0==CATCH) ) {
						int LA113_1 = input.LA(2);
						if ( (synpred164_JavaParser()) ) {
							alt113=1;
						}
						else if ( (synpred165_JavaParser()) ) {
							alt113=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 113, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA113_0==FINALLY) ) {
						alt113=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 113, 0, input);
						throw nvae;
					}

					switch (alt113) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1082:11: catches FINALLY block
							{
							pushFollow(FOLLOW_catches_in_statement5335);
							catches();
							state._fsp--;
							if (state.failed) return;
							match(input,FINALLY,FOLLOW_FINALLY_in_statement5337); if (state.failed) return;
							pushFollow(FOLLOW_block_in_statement5339);
							block();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1083:11: catches
							{
							pushFollow(FOLLOW_catches_in_statement5351);
							catches();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 3 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1084:13: FINALLY block
							{
							match(input,FINALLY,FOLLOW_FINALLY_in_statement5365); if (state.failed) return;
							pushFollow(FOLLOW_block_in_statement5367);
							block();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 8 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1086:9: SWITCH parExpression o= LBRACE switchBlockStatementGroups c= RBRACE
					{
					match(input,SWITCH,FOLLOW_SWITCH_in_statement5387); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement5389);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					o=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement5393); if (state.failed) return;
					pushFollow(FOLLOW_switchBlockStatementGroups_in_statement5395);
					switchBlockStatementGroups();
					state._fsp--;
					if (state.failed) return;
					c=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement5399); if (state.failed) return;
					}
					break;
				case 9 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1087:9: SYNCHRONIZED parExpression block
					{
					match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement5409); if (state.failed) return;
					pushFollow(FOLLOW_parExpression_in_statement5411);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_block_in_statement5413);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1088:9: RETURN ( expression )? SEMICOLON
					{
					match(input,RETURN,FOLLOW_RETURN_in_statement5423); if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1088:16: ( expression )?
					int alt114=2;
					int LA114_0 = input.LA(1);
					if ( (LA114_0==ADD||LA114_0==BITNOT||LA114_0==BOOLEAN||LA114_0==BYTE||LA114_0==CHAR||(LA114_0 >= CharacterLiteral && LA114_0 <= DEC)||(LA114_0 >= DOUBLE && LA114_0 <= DecimalLiteral)||LA114_0==FALSE||LA114_0==FLOAT||LA114_0==FloatingPointLiteral||LA114_0==HexLiteral||LA114_0==INC||LA114_0==INT||LA114_0==Identifier||(LA114_0 >= LONG && LA114_0 <= LPAREN)||(LA114_0 >= NEW && LA114_0 <= NULL)||LA114_0==OctalLiteral||LA114_0==SHORT||(LA114_0 >= SUB && LA114_0 <= SUPER)||(LA114_0 >= StringLiteral && LA114_0 <= THIS)||LA114_0==TRUE||LA114_0==VOID) ) {
						alt114=1;
					}
					switch (alt114) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1088:16: expression
							{
							pushFollow(FOLLOW_expression_in_statement5425);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement5428); if (state.failed) return;
					}
					break;
				case 11 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1089:9: THROW expression SEMICOLON
					{
					match(input,THROW,FOLLOW_THROW_in_statement5438); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_statement5440);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement5442); if (state.failed) return;
					}
					break;
				case 12 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1090:9: BREAK (i= Identifier )? SEMICOLON
					{
					match(input,BREAK,FOLLOW_BREAK_in_statement5452); if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1090:17: (i= Identifier )?
					int alt115=2;
					int LA115_0 = input.LA(1);
					if ( (LA115_0==Identifier) ) {
						alt115=1;
					}
					switch (alt115) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1090:19: i= Identifier
							{
							i=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement5460); if (state.failed) return;
							if ( state.backtracking==0 ) {
							            addToken(makeToken(i, TokenType.LABEL_REF, Stacks.top(entityStack)));
							            }
							}
							break;

					}

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement5487); if (state.failed) return;
					}
					break;
				case 13 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1095:9: CONTINUE (i= Identifier )? SEMICOLON
					{
					match(input,CONTINUE,FOLLOW_CONTINUE_in_statement5497); if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1095:18: (i= Identifier )?
					int alt116=2;
					int LA116_0 = input.LA(1);
					if ( (LA116_0==Identifier) ) {
						alt116=1;
					}
					switch (alt116) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1095:20: i= Identifier
							{
							i=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement5503); if (state.failed) return;
							if ( state.backtracking==0 ) {
							            addToken(makeToken(i, TokenType.LABEL_REF, Stacks.top(entityStack)));
							            }
							}
							break;

					}

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement5530); if (state.failed) return;
					}
					break;
				case 14 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1100:9: SEMICOLON
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement5540); if (state.failed) return;
					}
					break;
				case 15 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1101:9: statementExpression SEMICOLON
					{
					pushFollow(FOLLOW_statementExpression_in_statement5550);
					statementExpression();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statement5552); if (state.failed) return;
					}
					break;
				case 16 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1102:9: i= Identifier COLON statement
					{
					i=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement5564); if (state.failed) return;
					if ( state.backtracking==0 ) {
					            addToken(makeToken(i, TokenType.LABEL_NAME, Stacks.top(entityStack)));
					            }
					match(input,COLON,FOLLOW_COLON_in_statement5588); if (state.failed) return;
					pushFollow(FOLLOW_statement_in_statement5590);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 87, statement_StartIndex); }

		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "catches"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1109:1: catches : catchClause ( catchClause )* ;
	public final void catches() throws RecognitionException {
		int catches_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1110:5: ( catchClause ( catchClause )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1110:9: catchClause ( catchClause )*
			{
			pushFollow(FOLLOW_catchClause_in_catches5609);
			catchClause();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1110:21: ( catchClause )*
			loop118:
			while (true) {
				int alt118=2;
				int LA118_0 = input.LA(1);
				if ( (LA118_0==CATCH) ) {
					alt118=1;
				}

				switch (alt118) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1110:22: catchClause
					{
					pushFollow(FOLLOW_catchClause_in_catches5612);
					catchClause();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop118;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 88, catches_StartIndex); }

		}
	}
	// $ANTLR end "catches"



	// $ANTLR start "catchClause"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1113:1: catchClause : CATCH o= LPAREN formalCatchParameter c= RPAREN block ;
	public final void catchClause() throws RecognitionException {
		int catchClause_StartIndex = input.index();

		Token o=null;
		Token c=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1114:5: ( CATCH o= LPAREN formalCatchParameter c= RPAREN block )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1114:9: CATCH o= LPAREN formalCatchParameter c= RPAREN block
			{
			match(input,CATCH,FOLLOW_CATCH_in_catchClause5633); if (state.failed) return;
			o=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchClause5637); if (state.failed) return;
			pushFollow(FOLLOW_formalCatchParameter_in_catchClause5639);
			formalCatchParameter();
			state._fsp--;
			if (state.failed) return;
			c=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchClause5643); if (state.failed) return;
			pushFollow(FOLLOW_block_in_catchClause5653);
			block();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 89, catchClause_StartIndex); }

		}
	}
	// $ANTLR end "catchClause"



	// $ANTLR start "formalCatchParameter"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1118:1: formalCatchParameter : variableModifiers type variableDeclaratorId ;
	public final void formalCatchParameter() throws RecognitionException {
		int formalCatchParameter_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1119:5: ( variableModifiers type variableDeclaratorId )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1119:9: variableModifiers type variableDeclaratorId
			{
			pushFollow(FOLLOW_variableModifiers_in_formalCatchParameter5672);
			variableModifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_formalCatchParameter5674);
			type();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_variableDeclaratorId_in_formalCatchParameter5676);
			variableDeclaratorId();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			            lastVariableDeclaratorId = null;
			            }
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 90, formalCatchParameter_StartIndex); }

		}
	}
	// $ANTLR end "formalCatchParameter"



	// $ANTLR start "switchBlockStatementGroups"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1125:1: switchBlockStatementGroups : ( switchBlockStatementGroup )* ;
	public final void switchBlockStatementGroups() throws RecognitionException {
		int switchBlockStatementGroups_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1126:5: ( ( switchBlockStatementGroup )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1126:9: ( switchBlockStatementGroup )*
			{
			// edu/ua/cs/taser/extract/java/JavaParser.g:1126:9: ( switchBlockStatementGroup )*
			loop119:
			while (true) {
				int alt119=2;
				int LA119_0 = input.LA(1);
				if ( (LA119_0==CASE||LA119_0==DEFAULT) ) {
					alt119=1;
				}

				switch (alt119) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1126:10: switchBlockStatementGroup
					{
					pushFollow(FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups5710);
					switchBlockStatementGroup();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop119;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 91, switchBlockStatementGroups_StartIndex); }

		}
	}
	// $ANTLR end "switchBlockStatementGroups"



	// $ANTLR start "switchBlockStatementGroup"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1129:1: switchBlockStatementGroup : ( switchLabel )+ ( blockStatement )* ;
	public final void switchBlockStatementGroup() throws RecognitionException {
		int switchBlockStatementGroup_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1130:5: ( ( switchLabel )+ ( blockStatement )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1130:9: ( switchLabel )+ ( blockStatement )*
			{
			// edu/ua/cs/taser/extract/java/JavaParser.g:1130:9: ( switchLabel )+
			int cnt120=0;
			loop120:
			while (true) {
				int alt120=2;
				int LA120_0 = input.LA(1);
				if ( (LA120_0==CASE) ) {
					int LA120_2 = input.LA(2);
					if ( (synpred180_JavaParser()) ) {
						alt120=1;
					}

				}
				else if ( (LA120_0==DEFAULT) ) {
					int LA120_3 = input.LA(2);
					if ( (synpred180_JavaParser()) ) {
						alt120=1;
					}

				}

				switch (alt120) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1130:9: switchLabel
					{
					pushFollow(FOLLOW_switchLabel_in_switchBlockStatementGroup5731);
					switchLabel();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt120 >= 1 ) break loop120;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(120, input);
					throw eee;
				}
				cnt120++;
			}

			// edu/ua/cs/taser/extract/java/JavaParser.g:1130:22: ( blockStatement )*
			loop121:
			while (true) {
				int alt121=2;
				int LA121_0 = input.LA(1);
				if ( ((LA121_0 >= ABSTRACT && LA121_0 <= ADD)||(LA121_0 >= ASSERT && LA121_0 <= AT)||LA121_0==BITNOT||(LA121_0 >= BOOLEAN && LA121_0 <= BYTE)||(LA121_0 >= CHAR && LA121_0 <= CLASS)||(LA121_0 >= CONTINUE && LA121_0 <= DEC)||LA121_0==DO||(LA121_0 >= DOUBLE && LA121_0 <= DecimalLiteral)||LA121_0==ENUM||(LA121_0 >= FALSE && LA121_0 <= FINAL)||(LA121_0 >= FLOAT && LA121_0 <= FOR)||LA121_0==FloatingPointLiteral||(LA121_0 >= HexLiteral && LA121_0 <= IF)||LA121_0==INC||(LA121_0 >= INT && LA121_0 <= Identifier)||LA121_0==LBRACE||(LA121_0 >= LONG && LA121_0 <= LPAREN)||(LA121_0 >= NEW && LA121_0 <= NULL)||LA121_0==OctalLiteral||(LA121_0 >= PRIVATE && LA121_0 <= PUBLIC)||LA121_0==RETURN||(LA121_0 >= SEMICOLON && LA121_0 <= THROW)||(LA121_0 >= TRUE && LA121_0 <= TRY)||LA121_0==VOID||LA121_0==WHILE) ) {
					alt121=1;
				}

				switch (alt121) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1130:22: blockStatement
					{
					pushFollow(FOLLOW_blockStatement_in_switchBlockStatementGroup5734);
					blockStatement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop121;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 92, switchBlockStatementGroup_StartIndex); }

		}
	}
	// $ANTLR end "switchBlockStatementGroup"



	// $ANTLR start "switchLabel"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1133:1: switchLabel : ( CASE constantExpression COLON | CASE enumConstantName COLON | DEFAULT COLON );
	public final void switchLabel() throws RecognitionException {
		int switchLabel_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1134:5: ( CASE constantExpression COLON | CASE enumConstantName COLON | DEFAULT COLON )
			int alt122=3;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==CASE) ) {
				int LA122_1 = input.LA(2);
				if ( (LA122_1==ADD||LA122_1==BITNOT||LA122_1==BOOLEAN||LA122_1==BYTE||LA122_1==CHAR||(LA122_1 >= CharacterLiteral && LA122_1 <= DEC)||(LA122_1 >= DOUBLE && LA122_1 <= DecimalLiteral)||LA122_1==FALSE||LA122_1==FLOAT||LA122_1==FloatingPointLiteral||LA122_1==HexLiteral||LA122_1==INC||LA122_1==INT||(LA122_1 >= LONG && LA122_1 <= LPAREN)||(LA122_1 >= NEW && LA122_1 <= NULL)||LA122_1==OctalLiteral||LA122_1==SHORT||(LA122_1 >= SUB && LA122_1 <= SUPER)||(LA122_1 >= StringLiteral && LA122_1 <= THIS)||LA122_1==TRUE||LA122_1==VOID) ) {
					alt122=1;
				}
				else if ( (LA122_1==Identifier) ) {
					int LA122_4 = input.LA(3);
					if ( ((LA122_4 >= ADD && LA122_4 <= ASGSUB)||LA122_4==BITAND||(LA122_4 >= BITOR && LA122_4 <= BITXOR)||LA122_4==DEC||LA122_4==DIV||LA122_4==DOT||LA122_4==EQ||LA122_4==GT||(LA122_4 >= INC && LA122_4 <= INSTANCEOF)||LA122_4==LBRACKET||(LA122_4 >= LPAREN && LA122_4 <= LT)||LA122_4==MUL||LA122_4==NE||LA122_4==OR||LA122_4==QUESTIONMARK||LA122_4==REM||LA122_4==SUB) ) {
						alt122=1;
					}
					else if ( (LA122_4==COLON) ) {
						int LA122_5 = input.LA(4);
						if ( (synpred182_JavaParser()) ) {
							alt122=1;
						}
						else if ( (synpred183_JavaParser()) ) {
							alt122=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 122, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 122, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 122, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA122_0==DEFAULT) ) {
				alt122=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 122, 0, input);
				throw nvae;
			}

			switch (alt122) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1134:9: CASE constantExpression COLON
					{
					match(input,CASE,FOLLOW_CASE_in_switchLabel5754); if (state.failed) return;
					pushFollow(FOLLOW_constantExpression_in_switchLabel5756);
					constantExpression();
					state._fsp--;
					if (state.failed) return;
					match(input,COLON,FOLLOW_COLON_in_switchLabel5758); if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1135:9: CASE enumConstantName COLON
					{
					match(input,CASE,FOLLOW_CASE_in_switchLabel5768); if (state.failed) return;
					pushFollow(FOLLOW_enumConstantName_in_switchLabel5770);
					enumConstantName();
					state._fsp--;
					if (state.failed) return;
					match(input,COLON,FOLLOW_COLON_in_switchLabel5772); if (state.failed) return;
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1136:9: DEFAULT COLON
					{
					match(input,DEFAULT,FOLLOW_DEFAULT_in_switchLabel5782); if (state.failed) return;
					match(input,COLON,FOLLOW_COLON_in_switchLabel5784); if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 93, switchLabel_StartIndex); }

		}
	}
	// $ANTLR end "switchLabel"



	// $ANTLR start "forControl"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1139:1: forControl options {k=3; } : ( enhancedForControl | ( forInit )? SEMICOLON ( expression )? SEMICOLON ( forUpdate )? );
	public final void forControl() throws RecognitionException {
		int forControl_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1141:5: ( enhancedForControl | ( forInit )? SEMICOLON ( expression )? SEMICOLON ( forUpdate )? )
			int alt126=2;
			alt126 = dfa126.predict(input);
			switch (alt126) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1141:9: enhancedForControl
					{
					pushFollow(FOLLOW_enhancedForControl_in_forControl5810);
					enhancedForControl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1142:9: ( forInit )? SEMICOLON ( expression )? SEMICOLON ( forUpdate )?
					{
					// edu/ua/cs/taser/extract/java/JavaParser.g:1142:9: ( forInit )?
					int alt123=2;
					int LA123_0 = input.LA(1);
					if ( (LA123_0==ADD||LA123_0==AT||LA123_0==BITNOT||LA123_0==BOOLEAN||LA123_0==BYTE||LA123_0==CHAR||(LA123_0 >= CharacterLiteral && LA123_0 <= DEC)||(LA123_0 >= DOUBLE && LA123_0 <= DecimalLiteral)||(LA123_0 >= FALSE && LA123_0 <= FINAL)||LA123_0==FLOAT||LA123_0==FloatingPointLiteral||LA123_0==HexLiteral||LA123_0==INC||LA123_0==INT||LA123_0==Identifier||(LA123_0 >= LONG && LA123_0 <= LPAREN)||(LA123_0 >= NEW && LA123_0 <= NULL)||LA123_0==OctalLiteral||LA123_0==SHORT||(LA123_0 >= SUB && LA123_0 <= SUPER)||(LA123_0 >= StringLiteral && LA123_0 <= THIS)||LA123_0==TRUE||LA123_0==VOID) ) {
						alt123=1;
					}
					switch (alt123) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1142:9: forInit
							{
							pushFollow(FOLLOW_forInit_in_forControl5820);
							forInit();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forControl5823); if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1142:28: ( expression )?
					int alt124=2;
					int LA124_0 = input.LA(1);
					if ( (LA124_0==ADD||LA124_0==BITNOT||LA124_0==BOOLEAN||LA124_0==BYTE||LA124_0==CHAR||(LA124_0 >= CharacterLiteral && LA124_0 <= DEC)||(LA124_0 >= DOUBLE && LA124_0 <= DecimalLiteral)||LA124_0==FALSE||LA124_0==FLOAT||LA124_0==FloatingPointLiteral||LA124_0==HexLiteral||LA124_0==INC||LA124_0==INT||LA124_0==Identifier||(LA124_0 >= LONG && LA124_0 <= LPAREN)||(LA124_0 >= NEW && LA124_0 <= NULL)||LA124_0==OctalLiteral||LA124_0==SHORT||(LA124_0 >= SUB && LA124_0 <= SUPER)||(LA124_0 >= StringLiteral && LA124_0 <= THIS)||LA124_0==TRUE||LA124_0==VOID) ) {
						alt124=1;
					}
					switch (alt124) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1142:28: expression
							{
							pushFollow(FOLLOW_expression_in_forControl5825);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forControl5828); if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1142:50: ( forUpdate )?
					int alt125=2;
					int LA125_0 = input.LA(1);
					if ( (LA125_0==ADD||LA125_0==BITNOT||LA125_0==BOOLEAN||LA125_0==BYTE||LA125_0==CHAR||(LA125_0 >= CharacterLiteral && LA125_0 <= DEC)||(LA125_0 >= DOUBLE && LA125_0 <= DecimalLiteral)||LA125_0==FALSE||LA125_0==FLOAT||LA125_0==FloatingPointLiteral||LA125_0==HexLiteral||LA125_0==INC||LA125_0==INT||LA125_0==Identifier||(LA125_0 >= LONG && LA125_0 <= LPAREN)||(LA125_0 >= NEW && LA125_0 <= NULL)||LA125_0==OctalLiteral||LA125_0==SHORT||(LA125_0 >= SUB && LA125_0 <= SUPER)||(LA125_0 >= StringLiteral && LA125_0 <= THIS)||LA125_0==TRUE||LA125_0==VOID) ) {
						alt125=1;
					}
					switch (alt125) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1142:50: forUpdate
							{
							pushFollow(FOLLOW_forUpdate_in_forControl5830);
							forUpdate();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 94, forControl_StartIndex); }

		}
	}
	// $ANTLR end "forControl"



	// $ANTLR start "forInit"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1145:1: forInit : ( localVariableDeclaration | expressionList );
	public final void forInit() throws RecognitionException {
		int forInit_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1146:5: ( localVariableDeclaration | expressionList )
			int alt127=2;
			switch ( input.LA(1) ) {
			case AT:
			case FINAL:
				{
				alt127=1;
				}
				break;
			case Identifier:
				{
				int LA127_3 = input.LA(2);
				if ( (synpred188_JavaParser()) ) {
					alt127=1;
				}
				else if ( (true) ) {
					alt127=2;
				}

				}
				break;
			case BOOLEAN:
				{
				int LA127_4 = input.LA(2);
				if ( (synpred188_JavaParser()) ) {
					alt127=1;
				}
				else if ( (true) ) {
					alt127=2;
				}

				}
				break;
			case CHAR:
				{
				int LA127_5 = input.LA(2);
				if ( (synpred188_JavaParser()) ) {
					alt127=1;
				}
				else if ( (true) ) {
					alt127=2;
				}

				}
				break;
			case BYTE:
				{
				int LA127_6 = input.LA(2);
				if ( (synpred188_JavaParser()) ) {
					alt127=1;
				}
				else if ( (true) ) {
					alt127=2;
				}

				}
				break;
			case SHORT:
				{
				int LA127_7 = input.LA(2);
				if ( (synpred188_JavaParser()) ) {
					alt127=1;
				}
				else if ( (true) ) {
					alt127=2;
				}

				}
				break;
			case INT:
				{
				int LA127_8 = input.LA(2);
				if ( (synpred188_JavaParser()) ) {
					alt127=1;
				}
				else if ( (true) ) {
					alt127=2;
				}

				}
				break;
			case LONG:
				{
				int LA127_9 = input.LA(2);
				if ( (synpred188_JavaParser()) ) {
					alt127=1;
				}
				else if ( (true) ) {
					alt127=2;
				}

				}
				break;
			case FLOAT:
				{
				int LA127_10 = input.LA(2);
				if ( (synpred188_JavaParser()) ) {
					alt127=1;
				}
				else if ( (true) ) {
					alt127=2;
				}

				}
				break;
			case DOUBLE:
				{
				int LA127_11 = input.LA(2);
				if ( (synpred188_JavaParser()) ) {
					alt127=1;
				}
				else if ( (true) ) {
					alt127=2;
				}

				}
				break;
			case ADD:
			case BITNOT:
			case CharacterLiteral:
			case DEC:
			case DecimalLiteral:
			case FALSE:
			case FloatingPointLiteral:
			case HexLiteral:
			case INC:
			case LPAREN:
			case NEW:
			case NOT:
			case NULL:
			case OctalLiteral:
			case SUB:
			case SUPER:
			case StringLiteral:
			case THIS:
			case TRUE:
			case VOID:
				{
				alt127=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 127, 0, input);
				throw nvae;
			}
			switch (alt127) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1146:9: localVariableDeclaration
					{
					pushFollow(FOLLOW_localVariableDeclaration_in_forInit5850);
					localVariableDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1147:9: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_forInit5860);
					expressionList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 95, forInit_StartIndex); }

		}
	}
	// $ANTLR end "forInit"



	// $ANTLR start "enhancedForControl"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1150:1: enhancedForControl : variableModifiers type i= Identifier COLON expression ;
	public final void enhancedForControl() throws RecognitionException {
		int enhancedForControl_StartIndex = input.index();

		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1151:5: ( variableModifiers type i= Identifier COLON expression )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1151:9: variableModifiers type i= Identifier COLON expression
			{
			pushFollow(FOLLOW_variableModifiers_in_enhancedForControl5879);
			variableModifiers();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_type_in_enhancedForControl5881);
			type();
			state._fsp--;
			if (state.failed) return;
			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_enhancedForControl5885); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            addToken(makeToken(i, TokenType.LOCAL_VARIABLE_NAME, Stacks.top(entityStack)));
			            }
			match(input,COLON,FOLLOW_COLON_in_enhancedForControl5909); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_enhancedForControl5911);
			expression();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 96, enhancedForControl_StartIndex); }

		}
	}
	// $ANTLR end "enhancedForControl"



	// $ANTLR start "forUpdate"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1158:1: forUpdate : expressionList ;
	public final void forUpdate() throws RecognitionException {
		int forUpdate_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1159:5: ( expressionList )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1159:9: expressionList
			{
			pushFollow(FOLLOW_expressionList_in_forUpdate5930);
			expressionList();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 97, forUpdate_StartIndex); }

		}
	}
	// $ANTLR end "forUpdate"



	// $ANTLR start "parExpression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1164:1: parExpression : o= LPAREN expression c= RPAREN ;
	public final void parExpression() throws RecognitionException {
		int parExpression_StartIndex = input.index();

		Token o=null;
		Token c=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1165:5: (o= LPAREN expression c= RPAREN )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1165:9: o= LPAREN expression c= RPAREN
			{
			o=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression5953); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_parExpression5955);
			expression();
			state._fsp--;
			if (state.failed) return;
			c=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression5959); if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 98, parExpression_StartIndex); }

		}
	}
	// $ANTLR end "parExpression"



	// $ANTLR start "expressionList"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1168:1: expressionList : expression ( COMMA expression )* ;
	public final void expressionList() throws RecognitionException {
		int expressionList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1169:5: ( expression ( COMMA expression )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1169:9: expression ( COMMA expression )*
			{
			pushFollow(FOLLOW_expression_in_expressionList5978);
			expression();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1169:20: ( COMMA expression )*
			loop128:
			while (true) {
				int alt128=2;
				int LA128_0 = input.LA(1);
				if ( (LA128_0==COMMA) ) {
					alt128=1;
				}

				switch (alt128) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1169:21: COMMA expression
					{
					match(input,COMMA,FOLLOW_COMMA_in_expressionList5981); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_expressionList5983);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop128;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 99, expressionList_StartIndex); }

		}
	}
	// $ANTLR end "expressionList"



	// $ANTLR start "statementExpression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1172:1: statementExpression : expression ;
	public final void statementExpression() throws RecognitionException {
		int statementExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1173:5: ( expression )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1173:9: expression
			{
			pushFollow(FOLLOW_expression_in_statementExpression6004);
			expression();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 100, statementExpression_StartIndex); }

		}
	}
	// $ANTLR end "statementExpression"



	// $ANTLR start "constantExpression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1176:1: constantExpression : expression ;
	public final void constantExpression() throws RecognitionException {
		int constantExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1177:5: ( expression )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1177:9: expression
			{
			pushFollow(FOLLOW_expression_in_constantExpression6023);
			expression();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 101, constantExpression_StartIndex); }

		}
	}
	// $ANTLR end "constantExpression"



	// $ANTLR start "expression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1180:1: expression : conditionalExpression ( assignmentOperator expression )? ;
	public final void expression() throws RecognitionException {
		int expression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1181:5: ( conditionalExpression ( assignmentOperator expression )? )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1181:9: conditionalExpression ( assignmentOperator expression )?
			{
			pushFollow(FOLLOW_conditionalExpression_in_expression6042);
			conditionalExpression();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1181:31: ( assignmentOperator expression )?
			int alt129=2;
			switch ( input.LA(1) ) {
				case ASG:
					{
					int LA129_1 = input.LA(2);
					if ( (synpred190_JavaParser()) ) {
						alt129=1;
					}
					}
					break;
				case ASGADD:
					{
					int LA129_2 = input.LA(2);
					if ( (synpred190_JavaParser()) ) {
						alt129=1;
					}
					}
					break;
				case ASGSUB:
					{
					int LA129_3 = input.LA(2);
					if ( (synpred190_JavaParser()) ) {
						alt129=1;
					}
					}
					break;
				case ASGMUL:
					{
					int LA129_4 = input.LA(2);
					if ( (synpred190_JavaParser()) ) {
						alt129=1;
					}
					}
					break;
				case ASGDIV:
					{
					int LA129_5 = input.LA(2);
					if ( (synpred190_JavaParser()) ) {
						alt129=1;
					}
					}
					break;
				case ASGBITAND:
					{
					int LA129_6 = input.LA(2);
					if ( (synpred190_JavaParser()) ) {
						alt129=1;
					}
					}
					break;
				case ASGBITOR:
					{
					int LA129_7 = input.LA(2);
					if ( (synpred190_JavaParser()) ) {
						alt129=1;
					}
					}
					break;
				case ASGBITXOR:
					{
					int LA129_8 = input.LA(2);
					if ( (synpred190_JavaParser()) ) {
						alt129=1;
					}
					}
					break;
				case ASGREM:
					{
					int LA129_9 = input.LA(2);
					if ( (synpred190_JavaParser()) ) {
						alt129=1;
					}
					}
					break;
				case LT:
					{
					int LA129_10 = input.LA(2);
					if ( (synpred190_JavaParser()) ) {
						alt129=1;
					}
					}
					break;
				case GT:
					{
					int LA129_11 = input.LA(2);
					if ( (synpred190_JavaParser()) ) {
						alt129=1;
					}
					}
					break;
			}
			switch (alt129) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1181:32: assignmentOperator expression
					{
					pushFollow(FOLLOW_assignmentOperator_in_expression6045);
					assignmentOperator();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expression_in_expression6047);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 102, expression_StartIndex); }

		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "assignmentOperator"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1184:1: assignmentOperator : ( ASG | ASGADD | ASGSUB | ASGMUL | ASGDIV | ASGBITAND | ASGBITOR | ASGBITXOR | ASGREM | ( LT LT ASG )=>t1= LT t2= LT t3= ASG {...}?| ( GT GT GT ASG )=>t1= GT t2= GT t3= GT t4= ASG {...}?| ( GT GT ASG )=>t1= GT t2= GT t3= ASG {...}?);
	public final void assignmentOperator() throws RecognitionException {
		int assignmentOperator_StartIndex = input.index();

		Token t1=null;
		Token t2=null;
		Token t3=null;
		Token t4=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1185:5: ( ASG | ASGADD | ASGSUB | ASGMUL | ASGDIV | ASGBITAND | ASGBITOR | ASGBITXOR | ASGREM | ( LT LT ASG )=>t1= LT t2= LT t3= ASG {...}?| ( GT GT GT ASG )=>t1= GT t2= GT t3= GT t4= ASG {...}?| ( GT GT ASG )=>t1= GT t2= GT t3= ASG {...}?)
			int alt130=12;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==ASG) ) {
				alt130=1;
			}
			else if ( (LA130_0==ASGADD) ) {
				alt130=2;
			}
			else if ( (LA130_0==ASGSUB) ) {
				alt130=3;
			}
			else if ( (LA130_0==ASGMUL) ) {
				alt130=4;
			}
			else if ( (LA130_0==ASGDIV) ) {
				alt130=5;
			}
			else if ( (LA130_0==ASGBITAND) ) {
				alt130=6;
			}
			else if ( (LA130_0==ASGBITOR) ) {
				alt130=7;
			}
			else if ( (LA130_0==ASGBITXOR) ) {
				alt130=8;
			}
			else if ( (LA130_0==ASGREM) ) {
				alt130=9;
			}
			else if ( (LA130_0==LT) && (synpred200_JavaParser())) {
				alt130=10;
			}
			else if ( (LA130_0==GT) ) {
				int LA130_11 = input.LA(2);
				if ( (LA130_11==GT) ) {
					int LA130_12 = input.LA(3);
					if ( (LA130_12==GT) && (synpred201_JavaParser())) {
						alt130=11;
					}
					else if ( (LA130_12==ASG) && (synpred202_JavaParser())) {
						alt130=12;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 130, 11, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 130, 0, input);
				throw nvae;
			}

			switch (alt130) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1185:9: ASG
					{
					match(input,ASG,FOLLOW_ASG_in_assignmentOperator6068); if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1186:9: ASGADD
					{
					match(input,ASGADD,FOLLOW_ASGADD_in_assignmentOperator6078); if (state.failed) return;
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1187:9: ASGSUB
					{
					match(input,ASGSUB,FOLLOW_ASGSUB_in_assignmentOperator6088); if (state.failed) return;
					}
					break;
				case 4 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1188:9: ASGMUL
					{
					match(input,ASGMUL,FOLLOW_ASGMUL_in_assignmentOperator6098); if (state.failed) return;
					}
					break;
				case 5 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1189:9: ASGDIV
					{
					match(input,ASGDIV,FOLLOW_ASGDIV_in_assignmentOperator6108); if (state.failed) return;
					}
					break;
				case 6 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1190:9: ASGBITAND
					{
					match(input,ASGBITAND,FOLLOW_ASGBITAND_in_assignmentOperator6118); if (state.failed) return;
					}
					break;
				case 7 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1191:9: ASGBITOR
					{
					match(input,ASGBITOR,FOLLOW_ASGBITOR_in_assignmentOperator6128); if (state.failed) return;
					}
					break;
				case 8 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1192:9: ASGBITXOR
					{
					match(input,ASGBITXOR,FOLLOW_ASGBITXOR_in_assignmentOperator6138); if (state.failed) return;
					}
					break;
				case 9 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1193:9: ASGREM
					{
					match(input,ASGREM,FOLLOW_ASGREM_in_assignmentOperator6148); if (state.failed) return;
					}
					break;
				case 10 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1194:9: ( LT LT ASG )=>t1= LT t2= LT t3= ASG {...}?
					{
					t1=(Token)match(input,LT,FOLLOW_LT_in_assignmentOperator6169); if (state.failed) return;
					t2=(Token)match(input,LT,FOLLOW_LT_in_assignmentOperator6173); if (state.failed) return;
					t3=(Token)match(input,ASG,FOLLOW_ASG_in_assignmentOperator6177); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() &&
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() && 
					          t2.getLine() == t3.getLine() && 
					          t2.getCharPositionInLine() + 1 == t3.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "assignmentOperator", " $t1.getLine() == $t2.getLine() &&\n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() && \n          $t2.getLine() == $t3.getLine() && \n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() ");
					}
					}
					break;
				case 11 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1199:9: ( GT GT GT ASG )=>t1= GT t2= GT t3= GT t4= ASG {...}?
					{
					t1=(Token)match(input,GT,FOLLOW_GT_in_assignmentOperator6210); if (state.failed) return;
					t2=(Token)match(input,GT,FOLLOW_GT_in_assignmentOperator6214); if (state.failed) return;
					t3=(Token)match(input,GT,FOLLOW_GT_in_assignmentOperator6218); if (state.failed) return;
					t4=(Token)match(input,ASG,FOLLOW_ASG_in_assignmentOperator6222); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() && 
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() &&
					          t2.getLine() == t3.getLine() && 
					          t2.getCharPositionInLine() + 1 == t3.getCharPositionInLine() &&
					          t3.getLine() == t4.getLine() && 
					          t3.getCharPositionInLine() + 1 == t4.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "assignmentOperator", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() &&\n          $t2.getLine() == $t3.getLine() && \n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() &&\n          $t3.getLine() == $t4.getLine() && \n          $t3.getCharPositionInLine() + 1 == $t4.getCharPositionInLine() ");
					}
					}
					break;
				case 12 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1206:9: ( GT GT ASG )=>t1= GT t2= GT t3= ASG {...}?
					{
					t1=(Token)match(input,GT,FOLLOW_GT_in_assignmentOperator6253); if (state.failed) return;
					t2=(Token)match(input,GT,FOLLOW_GT_in_assignmentOperator6257); if (state.failed) return;
					t3=(Token)match(input,ASG,FOLLOW_ASG_in_assignmentOperator6261); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() && 
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() && 
					          t2.getLine() == t3.getLine() && 
					          t2.getCharPositionInLine() + 1 == t3.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "assignmentOperator", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() && \n          $t2.getLine() == $t3.getLine() && \n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() ");
					}
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 103, assignmentOperator_StartIndex); }

		}
	}
	// $ANTLR end "assignmentOperator"



	// $ANTLR start "conditionalExpression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1213:1: conditionalExpression : conditionalOrExpression ( QUESTIONMARK expression COLON expression )? ;
	public final void conditionalExpression() throws RecognitionException {
		int conditionalExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1214:5: ( conditionalOrExpression ( QUESTIONMARK expression COLON expression )? )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1214:9: conditionalOrExpression ( QUESTIONMARK expression COLON expression )?
			{
			pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression6290);
			conditionalOrExpression();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1214:33: ( QUESTIONMARK expression COLON expression )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==QUESTIONMARK) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1214:35: QUESTIONMARK expression COLON expression
					{
					match(input,QUESTIONMARK,FOLLOW_QUESTIONMARK_in_conditionalExpression6294); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_conditionalExpression6296);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,COLON,FOLLOW_COLON_in_conditionalExpression6298); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_conditionalExpression6300);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 104, conditionalExpression_StartIndex); }

		}
	}
	// $ANTLR end "conditionalExpression"



	// $ANTLR start "conditionalOrExpression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1217:1: conditionalOrExpression : conditionalAndExpression ( OR conditionalAndExpression )* ;
	public final void conditionalOrExpression() throws RecognitionException {
		int conditionalOrExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1218:5: ( conditionalAndExpression ( OR conditionalAndExpression )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1218:9: conditionalAndExpression ( OR conditionalAndExpression )*
			{
			pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression6322);
			conditionalAndExpression();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1218:34: ( OR conditionalAndExpression )*
			loop132:
			while (true) {
				int alt132=2;
				int LA132_0 = input.LA(1);
				if ( (LA132_0==OR) ) {
					alt132=1;
				}

				switch (alt132) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1218:36: OR conditionalAndExpression
					{
					match(input,OR,FOLLOW_OR_in_conditionalOrExpression6326); if (state.failed) return;
					pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression6328);
					conditionalAndExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop132;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 105, conditionalOrExpression_StartIndex); }

		}
	}
	// $ANTLR end "conditionalOrExpression"



	// $ANTLR start "conditionalAndExpression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1221:1: conditionalAndExpression : inclusiveOrExpression ( AND inclusiveOrExpression )* ;
	public final void conditionalAndExpression() throws RecognitionException {
		int conditionalAndExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1222:5: ( inclusiveOrExpression ( AND inclusiveOrExpression )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1222:9: inclusiveOrExpression ( AND inclusiveOrExpression )*
			{
			pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression6350);
			inclusiveOrExpression();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1222:31: ( AND inclusiveOrExpression )*
			loop133:
			while (true) {
				int alt133=2;
				int LA133_0 = input.LA(1);
				if ( (LA133_0==AND) ) {
					alt133=1;
				}

				switch (alt133) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1222:33: AND inclusiveOrExpression
					{
					match(input,AND,FOLLOW_AND_in_conditionalAndExpression6354); if (state.failed) return;
					pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression6356);
					inclusiveOrExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop133;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 106, conditionalAndExpression_StartIndex); }

		}
	}
	// $ANTLR end "conditionalAndExpression"



	// $ANTLR start "inclusiveOrExpression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1225:1: inclusiveOrExpression : exclusiveOrExpression ( BITOR exclusiveOrExpression )* ;
	public final void inclusiveOrExpression() throws RecognitionException {
		int inclusiveOrExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1226:5: ( exclusiveOrExpression ( BITOR exclusiveOrExpression )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1226:9: exclusiveOrExpression ( BITOR exclusiveOrExpression )*
			{
			pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression6378);
			exclusiveOrExpression();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1226:31: ( BITOR exclusiveOrExpression )*
			loop134:
			while (true) {
				int alt134=2;
				int LA134_0 = input.LA(1);
				if ( (LA134_0==BITOR) ) {
					alt134=1;
				}

				switch (alt134) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1226:33: BITOR exclusiveOrExpression
					{
					match(input,BITOR,FOLLOW_BITOR_in_inclusiveOrExpression6382); if (state.failed) return;
					pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression6384);
					exclusiveOrExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop134;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 107, inclusiveOrExpression_StartIndex); }

		}
	}
	// $ANTLR end "inclusiveOrExpression"



	// $ANTLR start "exclusiveOrExpression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1229:1: exclusiveOrExpression : andExpression ( BITXOR andExpression )* ;
	public final void exclusiveOrExpression() throws RecognitionException {
		int exclusiveOrExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1230:5: ( andExpression ( BITXOR andExpression )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1230:9: andExpression ( BITXOR andExpression )*
			{
			pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression6406);
			andExpression();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1230:23: ( BITXOR andExpression )*
			loop135:
			while (true) {
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==BITXOR) ) {
					alt135=1;
				}

				switch (alt135) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1230:25: BITXOR andExpression
					{
					match(input,BITXOR,FOLLOW_BITXOR_in_exclusiveOrExpression6410); if (state.failed) return;
					pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression6412);
					andExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop135;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 108, exclusiveOrExpression_StartIndex); }

		}
	}
	// $ANTLR end "exclusiveOrExpression"



	// $ANTLR start "andExpression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1233:1: andExpression : equalityExpression ( BITAND equalityExpression )* ;
	public final void andExpression() throws RecognitionException {
		int andExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1234:5: ( equalityExpression ( BITAND equalityExpression )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1234:9: equalityExpression ( BITAND equalityExpression )*
			{
			pushFollow(FOLLOW_equalityExpression_in_andExpression6434);
			equalityExpression();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1234:28: ( BITAND equalityExpression )*
			loop136:
			while (true) {
				int alt136=2;
				int LA136_0 = input.LA(1);
				if ( (LA136_0==BITAND) ) {
					alt136=1;
				}

				switch (alt136) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1234:30: BITAND equalityExpression
					{
					match(input,BITAND,FOLLOW_BITAND_in_andExpression6438); if (state.failed) return;
					pushFollow(FOLLOW_equalityExpression_in_andExpression6440);
					equalityExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop136;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 109, andExpression_StartIndex); }

		}
	}
	// $ANTLR end "andExpression"



	// $ANTLR start "equalityExpression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1237:1: equalityExpression : instanceOfExpression ( ( EQ | NE ) instanceOfExpression )* ;
	public final void equalityExpression() throws RecognitionException {
		int equalityExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1238:5: ( instanceOfExpression ( ( EQ | NE ) instanceOfExpression )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1238:9: instanceOfExpression ( ( EQ | NE ) instanceOfExpression )*
			{
			pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression6462);
			instanceOfExpression();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1238:30: ( ( EQ | NE ) instanceOfExpression )*
			loop137:
			while (true) {
				int alt137=2;
				int LA137_0 = input.LA(1);
				if ( (LA137_0==EQ||LA137_0==NE) ) {
					alt137=1;
				}

				switch (alt137) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1238:32: ( EQ | NE ) instanceOfExpression
					{
					if ( input.LA(1)==EQ||input.LA(1)==NE ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression6474);
					instanceOfExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop137;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 110, equalityExpression_StartIndex); }

		}
	}
	// $ANTLR end "equalityExpression"



	// $ANTLR start "instanceOfExpression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1241:1: instanceOfExpression : relationalExpression ( INSTANCEOF type )? ;
	public final void instanceOfExpression() throws RecognitionException {
		int instanceOfExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1242:5: ( relationalExpression ( INSTANCEOF type )? )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1242:9: relationalExpression ( INSTANCEOF type )?
			{
			pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression6496);
			relationalExpression();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1242:30: ( INSTANCEOF type )?
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==INSTANCEOF) ) {
				alt138=1;
			}
			switch (alt138) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1242:31: INSTANCEOF type
					{
					match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_instanceOfExpression6499); if (state.failed) return;
					pushFollow(FOLLOW_type_in_instanceOfExpression6501);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 111, instanceOfExpression_StartIndex); }

		}
	}
	// $ANTLR end "instanceOfExpression"



	// $ANTLR start "relationalExpression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1245:1: relationalExpression : shiftExpression ( relationalOp shiftExpression )* ;
	public final void relationalExpression() throws RecognitionException {
		int relationalExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1246:5: ( shiftExpression ( relationalOp shiftExpression )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1246:9: shiftExpression ( relationalOp shiftExpression )*
			{
			pushFollow(FOLLOW_shiftExpression_in_relationalExpression6522);
			shiftExpression();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1246:25: ( relationalOp shiftExpression )*
			loop139:
			while (true) {
				int alt139=2;
				int LA139_0 = input.LA(1);
				if ( (LA139_0==LT) ) {
					int LA139_2 = input.LA(2);
					if ( (LA139_2==ADD||LA139_2==ASG||LA139_2==BITNOT||LA139_2==BOOLEAN||LA139_2==BYTE||LA139_2==CHAR||(LA139_2 >= CharacterLiteral && LA139_2 <= DEC)||(LA139_2 >= DOUBLE && LA139_2 <= DecimalLiteral)||LA139_2==FALSE||LA139_2==FLOAT||LA139_2==FloatingPointLiteral||LA139_2==HexLiteral||LA139_2==INC||LA139_2==INT||LA139_2==Identifier||(LA139_2 >= LONG && LA139_2 <= LPAREN)||(LA139_2 >= NEW && LA139_2 <= NULL)||LA139_2==OctalLiteral||LA139_2==SHORT||(LA139_2 >= SUB && LA139_2 <= SUPER)||(LA139_2 >= StringLiteral && LA139_2 <= THIS)||LA139_2==TRUE||LA139_2==VOID) ) {
						alt139=1;
					}

				}
				else if ( (LA139_0==GT) ) {
					int LA139_3 = input.LA(2);
					if ( (LA139_3==ADD||LA139_3==ASG||LA139_3==BITNOT||LA139_3==BOOLEAN||LA139_3==BYTE||LA139_3==CHAR||(LA139_3 >= CharacterLiteral && LA139_3 <= DEC)||(LA139_3 >= DOUBLE && LA139_3 <= DecimalLiteral)||LA139_3==FALSE||LA139_3==FLOAT||LA139_3==FloatingPointLiteral||LA139_3==HexLiteral||LA139_3==INC||LA139_3==INT||LA139_3==Identifier||(LA139_3 >= LONG && LA139_3 <= LPAREN)||(LA139_3 >= NEW && LA139_3 <= NULL)||LA139_3==OctalLiteral||LA139_3==SHORT||(LA139_3 >= SUB && LA139_3 <= SUPER)||(LA139_3 >= StringLiteral && LA139_3 <= THIS)||LA139_3==TRUE||LA139_3==VOID) ) {
						alt139=1;
					}

				}

				switch (alt139) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1246:27: relationalOp shiftExpression
					{
					pushFollow(FOLLOW_relationalOp_in_relationalExpression6526);
					relationalOp();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_shiftExpression_in_relationalExpression6528);
					shiftExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop139;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 112, relationalExpression_StartIndex); }

		}
	}
	// $ANTLR end "relationalExpression"



	// $ANTLR start "relationalOp"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1249:1: relationalOp : ( ( LT ASG )=>t1= LT t2= ASG {...}?| ( GT ASG )=>t1= GT t2= ASG {...}?| LT | GT );
	public final void relationalOp() throws RecognitionException {
		int relationalOp_StartIndex = input.index();

		Token t1=null;
		Token t2=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1250:5: ( ( LT ASG )=>t1= LT t2= ASG {...}?| ( GT ASG )=>t1= GT t2= ASG {...}?| LT | GT )
			int alt140=4;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==LT) ) {
				int LA140_1 = input.LA(2);
				if ( (LA140_1==ASG) && (synpred213_JavaParser())) {
					alt140=1;
				}
				else if ( (LA140_1==ADD||LA140_1==BITNOT||LA140_1==BOOLEAN||LA140_1==BYTE||LA140_1==CHAR||(LA140_1 >= CharacterLiteral && LA140_1 <= DEC)||(LA140_1 >= DOUBLE && LA140_1 <= DecimalLiteral)||LA140_1==FALSE||LA140_1==FLOAT||LA140_1==FloatingPointLiteral||LA140_1==HexLiteral||LA140_1==INC||LA140_1==INT||LA140_1==Identifier||(LA140_1 >= LONG && LA140_1 <= LPAREN)||(LA140_1 >= NEW && LA140_1 <= NULL)||LA140_1==OctalLiteral||LA140_1==SHORT||(LA140_1 >= SUB && LA140_1 <= SUPER)||(LA140_1 >= StringLiteral && LA140_1 <= THIS)||LA140_1==TRUE||LA140_1==VOID) ) {
					alt140=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 140, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA140_0==GT) ) {
				int LA140_2 = input.LA(2);
				if ( (LA140_2==ASG) && (synpred214_JavaParser())) {
					alt140=2;
				}
				else if ( (LA140_2==ADD||LA140_2==BITNOT||LA140_2==BOOLEAN||LA140_2==BYTE||LA140_2==CHAR||(LA140_2 >= CharacterLiteral && LA140_2 <= DEC)||(LA140_2 >= DOUBLE && LA140_2 <= DecimalLiteral)||LA140_2==FALSE||LA140_2==FLOAT||LA140_2==FloatingPointLiteral||LA140_2==HexLiteral||LA140_2==INC||LA140_2==INT||LA140_2==Identifier||(LA140_2 >= LONG && LA140_2 <= LPAREN)||(LA140_2 >= NEW && LA140_2 <= NULL)||LA140_2==OctalLiteral||LA140_2==SHORT||(LA140_2 >= SUB && LA140_2 <= SUPER)||(LA140_2 >= StringLiteral && LA140_2 <= THIS)||LA140_2==TRUE||LA140_2==VOID) ) {
					alt140=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 140, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 140, 0, input);
				throw nvae;
			}

			switch (alt140) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1250:9: ( LT ASG )=>t1= LT t2= ASG {...}?
					{
					t1=(Token)match(input,LT,FOLLOW_LT_in_relationalOp6559); if (state.failed) return;
					t2=(Token)match(input,ASG,FOLLOW_ASG_in_relationalOp6563); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() && 
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "relationalOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
					}
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1253:9: ( GT ASG )=>t1= GT t2= ASG {...}?
					{
					t1=(Token)match(input,GT,FOLLOW_GT_in_relationalOp6592); if (state.failed) return;
					t2=(Token)match(input,ASG,FOLLOW_ASG_in_relationalOp6596); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() && 
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "relationalOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
					}
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1256:9: LT
					{
					match(input,LT,FOLLOW_LT_in_relationalOp6616); if (state.failed) return;
					}
					break;
				case 4 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1257:9: GT
					{
					match(input,GT,FOLLOW_GT_in_relationalOp6626); if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 113, relationalOp_StartIndex); }

		}
	}
	// $ANTLR end "relationalOp"



	// $ANTLR start "shiftExpression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1260:1: shiftExpression : additiveExpression ( shiftOp additiveExpression )* ;
	public final void shiftExpression() throws RecognitionException {
		int shiftExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1261:5: ( additiveExpression ( shiftOp additiveExpression )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1261:9: additiveExpression ( shiftOp additiveExpression )*
			{
			pushFollow(FOLLOW_additiveExpression_in_shiftExpression6645);
			additiveExpression();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1261:28: ( shiftOp additiveExpression )*
			loop141:
			while (true) {
				int alt141=2;
				int LA141_0 = input.LA(1);
				if ( (LA141_0==LT) ) {
					int LA141_1 = input.LA(2);
					if ( (LA141_1==LT) ) {
						int LA141_4 = input.LA(3);
						if ( (LA141_4==ADD||LA141_4==BITNOT||LA141_4==BOOLEAN||LA141_4==BYTE||LA141_4==CHAR||(LA141_4 >= CharacterLiteral && LA141_4 <= DEC)||(LA141_4 >= DOUBLE && LA141_4 <= DecimalLiteral)||LA141_4==FALSE||LA141_4==FLOAT||LA141_4==FloatingPointLiteral||LA141_4==HexLiteral||LA141_4==INC||LA141_4==INT||LA141_4==Identifier||(LA141_4 >= LONG && LA141_4 <= LPAREN)||(LA141_4 >= NEW && LA141_4 <= NULL)||LA141_4==OctalLiteral||LA141_4==SHORT||(LA141_4 >= SUB && LA141_4 <= SUPER)||(LA141_4 >= StringLiteral && LA141_4 <= THIS)||LA141_4==TRUE||LA141_4==VOID) ) {
							alt141=1;
						}

					}

				}
				else if ( (LA141_0==GT) ) {
					int LA141_2 = input.LA(2);
					if ( (LA141_2==GT) ) {
						int LA141_5 = input.LA(3);
						if ( (LA141_5==GT) ) {
							int LA141_7 = input.LA(4);
							if ( (LA141_7==ADD||LA141_7==BITNOT||LA141_7==BOOLEAN||LA141_7==BYTE||LA141_7==CHAR||(LA141_7 >= CharacterLiteral && LA141_7 <= DEC)||(LA141_7 >= DOUBLE && LA141_7 <= DecimalLiteral)||LA141_7==FALSE||LA141_7==FLOAT||LA141_7==FloatingPointLiteral||LA141_7==HexLiteral||LA141_7==INC||LA141_7==INT||LA141_7==Identifier||(LA141_7 >= LONG && LA141_7 <= LPAREN)||(LA141_7 >= NEW && LA141_7 <= NULL)||LA141_7==OctalLiteral||LA141_7==SHORT||(LA141_7 >= SUB && LA141_7 <= SUPER)||(LA141_7 >= StringLiteral && LA141_7 <= THIS)||LA141_7==TRUE||LA141_7==VOID) ) {
								alt141=1;
							}

						}
						else if ( (LA141_5==ADD||LA141_5==BITNOT||LA141_5==BOOLEAN||LA141_5==BYTE||LA141_5==CHAR||(LA141_5 >= CharacterLiteral && LA141_5 <= DEC)||(LA141_5 >= DOUBLE && LA141_5 <= DecimalLiteral)||LA141_5==FALSE||LA141_5==FLOAT||LA141_5==FloatingPointLiteral||LA141_5==HexLiteral||LA141_5==INC||LA141_5==INT||LA141_5==Identifier||(LA141_5 >= LONG && LA141_5 <= LPAREN)||(LA141_5 >= NEW && LA141_5 <= NULL)||LA141_5==OctalLiteral||LA141_5==SHORT||(LA141_5 >= SUB && LA141_5 <= SUPER)||(LA141_5 >= StringLiteral && LA141_5 <= THIS)||LA141_5==TRUE||LA141_5==VOID) ) {
							alt141=1;
						}

					}

				}

				switch (alt141) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1261:30: shiftOp additiveExpression
					{
					pushFollow(FOLLOW_shiftOp_in_shiftExpression6649);
					shiftOp();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_additiveExpression_in_shiftExpression6651);
					additiveExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop141;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 114, shiftExpression_StartIndex); }

		}
	}
	// $ANTLR end "shiftExpression"



	// $ANTLR start "shiftOp"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1264:1: shiftOp : ( ( LT LT )=>t1= LT t2= LT {...}?| ( GT GT GT )=>t1= GT t2= GT t3= GT {...}?| ( GT GT )=>t1= GT t2= GT {...}?);
	public final void shiftOp() throws RecognitionException {
		int shiftOp_StartIndex = input.index();

		Token t1=null;
		Token t2=null;
		Token t3=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1265:5: ( ( LT LT )=>t1= LT t2= LT {...}?| ( GT GT GT )=>t1= GT t2= GT t3= GT {...}?| ( GT GT )=>t1= GT t2= GT {...}?)
			int alt142=3;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==LT) && (synpred217_JavaParser())) {
				alt142=1;
			}
			else if ( (LA142_0==GT) ) {
				int LA142_2 = input.LA(2);
				if ( (LA142_2==GT) ) {
					int LA142_3 = input.LA(3);
					if ( (LA142_3==GT) && (synpred218_JavaParser())) {
						alt142=2;
					}
					else if ( (LA142_3==ADD) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==SUB) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==INC) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==DEC) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==BITNOT) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==NOT) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==LPAREN) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==THIS) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==SUPER) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==DecimalLiteral||LA142_3==HexLiteral||LA142_3==OctalLiteral) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==FloatingPointLiteral) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==CharacterLiteral) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==StringLiteral) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==FALSE||LA142_3==TRUE) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==NULL) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==NEW) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==Identifier) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==BOOLEAN) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==CHAR) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==BYTE) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==SHORT) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==INT) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==LONG) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==FLOAT) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==DOUBLE) && (synpred219_JavaParser())) {
						alt142=3;
					}
					else if ( (LA142_3==VOID) && (synpred219_JavaParser())) {
						alt142=3;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 142, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 142, 0, input);
				throw nvae;
			}

			switch (alt142) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1265:9: ( LT LT )=>t1= LT t2= LT {...}?
					{
					t1=(Token)match(input,LT,FOLLOW_LT_in_shiftOp6682); if (state.failed) return;
					t2=(Token)match(input,LT,FOLLOW_LT_in_shiftOp6686); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() && 
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "shiftOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
					}
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1268:9: ( GT GT GT )=>t1= GT t2= GT t3= GT {...}?
					{
					t1=(Token)match(input,GT,FOLLOW_GT_in_shiftOp6717); if (state.failed) return;
					t2=(Token)match(input,GT,FOLLOW_GT_in_shiftOp6721); if (state.failed) return;
					t3=(Token)match(input,GT,FOLLOW_GT_in_shiftOp6725); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() && 
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() &&
					          t2.getLine() == t3.getLine() && 
					          t2.getCharPositionInLine() + 1 == t3.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "shiftOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() &&\n          $t2.getLine() == $t3.getLine() && \n          $t2.getCharPositionInLine() + 1 == $t3.getCharPositionInLine() ");
					}
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1273:9: ( GT GT )=>t1= GT t2= GT {...}?
					{
					t1=(Token)match(input,GT,FOLLOW_GT_in_shiftOp6754); if (state.failed) return;
					t2=(Token)match(input,GT,FOLLOW_GT_in_shiftOp6758); if (state.failed) return;
					if ( !(( t1.getLine() == t2.getLine() && 
					          t1.getCharPositionInLine() + 1 == t2.getCharPositionInLine() )) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "shiftOp", " $t1.getLine() == $t2.getLine() && \n          $t1.getCharPositionInLine() + 1 == $t2.getCharPositionInLine() ");
					}
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 115, shiftOp_StartIndex); }

		}
	}
	// $ANTLR end "shiftOp"



	// $ANTLR start "additiveExpression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1279:1: additiveExpression : multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* ;
	public final void additiveExpression() throws RecognitionException {
		int additiveExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1280:5: ( multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1280:9: multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )*
			{
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression6788);
			multiplicativeExpression();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1280:34: ( ( ADD | SUB ) multiplicativeExpression )*
			loop143:
			while (true) {
				int alt143=2;
				int LA143_0 = input.LA(1);
				if ( (LA143_0==ADD||LA143_0==SUB) ) {
					alt143=1;
				}

				switch (alt143) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1280:36: ( ADD | SUB ) multiplicativeExpression
					{
					if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression6800);
					multiplicativeExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop143;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 116, additiveExpression_StartIndex); }

		}
	}
	// $ANTLR end "additiveExpression"



	// $ANTLR start "multiplicativeExpression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1283:1: multiplicativeExpression : unaryExpression ( ( MUL | DIV | REM ) unaryExpression )* ;
	public final void multiplicativeExpression() throws RecognitionException {
		int multiplicativeExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1284:5: ( unaryExpression ( ( MUL | DIV | REM ) unaryExpression )* )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1284:9: unaryExpression ( ( MUL | DIV | REM ) unaryExpression )*
			{
			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression6822);
			unaryExpression();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1284:25: ( ( MUL | DIV | REM ) unaryExpression )*
			loop144:
			while (true) {
				int alt144=2;
				int LA144_0 = input.LA(1);
				if ( (LA144_0==DIV||LA144_0==MUL||LA144_0==REM) ) {
					alt144=1;
				}

				switch (alt144) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1284:27: ( MUL | DIV | REM ) unaryExpression
					{
					if ( input.LA(1)==DIV||input.LA(1)==MUL||input.LA(1)==REM ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression6840);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop144;
				}
			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 117, multiplicativeExpression_StartIndex); }

		}
	}
	// $ANTLR end "multiplicativeExpression"



	// $ANTLR start "unaryExpression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1287:1: unaryExpression : ( ADD unaryExpression | SUB unaryExpression | INC unaryExpression | DEC unaryExpression | unaryExpressionNotPlusMinus );
	public final void unaryExpression() throws RecognitionException {
		int unaryExpression_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1288:5: ( ADD unaryExpression | SUB unaryExpression | INC unaryExpression | DEC unaryExpression | unaryExpressionNotPlusMinus )
			int alt145=5;
			switch ( input.LA(1) ) {
			case ADD:
				{
				alt145=1;
				}
				break;
			case SUB:
				{
				alt145=2;
				}
				break;
			case INC:
				{
				alt145=3;
				}
				break;
			case DEC:
				{
				alt145=4;
				}
				break;
			case BITNOT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CharacterLiteral:
			case DOUBLE:
			case DecimalLiteral:
			case FALSE:
			case FLOAT:
			case FloatingPointLiteral:
			case HexLiteral:
			case INT:
			case Identifier:
			case LONG:
			case LPAREN:
			case NEW:
			case NOT:
			case NULL:
			case OctalLiteral:
			case SHORT:
			case SUPER:
			case StringLiteral:
			case THIS:
			case TRUE:
			case VOID:
				{
				alt145=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 145, 0, input);
				throw nvae;
			}
			switch (alt145) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1288:9: ADD unaryExpression
					{
					match(input,ADD,FOLLOW_ADD_in_unaryExpression6862); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression6864);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1289:9: SUB unaryExpression
					{
					match(input,SUB,FOLLOW_SUB_in_unaryExpression6874); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression6876);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1290:9: INC unaryExpression
					{
					match(input,INC,FOLLOW_INC_in_unaryExpression6886); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression6888);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1291:9: DEC unaryExpression
					{
					match(input,DEC,FOLLOW_DEC_in_unaryExpression6898); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression6900);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1292:9: unaryExpressionNotPlusMinus
					{
					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression6910);
					unaryExpressionNotPlusMinus();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 118, unaryExpression_StartIndex); }

		}
	}
	// $ANTLR end "unaryExpression"



	// $ANTLR start "unaryExpressionNotPlusMinus"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1295:1: unaryExpressionNotPlusMinus : ( BITNOT unaryExpression | NOT unaryExpression | castExpression | primary ( selector )* ( INC | DEC )? );
	public final void unaryExpressionNotPlusMinus() throws RecognitionException {
		int unaryExpressionNotPlusMinus_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1296:5: ( BITNOT unaryExpression | NOT unaryExpression | castExpression | primary ( selector )* ( INC | DEC )? )
			int alt148=4;
			switch ( input.LA(1) ) {
			case BITNOT:
				{
				alt148=1;
				}
				break;
			case NOT:
				{
				alt148=2;
				}
				break;
			case LPAREN:
				{
				int LA148_3 = input.LA(2);
				if ( (synpred231_JavaParser()) ) {
					alt148=3;
				}
				else if ( (true) ) {
					alt148=4;
				}

				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CharacterLiteral:
			case DOUBLE:
			case DecimalLiteral:
			case FALSE:
			case FLOAT:
			case FloatingPointLiteral:
			case HexLiteral:
			case INT:
			case Identifier:
			case LONG:
			case NEW:
			case NULL:
			case OctalLiteral:
			case SHORT:
			case SUPER:
			case StringLiteral:
			case THIS:
			case TRUE:
			case VOID:
				{
				alt148=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 148, 0, input);
				throw nvae;
			}
			switch (alt148) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1296:9: BITNOT unaryExpression
					{
					match(input,BITNOT,FOLLOW_BITNOT_in_unaryExpressionNotPlusMinus6929); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus6931);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1297:9: NOT unaryExpression
					{
					match(input,NOT,FOLLOW_NOT_in_unaryExpressionNotPlusMinus6941); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus6943);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1298:9: castExpression
					{
					pushFollow(FOLLOW_castExpression_in_unaryExpressionNotPlusMinus6953);
					castExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1299:9: primary ( selector )* ( INC | DEC )?
					{
					pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus6963);
					primary();
					state._fsp--;
					if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1299:17: ( selector )*
					loop146:
					while (true) {
						int alt146=2;
						int LA146_0 = input.LA(1);
						if ( (LA146_0==DOT||LA146_0==LBRACKET) ) {
							alt146=1;
						}

						switch (alt146) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1299:17: selector
							{
							pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus6965);
							selector();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop146;
						}
					}

					// edu/ua/cs/taser/extract/java/JavaParser.g:1299:27: ( INC | DEC )?
					int alt147=2;
					int LA147_0 = input.LA(1);
					if ( (LA147_0==DEC||LA147_0==INC) ) {
						alt147=1;
					}
					switch (alt147) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:
							{
							if ( input.LA(1)==DEC||input.LA(1)==INC ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 119, unaryExpressionNotPlusMinus_StartIndex); }

		}
	}
	// $ANTLR end "unaryExpressionNotPlusMinus"



	// $ANTLR start "castExpression"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1302:1: castExpression : (o= LPAREN primitiveType c= RPAREN unaryExpression |o= LPAREN ( type | expression ) c= RPAREN unaryExpressionNotPlusMinus );
	public final void castExpression() throws RecognitionException {
		int castExpression_StartIndex = input.index();

		Token o=null;
		Token c=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1303:5: (o= LPAREN primitiveType c= RPAREN unaryExpression |o= LPAREN ( type | expression ) c= RPAREN unaryExpressionNotPlusMinus )
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==LPAREN) ) {
				int LA150_1 = input.LA(2);
				if ( (synpred235_JavaParser()) ) {
					alt150=1;
				}
				else if ( (true) ) {
					alt150=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 150, 0, input);
				throw nvae;
			}

			switch (alt150) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1303:9: o= LPAREN primitiveType c= RPAREN unaryExpression
					{
					o=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_castExpression6994); if (state.failed) return;
					pushFollow(FOLLOW_primitiveType_in_castExpression6996);
					primitiveType();
					state._fsp--;
					if (state.failed) return;
					c=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_castExpression7000); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpression_in_castExpression7002);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1304:9: o= LPAREN ( type | expression ) c= RPAREN unaryExpressionNotPlusMinus
					{
					o=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_castExpression7014); if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1304:18: ( type | expression )
					int alt149=2;
					alt149 = dfa149.predict(input);
					switch (alt149) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1304:19: type
							{
							pushFollow(FOLLOW_type_in_castExpression7017);
							type();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1304:26: expression
							{
							pushFollow(FOLLOW_expression_in_castExpression7021);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					c=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_castExpression7026); if (state.failed) return;
					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_castExpression7028);
					unaryExpressionNotPlusMinus();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 120, castExpression_StartIndex); }

		}
	}
	// $ANTLR end "castExpression"



	// $ANTLR start "primary"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1307:1: primary : ( parExpression | THIS ( DOT i= Identifier )* ( identifierSuffix )? | SUPER superSuffix | literal | NEW creator |i= Identifier ( DOT j= Identifier )* ( identifierSuffix )? | primitiveType ( LBRACKET RBRACKET )* DOT CLASS | VOID DOT CLASS );
	public final void primary() throws RecognitionException {
		int primary_StartIndex = input.index();

		Token i=null;
		Token j=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1308:5: ( parExpression | THIS ( DOT i= Identifier )* ( identifierSuffix )? | SUPER superSuffix | literal | NEW creator |i= Identifier ( DOT j= Identifier )* ( identifierSuffix )? | primitiveType ( LBRACKET RBRACKET )* DOT CLASS | VOID DOT CLASS )
			int alt156=8;
			switch ( input.LA(1) ) {
			case LPAREN:
				{
				alt156=1;
				}
				break;
			case THIS:
				{
				alt156=2;
				}
				break;
			case SUPER:
				{
				alt156=3;
				}
				break;
			case CharacterLiteral:
			case DecimalLiteral:
			case FALSE:
			case FloatingPointLiteral:
			case HexLiteral:
			case NULL:
			case OctalLiteral:
			case StringLiteral:
			case TRUE:
				{
				alt156=4;
				}
				break;
			case NEW:
				{
				alt156=5;
				}
				break;
			case Identifier:
				{
				alt156=6;
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				{
				alt156=7;
				}
				break;
			case VOID:
				{
				alt156=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 156, 0, input);
				throw nvae;
			}
			switch (alt156) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1308:9: parExpression
					{
					pushFollow(FOLLOW_parExpression_in_primary7047);
					parExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1309:9: THIS ( DOT i= Identifier )* ( identifierSuffix )?
					{
					match(input,THIS,FOLLOW_THIS_in_primary7057); if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1309:14: ( DOT i= Identifier )*
					loop151:
					while (true) {
						int alt151=2;
						int LA151_0 = input.LA(1);
						if ( (LA151_0==DOT) ) {
							int LA151_2 = input.LA(2);
							if ( (LA151_2==Identifier) ) {
								int LA151_3 = input.LA(3);
								if ( (synpred238_JavaParser()) ) {
									alt151=1;
								}

							}

						}

						switch (alt151) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1309:15: DOT i= Identifier
							{
							match(input,DOT,FOLLOW_DOT_in_primary7060); if (state.failed) return;
							i=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary7064); if (state.failed) return;
							if ( state.backtracking==0 ) {
							            JavaToken token = makeToken(i, TokenType.QUALIFIED_NAME_REF, Stacks.top(entityStack));
							            addToken(token);
							            }
							}
							break;

						default :
							break loop151;
						}
					}

					// edu/ua/cs/taser/extract/java/JavaParser.g:1314:12: ( identifierSuffix )?
					int alt152=2;
					switch ( input.LA(1) ) {
						case LBRACKET:
							{
							int LA152_1 = input.LA(2);
							if ( (synpred239_JavaParser()) ) {
								alt152=1;
							}
							}
							break;
						case LPAREN:
							{
							alt152=1;
							}
							break;
						case DOT:
							{
							int LA152_3 = input.LA(2);
							if ( (synpred239_JavaParser()) ) {
								alt152=1;
							}
							}
							break;
					}
					switch (alt152) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1314:12: identifierSuffix
							{
							pushFollow(FOLLOW_identifierSuffix_in_primary7091);
							identifierSuffix();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1315:9: SUPER superSuffix
					{
					match(input,SUPER,FOLLOW_SUPER_in_primary7102); if (state.failed) return;
					pushFollow(FOLLOW_superSuffix_in_primary7104);
					superSuffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1316:9: literal
					{
					pushFollow(FOLLOW_literal_in_primary7114);
					literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1317:9: NEW creator
					{
					match(input,NEW,FOLLOW_NEW_in_primary7124); if (state.failed) return;
					pushFollow(FOLLOW_creator_in_primary7126);
					creator();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1318:9: i= Identifier ( DOT j= Identifier )* ( identifierSuffix )?
					{
					i=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary7138); if (state.failed) return;
					if ( state.backtracking==0 ) {
					            addToken(makeToken(i, TokenType.PRIMARY_NAME_REF, Stacks.top(entityStack)));
					            }
					// edu/ua/cs/taser/extract/java/JavaParser.g:1322:9: ( DOT j= Identifier )*
					loop153:
					while (true) {
						int alt153=2;
						int LA153_0 = input.LA(1);
						if ( (LA153_0==DOT) ) {
							int LA153_2 = input.LA(2);
							if ( (LA153_2==Identifier) ) {
								int LA153_3 = input.LA(3);
								if ( (synpred244_JavaParser()) ) {
									alt153=1;
								}

							}

						}

						switch (alt153) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1322:10: DOT j= Identifier
							{
							match(input,DOT,FOLLOW_DOT_in_primary7163); if (state.failed) return;
							j=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary7167); if (state.failed) return;
							if ( state.backtracking==0 ) {
							            JavaToken token = makeToken(j, TokenType.QUALIFIED_NAME_REF, Stacks.top(entityStack));
							            addToken(token);
							            }
							}
							break;

						default :
							break loop153;
						}
					}

					// edu/ua/cs/taser/extract/java/JavaParser.g:1327:12: ( identifierSuffix )?
					int alt154=2;
					switch ( input.LA(1) ) {
						case LBRACKET:
							{
							int LA154_1 = input.LA(2);
							if ( (synpred245_JavaParser()) ) {
								alt154=1;
							}
							}
							break;
						case LPAREN:
							{
							alt154=1;
							}
							break;
						case DOT:
							{
							int LA154_3 = input.LA(2);
							if ( (synpred245_JavaParser()) ) {
								alt154=1;
							}
							}
							break;
					}
					switch (alt154) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1327:12: identifierSuffix
							{
							pushFollow(FOLLOW_identifierSuffix_in_primary7194);
							identifierSuffix();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 7 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1328:9: primitiveType ( LBRACKET RBRACKET )* DOT CLASS
					{
					pushFollow(FOLLOW_primitiveType_in_primary7205);
					primitiveType();
					state._fsp--;
					if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1328:23: ( LBRACKET RBRACKET )*
					loop155:
					while (true) {
						int alt155=2;
						int LA155_0 = input.LA(1);
						if ( (LA155_0==LBRACKET) ) {
							alt155=1;
						}

						switch (alt155) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1328:24: LBRACKET RBRACKET
							{
							match(input,LBRACKET,FOLLOW_LBRACKET_in_primary7208); if (state.failed) return;
							match(input,RBRACKET,FOLLOW_RBRACKET_in_primary7210); if (state.failed) return;
							}
							break;

						default :
							break loop155;
						}
					}

					match(input,DOT,FOLLOW_DOT_in_primary7214); if (state.failed) return;
					match(input,CLASS,FOLLOW_CLASS_in_primary7216); if (state.failed) return;
					}
					break;
				case 8 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1329:9: VOID DOT CLASS
					{
					match(input,VOID,FOLLOW_VOID_in_primary7226); if (state.failed) return;
					match(input,DOT,FOLLOW_DOT_in_primary7228); if (state.failed) return;
					match(input,CLASS,FOLLOW_CLASS_in_primary7230); if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 121, primary_StartIndex); }

		}
	}
	// $ANTLR end "primary"



	// $ANTLR start "identifierSuffix"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1332:1: identifierSuffix : ( ( LBRACKET RBRACKET )+ DOT CLASS | ( LBRACKET expression RBRACKET )+ | arguments | DOT CLASS | DOT explicitGenericInvocation | DOT THIS | DOT SUPER arguments | DOT NEW innerCreator );
	public final void identifierSuffix() throws RecognitionException {
		int identifierSuffix_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1333:5: ( ( LBRACKET RBRACKET )+ DOT CLASS | ( LBRACKET expression RBRACKET )+ | arguments | DOT CLASS | DOT explicitGenericInvocation | DOT THIS | DOT SUPER arguments | DOT NEW innerCreator )
			int alt159=8;
			switch ( input.LA(1) ) {
			case LBRACKET:
				{
				int LA159_1 = input.LA(2);
				if ( (LA159_1==RBRACKET) ) {
					alt159=1;
				}
				else if ( (LA159_1==ADD||LA159_1==BITNOT||LA159_1==BOOLEAN||LA159_1==BYTE||LA159_1==CHAR||(LA159_1 >= CharacterLiteral && LA159_1 <= DEC)||(LA159_1 >= DOUBLE && LA159_1 <= DecimalLiteral)||LA159_1==FALSE||LA159_1==FLOAT||LA159_1==FloatingPointLiteral||LA159_1==HexLiteral||LA159_1==INC||LA159_1==INT||LA159_1==Identifier||(LA159_1 >= LONG && LA159_1 <= LPAREN)||(LA159_1 >= NEW && LA159_1 <= NULL)||LA159_1==OctalLiteral||LA159_1==SHORT||(LA159_1 >= SUB && LA159_1 <= SUPER)||(LA159_1 >= StringLiteral && LA159_1 <= THIS)||LA159_1==TRUE||LA159_1==VOID) ) {
					alt159=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 159, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LPAREN:
				{
				alt159=3;
				}
				break;
			case DOT:
				{
				switch ( input.LA(2) ) {
				case CLASS:
					{
					alt159=4;
					}
					break;
				case THIS:
					{
					alt159=6;
					}
					break;
				case SUPER:
					{
					alt159=7;
					}
					break;
				case NEW:
					{
					alt159=8;
					}
					break;
				case LT:
					{
					alt159=5;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 159, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 159, 0, input);
				throw nvae;
			}
			switch (alt159) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1333:9: ( LBRACKET RBRACKET )+ DOT CLASS
					{
					// edu/ua/cs/taser/extract/java/JavaParser.g:1333:9: ( LBRACKET RBRACKET )+
					int cnt157=0;
					loop157:
					while (true) {
						int alt157=2;
						int LA157_0 = input.LA(1);
						if ( (LA157_0==LBRACKET) ) {
							alt157=1;
						}

						switch (alt157) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1333:10: LBRACKET RBRACKET
							{
							match(input,LBRACKET,FOLLOW_LBRACKET_in_identifierSuffix7250); if (state.failed) return;
							match(input,RBRACKET,FOLLOW_RBRACKET_in_identifierSuffix7252); if (state.failed) return;
							}
							break;

						default :
							if ( cnt157 >= 1 ) break loop157;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(157, input);
							throw eee;
						}
						cnt157++;
					}

					match(input,DOT,FOLLOW_DOT_in_identifierSuffix7256); if (state.failed) return;
					match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix7258); if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1334:9: ( LBRACKET expression RBRACKET )+
					{
					// edu/ua/cs/taser/extract/java/JavaParser.g:1334:9: ( LBRACKET expression RBRACKET )+
					int cnt158=0;
					loop158:
					while (true) {
						int alt158=2;
						int LA158_0 = input.LA(1);
						if ( (LA158_0==LBRACKET) ) {
							int LA158_2 = input.LA(2);
							if ( (synpred251_JavaParser()) ) {
								alt158=1;
							}

						}

						switch (alt158) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1334:10: LBRACKET expression RBRACKET
							{
							match(input,LBRACKET,FOLLOW_LBRACKET_in_identifierSuffix7269); if (state.failed) return;
							pushFollow(FOLLOW_expression_in_identifierSuffix7271);
							expression();
							state._fsp--;
							if (state.failed) return;
							match(input,RBRACKET,FOLLOW_RBRACKET_in_identifierSuffix7273); if (state.failed) return;
							}
							break;

						default :
							if ( cnt158 >= 1 ) break loop158;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(158, input);
							throw eee;
						}
						cnt158++;
					}

					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1335:9: arguments
					{
					pushFollow(FOLLOW_arguments_in_identifierSuffix7285);
					arguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1336:9: DOT CLASS
					{
					match(input,DOT,FOLLOW_DOT_in_identifierSuffix7295); if (state.failed) return;
					match(input,CLASS,FOLLOW_CLASS_in_identifierSuffix7297); if (state.failed) return;
					}
					break;
				case 5 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1337:9: DOT explicitGenericInvocation
					{
					match(input,DOT,FOLLOW_DOT_in_identifierSuffix7307); if (state.failed) return;
					pushFollow(FOLLOW_explicitGenericInvocation_in_identifierSuffix7309);
					explicitGenericInvocation();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1338:9: DOT THIS
					{
					match(input,DOT,FOLLOW_DOT_in_identifierSuffix7319); if (state.failed) return;
					match(input,THIS,FOLLOW_THIS_in_identifierSuffix7321); if (state.failed) return;
					}
					break;
				case 7 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1339:9: DOT SUPER arguments
					{
					match(input,DOT,FOLLOW_DOT_in_identifierSuffix7331); if (state.failed) return;
					match(input,SUPER,FOLLOW_SUPER_in_identifierSuffix7333); if (state.failed) return;
					pushFollow(FOLLOW_arguments_in_identifierSuffix7335);
					arguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1340:9: DOT NEW innerCreator
					{
					match(input,DOT,FOLLOW_DOT_in_identifierSuffix7345); if (state.failed) return;
					match(input,NEW,FOLLOW_NEW_in_identifierSuffix7347); if (state.failed) return;
					pushFollow(FOLLOW_innerCreator_in_identifierSuffix7349);
					innerCreator();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 122, identifierSuffix_StartIndex); }

		}
	}
	// $ANTLR end "identifierSuffix"



	// $ANTLR start "creator"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1343:1: creator : ( nonWildcardTypeArguments createdName classCreatorRest | createdName ( arrayCreatorRest | classCreatorRest ) );
	public final void creator() throws RecognitionException {
		int creator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1344:5: ( nonWildcardTypeArguments createdName classCreatorRest | createdName ( arrayCreatorRest | classCreatorRest ) )
			int alt161=2;
			int LA161_0 = input.LA(1);
			if ( (LA161_0==LT) ) {
				alt161=1;
			}
			else if ( (LA161_0==BOOLEAN||LA161_0==BYTE||LA161_0==CHAR||LA161_0==DOUBLE||LA161_0==FLOAT||LA161_0==INT||LA161_0==Identifier||LA161_0==LONG||LA161_0==SHORT) ) {
				alt161=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 161, 0, input);
				throw nvae;
			}

			switch (alt161) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1344:9: nonWildcardTypeArguments createdName classCreatorRest
					{
					pushFollow(FOLLOW_nonWildcardTypeArguments_in_creator7368);
					nonWildcardTypeArguments();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_createdName_in_creator7370);
					createdName();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_classCreatorRest_in_creator7372);
					classCreatorRest();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1345:9: createdName ( arrayCreatorRest | classCreatorRest )
					{
					pushFollow(FOLLOW_createdName_in_creator7382);
					createdName();
					state._fsp--;
					if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1345:21: ( arrayCreatorRest | classCreatorRest )
					int alt160=2;
					int LA160_0 = input.LA(1);
					if ( (LA160_0==LBRACKET) ) {
						alt160=1;
					}
					else if ( (LA160_0==LPAREN) ) {
						alt160=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 160, 0, input);
						throw nvae;
					}

					switch (alt160) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1345:22: arrayCreatorRest
							{
							pushFollow(FOLLOW_arrayCreatorRest_in_creator7385);
							arrayCreatorRest();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1345:41: classCreatorRest
							{
							pushFollow(FOLLOW_classCreatorRest_in_creator7389);
							classCreatorRest();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 123, creator_StartIndex); }

		}
	}
	// $ANTLR end "creator"



	// $ANTLR start "createdName"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1348:1: createdName : ( classOrInterfaceType | primitiveType );
	public final void createdName() throws RecognitionException {
		int createdName_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1349:5: ( classOrInterfaceType | primitiveType )
			int alt162=2;
			int LA162_0 = input.LA(1);
			if ( (LA162_0==Identifier) ) {
				alt162=1;
			}
			else if ( (LA162_0==BOOLEAN||LA162_0==BYTE||LA162_0==CHAR||LA162_0==DOUBLE||LA162_0==FLOAT||LA162_0==INT||LA162_0==LONG||LA162_0==SHORT) ) {
				alt162=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 162, 0, input);
				throw nvae;
			}

			switch (alt162) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1350:13: classOrInterfaceType
					{
					if ( state.backtracking==0 ) {
					            isCollectingCreatedNameParts = true;
					            }
					pushFollow(FOLLOW_classOrInterfaceType_in_createdName7429);
					classOrInterfaceType();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					            isCollectingCreatedNameParts = false;
					            for (JavaToken token : createdNameParts) {
					                token.setType(TokenType.CONSTRUCTOR_CALL);
					            }
					            createdNameParts.clear();
					            }
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1361:9: primitiveType
					{
					pushFollow(FOLLOW_primitiveType_in_createdName7453);
					primitiveType();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 124, createdName_StartIndex); }

		}
	}
	// $ANTLR end "createdName"



	// $ANTLR start "innerCreator"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1364:1: innerCreator : ( nonWildcardTypeArguments )? i= Identifier classCreatorRest ;
	public final void innerCreator() throws RecognitionException {
		int innerCreator_StartIndex = input.index();

		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1365:5: ( ( nonWildcardTypeArguments )? i= Identifier classCreatorRest )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1365:9: ( nonWildcardTypeArguments )? i= Identifier classCreatorRest
			{
			// edu/ua/cs/taser/extract/java/JavaParser.g:1365:9: ( nonWildcardTypeArguments )?
			int alt163=2;
			int LA163_0 = input.LA(1);
			if ( (LA163_0==LT) ) {
				alt163=1;
			}
			switch (alt163) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1365:9: nonWildcardTypeArguments
					{
					pushFollow(FOLLOW_nonWildcardTypeArguments_in_innerCreator7472);
					nonWildcardTypeArguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_innerCreator7477); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            addToken(makeToken(i, TokenType.CONSTRUCTOR_CALL, Stacks.top(entityStack)));
			            }
			pushFollow(FOLLOW_classCreatorRest_in_innerCreator7501);
			classCreatorRest();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 125, innerCreator_StartIndex); }

		}
	}
	// $ANTLR end "innerCreator"



	// $ANTLR start "arrayCreatorRest"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1372:1: arrayCreatorRest : LBRACKET ( RBRACKET ( LBRACKET RBRACKET )* arrayInitializer | expression RBRACKET ( LBRACKET expression RBRACKET )* ( LBRACKET RBRACKET )* ) ;
	public final void arrayCreatorRest() throws RecognitionException {
		int arrayCreatorRest_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1373:5: ( LBRACKET ( RBRACKET ( LBRACKET RBRACKET )* arrayInitializer | expression RBRACKET ( LBRACKET expression RBRACKET )* ( LBRACKET RBRACKET )* ) )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1373:9: LBRACKET ( RBRACKET ( LBRACKET RBRACKET )* arrayInitializer | expression RBRACKET ( LBRACKET expression RBRACKET )* ( LBRACKET RBRACKET )* )
			{
			match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreatorRest7520); if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1374:9: ( RBRACKET ( LBRACKET RBRACKET )* arrayInitializer | expression RBRACKET ( LBRACKET expression RBRACKET )* ( LBRACKET RBRACKET )* )
			int alt167=2;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==RBRACKET) ) {
				alt167=1;
			}
			else if ( (LA167_0==ADD||LA167_0==BITNOT||LA167_0==BOOLEAN||LA167_0==BYTE||LA167_0==CHAR||(LA167_0 >= CharacterLiteral && LA167_0 <= DEC)||(LA167_0 >= DOUBLE && LA167_0 <= DecimalLiteral)||LA167_0==FALSE||LA167_0==FLOAT||LA167_0==FloatingPointLiteral||LA167_0==HexLiteral||LA167_0==INC||LA167_0==INT||LA167_0==Identifier||(LA167_0 >= LONG && LA167_0 <= LPAREN)||(LA167_0 >= NEW && LA167_0 <= NULL)||LA167_0==OctalLiteral||LA167_0==SHORT||(LA167_0 >= SUB && LA167_0 <= SUPER)||(LA167_0 >= StringLiteral && LA167_0 <= THIS)||LA167_0==TRUE||LA167_0==VOID) ) {
				alt167=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 167, 0, input);
				throw nvae;
			}

			switch (alt167) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1374:13: RBRACKET ( LBRACKET RBRACKET )* arrayInitializer
					{
					match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreatorRest7534); if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1374:22: ( LBRACKET RBRACKET )*
					loop164:
					while (true) {
						int alt164=2;
						int LA164_0 = input.LA(1);
						if ( (LA164_0==LBRACKET) ) {
							alt164=1;
						}

						switch (alt164) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1374:23: LBRACKET RBRACKET
							{
							match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreatorRest7537); if (state.failed) return;
							match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreatorRest7539); if (state.failed) return;
							}
							break;

						default :
							break loop164;
						}
					}

					pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest7543);
					arrayInitializer();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1375:13: expression RBRACKET ( LBRACKET expression RBRACKET )* ( LBRACKET RBRACKET )*
					{
					pushFollow(FOLLOW_expression_in_arrayCreatorRest7557);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreatorRest7559); if (state.failed) return;
					// edu/ua/cs/taser/extract/java/JavaParser.g:1375:33: ( LBRACKET expression RBRACKET )*
					loop165:
					while (true) {
						int alt165=2;
						int LA165_0 = input.LA(1);
						if ( (LA165_0==LBRACKET) ) {
							int LA165_1 = input.LA(2);
							if ( (synpred264_JavaParser()) ) {
								alt165=1;
							}

						}

						switch (alt165) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1375:34: LBRACKET expression RBRACKET
							{
							match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreatorRest7562); if (state.failed) return;
							pushFollow(FOLLOW_expression_in_arrayCreatorRest7564);
							expression();
							state._fsp--;
							if (state.failed) return;
							match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreatorRest7566); if (state.failed) return;
							}
							break;

						default :
							break loop165;
						}
					}

					// edu/ua/cs/taser/extract/java/JavaParser.g:1375:65: ( LBRACKET RBRACKET )*
					loop166:
					while (true) {
						int alt166=2;
						int LA166_0 = input.LA(1);
						if ( (LA166_0==LBRACKET) ) {
							int LA166_2 = input.LA(2);
							if ( (LA166_2==RBRACKET) ) {
								alt166=1;
							}

						}

						switch (alt166) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1375:66: LBRACKET RBRACKET
							{
							match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayCreatorRest7571); if (state.failed) return;
							match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayCreatorRest7573); if (state.failed) return;
							}
							break;

						default :
							break loop166;
						}
					}

					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 126, arrayCreatorRest_StartIndex); }

		}
	}
	// $ANTLR end "arrayCreatorRest"



	// $ANTLR start "classCreatorRest"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1379:1: classCreatorRest : arguments (pos= classBody )? ;
	public final void classCreatorRest() throws RecognitionException {
		int classCreatorRest_StartIndex = input.index();

		Position pos =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1380:5: ( arguments (pos= classBody )? )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1380:9: arguments (pos= classBody )?
			{
			pushFollow(FOLLOW_arguments_in_classCreatorRest7604);
			arguments();
			state._fsp--;
			if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1380:19: (pos= classBody )?
			int alt168=2;
			int LA168_0 = input.LA(1);
			if ( (LA168_0==LBRACE) ) {
				alt168=1;
			}
			switch (alt168) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1381:13: pos= classBody
					{
					if ( state.backtracking==0 ) {
					            StringBuilder name = new StringBuilder();
					            name.append("$");
					            name.append(Stacks.top(anonStack));
					            Stacks.push(qualifiedNameStack, name.toString());
					            Stacks.push(entityStack, Entities.newJavaEntity(EntityType.CLASS, Stacks.top(entityStack), createQualifiedName()));
					            Integer anon = Stacks.pop(anonStack);
					            Stacks.push(anonStack, anon + 1);
					            }
					pushFollow(FOLLOW_classBody_in_classCreatorRest7632);
					pos=classBody();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
					            Stacks.top(entityStack).setPosition(pos);
					            addEntity(Stacks.pop(entityStack));
					            Stacks.pop(qualifiedNameStack);
					            }
					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 127, classCreatorRest_StartIndex); }

		}
	}
	// $ANTLR end "classCreatorRest"



	// $ANTLR start "explicitGenericInvocation"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1399:1: explicitGenericInvocation : nonWildcardTypeArguments i= Identifier arguments ;
	public final void explicitGenericInvocation() throws RecognitionException {
		int explicitGenericInvocation_StartIndex = input.index();

		Token i=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1400:5: ( nonWildcardTypeArguments i= Identifier arguments )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1400:9: nonWildcardTypeArguments i= Identifier arguments
			{
			pushFollow(FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation7676);
			nonWildcardTypeArguments();
			state._fsp--;
			if (state.failed) return;
			i=(Token)match(input,Identifier,FOLLOW_Identifier_in_explicitGenericInvocation7680); if (state.failed) return;
			if ( state.backtracking==0 ) {
			            addToken(makeToken(i, TokenType.METHOD_CALL, Stacks.top(entityStack)));
			            }
			pushFollow(FOLLOW_arguments_in_explicitGenericInvocation7704);
			arguments();
			state._fsp--;
			if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 128, explicitGenericInvocation_StartIndex); }

		}
	}
	// $ANTLR end "explicitGenericInvocation"



	// $ANTLR start "nonWildcardTypeArguments"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1407:1: nonWildcardTypeArguments : LT typeList GT ;
	public final void nonWildcardTypeArguments() throws RecognitionException {
		int nonWildcardTypeArguments_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1408:5: ( LT typeList GT )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1408:9: LT typeList GT
			{
			match(input,LT,FOLLOW_LT_in_nonWildcardTypeArguments7723); if (state.failed) return;
			pushFollow(FOLLOW_typeList_in_nonWildcardTypeArguments7725);
			typeList();
			state._fsp--;
			if (state.failed) return;
			match(input,GT,FOLLOW_GT_in_nonWildcardTypeArguments7727); if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 129, nonWildcardTypeArguments_StartIndex); }

		}
	}
	// $ANTLR end "nonWildcardTypeArguments"



	// $ANTLR start "selector"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1411:1: selector : ( DOT i= Identifier ( arguments )? | DOT THIS | DOT SUPER superSuffix | DOT NEW innerCreator | LBRACKET expression RBRACKET );
	public final void selector() throws RecognitionException {
		int selector_StartIndex = input.index();

		Token i=null;


		    JavaToken token = null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1415:5: ( DOT i= Identifier ( arguments )? | DOT THIS | DOT SUPER superSuffix | DOT NEW innerCreator | LBRACKET expression RBRACKET )
			int alt170=5;
			int LA170_0 = input.LA(1);
			if ( (LA170_0==DOT) ) {
				switch ( input.LA(2) ) {
				case Identifier:
					{
					alt170=1;
					}
					break;
				case THIS:
					{
					alt170=2;
					}
					break;
				case SUPER:
					{
					alt170=3;
					}
					break;
				case NEW:
					{
					alt170=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 170, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA170_0==LBRACKET) ) {
				alt170=5;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 170, 0, input);
				throw nvae;
			}

			switch (alt170) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1415:9: DOT i= Identifier ( arguments )?
					{
					match(input,DOT,FOLLOW_DOT_in_selector7751); if (state.failed) return;
					i=(Token)match(input,Identifier,FOLLOW_Identifier_in_selector7755); if (state.failed) return;
					if ( state.backtracking==0 ) {
					            token = makeToken(i, TokenType.QUALIFIED_NAME_REF, Stacks.top(entityStack));
					            addToken(token);
					            }
					// edu/ua/cs/taser/extract/java/JavaParser.g:1420:9: ( arguments )?
					int alt169=2;
					int LA169_0 = input.LA(1);
					if ( (LA169_0==LPAREN) ) {
						alt169=1;
					}
					switch (alt169) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1421:13: arguments
							{
							if ( state.backtracking==0 ) {
							            token.setType(TokenType.METHOD_CALL);
							            }
							pushFollow(FOLLOW_arguments_in_selector7803);
							arguments();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1425:9: DOT THIS
					{
					match(input,DOT,FOLLOW_DOT_in_selector7815); if (state.failed) return;
					match(input,THIS,FOLLOW_THIS_in_selector7817); if (state.failed) return;
					}
					break;
				case 3 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1426:9: DOT SUPER superSuffix
					{
					match(input,DOT,FOLLOW_DOT_in_selector7827); if (state.failed) return;
					match(input,SUPER,FOLLOW_SUPER_in_selector7829); if (state.failed) return;
					pushFollow(FOLLOW_superSuffix_in_selector7831);
					superSuffix();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1427:9: DOT NEW innerCreator
					{
					match(input,DOT,FOLLOW_DOT_in_selector7841); if (state.failed) return;
					match(input,NEW,FOLLOW_NEW_in_selector7843); if (state.failed) return;
					pushFollow(FOLLOW_innerCreator_in_selector7845);
					innerCreator();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1428:9: LBRACKET expression RBRACKET
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_selector7855); if (state.failed) return;
					pushFollow(FOLLOW_expression_in_selector7857);
					expression();
					state._fsp--;
					if (state.failed) return;
					match(input,RBRACKET,FOLLOW_RBRACKET_in_selector7859); if (state.failed) return;
					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 130, selector_StartIndex); }

		}
	}
	// $ANTLR end "selector"



	// $ANTLR start "superSuffix"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1431:1: superSuffix : ( arguments | DOT i= Identifier ( arguments )? );
	public final void superSuffix() throws RecognitionException {
		int superSuffix_StartIndex = input.index();

		Token i=null;


		    JavaToken token = null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1435:5: ( arguments | DOT i= Identifier ( arguments )? )
			int alt172=2;
			int LA172_0 = input.LA(1);
			if ( (LA172_0==LPAREN) ) {
				alt172=1;
			}
			else if ( (LA172_0==DOT) ) {
				alt172=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 172, 0, input);
				throw nvae;
			}

			switch (alt172) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1435:9: arguments
					{
					pushFollow(FOLLOW_arguments_in_superSuffix7883);
					arguments();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1436:9: DOT i= Identifier ( arguments )?
					{
					match(input,DOT,FOLLOW_DOT_in_superSuffix7893); if (state.failed) return;
					i=(Token)match(input,Identifier,FOLLOW_Identifier_in_superSuffix7897); if (state.failed) return;
					if ( state.backtracking==0 ) {
					            token = makeToken(i, TokenType.QUALIFIED_NAME_REF, Stacks.top(entityStack));
					            addToken(token);
					            }
					// edu/ua/cs/taser/extract/java/JavaParser.g:1441:9: ( arguments )?
					int alt171=2;
					int LA171_0 = input.LA(1);
					if ( (LA171_0==LPAREN) ) {
						alt171=1;
					}
					switch (alt171) {
						case 1 :
							// edu/ua/cs/taser/extract/java/JavaParser.g:1442:13: arguments
							{
							if ( state.backtracking==0 ) {
							            token.setType(TokenType.METHOD_CALL);
							            }
							pushFollow(FOLLOW_arguments_in_superSuffix7945);
							arguments();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					}
					break;

			}
		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 131, superSuffix_StartIndex); }

		}
	}
	// $ANTLR end "superSuffix"



	// $ANTLR start "arguments"
	// edu/ua/cs/taser/extract/java/JavaParser.g:1448:1: arguments :o= LPAREN ( expressionList )? c= RPAREN ;
	public final void arguments() throws RecognitionException {
		int arguments_StartIndex = input.index();

		Token o=null;
		Token c=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return; }

			// edu/ua/cs/taser/extract/java/JavaParser.g:1449:5: (o= LPAREN ( expressionList )? c= RPAREN )
			// edu/ua/cs/taser/extract/java/JavaParser.g:1450:13: o= LPAREN ( expressionList )? c= RPAREN
			{
			if ( state.backtracking==0 ) {
			            TokenType lastType = lastTokenAdded.getType();
			            if (lastType.isChildOf(TokenType.NAME_USE) &&
			                    ((lastType == TokenType.QUALIFIED_NAME_REF) ||
			                    (lastType != TokenType.CONSTRUCTOR_CALL))) {
			                lastTokenAdded.setType(TokenType.METHOD_CALL);
			            }
			            }
			o=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_arguments7988); if (state.failed) return;
			// edu/ua/cs/taser/extract/java/JavaParser.g:1458:18: ( expressionList )?
			int alt173=2;
			int LA173_0 = input.LA(1);
			if ( (LA173_0==ADD||LA173_0==BITNOT||LA173_0==BOOLEAN||LA173_0==BYTE||LA173_0==CHAR||(LA173_0 >= CharacterLiteral && LA173_0 <= DEC)||(LA173_0 >= DOUBLE && LA173_0 <= DecimalLiteral)||LA173_0==FALSE||LA173_0==FLOAT||LA173_0==FloatingPointLiteral||LA173_0==HexLiteral||LA173_0==INC||LA173_0==INT||LA173_0==Identifier||(LA173_0 >= LONG && LA173_0 <= LPAREN)||(LA173_0 >= NEW && LA173_0 <= NULL)||LA173_0==OctalLiteral||LA173_0==SHORT||(LA173_0 >= SUB && LA173_0 <= SUPER)||(LA173_0 >= StringLiteral && LA173_0 <= THIS)||LA173_0==TRUE||LA173_0==VOID) ) {
				alt173=1;
			}
			switch (alt173) {
				case 1 :
					// edu/ua/cs/taser/extract/java/JavaParser.g:1458:18: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_arguments7990);
					expressionList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			c=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_arguments7995); if (state.failed) return;
			}

		}

		    catch (RecognitionException e) {
		        //System.err.print(getRuleInvocationStack());
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 132, arguments_StartIndex); }

		}
	}
	// $ANTLR end "arguments"

	// $ANTLR start synpred5_JavaParser
	public final void synpred5_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:66:9: ( annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* ) )
		// edu/ua/cs/taser/extract/java/JavaParser.g:66:9: annotations ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
		{
		pushFollow(FOLLOW_annotations_in_synpred5_JavaParser112);
		annotations();
		state._fsp--;
		if (state.failed) return;
		// edu/ua/cs/taser/extract/java/JavaParser.g:67:9: ( packageDeclaration ( importDeclaration )* ( typeDeclaration )* | classOrInterfaceDeclaration ( typeDeclaration )* )
		int alt179=2;
		int LA179_0 = input.LA(1);
		if ( (LA179_0==PACKAGE) ) {
			alt179=1;
		}
		else if ( (LA179_0==ABSTRACT||LA179_0==AT||LA179_0==CLASS||LA179_0==ENUM||LA179_0==FINAL||LA179_0==INTERFACE||(LA179_0 >= PRIVATE && LA179_0 <= PUBLIC)||(LA179_0 >= STATIC && LA179_0 <= STRICTFP)) ) {
			alt179=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 179, 0, input);
			throw nvae;
		}

		switch (alt179) {
			case 1 :
				// edu/ua/cs/taser/extract/java/JavaParser.g:67:13: packageDeclaration ( importDeclaration )* ( typeDeclaration )*
				{
				pushFollow(FOLLOW_packageDeclaration_in_synpred5_JavaParser126);
				packageDeclaration();
				state._fsp--;
				if (state.failed) return;
				// edu/ua/cs/taser/extract/java/JavaParser.g:67:32: ( importDeclaration )*
				loop176:
				while (true) {
					int alt176=2;
					int LA176_0 = input.LA(1);
					if ( (LA176_0==IMPORT) ) {
						alt176=1;
					}

					switch (alt176) {
					case 1 :
						// edu/ua/cs/taser/extract/java/JavaParser.g:67:32: importDeclaration
						{
						pushFollow(FOLLOW_importDeclaration_in_synpred5_JavaParser128);
						importDeclaration();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop176;
					}
				}

				// edu/ua/cs/taser/extract/java/JavaParser.g:67:51: ( typeDeclaration )*
				loop177:
				while (true) {
					int alt177=2;
					int LA177_0 = input.LA(1);
					if ( (LA177_0==ABSTRACT||LA177_0==AT||LA177_0==CLASS||LA177_0==ENUM||LA177_0==FINAL||LA177_0==INTERFACE||(LA177_0 >= PRIVATE && LA177_0 <= PUBLIC)||LA177_0==SEMICOLON||(LA177_0 >= STATIC && LA177_0 <= STRICTFP)) ) {
						alt177=1;
					}

					switch (alt177) {
					case 1 :
						// edu/ua/cs/taser/extract/java/JavaParser.g:67:51: typeDeclaration
						{
						pushFollow(FOLLOW_typeDeclaration_in_synpred5_JavaParser131);
						typeDeclaration();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop177;
					}
				}

				}
				break;
			case 2 :
				// edu/ua/cs/taser/extract/java/JavaParser.g:68:13: classOrInterfaceDeclaration ( typeDeclaration )*
				{
				pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred5_JavaParser146);
				classOrInterfaceDeclaration();
				state._fsp--;
				if (state.failed) return;
				// edu/ua/cs/taser/extract/java/JavaParser.g:68:41: ( typeDeclaration )*
				loop178:
				while (true) {
					int alt178=2;
					int LA178_0 = input.LA(1);
					if ( (LA178_0==ABSTRACT||LA178_0==AT||LA178_0==CLASS||LA178_0==ENUM||LA178_0==FINAL||LA178_0==INTERFACE||(LA178_0 >= PRIVATE && LA178_0 <= PUBLIC)||LA178_0==SEMICOLON||(LA178_0 >= STATIC && LA178_0 <= STRICTFP)) ) {
						alt178=1;
					}

					switch (alt178) {
					case 1 :
						// edu/ua/cs/taser/extract/java/JavaParser.g:68:41: typeDeclaration
						{
						pushFollow(FOLLOW_typeDeclaration_in_synpred5_JavaParser148);
						typeDeclaration();
						state._fsp--;
						if (state.failed) return;
						}
						break;

					default :
						break loop178;
					}
				}

				}
				break;

		}

		}

	}
	// $ANTLR end synpred5_JavaParser

	// $ANTLR start synpred54_JavaParser
	public final void synpred54_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:400:13: ( type methodDeclaration )
		// edu/ua/cs/taser/extract/java/JavaParser.g:400:13: type methodDeclaration
		{
		pushFollow(FOLLOW_type_in_synpred54_JavaParser1603);
		type();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_methodDeclaration_in_synpred54_JavaParser1605);
		methodDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred54_JavaParser

	// $ANTLR start synpred62_JavaParser
	public final void synpred62_JavaParser_fragment() throws RecognitionException {
		Token i=null;

		// edu/ua/cs/taser/extract/java/JavaParser.g:528:9: ( type i= Identifier constantDeclaratorsRest SEMICOLON )
		// edu/ua/cs/taser/extract/java/JavaParser.g:528:9: type i= Identifier constantDeclaratorsRest SEMICOLON
		{
		pushFollow(FOLLOW_type_in_synpred62_JavaParser2117);
		type();
		state._fsp--;
		if (state.failed) return;
		i=(Token)match(input,Identifier,FOLLOW_Identifier_in_synpred62_JavaParser2121); if (state.failed) return;
		pushFollow(FOLLOW_constantDeclaratorsRest_in_synpred62_JavaParser2145);
		constantDeclaratorsRest();
		state._fsp--;
		if (state.failed) return;
		match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred62_JavaParser2147); if (state.failed) return;
		}

	}
	// $ANTLR end synpred62_JavaParser

	// $ANTLR start synpred115_JavaParser
	public final void synpred115_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:888:9: ( explicitConstructorInvocation )
		// edu/ua/cs/taser/extract/java/JavaParser.g:888:9: explicitConstructorInvocation
		{
		pushFollow(FOLLOW_explicitConstructorInvocation_in_synpred115_JavaParser4108);
		explicitConstructorInvocation();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred115_JavaParser

	// $ANTLR start synpred119_JavaParser
	public final void synpred119_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:896:9: ( ( nonWildcardTypeArguments )? ( THIS | SUPER ) arguments SEMICOLON )
		// edu/ua/cs/taser/extract/java/JavaParser.g:896:9: ( nonWildcardTypeArguments )? ( THIS | SUPER ) arguments SEMICOLON
		{
		// edu/ua/cs/taser/extract/java/JavaParser.g:896:9: ( nonWildcardTypeArguments )?
		int alt187=2;
		int LA187_0 = input.LA(1);
		if ( (LA187_0==LT) ) {
			alt187=1;
		}
		switch (alt187) {
			case 1 :
				// edu/ua/cs/taser/extract/java/JavaParser.g:896:9: nonWildcardTypeArguments
				{
				pushFollow(FOLLOW_nonWildcardTypeArguments_in_synpred119_JavaParser4149);
				nonWildcardTypeArguments();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		if ( input.LA(1)==SUPER||input.LA(1)==THIS ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_arguments_in_synpred119_JavaParser4160);
		arguments();
		state._fsp--;
		if (state.failed) return;
		match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred119_JavaParser4162); if (state.failed) return;
		}

	}
	// $ANTLR end synpred119_JavaParser

	// $ANTLR start synpred130_JavaParser
	public final void synpred130_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:939:9: ( annotation )
		// edu/ua/cs/taser/extract/java/JavaParser.g:939:9: annotation
		{
		pushFollow(FOLLOW_annotation_in_synpred130_JavaParser4434);
		annotation();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred130_JavaParser

	// $ANTLR start synpred153_JavaParser
	public final void synpred153_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1056:9: ( localVariableDeclarationStatement )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1056:9: localVariableDeclarationStatement
		{
		pushFollow(FOLLOW_localVariableDeclarationStatement_in_synpred153_JavaParser5098);
		localVariableDeclarationStatement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred153_JavaParser

	// $ANTLR start synpred154_JavaParser
	public final void synpred154_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1057:9: ( classOrInterfaceDeclaration )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1057:9: classOrInterfaceDeclaration
		{
		pushFollow(FOLLOW_classOrInterfaceDeclaration_in_synpred154_JavaParser5108);
		classOrInterfaceDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred154_JavaParser

	// $ANTLR start synpred159_JavaParser
	public final void synpred159_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1076:52: ( ELSE statement )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1076:52: ELSE statement
		{
		match(input,ELSE,FOLLOW_ELSE_in_synpred159_JavaParser5245); if (state.failed) return;
		pushFollow(FOLLOW_statement_in_synpred159_JavaParser5247);
		statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred159_JavaParser

	// $ANTLR start synpred164_JavaParser
	public final void synpred164_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1082:11: ( catches FINALLY block )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1082:11: catches FINALLY block
		{
		pushFollow(FOLLOW_catches_in_synpred164_JavaParser5335);
		catches();
		state._fsp--;
		if (state.failed) return;
		match(input,FINALLY,FOLLOW_FINALLY_in_synpred164_JavaParser5337); if (state.failed) return;
		pushFollow(FOLLOW_block_in_synpred164_JavaParser5339);
		block();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred164_JavaParser

	// $ANTLR start synpred165_JavaParser
	public final void synpred165_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1083:11: ( catches )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1083:11: catches
		{
		pushFollow(FOLLOW_catches_in_synpred165_JavaParser5351);
		catches();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred165_JavaParser

	// $ANTLR start synpred180_JavaParser
	public final void synpred180_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1130:9: ( switchLabel )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1130:9: switchLabel
		{
		pushFollow(FOLLOW_switchLabel_in_synpred180_JavaParser5731);
		switchLabel();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred180_JavaParser

	// $ANTLR start synpred182_JavaParser
	public final void synpred182_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1134:9: ( CASE constantExpression COLON )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1134:9: CASE constantExpression COLON
		{
		match(input,CASE,FOLLOW_CASE_in_synpred182_JavaParser5754); if (state.failed) return;
		pushFollow(FOLLOW_constantExpression_in_synpred182_JavaParser5756);
		constantExpression();
		state._fsp--;
		if (state.failed) return;
		match(input,COLON,FOLLOW_COLON_in_synpred182_JavaParser5758); if (state.failed) return;
		}

	}
	// $ANTLR end synpred182_JavaParser

	// $ANTLR start synpred183_JavaParser
	public final void synpred183_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1135:9: ( CASE enumConstantName COLON )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1135:9: CASE enumConstantName COLON
		{
		match(input,CASE,FOLLOW_CASE_in_synpred183_JavaParser5768); if (state.failed) return;
		pushFollow(FOLLOW_enumConstantName_in_synpred183_JavaParser5770);
		enumConstantName();
		state._fsp--;
		if (state.failed) return;
		match(input,COLON,FOLLOW_COLON_in_synpred183_JavaParser5772); if (state.failed) return;
		}

	}
	// $ANTLR end synpred183_JavaParser

	// $ANTLR start synpred184_JavaParser
	public final void synpred184_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1141:9: ( enhancedForControl )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1141:9: enhancedForControl
		{
		pushFollow(FOLLOW_enhancedForControl_in_synpred184_JavaParser5810);
		enhancedForControl();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred184_JavaParser

	// $ANTLR start synpred188_JavaParser
	public final void synpred188_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1146:9: ( localVariableDeclaration )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1146:9: localVariableDeclaration
		{
		pushFollow(FOLLOW_localVariableDeclaration_in_synpred188_JavaParser5850);
		localVariableDeclaration();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred188_JavaParser

	// $ANTLR start synpred190_JavaParser
	public final void synpred190_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1181:32: ( assignmentOperator expression )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1181:32: assignmentOperator expression
		{
		pushFollow(FOLLOW_assignmentOperator_in_synpred190_JavaParser6045);
		assignmentOperator();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred190_JavaParser6047);
		expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred190_JavaParser

	// $ANTLR start synpred200_JavaParser
	public final void synpred200_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1194:9: ( LT LT ASG )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1194:10: LT LT ASG
		{
		match(input,LT,FOLLOW_LT_in_synpred200_JavaParser6159); if (state.failed) return;
		match(input,LT,FOLLOW_LT_in_synpred200_JavaParser6161); if (state.failed) return;
		match(input,ASG,FOLLOW_ASG_in_synpred200_JavaParser6163); if (state.failed) return;
		}

	}
	// $ANTLR end synpred200_JavaParser

	// $ANTLR start synpred201_JavaParser
	public final void synpred201_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1199:9: ( GT GT GT ASG )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1199:10: GT GT GT ASG
		{
		match(input,GT,FOLLOW_GT_in_synpred201_JavaParser6198); if (state.failed) return;
		match(input,GT,FOLLOW_GT_in_synpred201_JavaParser6200); if (state.failed) return;
		match(input,GT,FOLLOW_GT_in_synpred201_JavaParser6202); if (state.failed) return;
		match(input,ASG,FOLLOW_ASG_in_synpred201_JavaParser6204); if (state.failed) return;
		}

	}
	// $ANTLR end synpred201_JavaParser

	// $ANTLR start synpred202_JavaParser
	public final void synpred202_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1206:9: ( GT GT ASG )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1206:10: GT GT ASG
		{
		match(input,GT,FOLLOW_GT_in_synpred202_JavaParser6243); if (state.failed) return;
		match(input,GT,FOLLOW_GT_in_synpred202_JavaParser6245); if (state.failed) return;
		match(input,ASG,FOLLOW_ASG_in_synpred202_JavaParser6247); if (state.failed) return;
		}

	}
	// $ANTLR end synpred202_JavaParser

	// $ANTLR start synpred213_JavaParser
	public final void synpred213_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1250:9: ( LT ASG )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1250:10: LT ASG
		{
		match(input,LT,FOLLOW_LT_in_synpred213_JavaParser6551); if (state.failed) return;
		match(input,ASG,FOLLOW_ASG_in_synpred213_JavaParser6553); if (state.failed) return;
		}

	}
	// $ANTLR end synpred213_JavaParser

	// $ANTLR start synpred214_JavaParser
	public final void synpred214_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1253:9: ( GT ASG )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1253:10: GT ASG
		{
		match(input,GT,FOLLOW_GT_in_synpred214_JavaParser6584); if (state.failed) return;
		match(input,ASG,FOLLOW_ASG_in_synpred214_JavaParser6586); if (state.failed) return;
		}

	}
	// $ANTLR end synpred214_JavaParser

	// $ANTLR start synpred217_JavaParser
	public final void synpred217_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1265:9: ( LT LT )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1265:10: LT LT
		{
		match(input,LT,FOLLOW_LT_in_synpred217_JavaParser6674); if (state.failed) return;
		match(input,LT,FOLLOW_LT_in_synpred217_JavaParser6676); if (state.failed) return;
		}

	}
	// $ANTLR end synpred217_JavaParser

	// $ANTLR start synpred218_JavaParser
	public final void synpred218_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1268:9: ( GT GT GT )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1268:10: GT GT GT
		{
		match(input,GT,FOLLOW_GT_in_synpred218_JavaParser6707); if (state.failed) return;
		match(input,GT,FOLLOW_GT_in_synpred218_JavaParser6709); if (state.failed) return;
		match(input,GT,FOLLOW_GT_in_synpred218_JavaParser6711); if (state.failed) return;
		}

	}
	// $ANTLR end synpred218_JavaParser

	// $ANTLR start synpred219_JavaParser
	public final void synpred219_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1273:9: ( GT GT )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1273:10: GT GT
		{
		match(input,GT,FOLLOW_GT_in_synpred219_JavaParser6746); if (state.failed) return;
		match(input,GT,FOLLOW_GT_in_synpred219_JavaParser6748); if (state.failed) return;
		}

	}
	// $ANTLR end synpred219_JavaParser

	// $ANTLR start synpred231_JavaParser
	public final void synpred231_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1298:9: ( castExpression )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1298:9: castExpression
		{
		pushFollow(FOLLOW_castExpression_in_synpred231_JavaParser6953);
		castExpression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred231_JavaParser

	// $ANTLR start synpred235_JavaParser
	public final void synpred235_JavaParser_fragment() throws RecognitionException {
		Token o=null;
		Token c=null;

		// edu/ua/cs/taser/extract/java/JavaParser.g:1303:9: (o= LPAREN primitiveType c= RPAREN unaryExpression )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1303:9: o= LPAREN primitiveType c= RPAREN unaryExpression
		{
		o=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_synpred235_JavaParser6994); if (state.failed) return;
		pushFollow(FOLLOW_primitiveType_in_synpred235_JavaParser6996);
		primitiveType();
		state._fsp--;
		if (state.failed) return;
		c=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_synpred235_JavaParser7000); if (state.failed) return;
		pushFollow(FOLLOW_unaryExpression_in_synpred235_JavaParser7002);
		unaryExpression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred235_JavaParser

	// $ANTLR start synpred236_JavaParser
	public final void synpred236_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1304:19: ( type )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1304:19: type
		{
		pushFollow(FOLLOW_type_in_synpred236_JavaParser7017);
		type();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred236_JavaParser

	// $ANTLR start synpred238_JavaParser
	public final void synpred238_JavaParser_fragment() throws RecognitionException {
		Token i=null;

		// edu/ua/cs/taser/extract/java/JavaParser.g:1309:15: ( DOT i= Identifier )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1309:15: DOT i= Identifier
		{
		match(input,DOT,FOLLOW_DOT_in_synpred238_JavaParser7060); if (state.failed) return;
		i=(Token)match(input,Identifier,FOLLOW_Identifier_in_synpred238_JavaParser7064); if (state.failed) return;
		}

	}
	// $ANTLR end synpred238_JavaParser

	// $ANTLR start synpred239_JavaParser
	public final void synpred239_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1314:12: ( identifierSuffix )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1314:12: identifierSuffix
		{
		pushFollow(FOLLOW_identifierSuffix_in_synpred239_JavaParser7091);
		identifierSuffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred239_JavaParser

	// $ANTLR start synpred244_JavaParser
	public final void synpred244_JavaParser_fragment() throws RecognitionException {
		Token j=null;

		// edu/ua/cs/taser/extract/java/JavaParser.g:1322:10: ( DOT j= Identifier )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1322:10: DOT j= Identifier
		{
		match(input,DOT,FOLLOW_DOT_in_synpred244_JavaParser7163); if (state.failed) return;
		j=(Token)match(input,Identifier,FOLLOW_Identifier_in_synpred244_JavaParser7167); if (state.failed) return;
		}

	}
	// $ANTLR end synpred244_JavaParser

	// $ANTLR start synpred245_JavaParser
	public final void synpred245_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1327:12: ( identifierSuffix )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1327:12: identifierSuffix
		{
		pushFollow(FOLLOW_identifierSuffix_in_synpred245_JavaParser7194);
		identifierSuffix();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred245_JavaParser

	// $ANTLR start synpred251_JavaParser
	public final void synpred251_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1334:10: ( LBRACKET expression RBRACKET )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1334:10: LBRACKET expression RBRACKET
		{
		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred251_JavaParser7269); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred251_JavaParser7271);
		expression();
		state._fsp--;
		if (state.failed) return;
		match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred251_JavaParser7273); if (state.failed) return;
		}

	}
	// $ANTLR end synpred251_JavaParser

	// $ANTLR start synpred264_JavaParser
	public final void synpred264_JavaParser_fragment() throws RecognitionException {
		// edu/ua/cs/taser/extract/java/JavaParser.g:1375:34: ( LBRACKET expression RBRACKET )
		// edu/ua/cs/taser/extract/java/JavaParser.g:1375:34: LBRACKET expression RBRACKET
		{
		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred264_JavaParser7562); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred264_JavaParser7564);
		expression();
		state._fsp--;
		if (state.failed) return;
		match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred264_JavaParser7566); if (state.failed) return;
		}

	}
	// $ANTLR end synpred264_JavaParser

	// Delegated rules

	public final boolean synpred235_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred235_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred202_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred202_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred62_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred62_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred188_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred188_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred115_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred115_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred119_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred119_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred184_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred184_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred239_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred239_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred245_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred245_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred251_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred251_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred201_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred201_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred244_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred244_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred218_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred218_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred264_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred264_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred154_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred154_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred164_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred164_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred231_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred231_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred238_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred238_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred219_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred219_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred183_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred183_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred54_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred54_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred153_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred153_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred200_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred200_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred217_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred217_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred130_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred130_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred214_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred214_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred182_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred182_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred180_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred180_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred159_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred159_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred190_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred190_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred236_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred236_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred165_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred165_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred213_JavaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred213_JavaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA126 dfa126 = new DFA126(this);
	protected DFA149 dfa149 = new DFA149(this);
	static final String DFA126_eotS =
		"\u00fe\uffff";
	static final String DFA126_eofS =
		"\u00fe\uffff";
	static final String DFA126_minS =
		"\1\5\1\21\1\101\1\5\10\46\22\uffff\1\46\10\101\1\21\1\101\1\21\1\5\1\35"+
		"\1\5\1\7\30\uffff\1\132\1\7\1\uffff\1\132\1\7\1\uffff\1\132\1\7\1\uffff"+
		"\1\132\1\7\1\uffff\1\132\1\7\1\uffff\1\132\1\7\1\uffff\1\132\1\7\1\uffff"+
		"\1\132\1\7\1\uffff\55\0\2\uffff\12\0\21\uffff\1\0\5\uffff\1\0\37\uffff"+
		"\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff"+
		"\1\0\5\uffff\1\0\5\uffff";
	static final String DFA126_maxS =
		"\1\156\1\137\1\101\1\142\10\105\22\uffff\1\111\10\105\1\137\1\101\1\137"+
		"\1\156\1\147\1\156\1\136\30\uffff\1\132\1\136\1\uffff\1\132\1\136\1\uffff"+
		"\1\132\1\136\1\uffff\1\132\1\136\1\uffff\1\132\1\136\1\uffff\1\132\1\136"+
		"\1\uffff\1\132\1\136\1\uffff\1\132\1\136\1\uffff\55\0\2\uffff\12\0\21"+
		"\uffff\1\0\5\uffff\1\0\37\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff\1"+
		"\0\5\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff\1\0\5\uffff";
	static final String DFA126_acceptS =
		"\14\uffff\1\2\u00bc\uffff\1\1\64\uffff";
	static final String DFA126_specialS =
		"\136\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
		"\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1"+
		"\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1"+
		"\51\1\52\1\53\1\54\2\uffff\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65"+
		"\1\66\21\uffff\1\67\5\uffff\1\70\37\uffff\1\71\5\uffff\1\72\5\uffff\1"+
		"\73\5\uffff\1\74\5\uffff\1\75\5\uffff\1\76\5\uffff\1\77\5\uffff\1\100"+
		"\5\uffff}>";
	static final String[] DFA126_transitionS = {
			"\1\14\13\uffff\1\2\1\uffff\1\14\3\uffff\1\4\1\uffff\1\6\2\uffff\1\5\4"+
			"\uffff\2\14\4\uffff\1\13\1\14\7\uffff\1\14\1\1\1\uffff\1\12\2\uffff\1"+
			"\14\2\uffff\1\14\3\uffff\1\14\1\uffff\1\10\1\uffff\1\3\5\uffff\1\11\1"+
			"\14\5\uffff\3\14\2\uffff\1\14\12\uffff\1\14\1\7\2\uffff\2\14\2\uffff"+
			"\2\14\3\uffff\1\14\2\uffff\1\14",
			"\1\50\5\uffff\1\37\1\uffff\1\41\2\uffff\1\40\12\uffff\1\46\11\uffff"+
			"\1\47\1\uffff\1\45\13\uffff\1\43\1\uffff\1\36\5\uffff\1\44\27\uffff\1"+
			"\42",
			"\1\51",
			"\13\14\2\uffff\1\14\1\uffff\2\14\11\uffff\1\14\2\uffff\1\14\1\uffff"+
			"\1\14\1\uffff\1\53\5\uffff\1\14\12\uffff\1\14\5\uffff\2\14\2\uffff\1"+
			"\55\3\uffff\1\54\2\uffff\1\14\1\52\1\uffff\1\14\1\uffff\1\14\3\uffff"+
			"\1\14\6\uffff\1\14\2\uffff\1\14\2\uffff\1\14\3\uffff\1\14",
			"\1\14\32\uffff\1\107\3\uffff\1\106",
			"\1\14\32\uffff\1\112\3\uffff\1\111",
			"\1\14\32\uffff\1\115\3\uffff\1\114",
			"\1\14\32\uffff\1\120\3\uffff\1\117",
			"\1\14\32\uffff\1\123\3\uffff\1\122",
			"\1\14\32\uffff\1\126\3\uffff\1\125",
			"\1\14\32\uffff\1\131\3\uffff\1\130",
			"\1\14\32\uffff\1\134\3\uffff\1\133",
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
			"\1\137\32\uffff\1\141\3\uffff\1\140\3\uffff\1\136",
			"\1\143\3\uffff\1\142",
			"\1\145\3\uffff\1\144",
			"\1\147\3\uffff\1\146",
			"\1\151\3\uffff\1\150",
			"\1\153\3\uffff\1\152",
			"\1\155\3\uffff\1\154",
			"\1\157\3\uffff\1\156",
			"\1\161\3\uffff\1\160",
			"\1\174\5\uffff\1\163\1\uffff\1\165\2\uffff\1\164\12\uffff\1\172\11\uffff"+
			"\1\173\1\uffff\1\171\13\uffff\1\167\1\uffff\1\162\5\uffff\1\170\27\uffff"+
			"\1\166",
			"\1\175",
			"\1\u008a\5\uffff\1\u0081\1\uffff\1\u0083\2\uffff\1\u0082\11\uffff\1"+
			"\176\1\u0088\11\uffff\1\u0089\1\uffff\1\u0087\13\uffff\1\u0085\1\uffff"+
			"\1\u0080\5\uffff\1\u0086\1\177\26\uffff\1\u0084",
			"\1\14\1\uffff\1\14\13\uffff\1\14\3\uffff\1\u008e\1\uffff\1\u0090\2\uffff"+
			"\1\u008f\4\uffff\2\14\4\uffff\1\u0095\1\14\7\uffff\1\14\2\uffff\1\u0094"+
			"\2\uffff\1\14\2\uffff\1\14\3\uffff\1\14\1\uffff\1\u0092\1\uffff\1\u008d"+
			"\5\uffff\1\u0093\2\14\4\uffff\3\14\2\uffff\1\14\4\uffff\1\u0096\6\uffff"+
			"\1\u0091\2\uffff\2\14\2\uffff\2\14\3\uffff\1\14\2\uffff\1\14",
			"\1\14\43\uffff\1\u00a8\7\uffff\1\14\4\uffff\1\14\24\uffff\1\14\3\uffff"+
			"\1\14",
			"\1\14\15\uffff\1\14\3\uffff\1\14\1\uffff\1\14\2\uffff\1\14\4\uffff\2"+
			"\14\4\uffff\2\14\7\uffff\1\14\2\uffff\1\14\2\uffff\1\14\2\uffff\1\14"+
			"\3\uffff\1\14\1\uffff\1\14\1\uffff\1\14\5\uffff\2\14\5\uffff\3\14\2\uffff"+
			"\1\14\6\uffff\1\u00ae\4\uffff\1\14\2\uffff\2\14\2\uffff\2\14\3\uffff"+
			"\1\14\2\uffff\1\14",
			"\1\14\26\uffff\1\u00c9\1\14\45\uffff\1\14\30\uffff\1\14",
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
			"\1\u00ce",
			"\1\14\26\uffff\1\u00c9\1\14\45\uffff\1\14\30\uffff\1\14",
			"",
			"\1\u00d4",
			"\1\14\26\uffff\1\u00c9\1\14\45\uffff\1\14\30\uffff\1\14",
			"",
			"\1\u00da",
			"\1\14\26\uffff\1\u00c9\1\14\45\uffff\1\14\30\uffff\1\14",
			"",
			"\1\u00e0",
			"\1\14\26\uffff\1\u00c9\1\14\45\uffff\1\14\30\uffff\1\14",
			"",
			"\1\u00e6",
			"\1\14\26\uffff\1\u00c9\1\14\45\uffff\1\14\30\uffff\1\14",
			"",
			"\1\u00ec",
			"\1\14\26\uffff\1\u00c9\1\14\45\uffff\1\14\30\uffff\1\14",
			"",
			"\1\u00f2",
			"\1\14\26\uffff\1\u00c9\1\14\45\uffff\1\14\30\uffff\1\14",
			"",
			"\1\u00f8",
			"\1\14\26\uffff\1\u00c9\1\14\45\uffff\1\14\30\uffff\1\14",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
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
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
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
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA126_eot = DFA.unpackEncodedString(DFA126_eotS);
	static final short[] DFA126_eof = DFA.unpackEncodedString(DFA126_eofS);
	static final char[] DFA126_min = DFA.unpackEncodedStringToUnsignedChars(DFA126_minS);
	static final char[] DFA126_max = DFA.unpackEncodedStringToUnsignedChars(DFA126_maxS);
	static final short[] DFA126_accept = DFA.unpackEncodedString(DFA126_acceptS);
	static final short[] DFA126_special = DFA.unpackEncodedString(DFA126_specialS);
	static final short[][] DFA126_transition;

	static {
		int numStates = DFA126_transitionS.length;
		DFA126_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA126_transition[i] = DFA.unpackEncodedString(DFA126_transitionS[i]);
		}
	}

	protected class DFA126 extends DFA {

		public DFA126(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 126;
			this.eot = DFA126_eot;
			this.eof = DFA126_eof;
			this.min = DFA126_min;
			this.max = DFA126_max;
			this.accept = DFA126_accept;
			this.special = DFA126_special;
			this.transition = DFA126_transition;
		}
		@Override
		public String getDescription() {
			return "1139:1: forControl options {k=3; } : ( enhancedForControl | ( forInit )? SEMICOLON ( expression )? SEMICOLON ( forUpdate )? );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA126_94 = input.LA(1);
						 
						int index126_94 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_94);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA126_95 = input.LA(1);
						 
						int index126_95 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_95);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA126_96 = input.LA(1);
						 
						int index126_96 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_96);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA126_97 = input.LA(1);
						 
						int index126_97 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_97);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA126_98 = input.LA(1);
						 
						int index126_98 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_98);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA126_99 = input.LA(1);
						 
						int index126_99 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_99);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA126_100 = input.LA(1);
						 
						int index126_100 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_100);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA126_101 = input.LA(1);
						 
						int index126_101 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_101);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA126_102 = input.LA(1);
						 
						int index126_102 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_102);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA126_103 = input.LA(1);
						 
						int index126_103 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_103);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA126_104 = input.LA(1);
						 
						int index126_104 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_104);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA126_105 = input.LA(1);
						 
						int index126_105 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_105);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA126_106 = input.LA(1);
						 
						int index126_106 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_106);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA126_107 = input.LA(1);
						 
						int index126_107 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_107);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA126_108 = input.LA(1);
						 
						int index126_108 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_108);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA126_109 = input.LA(1);
						 
						int index126_109 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_109);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA126_110 = input.LA(1);
						 
						int index126_110 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_110);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA126_111 = input.LA(1);
						 
						int index126_111 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_111);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA126_112 = input.LA(1);
						 
						int index126_112 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_112);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA126_113 = input.LA(1);
						 
						int index126_113 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_113);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA126_114 = input.LA(1);
						 
						int index126_114 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_114);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA126_115 = input.LA(1);
						 
						int index126_115 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_115);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA126_116 = input.LA(1);
						 
						int index126_116 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_116);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA126_117 = input.LA(1);
						 
						int index126_117 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_117);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA126_118 = input.LA(1);
						 
						int index126_118 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_118);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA126_119 = input.LA(1);
						 
						int index126_119 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_119);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA126_120 = input.LA(1);
						 
						int index126_120 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_120);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA126_121 = input.LA(1);
						 
						int index126_121 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_121);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA126_122 = input.LA(1);
						 
						int index126_122 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_122);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA126_123 = input.LA(1);
						 
						int index126_123 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_123);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA126_124 = input.LA(1);
						 
						int index126_124 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_124);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA126_125 = input.LA(1);
						 
						int index126_125 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_125);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA126_126 = input.LA(1);
						 
						int index126_126 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_126);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA126_127 = input.LA(1);
						 
						int index126_127 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_127);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA126_128 = input.LA(1);
						 
						int index126_128 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_128);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA126_129 = input.LA(1);
						 
						int index126_129 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_129);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA126_130 = input.LA(1);
						 
						int index126_130 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_130);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA126_131 = input.LA(1);
						 
						int index126_131 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_131);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA126_132 = input.LA(1);
						 
						int index126_132 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_132);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA126_133 = input.LA(1);
						 
						int index126_133 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_133);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA126_134 = input.LA(1);
						 
						int index126_134 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_134);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA126_135 = input.LA(1);
						 
						int index126_135 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_135);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA126_136 = input.LA(1);
						 
						int index126_136 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_136);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA126_137 = input.LA(1);
						 
						int index126_137 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_137);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA126_138 = input.LA(1);
						 
						int index126_138 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_138);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA126_141 = input.LA(1);
						 
						int index126_141 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_141);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA126_142 = input.LA(1);
						 
						int index126_142 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_142);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA126_143 = input.LA(1);
						 
						int index126_143 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_143);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA126_144 = input.LA(1);
						 
						int index126_144 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_144);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA126_145 = input.LA(1);
						 
						int index126_145 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_145);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA126_146 = input.LA(1);
						 
						int index126_146 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_146);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA126_147 = input.LA(1);
						 
						int index126_147 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_147);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA126_148 = input.LA(1);
						 
						int index126_148 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_148);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA126_149 = input.LA(1);
						 
						int index126_149 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_149);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA126_150 = input.LA(1);
						 
						int index126_150 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_150);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA126_168 = input.LA(1);
						 
						int index126_168 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_168);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA126_174 = input.LA(1);
						 
						int index126_174 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_174);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA126_206 = input.LA(1);
						 
						int index126_206 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_206);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA126_212 = input.LA(1);
						 
						int index126_212 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_212);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA126_218 = input.LA(1);
						 
						int index126_218 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_218);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA126_224 = input.LA(1);
						 
						int index126_224 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_224);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA126_230 = input.LA(1);
						 
						int index126_230 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_230);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA126_236 = input.LA(1);
						 
						int index126_236 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_236);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA126_242 = input.LA(1);
						 
						int index126_242 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_242);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA126_248 = input.LA(1);
						 
						int index126_248 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred184_JavaParser()) ) {s = 201;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index126_248);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 126, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA149_eotS =
		"\16\uffff";
	static final String DFA149_eofS =
		"\16\uffff";
	static final String DFA149_minS =
		"\1\5\1\0\10\46\2\uffff\1\132\1\46";
	static final String DFA149_maxS =
		"\1\156\1\0\10\135\2\uffff\1\132\1\135";
	static final String DFA149_acceptS =
		"\12\uffff\1\2\1\1\2\uffff";
	static final String DFA149_specialS =
		"\1\uffff\1\0\14\uffff}>";
	static final String[] DFA149_transitionS = {
			"\1\12\15\uffff\1\12\3\uffff\1\2\1\uffff\1\4\2\uffff\1\3\4\uffff\2\12"+
			"\4\uffff\1\11\1\12\7\uffff\1\12\2\uffff\1\10\2\uffff\1\12\2\uffff\1\12"+
			"\3\uffff\1\12\1\uffff\1\6\1\uffff\1\1\5\uffff\1\7\1\12\5\uffff\3\12\2"+
			"\uffff\1\12\13\uffff\1\5\2\uffff\2\12\2\uffff\2\12\3\uffff\1\12\2\uffff"+
			"\1\12",
			"\1\uffff",
			"\1\12\36\uffff\1\14\27\uffff\1\13",
			"\1\12\36\uffff\1\14\27\uffff\1\13",
			"\1\12\36\uffff\1\14\27\uffff\1\13",
			"\1\12\36\uffff\1\14\27\uffff\1\13",
			"\1\12\36\uffff\1\14\27\uffff\1\13",
			"\1\12\36\uffff\1\14\27\uffff\1\13",
			"\1\12\36\uffff\1\14\27\uffff\1\13",
			"\1\12\36\uffff\1\14\27\uffff\1\13",
			"",
			"",
			"\1\15",
			"\1\12\36\uffff\1\14\27\uffff\1\13"
	};

	static final short[] DFA149_eot = DFA.unpackEncodedString(DFA149_eotS);
	static final short[] DFA149_eof = DFA.unpackEncodedString(DFA149_eofS);
	static final char[] DFA149_min = DFA.unpackEncodedStringToUnsignedChars(DFA149_minS);
	static final char[] DFA149_max = DFA.unpackEncodedStringToUnsignedChars(DFA149_maxS);
	static final short[] DFA149_accept = DFA.unpackEncodedString(DFA149_acceptS);
	static final short[] DFA149_special = DFA.unpackEncodedString(DFA149_specialS);
	static final short[][] DFA149_transition;

	static {
		int numStates = DFA149_transitionS.length;
		DFA149_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA149_transition[i] = DFA.unpackEncodedString(DFA149_transitionS[i]);
		}
	}

	protected class DFA149 extends DFA {

		public DFA149(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 149;
			this.eot = DFA149_eot;
			this.eof = DFA149_eof;
			this.min = DFA149_min;
			this.max = DFA149_max;
			this.accept = DFA149_accept;
			this.special = DFA149_special;
			this.transition = DFA149_transition;
		}
		@Override
		public String getDescription() {
			return "1304:18: ( type | expression )";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA149_1 = input.LA(1);
						 
						int index149_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred236_JavaParser()) ) {s = 11;}
						else if ( (true) ) {s = 10;}
						 
						input.seek(index149_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 149, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_annotations_in_compilationUnit112 = new BitSet(new long[]{0x0002080020020010L,0x0000000300F00001L});
	public static final BitSet FOLLOW_packageDeclaration_in_compilationUnit126 = new BitSet(new long[]{0x1002080020020012L,0x0000000340E00001L});
	public static final BitSet FOLLOW_importDeclaration_in_compilationUnit128 = new BitSet(new long[]{0x1002080020020012L,0x0000000340E00001L});
	public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit131 = new BitSet(new long[]{0x0002080020020012L,0x0000000340E00001L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_compilationUnit146 = new BitSet(new long[]{0x0002080020020012L,0x0000000340E00001L});
	public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit148 = new BitSet(new long[]{0x0002080020020012L,0x0000000340E00001L});
	public static final BitSet FOLLOW_packageDeclaration_in_compilationUnit169 = new BitSet(new long[]{0x1002080020020012L,0x0000000340E00001L});
	public static final BitSet FOLLOW_importDeclaration_in_compilationUnit172 = new BitSet(new long[]{0x1002080020020012L,0x0000000340E00001L});
	public static final BitSet FOLLOW_typeDeclaration_in_compilationUnit175 = new BitSet(new long[]{0x0002080020020012L,0x0000000340E00001L});
	public static final BitSet FOLLOW_PACKAGE_in_packageDeclaration200 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_packageDeclaration204 = new BitSet(new long[]{0x0000004000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_DOT_in_packageDeclaration229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_packageDeclaration233 = new BitSet(new long[]{0x0000004000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_packageDeclaration282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPORT_in_importDeclaration301 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000002L});
	public static final BitSet FOLLOW_STATIC_in_importDeclaration303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_importDeclaration306 = new BitSet(new long[]{0x0000004000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_DOT_in_importDeclaration309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_importDeclaration311 = new BitSet(new long[]{0x0000004000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_DOT_in_importDeclaration316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_MUL_in_importDeclaration318 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_importDeclaration322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_typeDeclaration341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_typeDeclaration351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceModifiers_in_classOrInterfaceDeclaration390 = new BitSet(new long[]{0x0000080020020000L,0x0000000000000001L});
	public static final BitSet FOLLOW_classDeclaration_in_classOrInterfaceDeclaration393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_classOrInterfaceDeclaration397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceModifier_in_classOrInterfaceModifiers431 = new BitSet(new long[]{0x0002000000020012L,0x0000000300E00000L});
	public static final BitSet FOLLOW_annotation_in_classOrInterfaceModifier456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUBLIC_in_classOrInterfaceModifier468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROTECTED_in_classOrInterfaceModifier480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIVATE_in_classOrInterfaceModifier492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ABSTRACT_in_classOrInterfaceModifier504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_classOrInterfaceModifier516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FINAL_in_classOrInterfaceModifier528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRICTFP_in_classOrInterfaceModifier540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_modifiers559 = new BitSet(new long[]{0x0002000000020012L,0x0000842300E01000L});
	public static final BitSet FOLLOW_normalClassDeclaration_in_classDeclaration579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumDeclaration_in_classDeclaration589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_normalClassDeclaration610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_normalClassDeclaration614 = new BitSet(new long[]{0x0800200000000000L,0x0000000000000210L});
	public static final BitSet FOLLOW_typeParameters_in_normalClassDeclaration635 = new BitSet(new long[]{0x0800200000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_EXTENDS_in_normalClassDeclaration664 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000082L});
	public static final BitSet FOLLOW_type_in_normalClassDeclaration666 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_IMPLEMENTS_in_normalClassDeclaration672 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000082L});
	public static final BitSet FOLLOW_typeList_in_normalClassDeclaration674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_classBody_in_normalClassDeclaration679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_typeParameters700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_typeParameter_in_typeParameters702 = new BitSet(new long[]{0x0080000080000000L});
	public static final BitSet FOLLOW_COMMA_in_typeParameters705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_typeParameter_in_typeParameters707 = new BitSet(new long[]{0x0080000080000000L});
	public static final BitSet FOLLOW_GT_in_typeParameters711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_typeParameter746 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_EXTENDS_in_typeParameter771 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000082L});
	public static final BitSet FOLLOW_typeBound_in_typeParameter773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeBound794 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_BITAND_in_typeBound797 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000082L});
	public static final BitSet FOLLOW_type_in_typeBound799 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_ENUM_in_enumDeclaration820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_enumDeclaration824 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_IMPLEMENTS_in_enumDeclaration849 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000082L});
	public static final BitSet FOLLOW_typeList_in_enumDeclaration851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_enumBody_in_enumDeclaration855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_enumBody876 = new BitSet(new long[]{0x0000000080020000L,0x0000000042000002L});
	public static final BitSet FOLLOW_enumConstants_in_enumBody878 = new BitSet(new long[]{0x0000000080000000L,0x0000000042000000L});
	public static final BitSet FOLLOW_COMMA_in_enumBody881 = new BitSet(new long[]{0x0000000000000000L,0x0000000042000000L});
	public static final BitSet FOLLOW_enumBodyDeclarations_in_enumBody884 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACE_in_enumBody889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumConstant_in_enumConstants922 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_enumConstants925 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000002L});
	public static final BitSet FOLLOW_enumConstant_in_enumConstants927 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_annotations_in_enumConstant948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_enumConstant953 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000110L});
	public static final BitSet FOLLOW_arguments_in_enumConstant977 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_classBody_in_enumConstant980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_enumBodyDeclarations1000 = new BitSet(new long[]{0x800A088032820012L,0x0000C423C0E01293L});
	public static final BitSet FOLLOW_classBodyDeclaration_in_enumBodyDeclarations1003 = new BitSet(new long[]{0x800A088032820012L,0x0000C423C0E01293L});
	public static final BitSet FOLLOW_normalInterfaceDeclaration_in_interfaceDeclaration1029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationTypeDeclaration_in_interfaceDeclaration1039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERFACE_in_normalInterfaceDeclaration1060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_normalInterfaceDeclaration1064 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000210L});
	public static final BitSet FOLLOW_typeParameters_in_normalInterfaceDeclaration1089 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_EXTENDS_in_normalInterfaceDeclaration1117 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000082L});
	public static final BitSet FOLLOW_typeList_in_normalInterfaceDeclaration1119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_interfaceBody_in_normalInterfaceDeclaration1123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeList1142 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_typeList1145 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000082L});
	public static final BitSet FOLLOW_type_in_typeList1147 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_LBRACE_in_classBody1194 = new BitSet(new long[]{0x800A088032820010L,0x0000C423C2E01293L});
	public static final BitSet FOLLOW_classBodyDeclaration_in_classBody1222 = new BitSet(new long[]{0x800A088032820010L,0x0000C423C2E01293L});
	public static final BitSet FOLLOW_RBRACE_in_classBody1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_interfaceBody1282 = new BitSet(new long[]{0x800A088032820010L,0x0000C423C2E01283L});
	public static final BitSet FOLLOW_interfaceBodyDeclaration_in_interfaceBody1306 = new BitSet(new long[]{0x800A088032820010L,0x0000C423C2E01283L});
	public static final BitSet FOLLOW_RBRACE_in_interfaceBody1311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_classBodyDeclaration1354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_classBodyDeclaration1364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_block_in_classBodyDeclaration1367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_classBodyDeclaration1377 = new BitSet(new long[]{0x8008088032820000L,0x0000400080000283L});
	public static final BitSet FOLLOW_memberDecl_in_classBodyDeclaration1379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_genericMethodOrConstructorDecl_in_memberDecl1398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberDeclaration_in_memberDecl1408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_memberDecl1420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_memberDecl1424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_voidMethodDeclaratorRest_in_memberDecl1448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_memberDecl1474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_constructorDeclaratorRest_in_memberDecl1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_memberDecl1524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_memberDecl1554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_memberDeclaration1603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_memberDeclaration1605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_memberDeclaration1615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_fieldDeclaration_in_memberDeclaration1617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeParameters_in_genericMethodOrConstructorDecl1656 = new BitSet(new long[]{0x8008008012800000L,0x0000400080000082L});
	public static final BitSet FOLLOW_genericMethodOrConstructorRest_in_genericMethodOrConstructorDecl1658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_genericMethodOrConstructorRest1692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_genericMethodOrConstructorRest1698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_genericMethodOrConstructorRest1726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_methodDeclaratorRest_in_genericMethodOrConstructorRest1750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_genericMethodOrConstructorRest1762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_constructorDeclaratorRest_in_genericMethodOrConstructorRest1786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_methodDeclaration1807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_methodDeclaratorRest_in_methodDeclaration1831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarators_in_fieldDeclaration1864 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_fieldDeclaration1866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_interfaceBodyDeclaration1895 = new BitSet(new long[]{0x8008088032820000L,0x0000400080000283L});
	public static final BitSet FOLLOW_interfaceMemberDecl_in_interfaceBodyDeclaration1897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_interfaceBodyDeclaration1907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodOrFieldDecl_in_interfaceMemberDecl1926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceGenericMethodDecl_in_interfaceMemberDecl1936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_interfaceMemberDecl1968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_interfaceMemberDecl1972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_voidInterfaceMethodDeclaratorRest_in_interfaceMemberDecl1996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_interfaceMemberDecl2040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDeclaration_in_interfaceMemberDecl2084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_interfaceMethodOrFieldDecl2117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_interfaceMethodOrFieldDecl2121 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000020L});
	public static final BitSet FOLLOW_constantDeclaratorsRest_in_interfaceMethodOrFieldDecl2145 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_interfaceMethodOrFieldDecl2147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_interfaceMethodOrFieldDecl2191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_interfaceMethodOrFieldDecl2195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_interfaceMethodDeclaratorRest_in_interfaceMethodOrFieldDecl2219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_methodDeclaratorRest2252 = new BitSet(new long[]{0x0000000000000000L,0x0000020040000030L});
	public static final BitSet FOLLOW_LBRACKET_in_methodDeclaratorRest2255 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RBRACKET_in_methodDeclaratorRest2257 = new BitSet(new long[]{0x0000000000000000L,0x0000020040000030L});
	public static final BitSet FOLLOW_THROWS_in_methodDeclaratorRest2284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedNameList_in_methodDeclaratorRest2286 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000010L});
	public static final BitSet FOLLOW_methodBody_in_methodDeclaratorRest2302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_methodDeclaratorRest2318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_voidMethodDeclaratorRest2365 = new BitSet(new long[]{0x0000000000000000L,0x0000020040000010L});
	public static final BitSet FOLLOW_THROWS_in_voidMethodDeclaratorRest2390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedNameList_in_voidMethodDeclaratorRest2392 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000010L});
	public static final BitSet FOLLOW_methodBody_in_voidMethodDeclaratorRest2408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_voidMethodDeclaratorRest2424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_interfaceMethodDeclaratorRest2471 = new BitSet(new long[]{0x0000000000000000L,0x0000020040000020L});
	public static final BitSet FOLLOW_LBRACKET_in_interfaceMethodDeclaratorRest2496 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RBRACKET_in_interfaceMethodDeclaratorRest2498 = new BitSet(new long[]{0x0000000000000000L,0x0000020040000020L});
	public static final BitSet FOLLOW_THROWS_in_interfaceMethodDeclaratorRest2503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedNameList_in_interfaceMethodDeclaratorRest2505 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_interfaceMethodDeclaratorRest2511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeParameters_in_interfaceGenericMethodDecl2564 = new BitSet(new long[]{0x8008008012800000L,0x0000400080000082L});
	public static final BitSet FOLLOW_type_in_interfaceGenericMethodDecl2567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_interfaceGenericMethodDecl2571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_interfaceGenericMethodDecl2576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_interfaceMethodDeclaratorRest_in_interfaceGenericMethodDecl2600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_voidInterfaceMethodDeclaratorRest2633 = new BitSet(new long[]{0x0000000000000000L,0x0000020040000000L});
	public static final BitSet FOLLOW_THROWS_in_voidInterfaceMethodDeclaratorRest2658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedNameList_in_voidInterfaceMethodDeclaratorRest2660 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_voidInterfaceMethodDeclaratorRest2666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameters_in_constructorDeclaratorRest2699 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000010L});
	public static final BitSet FOLLOW_THROWS_in_constructorDeclaratorRest2724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedNameList_in_constructorDeclaratorRest2726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_constructorBody_in_constructorDeclaratorRest2730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_constantDeclarator2751 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000020L});
	public static final BitSet FOLLOW_constantDeclaratorRest_in_constantDeclarator2775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators2794 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_variableDeclarators2797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarator_in_variableDeclarators2799 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator2820 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ASG_in_variableDeclarator2845 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C192L});
	public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator2847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclaratorRest_in_constantDeclaratorsRest2868 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_constantDeclaratorsRest2871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_constantDeclarator_in_constantDeclaratorsRest2873 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_LBRACKET_in_constantDeclaratorRest2895 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RBRACKET_in_constantDeclaratorRest2897 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000020L});
	public static final BitSet FOLLOW_ASG_in_constantDeclaratorRest2901 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C192L});
	public static final BitSet FOLLOW_variableInitializer_in_constantDeclaratorRest2903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_variableDeclaratorId2924 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LBRACKET_in_variableDeclaratorId2949 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RBRACKET_in_variableDeclaratorId2951 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer2972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_variableInitializer2982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_arrayInitializer3003 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8209C192L});
	public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer3006 = new BitSet(new long[]{0x0000000080000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayInitializer3009 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C192L});
	public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer3011 = new BitSet(new long[]{0x0000000080000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_arrayInitializer3016 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACE_in_arrayInitializer3025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_modifier3049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUBLIC_in_modifier3061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROTECTED_in_modifier3073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIVATE_in_modifier3085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_modifier3097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ABSTRACT_in_modifier3109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FINAL_in_modifier3121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NATIVE_in_modifier3133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYNCHRONIZED_in_modifier3145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRANSIENT_in_modifier3157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOLATILE_in_modifier3169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRICTFP_in_modifier3181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_enumConstantName3202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceType_in_type3241 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LBRACKET_in_type3266 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RBRACKET_in_type3290 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_primitiveType_in_type3327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LBRACKET_in_type3352 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RBRACKET_in_type3376 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_Identifier_in_classOrInterfaceType3426 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType3451 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_DOT_in_classOrInterfaceType3479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_classOrInterfaceType3483 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType3508 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_primitiveType3566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_primitiveType3588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTE_in_primitiveType3610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_in_primitiveType3632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_primitiveType3654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_in_primitiveType3676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_primitiveType3698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_primitiveType3720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FINAL_in_variableModifier3749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_variableModifier3759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_typeArguments3778 = new BitSet(new long[]{0x8008008012800000L,0x0000000081000082L});
	public static final BitSet FOLLOW_typeArgument_in_typeArguments3780 = new BitSet(new long[]{0x0080000080000000L});
	public static final BitSet FOLLOW_COMMA_in_typeArguments3783 = new BitSet(new long[]{0x8008008012800000L,0x0000000081000082L});
	public static final BitSet FOLLOW_typeArgument_in_typeArguments3785 = new BitSet(new long[]{0x0080000080000000L});
	public static final BitSet FOLLOW_GT_in_typeArguments3789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeArgument3810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUESTIONMARK_in_typeArgument3834 = new BitSet(new long[]{0x0000200000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_set_in_typeArgument3837 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000082L});
	public static final BitSet FOLLOW_type_in_typeArgument3845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList3866 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_qualifiedNameList3869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_qualifiedName_in_qualifiedNameList3871 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_LPAREN_in_formalParameters3894 = new BitSet(new long[]{0x800A008012820000L,0x00000000A0000082L});
	public static final BitSet FOLLOW_formalParameterDecls_in_formalParameters3896 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RPAREN_in_formalParameters3901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_formalParameterDecls3920 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000082L});
	public static final BitSet FOLLOW_type_in_formalParameterDecls3946 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_formalParameterDeclsRest_in_formalParameterDecls3970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest3989 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_formalParameterDeclsRest4014 = new BitSet(new long[]{0x800A008012820000L,0x0000000080000082L});
	public static final BitSet FOLLOW_formalParameterDecls_in_formalParameterDeclsRest4016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_formalParameterDeclsRest4028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterDeclsRest4030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_methodBody4063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_constructorBody4084 = new BitSet(new long[]{0xA65B09A7338B0030L,0x000159FFD2E9C393L});
	public static final BitSet FOLLOW_explicitConstructorInvocation_in_constructorBody4108 = new BitSet(new long[]{0xA65B09A7338B0030L,0x000159FFD2E9C193L});
	public static final BitSet FOLLOW_blockStatement_in_constructorBody4111 = new BitSet(new long[]{0xA65B09A7338B0030L,0x000159FFD2E9C193L});
	public static final BitSet FOLLOW_RBRACE_in_constructorBody4116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation4149 = new BitSet(new long[]{0x0000000000000000L,0x0000008800000000L});
	public static final BitSet FOLLOW_set_in_explicitConstructorInvocation4152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation4160 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_explicitConstructorInvocation4162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_explicitConstructorInvocation4172 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOT_in_explicitConstructorInvocation4174 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000200L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitConstructorInvocation4176 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_SUPER_in_explicitConstructorInvocation4179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_arguments_in_explicitConstructorInvocation4181 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_explicitConstructorInvocation4183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_qualifiedName4205 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_DOT_in_qualifiedName4230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_qualifiedName4234 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_integerLiteral_in_literal4279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FloatingPointLiteral_in_literal4289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CharacterLiteral_in_literal4299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_literal4311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanLiteral_in_literal4335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_literal4345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_annotations4434 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_AT_in_annotation4454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_annotationName_in_annotation4456 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_LPAREN_in_annotation4460 = new BitSet(new long[]{0xA2490186128A0020L,0x000048CCA009C192L});
	public static final BitSet FOLLOW_elementValuePairs_in_annotation4464 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_elementValue_in_annotation4468 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RPAREN_in_annotation4473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_annotationName4497 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_DOT_in_annotationName4522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_annotationName4526 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs4570 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_elementValuePairs4573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_elementValuePair_in_elementValuePairs4575 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Identifier_in_elementValuePair4598 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASG_in_elementValuePair4622 = new BitSet(new long[]{0xA2490186128A0020L,0x000048CC8009C192L});
	public static final BitSet FOLLOW_elementValue_in_elementValuePair4624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_elementValue4643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_elementValue4653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_elementValueArrayInitializer_in_elementValue4663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_elementValueArrayInitializer4684 = new BitSet(new long[]{0xA2490186928A0020L,0x000048CC8209C192L});
	public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer4687 = new BitSet(new long[]{0x0000000080000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_elementValueArrayInitializer4690 = new BitSet(new long[]{0xA2490186128A0020L,0x000048CC8009C192L});
	public static final BitSet FOLLOW_elementValue_in_elementValueArrayInitializer4692 = new BitSet(new long[]{0x0000000080000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_elementValueArrayInitializer4699 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACE_in_elementValueArrayInitializer4705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_in_annotationTypeDeclaration4724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_INTERFACE_in_annotationTypeDeclaration4726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_annotationTypeDeclaration4730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_annotationTypeBody_in_annotationTypeDeclaration4754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_annotationTypeBody4775 = new BitSet(new long[]{0x800A088032820010L,0x0000842382E01083L});
	public static final BitSet FOLLOW_annotationTypeElementDeclaration_in_annotationTypeBody4778 = new BitSet(new long[]{0x800A088032820010L,0x0000842382E01083L});
	public static final BitSet FOLLOW_RBRACE_in_annotationTypeBody4784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifiers_in_annotationTypeElementDeclaration4817 = new BitSet(new long[]{0x8008088032820000L,0x0000000080000083L});
	public static final BitSet FOLLOW_annotationTypeElementRest_in_annotationTypeElementDeclaration4819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_annotationTypeElementRest4838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_annotationMethodOrConstantRest_in_annotationTypeElementRest4840 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_annotationTypeElementRest4842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalClassDeclaration_in_annotationTypeElementRest4852 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_annotationTypeElementRest4854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_normalInterfaceDeclaration_in_annotationTypeElementRest4865 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_annotationTypeElementRest4867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumDeclaration_in_annotationTypeElementRest4878 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_annotationTypeElementRest4880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationTypeDeclaration_in_annotationTypeElementRest4891 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_annotationTypeElementRest4893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationMethodRest_in_annotationMethodOrConstantRest4913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotationConstantRest_in_annotationMethodOrConstantRest4923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_annotationMethodRest4944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_LPAREN_in_annotationMethodRest4968 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RPAREN_in_annotationMethodRest4970 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_defaultValue_in_annotationMethodRest4972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarators_in_annotationConstantRest4992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_in_defaultValue5011 = new BitSet(new long[]{0xA2490186128A0020L,0x000048CC8009C192L});
	public static final BitSet FOLLOW_elementValue_in_defaultValue5013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_block5036 = new BitSet(new long[]{0xA65B09A7338B0030L,0x000159FFD2E9C193L});
	public static final BitSet FOLLOW_blockStatement_in_block5060 = new BitSet(new long[]{0xA65B09A7338B0030L,0x000159FFD2E9C193L});
	public static final BitSet FOLLOW_RBRACE_in_block5065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclarationStatement_in_blockStatement5098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_blockStatement5108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_blockStatement5118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationStatement5138 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_localVariableDeclarationStatement5140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_localVariableDeclaration5159 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000082L});
	public static final BitSet FOLLOW_type_in_localVariableDeclaration5161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclarators_in_localVariableDeclaration5163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifier_in_variableModifiers5182 = new BitSet(new long[]{0x0002000000020002L});
	public static final BitSet FOLLOW_block_in_statement5200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSERT_in_statement5210 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_expression_in_statement5212 = new BitSet(new long[]{0x0000000040000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_statement5215 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_expression_in_statement5217 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statement5221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement5231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_parExpression_in_statement5233 = new BitSet(new long[]{0xA65901A713890020L,0x000159FCD009C192L});
	public static final BitSet FOLLOW_statement_in_statement5235 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_ELSE_in_statement5245 = new BitSet(new long[]{0xA65901A713890020L,0x000159FCD009C192L});
	public static final BitSet FOLLOW_statement_in_statement5247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_statement5259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_LPAREN_in_statement5263 = new BitSet(new long[]{0xA24B0186128A0020L,0x000048CCC009C182L});
	public static final BitSet FOLLOW_forControl_in_statement5265 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RPAREN_in_statement5269 = new BitSet(new long[]{0xA65901A713890020L,0x000159FCD009C192L});
	public static final BitSet FOLLOW_statement_in_statement5279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_statement5289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_parExpression_in_statement5291 = new BitSet(new long[]{0xA65901A713890020L,0x000159FCD009C192L});
	public static final BitSet FOLLOW_statement_in_statement5293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_statement5303 = new BitSet(new long[]{0xA65901A713890020L,0x000159FCD009C192L});
	public static final BitSet FOLLOW_statement_in_statement5305 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_WHILE_in_statement5307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_parExpression_in_statement5309 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statement5311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRY_in_statement5321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_block_in_statement5323 = new BitSet(new long[]{0x0004000008000000L});
	public static final BitSet FOLLOW_catches_in_statement5335 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_FINALLY_in_statement5337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_block_in_statement5339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_statement5351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FINALLY_in_statement5365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_block_in_statement5367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_statement5387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_parExpression_in_statement5389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LBRACE_in_statement5393 = new BitSet(new long[]{0x0000000804000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_switchBlockStatementGroups_in_statement5395 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_RBRACE_in_statement5399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYNCHRONIZED_in_statement5409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_parExpression_in_statement5411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_block_in_statement5413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_statement5423 = new BitSet(new long[]{0xA249018612880020L,0x000048CCC009C182L});
	public static final BitSet FOLLOW_expression_in_statement5425 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statement5428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THROW_in_statement5438 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_expression_in_statement5440 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statement5442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_statement5452 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000002L});
	public static final BitSet FOLLOW_Identifier_in_statement5460 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statement5487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_statement5497 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000002L});
	public static final BitSet FOLLOW_Identifier_in_statement5503 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statement5530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLON_in_statement5540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statementExpression_in_statement5550 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statement5552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement5564 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_statement5588 = new BitSet(new long[]{0xA65901A713890020L,0x000159FCD009C192L});
	public static final BitSet FOLLOW_statement_in_statement5590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catchClause_in_catches5609 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_catchClause_in_catches5612 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_CATCH_in_catchClause5633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_LPAREN_in_catchClause5637 = new BitSet(new long[]{0x800A008012820000L,0x0000000080000082L});
	public static final BitSet FOLLOW_formalCatchParameter_in_catchClause5639 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RPAREN_in_catchClause5643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_block_in_catchClause5653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_formalCatchParameter5672 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000082L});
	public static final BitSet FOLLOW_type_in_formalCatchParameter5674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaratorId_in_formalCatchParameter5676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchBlockStatementGroup_in_switchBlockStatementGroups5710 = new BitSet(new long[]{0x0000000804000002L});
	public static final BitSet FOLLOW_switchLabel_in_switchBlockStatementGroup5731 = new BitSet(new long[]{0xA65B09AF378B0032L,0x000159FFD0E9C193L});
	public static final BitSet FOLLOW_blockStatement_in_switchBlockStatementGroup5734 = new BitSet(new long[]{0xA65B09A7338B0032L,0x000159FFD0E9C193L});
	public static final BitSet FOLLOW_CASE_in_switchLabel5754 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_constantExpression_in_switchLabel5756 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_switchLabel5758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_switchLabel5768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_enumConstantName_in_switchLabel5770 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_switchLabel5772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_in_switchLabel5782 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_switchLabel5784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enhancedForControl_in_forControl5810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forInit_in_forControl5820 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_forControl5823 = new BitSet(new long[]{0xA249018612880020L,0x000048CCC009C182L});
	public static final BitSet FOLLOW_expression_in_forControl5825 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_forControl5828 = new BitSet(new long[]{0xA249018612880022L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_forUpdate_in_forControl5830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_forInit5850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forInit5860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableModifiers_in_enhancedForControl5879 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000082L});
	public static final BitSet FOLLOW_type_in_enhancedForControl5881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_enhancedForControl5885 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_enhancedForControl5909 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_expression_in_enhancedForControl5911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionList_in_forUpdate5930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_parExpression5953 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_expression_in_parExpression5955 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RPAREN_in_parExpression5959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList5978 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_expressionList5981 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_expression_in_expressionList5983 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_expression_in_statementExpression6004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_constantExpression6023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_expression6042 = new BitSet(new long[]{0x008000000000FF82L,0x0000000000000200L});
	public static final BitSet FOLLOW_assignmentOperator_in_expression6045 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_expression_in_expression6047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASG_in_assignmentOperator6068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASGADD_in_assignmentOperator6078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASGSUB_in_assignmentOperator6088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASGMUL_in_assignmentOperator6098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASGDIV_in_assignmentOperator6108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASGBITAND_in_assignmentOperator6118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASGBITOR_in_assignmentOperator6128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASGBITXOR_in_assignmentOperator6138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASGREM_in_assignmentOperator6148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_assignmentOperator6169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LT_in_assignmentOperator6173 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASG_in_assignmentOperator6177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_assignmentOperator6210 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_GT_in_assignmentOperator6214 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_GT_in_assignmentOperator6218 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASG_in_assignmentOperator6222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_assignmentOperator6253 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_GT_in_assignmentOperator6257 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASG_in_assignmentOperator6261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression6290 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_QUESTIONMARK_in_conditionalExpression6294 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6296 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_conditionalExpression6298 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression6322 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_OR_in_conditionalOrExpression6326 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression6328 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression6350 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_AND_in_conditionalAndExpression6354 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression6356 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression6378 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_BITOR_in_inclusiveOrExpression6382 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression6384 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression6406 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_BITXOR_in_exclusiveOrExpression6410 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression6412 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression6434 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_BITAND_in_andExpression6438 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_equalityExpression_in_andExpression6440 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression6462 = new BitSet(new long[]{0x0000100000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_set_in_equalityExpression6466 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression6474 = new BitSet(new long[]{0x0000100000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression6496 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_INSTANCEOF_in_instanceOfExpression6499 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000082L});
	public static final BitSet FOLLOW_type_in_instanceOfExpression6501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression6522 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_relationalOp_in_relationalExpression6526 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_shiftExpression_in_relationalExpression6528 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_LT_in_relationalOp6559 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASG_in_relationalOp6563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_relationalOp6592 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASG_in_relationalOp6596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_relationalOp6616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_relationalOp6626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression6645 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_shiftOp_in_shiftExpression6649 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_additiveExpression_in_shiftExpression6651 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_LT_in_shiftOp6682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LT_in_shiftOp6686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_shiftOp6717 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_GT_in_shiftOp6721 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_GT_in_shiftOp6725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_shiftOp6754 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_GT_in_shiftOp6758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression6788 = new BitSet(new long[]{0x0000000000000022L,0x0000000400000000L});
	public static final BitSet FOLLOW_set_in_additiveExpression6792 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression6800 = new BitSet(new long[]{0x0000000000000022L,0x0000000400000000L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression6822 = new BitSet(new long[]{0x0000001000000002L,0x0000000008000800L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression6826 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression6840 = new BitSet(new long[]{0x0000001000000002L,0x0000000008000800L});
	public static final BitSet FOLLOW_ADD_in_unaryExpression6862 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression6864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_unaryExpression6874 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression6876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INC_in_unaryExpression6886 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression6888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_in_unaryExpression6898 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression6900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression6910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BITNOT_in_unaryExpressionNotPlusMinus6929 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus6931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_unaryExpressionNotPlusMinus6941 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus6943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castExpression_in_unaryExpressionNotPlusMinus6953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus6963 = new BitSet(new long[]{0x2000004400000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus6965 = new BitSet(new long[]{0x2000004400000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LPAREN_in_castExpression6994 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000080L});
	public static final BitSet FOLLOW_primitiveType_in_castExpression6996 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RPAREN_in_castExpression7000 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_unaryExpression_in_castExpression7002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_castExpression7014 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_type_in_castExpression7017 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_expression_in_castExpression7021 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RPAREN_in_castExpression7026 = new BitSet(new long[]{0x8249018212880000L,0x000048C88009C182L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_castExpression7028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parExpression_in_primary7047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIS_in_primary7057 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000120L});
	public static final BitSet FOLLOW_DOT_in_primary7060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primary7064 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000120L});
	public static final BitSet FOLLOW_identifierSuffix_in_primary7091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_in_primary7102 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_superSuffix_in_primary7104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_primary7114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_primary7124 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000282L});
	public static final BitSet FOLLOW_creator_in_primary7126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primary7138 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000120L});
	public static final BitSet FOLLOW_DOT_in_primary7163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primary7167 = new BitSet(new long[]{0x0000004000000002L,0x0000000000000120L});
	public static final BitSet FOLLOW_identifierSuffix_in_primary7194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_primary7205 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LBRACKET_in_primary7208 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RBRACKET_in_primary7210 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_DOT_in_primary7214 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_CLASS_in_primary7216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_primary7226 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOT_in_primary7228 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_CLASS_in_primary7230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_identifierSuffix7250 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RBRACKET_in_identifierSuffix7252 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_DOT_in_identifierSuffix7256 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_CLASS_in_identifierSuffix7258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_identifierSuffix7269 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_expression_in_identifierSuffix7271 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RBRACKET_in_identifierSuffix7273 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_arguments_in_identifierSuffix7285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_identifierSuffix7295 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_CLASS_in_identifierSuffix7297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_identifierSuffix7307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_explicitGenericInvocation_in_identifierSuffix7309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_identifierSuffix7319 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_THIS_in_identifierSuffix7321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_identifierSuffix7331 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_SUPER_in_identifierSuffix7333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_arguments_in_identifierSuffix7335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_identifierSuffix7345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_NEW_in_identifierSuffix7347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000202L});
	public static final BitSet FOLLOW_innerCreator_in_identifierSuffix7349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_creator7368 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000082L});
	public static final BitSet FOLLOW_createdName_in_creator7370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_classCreatorRest_in_creator7372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createdName_in_creator7382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000120L});
	public static final BitSet FOLLOW_arrayCreatorRest_in_creator7385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classCreatorRest_in_creator7389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceType_in_createdName7429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveType_in_createdName7453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_innerCreator7472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_innerCreator7477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_classCreatorRest_in_innerCreator7501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_arrayCreatorRest7520 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8409C182L});
	public static final BitSet FOLLOW_RBRACKET_in_arrayCreatorRest7534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
	public static final BitSet FOLLOW_LBRACKET_in_arrayCreatorRest7537 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RBRACKET_in_arrayCreatorRest7539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
	public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest7543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_arrayCreatorRest7557 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RBRACKET_in_arrayCreatorRest7559 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LBRACKET_in_arrayCreatorRest7562 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_expression_in_arrayCreatorRest7564 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RBRACKET_in_arrayCreatorRest7566 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LBRACKET_in_arrayCreatorRest7571 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RBRACKET_in_arrayCreatorRest7573 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_arguments_in_classCreatorRest7604 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_classBody_in_classCreatorRest7632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_explicitGenericInvocation7676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_explicitGenericInvocation7680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_arguments_in_explicitGenericInvocation7704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_nonWildcardTypeArguments7723 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000082L});
	public static final BitSet FOLLOW_typeList_in_nonWildcardTypeArguments7725 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_GT_in_nonWildcardTypeArguments7727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_selector7751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_selector7755 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_arguments_in_selector7803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_selector7815 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_THIS_in_selector7817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_selector7827 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_SUPER_in_selector7829 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_superSuffix_in_selector7831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_selector7841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_NEW_in_selector7843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000202L});
	public static final BitSet FOLLOW_innerCreator_in_selector7845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_selector7855 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_expression_in_selector7857 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RBRACKET_in_selector7859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arguments_in_superSuffix7883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_superSuffix7893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_superSuffix7897 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_arguments_in_superSuffix7945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_arguments7988 = new BitSet(new long[]{0xA249018612880020L,0x000048CCA009C182L});
	public static final BitSet FOLLOW_expressionList_in_arguments7990 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RPAREN_in_arguments7995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotations_in_synpred5_JavaParser112 = new BitSet(new long[]{0x0002080020020010L,0x0000000300F00001L});
	public static final BitSet FOLLOW_packageDeclaration_in_synpred5_JavaParser126 = new BitSet(new long[]{0x1002080020020012L,0x0000000340E00001L});
	public static final BitSet FOLLOW_importDeclaration_in_synpred5_JavaParser128 = new BitSet(new long[]{0x1002080020020012L,0x0000000340E00001L});
	public static final BitSet FOLLOW_typeDeclaration_in_synpred5_JavaParser131 = new BitSet(new long[]{0x0002080020020012L,0x0000000340E00001L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred5_JavaParser146 = new BitSet(new long[]{0x0002080020020012L,0x0000000340E00001L});
	public static final BitSet FOLLOW_typeDeclaration_in_synpred5_JavaParser148 = new BitSet(new long[]{0x0002080020020012L,0x0000000340E00001L});
	public static final BitSet FOLLOW_type_in_synpred54_JavaParser1603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_synpred54_JavaParser1605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_synpred62_JavaParser2117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_synpred62_JavaParser2121 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000020L});
	public static final BitSet FOLLOW_constantDeclaratorsRest_in_synpred62_JavaParser2145 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_synpred62_JavaParser2147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_explicitConstructorInvocation_in_synpred115_JavaParser4108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonWildcardTypeArguments_in_synpred119_JavaParser4149 = new BitSet(new long[]{0x0000000000000000L,0x0000008800000000L});
	public static final BitSet FOLLOW_set_in_synpred119_JavaParser4152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_arguments_in_synpred119_JavaParser4160 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_synpred119_JavaParser4162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_synpred130_JavaParser4434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclarationStatement_in_synpred153_JavaParser5098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classOrInterfaceDeclaration_in_synpred154_JavaParser5108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_synpred159_JavaParser5245 = new BitSet(new long[]{0xA65901A713890020L,0x000159FCD009C192L});
	public static final BitSet FOLLOW_statement_in_synpred159_JavaParser5247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_synpred164_JavaParser5335 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_FINALLY_in_synpred164_JavaParser5337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_block_in_synpred164_JavaParser5339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_catches_in_synpred165_JavaParser5351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchLabel_in_synpred180_JavaParser5731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_synpred182_JavaParser5754 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_constantExpression_in_synpred182_JavaParser5756 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_synpred182_JavaParser5758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_synpred183_JavaParser5768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_enumConstantName_in_synpred183_JavaParser5770 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_synpred183_JavaParser5772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enhancedForControl_in_synpred184_JavaParser5810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_synpred188_JavaParser5850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentOperator_in_synpred190_JavaParser6045 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_expression_in_synpred190_JavaParser6047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_synpred200_JavaParser6159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LT_in_synpred200_JavaParser6161 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASG_in_synpred200_JavaParser6163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_synpred201_JavaParser6198 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_GT_in_synpred201_JavaParser6200 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_GT_in_synpred201_JavaParser6202 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASG_in_synpred201_JavaParser6204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_synpred202_JavaParser6243 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_GT_in_synpred202_JavaParser6245 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASG_in_synpred202_JavaParser6247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_synpred213_JavaParser6551 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASG_in_synpred213_JavaParser6553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_synpred214_JavaParser6584 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASG_in_synpred214_JavaParser6586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_synpred217_JavaParser6674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LT_in_synpred217_JavaParser6676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_synpred218_JavaParser6707 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_GT_in_synpred218_JavaParser6709 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_GT_in_synpred218_JavaParser6711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_synpred219_JavaParser6746 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_GT_in_synpred219_JavaParser6748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_castExpression_in_synpred231_JavaParser6953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred235_JavaParser6994 = new BitSet(new long[]{0x8008008012800000L,0x0000000080000080L});
	public static final BitSet FOLLOW_primitiveType_in_synpred235_JavaParser6996 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred235_JavaParser7000 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_unaryExpression_in_synpred235_JavaParser7002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_synpred236_JavaParser7017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred238_JavaParser7060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_synpred238_JavaParser7064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_synpred239_JavaParser7091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_synpred244_JavaParser7163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_synpred244_JavaParser7167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierSuffix_in_synpred245_JavaParser7194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred251_JavaParser7269 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_expression_in_synpred251_JavaParser7271 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RBRACKET_in_synpred251_JavaParser7273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred264_JavaParser7562 = new BitSet(new long[]{0xA249018612880020L,0x000048CC8009C182L});
	public static final BitSet FOLLOW_expression_in_synpred264_JavaParser7564 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RBRACKET_in_synpred264_JavaParser7566 = new BitSet(new long[]{0x0000000000000002L});
}

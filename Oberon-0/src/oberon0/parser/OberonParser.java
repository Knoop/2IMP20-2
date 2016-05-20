package oberon0.parser;

import java.util.List;
import oberon0.parser.ast.*;
import beaver.*;
import java.util.LinkedList;
import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "Oberon0.grammar".
 */
public class OberonParser extends Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short IDENTIFIER = 1;
		static public final short PAR_OPEN = 2;
		static public final short NUMBER = 3;
		static public final short TILDE = 4;
		static public final short PLUS = 5;
		static public final short MINUS = 6;
		static public final short SEMICOLON = 7;
		static public final short END = 8;
		static public final short WHILE = 9;
		static public final short IF = 10;
		static public final short PAR_CLOSE = 11;
		static public final short OR = 12;
		static public final short STAR = 13;
		static public final short DIV = 14;
		static public final short MOD = 15;
		static public final short AMP = 16;
		static public final short ARRAY = 17;
		static public final short RECORD = 18;
		static public final short VAR = 19;
		static public final short COMMA = 20;
		static public final short DOT = 21;
		static public final short EQ = 22;
		static public final short COLON = 23;
		static public final short PROCEDURE = 24;
		static public final short CONST = 25;
		static public final short TYPE = 26;
		static public final short THEN = 27;
		static public final short ELSIF = 28;
		static public final short BRACK_OPEN = 29;
		static public final short ELSE = 30;
		static public final short MODULE = 31;
		static public final short DO = 32;
		static public final short OF = 33;
		static public final short BRACK_CLOSE = 34;
		static public final short BEGIN = 35;
		static public final short ASSIGN = 36;
		static public final short HASH = 37;
		static public final short ST = 38;
		static public final short SEQ = 39;
		static public final short GT = 40;
		static public final short GEQ = 41;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9ozbtcyLLKLnt$dt8VtwGir7oWo#XHH7i93UF2ObK50OX3XYH04ZeLbcfP9IffZgHZcX23" +
		"YX2Cgq61cPc9gascIYLbMb55f53PGYQs#Uvzzxzttlilx#9VtVdxxjzRQQw#pfxFsFb8wIG" +
		"Tgk7geHSFKHOTgP93tHvwXtjf3gGxG7Rf5f#kZ#fWMQxdsqgcwLJrrfyxGkHgjepHMutMCE" +
		"jg$DKchohphDHdl3dQZfYgdZsWVxQiFQZ$TJisKyAmnFAjKyu6e1vtfGKax6Ar6goFB4LYQ" +
		"rK#D6gG#6b2GxV78PtfPZ9bezMLjIa#U5VcTwFqo$MZq#iXlNYGlYDeiQYVsoP7VsMKzkgX" +
		"DgxsBhQgCxNsHJujMS7S#sGZ6CO9Ccb2K9Y8TgsuwN0CrfDYcm2LxNhsAA$Qo5keuDHIzUg" +
		"YxEkqsHe5hstXKwFQVegMZVKDVzELoUyV#opw#8UpWh7HzxygklbPpTANcKwxGVFkMrX5hJ" +
		"rrAMQUlQ8Ec#PuUv4ltxbod#ttRmyAxq#JB4RhNyoZlKy0X#1mFre62hLaFWf41v$YuCJwX" +
		"2$HbBT65Mehq1SyVrsSOorLUVa2VroMwm7wfJsUIRd9ssyBiNe5s9VtewsiQx5VgxwL7VCl" +
		"PMk#r7ZeI30P3TO8#p1njL4UTeijr6NDqDVyJz2NTYFrdkaThTJUnhxRVw4DwMDUhLIVPrp" +
		"NNlgfFyZzJdz9P#Yp$zJfFdzCoNQppAQy1otIpLcgDxj93Sh$RjCnUiTVjrvAzvYttgGCPf" +
		"v6rEuAU3Y0NbEGcLd4QOzgVUHf5rXb3tZcQDsSEkMS2kQGBizcLdTU7bJYS4UVP7Qsyxx5t" +
		"8s#ayrx4Y196FOXHDxCtXbApC7fMUKtSWt8jJyuejoJaonnPoesZ8DUr6wEnh4rxJoxfZML" +
		"#xRLvhx7VIwjgOti$v7W5T#SJpqrRAMK$PrcrqAR09Nijfqt1MiiRlnVlGq5taNhlDaQ9Ap" +
		"qgTHKjRdUs#B8UkB8bxE2ipFe#XJpQdVUi9#KaoZfEseH#pgOyXDmmcHpfUfhuqit3FF9Br" +
		"hRmxcJbWi3Efu23yUa6neA2BI5cWfxX61ytndIi4ydnmybmIU0JkIcq13dlpws4diuDKi6t" +
		"CsD968lhXwlfWK#TbpAFSSo1qnfzvium5QkRem9Q66ydh0VmTtfAjffFr4veTTWcOJl8dmg" +
		"rM5t$y#GB9zNJwppS47JtptjBeXRZ5rfWGyvxInthjV5Y2fGTK3Cu3dIGadF04B00B0LdWN" +
		"F1SkfxmjUxTfN0tfTYIOZv3dGljblWq#1Ue2duRGcyCcDjGhwX8jPWq0#CATdqFFfReNuY6" +
		"0jc1hqrQZitaey79uDvu0nm2iRDy8Fmgx3BrkJev17u3VXH#4tuiUYv2wLqln3lCeeTKTrE" +
		"RAl1a#1C$BfazhGhnRjmBVQdmDd8tU6duJJ4oY4dy3DmJR2TNdrkqzw13mrSZ#y#S4FaqpT" +
		"mO#1k#Bm87zOsNj8PE#sJbuFl0B17a8#C$7Q1hS4#g4g$1WTk3lwCETc6tXJv3CIsEDIFH6" +
		"TlfIsXRk$0mu3hqt0m0Z$M87M#ev1Pf$J0u3SQvB5j3tfnVx3dDaVoTh2f#bmghALMLAkdt" +
		"KjGhqWlxDTvWHi2Zww8swVjivBp0pyN#KLparmO#9N0hqPrhrN4kYZmfI5Efy2d1duxyCx0" +
		"koh6zNf5VyT6ykJ0CuZ$U8NV$C2yEycpGLuSrPyNU6baUo6E4OtXai1R8z#hAdok2Rmjigs" +
		"g7a$NXVerWO#AsgojY5kcLzHD3Bmbicsez6CEmpgfGpkndeZa6HLrIp9ESq7VL5wlZGe$Ur" +
		"TjVhR9dhLdx7lsj7q7xKdRG4dcill07RRQLi0tUy#RRBtT3wy5jzkjthOAt0tMW9L6PhRRx" +
		"4wx2oPJsptWOK16j7M036aFsBVj2T$sCLz#qnwDUlErDlrxgYXzrtRP$sod$Sl#QV#m7VPN" +
		"#vkz7Ugssz$jJVkJ$TdU2fO$salsKtinQ2yOcTv#Oi$RZ#p7tl83y7rxpdveVx4tx7VsU$j" +
		"3yDrgsznSsM#3ljcjKfMP#qNWdmFo2Lz5upaHntFAJa2RW3mDdWOluhISWtqaSepf7Yat0e" +
		"64MrlA6Lp36vE0b3k1GC9TBkKyhk4qJK3AhKKWuOQNSeRNSC$BSQxBd#sZa3bbGS9fd#D#u" +
		"v1mQv6$3Kt6VnRoBEIPoCFydIF3SFGH#1zBlRjzp4QUxMyXEUuI3kuhe1n3iG#5Xt3E3q9k" +
		"fMqh#c3wnYa74huYSdn1vFnNn3Xiu#1cRazJQJCLloPqXu7uL4D$wlfxpk1kg1aIxcWEkJB" +
		"qmvR1oQc$eJV2KpnoEkd$URM5LG==");

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	private final Action[] actions;

	public OberonParser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			new Action() {	// [0] lst$declaration = declaration
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1].value); return new Symbol(lst);
				}
			},
			new Action() {	// [1] lst$declaration = lst$declaration declaration
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2].value); return _symbols[offset + 1];
				}
			},
			Action.NONE,  	// [2] opt$lst$declaration = 
			Action.RETURN,	// [3] opt$lst$declaration = lst$declaration
			Action.NONE,  	// [4] opt$begin_statement_sequence = 
			Action.RETURN,	// [5] opt$begin_statement_sequence = begin_statement_sequence
			new Action() {	// [6] module = MODULE IDENTIFIER.i1 SEMICOLON opt$lst$declaration.ds opt$begin_statement_sequence.bs END IDENTIFIER.i2 DOT
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i1 = _symbols[offset + 2];
					final String i1 = (String) _symbol_i1.value;
					final Symbol _symbol_ds = _symbols[offset + 4];
					final ArrayList _list_ds = (ArrayList) _symbol_ds.value;
					final Declaration[] ds = _list_ds == null ? new Declaration[0] : (Declaration[]) _list_ds.toArray(new Declaration[_list_ds.size()]);
					final Symbol _symbol_bs = _symbols[offset + 5];
					final Sequence<Statement> bs = (Sequence<Statement>) _symbol_bs.value;
					final Symbol _symbol_i2 = _symbols[offset + 7];
					final String i2 = (String) _symbol_i2.value;
					 return new Module(i1, i2, ds, bs.getElements());
				}
			},
			new Action() {	// [7] begin_statement_sequence = BEGIN statement_sequence.ss
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_ss = _symbols[offset + 2];
					final List<Statement> ss = (List<Statement>) _symbol_ss.value;
					 return new Sequence(ss);
				}
			},
			Action.RETURN,	// [8] declaration = const_declaration.cd
			Action.RETURN,	// [9] declaration = type_declaration.td
			Action.RETURN,	// [10] declaration = var_declaration.vd
			Action.RETURN,	// [11] declaration = procedure_declaration.pd
			new Action() {	// [12] lst$const_declaration_assign = const_declaration_assign
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1].value); return new Symbol(lst);
				}
			},
			new Action() {	// [13] lst$const_declaration_assign = lst$const_declaration_assign const_declaration_assign
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2].value); return _symbols[offset + 1];
				}
			},
			Action.NONE,  	// [14] opt$lst$const_declaration_assign = 
			Action.RETURN,	// [15] opt$lst$const_declaration_assign = lst$const_declaration_assign
			new Action() {	// [16] const_declaration = CONST opt$lst$const_declaration_assign.cda
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_cda = _symbols[offset + 2];
					final ArrayList _list_cda = (ArrayList) _symbol_cda.value;
					final ConstDeclarationAssignment[] cda = _list_cda == null ? new ConstDeclarationAssignment[0] : (ConstDeclarationAssignment[]) _list_cda.toArray(new ConstDeclarationAssignment[_list_cda.size()]);
					 return new ConstDeclaration(cda);
				}
			},
			new Action() {	// [17] const_declaration_assign = IDENTIFIER.i EQ expression.e SEMICOLON
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final String i = (String) _symbol_i.value;
					final Symbol _symbol_e = _symbols[offset + 3];
					final Expression e = (Expression) _symbol_e.value;
					 return new ConstDeclarationAssignment(i, e);
				}
			},
			new Action() {	// [18] lst$type_declaration_assign = type_declaration_assign
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1].value); return new Symbol(lst);
				}
			},
			new Action() {	// [19] lst$type_declaration_assign = lst$type_declaration_assign type_declaration_assign
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2].value); return _symbols[offset + 1];
				}
			},
			Action.NONE,  	// [20] opt$lst$type_declaration_assign = 
			Action.RETURN,	// [21] opt$lst$type_declaration_assign = lst$type_declaration_assign
			new Action() {	// [22] type_declaration = TYPE opt$lst$type_declaration_assign.tda
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_tda = _symbols[offset + 2];
					final ArrayList _list_tda = (ArrayList) _symbol_tda.value;
					final TypeDeclarationAssignment[] tda = _list_tda == null ? new TypeDeclarationAssignment[0] : (TypeDeclarationAssignment[]) _list_tda.toArray(new TypeDeclarationAssignment[_list_tda.size()]);
					 return new TypeDeclaration(tda);
				}
			},
			new Action() {	// [23] type_declaration_assign = IDENTIFIER.i EQ type.t SEMICOLON
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final String i = (String) _symbol_i.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Type t = (Type) _symbol_t.value;
					 return new TypeDeclarationAssignment(i, t);
				}
			},
			new Action() {	// [24] lst$var_declaration_assignment = var_declaration_assignment
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1].value); return new Symbol(lst);
				}
			},
			new Action() {	// [25] lst$var_declaration_assignment = lst$var_declaration_assignment var_declaration_assignment
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2].value); return _symbols[offset + 1];
				}
			},
			Action.NONE,  	// [26] opt$lst$var_declaration_assignment = 
			Action.RETURN,	// [27] opt$lst$var_declaration_assignment = lst$var_declaration_assignment
			new Action() {	// [28] var_declaration = VAR opt$lst$var_declaration_assignment.vda
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_vda = _symbols[offset + 2];
					final ArrayList _list_vda = (ArrayList) _symbol_vda.value;
					final VarDeclarationAssignment[] vda = _list_vda == null ? new VarDeclarationAssignment[0] : (VarDeclarationAssignment[]) _list_vda.toArray(new VarDeclarationAssignment[_list_vda.size()]);
					 return new VarDeclaration(vda);
				}
			},
			new Action() {	// [29] var_declaration_assignment = ident_list.il COLON type.t SEMICOLON
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_il = _symbols[offset + 1];
					final List<String> il = (List<String>) _symbol_il.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Type t = (Type) _symbol_t.value;
					 return new VarDeclarationAssignment(il, t);
				}
			},
			new Action() {	// [30] procedure_declaration = procedure_heading.ph SEMICOLON procedure_body.pb
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_ph = _symbols[offset + 1];
					final ProcedureHeading ph = (ProcedureHeading) _symbol_ph.value;
					final Symbol _symbol_pb = _symbols[offset + 3];
					final ProcedureBody pb = (ProcedureBody) _symbol_pb.value;
					 return new ProcedureDeclaration(ph, pb);
				}
			},
			Action.NONE,  	// [31] opt$procedure_heading_param = 
			Action.RETURN,	// [32] opt$procedure_heading_param = procedure_heading_param
			new Action() {	// [33] procedure_heading = PROCEDURE IDENTIFIER.i opt$procedure_heading_param.php
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 2];
					final String i = (String) _symbol_i.value;
					final Symbol _symbol_php = _symbols[offset + 3];
					final List<FormalParam> php = (List<FormalParam>) _symbol_php.value;
					 return new ProcedureHeading(i, php);
				}
			},
			Action.NONE,  	// [34] opt$formal_params = 
			Action.RETURN,	// [35] opt$formal_params = formal_params
			RETURN2,	// [36] procedure_heading_param = PAR_OPEN opt$formal_params.fps PAR_CLOSE
			new Action() {	// [37] formal_params = formal_params.fps SEMICOLON formal_param.fp
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_fps = _symbols[offset + 1];
					final List<FormalParam> fps = (List<FormalParam>) _symbol_fps.value;
					final Symbol _symbol_fp = _symbols[offset + 3];
					final FormalParam fp = (FormalParam) _symbol_fp.value;
					 fps.add(fp); return new Sequence(fps);
				}
			},
			new Action() {	// [38] formal_params = formal_param.fp
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_fp = _symbols[offset + 1];
					final FormalParam fp = (FormalParam) _symbol_fp.value;
					 List<FormalParam> l = new LinkedList<>(); l.add(fp); return new Sequence(l);
				}
			},
			Action.NONE,  	// [39] opt$VAR = 
			Action.RETURN,	// [40] opt$VAR = VAR
			new Action() {	// [41] formal_param = opt$VAR ident_list.il COLON type.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_il = _symbols[offset + 2];
					final List<String> il = (List<String>) _symbol_il.value;
					final Symbol _symbol_t = _symbols[offset + 4];
					final Type t = (Type) _symbol_t.value;
					 return new FormalParam(il, t);
				}
			},
			Action.NONE,  	// [42] opt$statement_sequence = 
			Action.RETURN,	// [43] opt$statement_sequence = statement_sequence
			new Action() {	// [44] procedure_body = opt$lst$declaration.d opt$statement_sequence.ss END IDENTIFIER.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_d = _symbols[offset + 1];
					final ArrayList _list_d = (ArrayList) _symbol_d.value;
					final Declaration[] d = _list_d == null ? new Declaration[0] : (Declaration[]) _list_d.toArray(new Declaration[_list_d.size()]);
					final Symbol _symbol_ss = _symbols[offset + 2];
					final List<Statement> ss = (List<Statement>) _symbol_ss.value;
					final Symbol _symbol_i = _symbols[offset + 4];
					final String i = (String) _symbol_i.value;
					 return new ProcedureBody(d, ss, i);
				}
			},
			new Action() {	// [45] type = IDENTIFIER.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final String i = (String) _symbol_i.value;
					 return new LiteralType(i);
				}
			},
			Action.RETURN,	// [46] type = array_type.at
			Action.RETURN,	// [47] type = record_type.rt
			new Action() {	// [48] array_type = ARRAY expression.e OF type.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final Expression e = (Expression) _symbol_e.value;
					final Symbol _symbol_t = _symbols[offset + 4];
					final Type t = (Type) _symbol_t.value;
					 return new ArrayType(e, t);
				}
			},
			new Action() {	// [49] record_type = RECORD field_list.fls END
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_fls = _symbols[offset + 2];
					final List<Field> fls = (List<Field>) _symbol_fls.value;
					 return new RecordType(fls);
				}
			},
			Action.NONE,  	// [50] opt$field = 
			Action.RETURN,	// [51] opt$field = field
			new Action() {	// [52] field_list = field_list.fls SEMICOLON opt$field.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_fls = _symbols[offset + 1];
					final List<Field> fls = (List<Field>) _symbol_fls.value;
					final Symbol _symbol_f = _symbols[offset + 3];
					final Field f = (Field) _symbol_f.value;
					 fls.add(f); return new Sequence(fls);
				}
			},
			new Action() {	// [53] field_list = opt$field.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_f = _symbols[offset + 1];
					final Field f = (Field) _symbol_f.value;
					 List<Field> l = new LinkedList<>(); l.add(f); return new Sequence(l);
				}
			},
			new Action() {	// [54] field = ident_list.il COLON type.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_il = _symbols[offset + 1];
					final List<String> il = (List<String>) _symbol_il.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Type t = (Type) _symbol_t.value;
					 return new Field(il, t);
				}
			},
			new Action() {	// [55] ident_list = ident_list.il COMMA IDENTIFIER.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_il = _symbols[offset + 1];
					final List<String> il = (List<String>) _symbol_il.value;
					final Symbol _symbol_i = _symbols[offset + 3];
					final String i = (String) _symbol_i.value;
					 il.add(i); return new Sequence(il);
				}
			},
			new Action() {	// [56] ident_list = IDENTIFIER.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final String i = (String) _symbol_i.value;
					 List<String> il = new LinkedList<>(); il.add(i); return new Sequence(il);
				}
			},
			Action.RETURN,	// [57] statement = assignment_statement.a
			Action.RETURN,	// [58] statement = procedure_call_statement.pc
			Action.RETURN,	// [59] statement = if_statement.is
			Action.RETURN,	// [60] statement = while_statement.ws
			new Action() {	// [61] statement_sequence = statement_sequence.ss SEMICOLON statement.s
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_ss = _symbols[offset + 1];
					final List<Statement> ss = (List<Statement>) _symbol_ss.value;
					final Symbol _symbol_s = _symbols[offset + 3];
					final Statement s = (Statement) _symbol_s.value;
					 ss.add(s); return new Sequence(ss);
				}
			},
			new Action() {	// [62] statement_sequence = statement.s
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_s = _symbols[offset + 1];
					final Statement s = (Statement) _symbol_s.value;
					 List<Statement> ls = new LinkedList<>(); ls.add(s); return new Sequence(ls);
				}
			},
			new Action() {	// [63] while_statement = WHILE expression.e DO statement_sequence.ss END
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final Expression e = (Expression) _symbol_e.value;
					final Symbol _symbol_ss = _symbols[offset + 4];
					final List<Statement> ss = (List<Statement>) _symbol_ss.value;
					 return new WhileStatement(e, ss);
				}
			},
			new Action() {	// [64] assignment_statement = reference.rf ASSIGN expression.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_rf = _symbols[offset + 1];
					final Reference rf = (Reference) _symbol_rf.value;
					final Symbol _symbol_e = _symbols[offset + 3];
					final Expression e = (Expression) _symbol_e.value;
					 return new AssignStatement(rf, e);
				}
			},
			Action.NONE,  	// [65] opt$actual_params = 
			Action.RETURN,	// [66] opt$actual_params = actual_params
			new Action() {	// [67] procedure_call_statement = reference.rf opt$actual_params.aps
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_rf = _symbols[offset + 1];
					final Reference rf = (Reference) _symbol_rf.value;
					final Symbol _symbol_aps = _symbols[offset + 2];
					final List<Expression> aps = (List<Expression>) _symbol_aps.value;
					 return new ProcedureCallStatement(rf, aps);
				}
			},
			Action.NONE,  	// [68] opt$expressions = 
			Action.RETURN,	// [69] opt$expressions = expressions
			RETURN2,	// [70] actual_params = PAR_OPEN opt$expressions.es PAR_CLOSE
			new Action() {	// [71] expressions = expressions.es COMMA expression.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_es = _symbols[offset + 1];
					final List<Expression> es = (List<Expression>) _symbol_es.value;
					final Symbol _symbol_e = _symbols[offset + 3];
					final Expression e = (Expression) _symbol_e.value;
					 es.add(e); return new Sequence(es);
				}
			},
			new Action() {	// [72] expressions = expression.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 1];
					final Expression e = (Expression) _symbol_e.value;
					 List<Expression> es = new LinkedList<>(); es.add(e); return new Sequence(es);
				}
			},
			Action.NONE,  	// [73] opt$otherwise = 
			Action.RETURN,	// [74] opt$otherwise = otherwise
			new Action() {	// [75] if_statement = IF expression.e THEN statement_sequence.ss opt$otherwise.o END
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final Expression e = (Expression) _symbol_e.value;
					final Symbol _symbol_ss = _symbols[offset + 4];
					final List<Statement> ss = (List<Statement>) _symbol_ss.value;
					final Symbol _symbol_o = _symbols[offset + 5];
					final ElseStatement o = (ElseStatement) _symbol_o.value;
					 return new IfStatement(e, ss, o);
				}
			},
			new Action() {	// [76] otherwise = ELSIF expression.e THEN statement_sequence.ss opt$otherwise.o
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final Expression e = (Expression) _symbol_e.value;
					final Symbol _symbol_ss = _symbols[offset + 4];
					final List<Statement> ss = (List<Statement>) _symbol_ss.value;
					final Symbol _symbol_o = _symbols[offset + 5];
					final ElseStatement o = (ElseStatement) _symbol_o.value;
					 return new ElseStatement(new IfStatement(e, ss, o));
				}
			},
			new Action() {	// [77] otherwise = ELSE statement_sequence.ss
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_ss = _symbols[offset + 2];
					final List<Statement> ss = (List<Statement>) _symbol_ss.value;
					 return new ElseStatement(ss);
				}
			},
			Action.RETURN,	// [78] expression = simple_expression.se
			Action.RETURN,	// [79] expression = comparison.c
			new Action() {	// [80] comparison = simple_expression.se1 EQ simple_expression.se2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se1 = _symbols[offset + 1];
					final Expression se1 = (Expression) _symbol_se1.value;
					final Symbol _symbol_se2 = _symbols[offset + 3];
					final Expression se2 = (Expression) _symbol_se2.value;
					 return new EqualComparison(se1, se2);
				}
			},
			new Action() {	// [81] comparison = simple_expression.se1 HASH simple_expression.se2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se1 = _symbols[offset + 1];
					final Expression se1 = (Expression) _symbol_se1.value;
					final Symbol _symbol_se2 = _symbols[offset + 3];
					final Expression se2 = (Expression) _symbol_se2.value;
					 return new HashComparison(se1, se2);
				}
			},
			new Action() {	// [82] comparison = simple_expression.se1 ST simple_expression.se2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se1 = _symbols[offset + 1];
					final Expression se1 = (Expression) _symbol_se1.value;
					final Symbol _symbol_se2 = _symbols[offset + 3];
					final Expression se2 = (Expression) _symbol_se2.value;
					 return new SmallerComparison(se1, se2);
				}
			},
			new Action() {	// [83] comparison = simple_expression.se1 SEQ simple_expression.se2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se1 = _symbols[offset + 1];
					final Expression se1 = (Expression) _symbol_se1.value;
					final Symbol _symbol_se2 = _symbols[offset + 3];
					final Expression se2 = (Expression) _symbol_se2.value;
					 return new SmallerEqualComparison(se1, se2);
				}
			},
			new Action() {	// [84] comparison = simple_expression.se1 GT simple_expression.se2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se1 = _symbols[offset + 1];
					final Expression se1 = (Expression) _symbol_se1.value;
					final Symbol _symbol_se2 = _symbols[offset + 3];
					final Expression se2 = (Expression) _symbol_se2.value;
					 return new GreaterComparison(se1, se2);
				}
			},
			new Action() {	// [85] comparison = simple_expression.se1 GEQ simple_expression.se2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se1 = _symbols[offset + 1];
					final Expression se1 = (Expression) _symbol_se1.value;
					final Symbol _symbol_se2 = _symbols[offset + 3];
					final Expression se2 = (Expression) _symbol_se2.value;
					 return new GreaterEqualComparison(se1, se2);
				}
			},
			Action.RETURN,	// [86] simple_expression = signed_term.st
			new Action() {	// [87] simple_expression = simple_expression.se PLUS term.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se = _symbols[offset + 1];
					final Expression se = (Expression) _symbol_se.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Term t = (Term) _symbol_t.value;
					 return new AddExpression(se, t);
				}
			},
			new Action() {	// [88] simple_expression = simple_expression.se MINUS term.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se = _symbols[offset + 1];
					final Expression se = (Expression) _symbol_se.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Term t = (Term) _symbol_t.value;
					 return new SubtractExpression(se, t);
				}
			},
			new Action() {	// [89] simple_expression = simple_expression.se OR term.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se = _symbols[offset + 1];
					final Expression se = (Expression) _symbol_se.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Term t = (Term) _symbol_t.value;
					 return new OrExpression(se, t);
				}
			},
			new Action() {	// [90] signed_term = PLUS term.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 2];
					final Term t = (Term) _symbol_t.value;
					 return new PositiveTerm(t);
				}
			},
			new Action() {	// [91] signed_term = MINUS term.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 2];
					final Term t = (Term) _symbol_t.value;
					 return new NegativeTerm(t);
				}
			},
			Action.RETURN,	// [92] signed_term = term.t
			Action.RETURN,	// [93] term = factor.f
			new Action() {	// [94] term = term.t STAR factor.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Term t = (Term) _symbol_t.value;
					final Symbol _symbol_f = _symbols[offset + 3];
					final Factor f = (Factor) _symbol_f.value;
					 return new MultiplicationTerm(t, f);
				}
			},
			new Action() {	// [95] term = term.t DIV factor.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Term t = (Term) _symbol_t.value;
					final Symbol _symbol_f = _symbols[offset + 3];
					final Factor f = (Factor) _symbol_f.value;
					 return new DivisionTerm(t, f);
				}
			},
			new Action() {	// [96] term = term.t MOD factor.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Term t = (Term) _symbol_t.value;
					final Symbol _symbol_f = _symbols[offset + 3];
					final Factor f = (Factor) _symbol_f.value;
					 return new ModuloTerm(t, f);
				}
			},
			new Action() {	// [97] term = term.t AMP factor.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Term t = (Term) _symbol_t.value;
					final Symbol _symbol_f = _symbols[offset + 3];
					final Factor f = (Factor) _symbol_f.value;
					 return new AndTerm(t, f);
				}
			},
			new Action() {	// [98] factor = reference.rf
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_rf = _symbols[offset + 1];
					final Reference rf = (Reference) _symbol_rf.value;
					 return new VariableFactor(rf);
				}
			},
			new Action() {	// [99] factor = NUMBER.n
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_n = _symbols[offset + 1];
					final String n = (String) _symbol_n.value;
					 return new LiteralFactor(n);
				}
			},
			RETURN2,	// [100] factor = PAR_OPEN expression.e PAR_CLOSE
			new Action() {	// [101] factor = TILDE factor.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_f = _symbols[offset + 2];
					final Factor f = (Factor) _symbol_f.value;
					 return new NegatedFactor(f);
				}
			},
			new Action() {	// [102] reference = IDENTIFIER.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final String i = (String) _symbol_i.value;
					 return new BaseReference(i);
				}
			},
			new Action() {	// [103] reference = reference.rf selector.s
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_rf = _symbols[offset + 1];
					final Reference rf = (Reference) _symbol_rf.value;
					final Symbol _symbol_s = _symbols[offset + 2];
					final Selector s = (Selector) _symbol_s.value;
					 return new SelectedReference(rf, s);
				}
			},
			new Action() {	// [104] selector = DOT IDENTIFIER.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 2];
					final String i = (String) _symbol_i.value;
					 return new AttributeSelector(i);
				}
			},
			new Action() {	// [105] selector = BRACK_OPEN expression.e BRACK_CLOSE
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final Expression e = (Expression) _symbol_e.value;
					 return new IndexSelector(e);
				}
			}
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}

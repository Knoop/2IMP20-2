package oberon0.parser;

import java.util.List;
import oberon0.parser.ast.*;
import beaver.*;
import java.util.LinkedList;
import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "oberon0.grammar".
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
		static public final short PAR_CLOSE = 9;
		static public final short OR = 10;
		static public final short WHILE = 11;
		static public final short IF = 12;
		static public final short STAR = 13;
		static public final short DIV = 14;
		static public final short MOD = 15;
		static public final short AMP = 16;
		static public final short ARRAY = 17;
		static public final short RECORD = 18;
		static public final short COMMA = 19;
		static public final short DOT = 20;
		static public final short EQ = 21;
		static public final short COLON = 22;
		static public final short VAR = 23;
		static public final short THEN = 24;
		static public final short ELSIF = 25;
		static public final short BRACK_OPEN = 26;
		static public final short BEGIN = 27;
		static public final short CONST = 28;
		static public final short ELSE = 29;
		static public final short MODULE = 30;
		static public final short DO = 31;
		static public final short PROCEDURE = 32;
		static public final short OF = 33;
		static public final short BRACK_CLOSE = 34;
		static public final short TYPE = 35;
		static public final short ASSIGN = 36;
		static public final short HASH = 37;
		static public final short ST = 38;
		static public final short SEQ = 39;
		static public final short GT = 40;
		static public final short GEQ = 41;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9p5btcSbLKPnt$ddT6veupR30B2008kRAaumA22BCDYAXA3WSecsK9PQKLgPMWgcj66Y0g" +
		"eBEvhaDcYQRRPfcbQIf9eO6AubEQ#F7tFkUUzS#RUIUalx$lvdMSvp$ES$PpdIjaWTTC8DM" +
		"guzjAXWJPhJ#sZOzHFzJf9cRfe1#reopHRksetxQuzj9DEKISrQQ06Q8X6wd2DqJYDJxmxu" +
		"rsKkY8TbTJqYJNxwOE9TX3QFDw##W0rFUpEf7voAPwNFXJwbjgtzQtEtb9hOZlZNMphLQNZ" +
		"rLtxwq0DJVIDwgzPIOovxnAZKGTfNc9xMhkUBgxmtANacMhVBxxOqr7qjCYDBd5ZIrnBYPi" +
		"0TqJ9FwVv$ELoBxwStvklfiAYuRrYc5Nuv7AT$J3W99shdNMoghLMdzR5kXmVlvDFONTEPo" +
		"TFrxMQgPvWXJwbi$KrBRN7YBOpM1t6Su0cQg6#epcQ4d2#Lkdhkb2JGkqXeJminFIe9UQf8" +
		"9VFXM#ASfFE2NoJFXuYdQ7vfQZ07j4dT84k1P$N8dtBDePsBbP1bw3p$EVq3NqxO2MQgtLH" +
		"qAxJqg2xGBVQ7K7Jg8E3vaQuOJfQqtI2FXeqTVPzVKmtg4uVqLVrORxhx17Rf3Fr5LsX9Ve" +
		"kxQy5o#njNMNlC3EzrLU3TQIcQesErKgxNSVPRRfU9#gJkfAnVaQVrPUqWEyB#gA#hDDrdf" +
		"RRt#nnBTStxQyw2tgP$OLokQxHpNmtoV##5yfR$At1oWtaREyKwM1st06iuW3cgYTtn2XkZ" +
		"XCvFqCOLHDhEu4LQPRZpgbYNVTXX#x7glUlyCwbOpkicLkcpUFb$Qdzd$6AKchVrhSQLgjv" +
		"EsszlfcLA9xrL3$m$uZHaUtsUARQzujlw#dsSbd9FwVv$ELo0r$ExyLNgB3ezvunAdrosQ#" +
		"lnw6S#Uxip1hEr#5W73e$eedipcxiv6xSZ8tXhMlX7PgAtIHsbCF7yMOMnpEDzw6LcwPJm7" +
		"3Ew0ZkapcnjbZwc1uDnEm1SlamU1TbH#iko4U5IAEvJ$Ae7exNpV6#E6w2FMcdDhGp37auy" +
		"FnnuQNnw1AqBK4xXZvxdIlv#3vvpUJ0rVEcZ#HzzXe$9qVoIdgQSViVmStYa6RoGauFsdfQ" +
		"hATzWG8putZZQ$cwCbC5sYt05RXhUc7TXR4MiEWD7EFf768D2sKDfNyjQaDTyQi9vHZZfvf" +
		"GTgQTzMTH8FmRSgRaPe0pm5YmFxWJB0IlWHV10kpcGa$pVkL0xsEU46E#2JaL7VQigRYnvR" +
		"f4kuP8tonIRccvnyfYuUFgGTysdRyHtSknlZ$e1vgYF2Bn7PdmGy5uC0fC1XDGtW6z47eFT" +
		"37qNkWIw7tGfT27eCkJTiSXlnBZ$OvYGrAt2TrMi19C0Mz4kxSede8#1rQ1gU0Ti0PiZBxR" +
		"u9y1Lu4dejyMy19ulgsDB4D#8TRFHAu6dPBwNIBTDTgyJS6QPdM9pHxeduRk1dQ7PoupvZT" +
		"hW3yPF1ljM4Et6gnFroFszrNqhuFRecrN#6sHxv7C#PFWhgXlR1yZwvdmlIBj7Vqs0zOYwr" +
		"xcqoVIlf5oHjm3qBrJE$RS#eH$oADy3B5kSnpFeexg$Txo#pSPTnRz7erotj$Ro#QdK1bBS" +
		"Kqq9z7L9srDYRe5KRufgLjNrgyvaSwBFWz7kY7InoFDnxSrzQV$6ylwbfwj0P4UvDU$p6vq" +
		"f1Fz$eryQrAVzsT#qjTb$Wo1uyl6aCzTdrGVTVCZVJ29VNe7TXULnqlaV8usHNfqfRyMnhg" +
		"p8nsK#2zgR#lEB$Vle3znxjpTYMv91tQB8zsIw5QKzMszuY$Se6K$#uNTQx#sNzalxMwadn" +
		"dMnacswy4Qky8kWruQB2#nTNO3z1gmsYuFEkuekngi0YkCrR4hRQrn#zXru5fmAxW5t0p8G" +
		"kr6#wdT5Nn$4ieVsu#ItloWedy$Bt7tsElsghriBzb$$5ZiYQX$sDwmVzdpza9uTRpcENkn" +
		"Wv5kYFJFdEG$sODHUi3kf$oZtMz$iFk2XllOVck$iTz37xLNR8lztJRRKz7#IVk7lMR$jAt" +
		"sZ6sBkgVjMSXyiX81H#PS82V9o5W47E#rWEEr5l0vWu0ZbwacF$0vGaO#8E0u4HclRpNllG" +
		"CPxxk0ustFo0wgoMHyDfEHkV0oma#77uj#1ZdJB7Ipq4s1dmq$6tuc$DG0HmOZu7ENQZAaw" +
		"f2Bv1Y1V0XsBTYq8BV2jq8dGOS5E4voUpIZz$yAXf8J3O6VXkyqv8FfqrpvbzsHMrNnRy33" +
		"aRa8E7BX7SbMTW0P#R8BE12RZZ2Oki615k7pqI8SkPf7LJiCH5U4vxEGYm#0ZW#eqhp$0YP" +
		"8Vh0=");

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	private final Action[] actions;

	public OberonParser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			Action.NONE,  	// [0] opt$begin_statement_sequence = 
			Action.RETURN,	// [1] opt$begin_statement_sequence = begin_statement_sequence
			new Action() {	// [2] module = MODULE IDENTIFIER.i1 SEMICOLON declaration_group.gd opt$begin_statement_sequence.bs END IDENTIFIER.i2 DOT
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i1 = _symbols[offset + 2];
					final String i1 = (String) _symbol_i1.value;
					final Symbol _symbol_gd = _symbols[offset + 4];
					final DeclarationGroup gd = (DeclarationGroup) _symbol_gd.value;
					final Symbol _symbol_bs = _symbols[offset + 5];
					final Sequence<Statement> bs = (Sequence<Statement>) _symbol_bs.value;
					final Symbol _symbol_i2 = _symbols[offset + 7];
					final String i2 = (String) _symbol_i2.value;
					 return new Module(i1, i2, gd, bs.getElements());
				}
			},
			RETURN2,	// [3] begin_statement_sequence = BEGIN statement_sequence.ss
			Action.NONE,  	// [4] opt$const_declaration = 
			Action.RETURN,	// [5] opt$const_declaration = const_declaration
			Action.NONE,  	// [6] opt$type_declaration = 
			Action.RETURN,	// [7] opt$type_declaration = type_declaration
			Action.NONE,  	// [8] opt$var_declaration = 
			Action.RETURN,	// [9] opt$var_declaration = var_declaration
			Action.NONE,  	// [10] opt$procedure_declaration = 
			Action.RETURN,	// [11] opt$procedure_declaration = procedure_declaration
			new Action() {	// [12] declaration_group = opt$const_declaration.cd opt$type_declaration.td opt$var_declaration.vd opt$procedure_declaration.pd
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_cd = _symbols[offset + 1];
					final ConstDeclaration cd = (ConstDeclaration) _symbol_cd.value;
					final Symbol _symbol_td = _symbols[offset + 2];
					final TypeDeclaration td = (TypeDeclaration) _symbol_td.value;
					final Symbol _symbol_vd = _symbols[offset + 3];
					final VarDeclaration vd = (VarDeclaration) _symbol_vd.value;
					final Symbol _symbol_pd = _symbols[offset + 4];
					final ProcedureDeclaration pd = (ProcedureDeclaration) _symbol_pd.value;
					 return new DeclarationGroup(cd,td,vd,pd);
				}
			},
			new Action() {	// [13] lst$const_declaration_assign = const_declaration_assign
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1].value); return new Symbol(lst);
				}
			},
			new Action() {	// [14] lst$const_declaration_assign = lst$const_declaration_assign const_declaration_assign
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2].value); return _symbols[offset + 1];
				}
			},
			Action.NONE,  	// [15] opt$lst$const_declaration_assign = 
			Action.RETURN,	// [16] opt$lst$const_declaration_assign = lst$const_declaration_assign
			new Action() {	// [17] const_declaration = CONST opt$lst$const_declaration_assign.cda
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_cda = _symbols[offset + 2];
					final ArrayList _list_cda = (ArrayList) _symbol_cda.value;
					final ConstDeclarationAssignment[] cda = _list_cda == null ? new ConstDeclarationAssignment[0] : (ConstDeclarationAssignment[]) _list_cda.toArray(new ConstDeclarationAssignment[_list_cda.size()]);
					 return new ConstDeclaration(cda);
				}
			},
			new Action() {	// [18] const_declaration_assign = IDENTIFIER.i EQ expression.e SEMICOLON
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final String i = (String) _symbol_i.value;
					final Symbol _symbol_e = _symbols[offset + 3];
					final Expression e = (Expression) _symbol_e.value;
					 return new ConstDeclarationAssignment(i, e);
				}
			},
			new Action() {	// [19] lst$type_declaration_assign = type_declaration_assign
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1].value); return new Symbol(lst);
				}
			},
			new Action() {	// [20] lst$type_declaration_assign = lst$type_declaration_assign type_declaration_assign
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2].value); return _symbols[offset + 1];
				}
			},
			Action.NONE,  	// [21] opt$lst$type_declaration_assign = 
			Action.RETURN,	// [22] opt$lst$type_declaration_assign = lst$type_declaration_assign
			new Action() {	// [23] type_declaration = TYPE opt$lst$type_declaration_assign.tda
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_tda = _symbols[offset + 2];
					final ArrayList _list_tda = (ArrayList) _symbol_tda.value;
					final TypeDeclarationAssignment[] tda = _list_tda == null ? new TypeDeclarationAssignment[0] : (TypeDeclarationAssignment[]) _list_tda.toArray(new TypeDeclarationAssignment[_list_tda.size()]);
					 return new TypeDeclaration(tda);
				}
			},
			new Action() {	// [24] type_declaration_assign = IDENTIFIER.i EQ type.t SEMICOLON
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final String i = (String) _symbol_i.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Type t = (Type) _symbol_t.value;
					 return new TypeDeclarationAssignment(i, t);
				}
			},
			new Action() {	// [25] lst$var_declaration_assignment = var_declaration_assignment
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1].value); return new Symbol(lst);
				}
			},
			new Action() {	// [26] lst$var_declaration_assignment = lst$var_declaration_assignment var_declaration_assignment
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2].value); return _symbols[offset + 1];
				}
			},
			Action.NONE,  	// [27] opt$lst$var_declaration_assignment = 
			Action.RETURN,	// [28] opt$lst$var_declaration_assignment = lst$var_declaration_assignment
			new Action() {	// [29] var_declaration = VAR opt$lst$var_declaration_assignment.vda
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_vda = _symbols[offset + 2];
					final ArrayList _list_vda = (ArrayList) _symbol_vda.value;
					final VarDeclarationAssignment[] vda = _list_vda == null ? new VarDeclarationAssignment[0] : (VarDeclarationAssignment[]) _list_vda.toArray(new VarDeclarationAssignment[_list_vda.size()]);
					 return new VarDeclaration(vda);
				}
			},
			new Action() {	// [30] var_declaration_assignment = ident_list.il COLON type.t SEMICOLON
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_il = _symbols[offset + 1];
					final Sequence<String> il = (Sequence<String>) _symbol_il.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Type t = (Type) _symbol_t.value;
					 return new VarDeclarationAssignment(il, t);
				}
			},
			new Action() {	// [31] procedure_declaration = procedure_heading.ph SEMICOLON procedure_body.pb
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_ph = _symbols[offset + 1];
					final ProcedureHeading ph = (ProcedureHeading) _symbol_ph.value;
					final Symbol _symbol_pb = _symbols[offset + 3];
					final ProcedureBody pb = (ProcedureBody) _symbol_pb.value;
					 return new ProcedureDeclaration(ph, pb);
				}
			},
			Action.NONE,  	// [32] opt$procedure_heading_param = 
			Action.RETURN,	// [33] opt$procedure_heading_param = procedure_heading_param
			new Action() {	// [34] procedure_heading = PROCEDURE IDENTIFIER.i opt$procedure_heading_param.php
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 2];
					final String i = (String) _symbol_i.value;
					final Symbol _symbol_php = _symbols[offset + 3];
					final Sequence<FormalParam> php = (Sequence<FormalParam>) _symbol_php.value;
					 return new ProcedureHeading(i, php);
				}
			},
			Action.NONE,  	// [35] opt$formal_params = 
			Action.RETURN,	// [36] opt$formal_params = formal_params
			RETURN2,	// [37] procedure_heading_param = PAR_OPEN opt$formal_params.fps PAR_CLOSE
			new Action() {	// [38] formal_params = formal_params.fps SEMICOLON formal_param.fp
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_fps = _symbols[offset + 1];
					final Sequence<FormalParam> fps = (Sequence<FormalParam>) _symbol_fps.value;
					final Symbol _symbol_fp = _symbols[offset + 3];
					final FormalParam fp = (FormalParam) _symbol_fp.value;
					 return new Sequence<FormalParam>(fps, fp);
				}
			},
			new Action() {	// [39] formal_params = formal_param.fp
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_fp = _symbols[offset + 1];
					final FormalParam fp = (FormalParam) _symbol_fp.value;
					 return new Sequence<FormalParam>(fp);
				}
			},
			Action.NONE,  	// [40] opt$VAR = 
			Action.RETURN,	// [41] opt$VAR = VAR
			new Action() {	// [42] formal_param = opt$VAR ident_list.il COLON type.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_il = _symbols[offset + 2];
					final Sequence<String> il = (Sequence<String>) _symbol_il.value;
					final Symbol _symbol_t = _symbols[offset + 4];
					final Type t = (Type) _symbol_t.value;
					 return new FormalParam(il, t);
				}
			},
			new Action() {	// [43] procedure_body = declaration_group.gd opt$begin_statement_sequence.ss END IDENTIFIER.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_gd = _symbols[offset + 1];
					final DeclarationGroup gd = (DeclarationGroup) _symbol_gd.value;
					final Symbol _symbol_ss = _symbols[offset + 2];
					final Sequence<Statement> ss = (Sequence<Statement>) _symbol_ss.value;
					final Symbol _symbol_i = _symbols[offset + 4];
					final String i = (String) _symbol_i.value;
					 return new ProcedureBody(gd, ss, i);
				}
			},
			new Action() {	// [44] type = IDENTIFIER.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final String i = (String) _symbol_i.value;
					 return new LiteralType(i);
				}
			},
			Action.RETURN,	// [45] type = array_type.at
			Action.RETURN,	// [46] type = record_type.rt
			new Action() {	// [47] array_type = ARRAY expression.e OF type.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final Expression e = (Expression) _symbol_e.value;
					final Symbol _symbol_t = _symbols[offset + 4];
					final Type t = (Type) _symbol_t.value;
					 return new ArrayType(e, t);
				}
			},
			new Action() {	// [48] record_type = RECORD field_list.fls END
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_fls = _symbols[offset + 2];
					final Sequence fls = (Sequence) _symbol_fls.value;
					 return new RecordType(fls);
				}
			},
			Action.NONE,  	// [49] opt$field = 
			Action.RETURN,	// [50] opt$field = field
			new Action() {	// [51] field_list = field_list.fls SEMICOLON opt$field.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_fls = _symbols[offset + 1];
					final Sequence fls = (Sequence) _symbol_fls.value;
					final Symbol _symbol_f = _symbols[offset + 3];
					final Field f = (Field) _symbol_f.value;
					 return new Sequence<Field>(fls, f);
				}
			},
			new Action() {	// [52] field_list = opt$field.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_f = _symbols[offset + 1];
					final Field f = (Field) _symbol_f.value;
					 return new Sequence<Field>(f);
				}
			},
			new Action() {	// [53] field = ident_list.il COLON type.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_il = _symbols[offset + 1];
					final Sequence<String> il = (Sequence<String>) _symbol_il.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Type t = (Type) _symbol_t.value;
					 return new Field(il, t);
				}
			},
			new Action() {	// [54] ident_list = ident_list.il COMMA IDENTIFIER.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_il = _symbols[offset + 1];
					final Sequence<String> il = (Sequence<String>) _symbol_il.value;
					final Symbol _symbol_i = _symbols[offset + 3];
					final String i = (String) _symbol_i.value;
					 return new Sequence<String>(il, i);
				}
			},
			new Action() {	// [55] ident_list = IDENTIFIER.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final String i = (String) _symbol_i.value;
					 return new Sequence<String>(i);
				}
			},
			Action.RETURN,	// [56] statement = assignment_statement.a
			Action.RETURN,	// [57] statement = procedure_call_statement.pc
			Action.RETURN,	// [58] statement = if_statement.is
			Action.RETURN,	// [59] statement = while_statement.ws
			new Action() {	// [60] statement_sequence = statement_sequence.ss SEMICOLON statement.s
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_ss = _symbols[offset + 1];
					final Sequence<Statement> ss = (Sequence<Statement>) _symbol_ss.value;
					final Symbol _symbol_s = _symbols[offset + 3];
					final Statement s = (Statement) _symbol_s.value;
					 return new Sequence<Statement>(ss, s);
				}
			},
			new Action() {	// [61] statement_sequence = statement.s
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_s = _symbols[offset + 1];
					final Statement s = (Statement) _symbol_s.value;
					 return new Sequence<Statement>(s);
				}
			},
			new Action() {	// [62] while_statement = WHILE expression.e DO statement_sequence.ss END
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final Expression e = (Expression) _symbol_e.value;
					final Symbol _symbol_ss = _symbols[offset + 4];
					final Sequence<Statement> ss = (Sequence<Statement>) _symbol_ss.value;
					 return new WhileStatement(e, ss);
				}
			},
			new Action() {	// [63] assignment_statement = reference.rf ASSIGN expression.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_rf = _symbols[offset + 1];
					final Reference rf = (Reference) _symbol_rf.value;
					final Symbol _symbol_e = _symbols[offset + 3];
					final Expression e = (Expression) _symbol_e.value;
					 return new AssignStatement(rf, e);
				}
			},
			Action.NONE,  	// [64] opt$actual_params = 
			Action.RETURN,	// [65] opt$actual_params = actual_params
			new Action() {	// [66] procedure_call_statement = reference.rf opt$actual_params.aps
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_rf = _symbols[offset + 1];
					final Reference rf = (Reference) _symbol_rf.value;
					final Symbol _symbol_aps = _symbols[offset + 2];
					final Sequence<Expression> aps = (Sequence<Expression>) _symbol_aps.value;
					 return new ProcedureCallStatement(rf, aps);
				}
			},
			Action.NONE,  	// [67] opt$expressions = 
			Action.RETURN,	// [68] opt$expressions = expressions
			RETURN2,	// [69] actual_params = PAR_OPEN opt$expressions.es PAR_CLOSE
			new Action() {	// [70] expressions = expressions.es COMMA expression.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_es = _symbols[offset + 1];
					final Sequence<Expression> es = (Sequence<Expression>) _symbol_es.value;
					final Symbol _symbol_e = _symbols[offset + 3];
					final Expression e = (Expression) _symbol_e.value;
					 return new Sequence<Expression>(es, e);
				}
			},
			new Action() {	// [71] expressions = expression.e
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 1];
					final Expression e = (Expression) _symbol_e.value;
					 return new Sequence<Expression>(e);
				}
			},
			Action.NONE,  	// [72] opt$otherwise = 
			Action.RETURN,	// [73] opt$otherwise = otherwise
			new Action() {	// [74] if_statement = IF expression.e THEN statement_sequence.ss opt$otherwise.o END
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final Expression e = (Expression) _symbol_e.value;
					final Symbol _symbol_ss = _symbols[offset + 4];
					final Sequence<Statement> ss = (Sequence<Statement>) _symbol_ss.value;
					final Symbol _symbol_o = _symbols[offset + 5];
					final ElseStatement o = (ElseStatement) _symbol_o.value;
					 return new IfStatement(e, ss, o);
				}
			},
			new Action() {	// [75] otherwise = ELSIF expression.e THEN statement_sequence.ss opt$otherwise.o
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_e = _symbols[offset + 2];
					final Expression e = (Expression) _symbol_e.value;
					final Symbol _symbol_ss = _symbols[offset + 4];
					final Sequence<Statement> ss = (Sequence<Statement>) _symbol_ss.value;
					final Symbol _symbol_o = _symbols[offset + 5];
					final ElseStatement o = (ElseStatement) _symbol_o.value;
					 return new ElseStatement(new IfStatement(e, ss, o));
				}
			},
			new Action() {	// [76] otherwise = ELSE statement_sequence.ss
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_ss = _symbols[offset + 2];
					final Sequence<Statement> ss = (Sequence<Statement>) _symbol_ss.value;
					 return new ElseStatement(ss);
				}
			},
			Action.RETURN,	// [77] expression = simple_expression.se
			Action.RETURN,	// [78] expression = comparison.c
			new Action() {	// [79] comparison = simple_expression.se1 EQ simple_expression.se2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se1 = _symbols[offset + 1];
					final Expression se1 = (Expression) _symbol_se1.value;
					final Symbol _symbol_se2 = _symbols[offset + 3];
					final Expression se2 = (Expression) _symbol_se2.value;
					 return new EqualComparison(se1, se2);
				}
			},
			new Action() {	// [80] comparison = simple_expression.se1 HASH simple_expression.se2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se1 = _symbols[offset + 1];
					final Expression se1 = (Expression) _symbol_se1.value;
					final Symbol _symbol_se2 = _symbols[offset + 3];
					final Expression se2 = (Expression) _symbol_se2.value;
					 return new HashComparison(se1, se2);
				}
			},
			new Action() {	// [81] comparison = simple_expression.se1 ST simple_expression.se2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se1 = _symbols[offset + 1];
					final Expression se1 = (Expression) _symbol_se1.value;
					final Symbol _symbol_se2 = _symbols[offset + 3];
					final Expression se2 = (Expression) _symbol_se2.value;
					 return new SmallerComparison(se1, se2);
				}
			},
			new Action() {	// [82] comparison = simple_expression.se1 SEQ simple_expression.se2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se1 = _symbols[offset + 1];
					final Expression se1 = (Expression) _symbol_se1.value;
					final Symbol _symbol_se2 = _symbols[offset + 3];
					final Expression se2 = (Expression) _symbol_se2.value;
					 return new SmallerEqualComparison(se1, se2);
				}
			},
			new Action() {	// [83] comparison = simple_expression.se1 GT simple_expression.se2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se1 = _symbols[offset + 1];
					final Expression se1 = (Expression) _symbol_se1.value;
					final Symbol _symbol_se2 = _symbols[offset + 3];
					final Expression se2 = (Expression) _symbol_se2.value;
					 return new GreaterComparison(se1, se2);
				}
			},
			new Action() {	// [84] comparison = simple_expression.se1 GEQ simple_expression.se2
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se1 = _symbols[offset + 1];
					final Expression se1 = (Expression) _symbol_se1.value;
					final Symbol _symbol_se2 = _symbols[offset + 3];
					final Expression se2 = (Expression) _symbol_se2.value;
					 return new GreaterEqualComparison(se1, se2);
				}
			},
			Action.RETURN,	// [85] simple_expression = signed_term.st
			new Action() {	// [86] simple_expression = simple_expression.se PLUS term.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se = _symbols[offset + 1];
					final Expression se = (Expression) _symbol_se.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Term t = (Term) _symbol_t.value;
					 return new AddExpression(se, t);
				}
			},
			new Action() {	// [87] simple_expression = simple_expression.se MINUS term.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se = _symbols[offset + 1];
					final Expression se = (Expression) _symbol_se.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Term t = (Term) _symbol_t.value;
					 return new SubtractExpression(se, t);
				}
			},
			new Action() {	// [88] simple_expression = simple_expression.se OR term.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_se = _symbols[offset + 1];
					final Expression se = (Expression) _symbol_se.value;
					final Symbol _symbol_t = _symbols[offset + 3];
					final Term t = (Term) _symbol_t.value;
					 return new OrExpression(se, t);
				}
			},
			new Action() {	// [89] signed_term = PLUS term.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 2];
					final Term t = (Term) _symbol_t.value;
					 return new PositiveTerm(t);
				}
			},
			new Action() {	// [90] signed_term = MINUS term.t
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 2];
					final Term t = (Term) _symbol_t.value;
					 return new NegativeTerm(t);
				}
			},
			Action.RETURN,	// [91] signed_term = term.t
			Action.RETURN,	// [92] term = factor.f
			new Action() {	// [93] term = term.t STAR factor.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Term t = (Term) _symbol_t.value;
					final Symbol _symbol_f = _symbols[offset + 3];
					final Factor f = (Factor) _symbol_f.value;
					 return new MultiplicationTerm(t, f);
				}
			},
			new Action() {	// [94] term = term.t DIV factor.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Term t = (Term) _symbol_t.value;
					final Symbol _symbol_f = _symbols[offset + 3];
					final Factor f = (Factor) _symbol_f.value;
					 return new DivisionTerm(t, f);
				}
			},
			new Action() {	// [95] term = term.t MOD factor.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Term t = (Term) _symbol_t.value;
					final Symbol _symbol_f = _symbols[offset + 3];
					final Factor f = (Factor) _symbol_f.value;
					 return new ModuloTerm(t, f);
				}
			},
			new Action() {	// [96] term = term.t AMP factor.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_t = _symbols[offset + 1];
					final Term t = (Term) _symbol_t.value;
					final Symbol _symbol_f = _symbols[offset + 3];
					final Factor f = (Factor) _symbol_f.value;
					 return new AndTerm(t, f);
				}
			},
			new Action() {	// [97] factor = reference.rf
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_rf = _symbols[offset + 1];
					final Reference rf = (Reference) _symbol_rf.value;
					 return new VariableFactor(rf);
				}
			},
			new Action() {	// [98] factor = NUMBER.n
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_n = _symbols[offset + 1];
					final String n = (String) _symbol_n.value;
					 return new LiteralFactor(n);
				}
			},
			RETURN2,	// [99] factor = PAR_OPEN expression.e PAR_CLOSE
			new Action() {	// [100] factor = TILDE factor.f
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_f = _symbols[offset + 2];
					final Factor f = (Factor) _symbol_f.value;
					 return new NegatedFactor(f);
				}
			},
			new Action() {	// [101] reference = IDENTIFIER.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 1];
					final String i = (String) _symbol_i.value;
					 return new BaseReference(i);
				}
			},
			new Action() {	// [102] reference = reference.rf selector.s
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_rf = _symbols[offset + 1];
					final Reference rf = (Reference) _symbol_rf.value;
					final Symbol _symbol_s = _symbols[offset + 2];
					final Selector s = (Selector) _symbol_s.value;
					 return new SelectedReference(rf, s);
				}
			},
			new Action() {	// [103] selector = DOT IDENTIFIER.i
				public Symbol reduce(Symbol[] _symbols, int offset) {
					final Symbol _symbol_i = _symbols[offset + 2];
					final String i = (String) _symbol_i.value;
					 return new AttributeSelector(i);
				}
			},
			new Action() {	// [104] selector = BRACK_OPEN expression.e BRACK_CLOSE
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
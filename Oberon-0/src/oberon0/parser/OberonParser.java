package oberon0.parser;

import beaver.*;
import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "Oberon0.grammar".
 */
public class OberonParser extends Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short identifier = 1;
		static public final short semicolon = 2;
		static public final short plus = 3;
		static public final short minus = 4;
		static public final short end = 5;
		static public final short dot = 6;
		static public final short par_close = 7;
		static public final short while_ = 8;
		static public final short repeat = 9;
		static public final short brack_open = 10;
		static public final short if_ = 11;
		static public final short par_open = 12;
		static public final short comma = 13;
		static public final short array = 14;
		static public final short record = 15;
		static public final short integer = 16;
		static public final short long_ = 17;
		static public final short char_ = 18;
		static public final short number = 19;
		static public final short tilde = 20;
		static public final short string_literal = 21;
		static public final short eq = 22;
		static public final short else_if = 23;
		static public final short colon = 24;
		static public final short var = 25;
		static public final short begin = 26;
		static public final short then = 27;
		static public final short else_ = 28;
		static public final short procedure = 29;
		static public final short star = 30;
		static public final short div = 31;
		static public final short mod = 32;
		static public final short amp = 33;
		static public final short or = 34;
		static public final short const_ = 35;
		static public final short do_ = 36;
		static public final short until = 37;
		static public final short module = 38;
		static public final short brack_close = 39;
		static public final short assign = 40;
		static public final short of = 41;
		static public final short import_ = 42;
		static public final short hash = 43;
		static public final short st = 44;
		static public final short seq = 45;
		static public final short gt = 46;
		static public final short geq = 47;
		static public final short pipe = 48;
		static public final short type_dec = 49;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9nzbmUSLSKLnhzxjmLaYLYGfHW24gCnXGLsXGKN1KMa1PIWD2ahe7H4m21LG0JfooAe828" +
		"Y7QHtB1G1HINH63H54pKc9YQQnDJZ$ywR1#zT5jxzVUSxyysPSkVDp3jF2jvMeQvNUzkXN5" +
		"NH9RfKb#boNQm2NQdhL1Dk0hTNCtqphNwzCdKlUbFTaQPNrWqgLdFTg9lKWlgVwiwq#lOwg" +
		"cun9KDzOafttHDJ5kl1D6MnwkeLtSySdjQpUafBjGpjaAv9AtzN3TI8EQHgTHMcb4Uuzw#R" +
		"rkvgt#uQzCGwj5FLX6PZDHQzixgYtArwl7yYDbBoK2hhAjNGNMgb7#Y7#f7g#nwkZPLlLf5" +
		"orDgNsdhkf9Rqc$1$WfTzPgHlEIyVB#BQS2AgX#TUH0tJHdq3dg$6Bken7nsrtwP1gkRUDL" +
		"9kHHdYMqxol5mFQm3xO9VMQAOULPPjrGOzhYVq92ko8cARg9MkZpKQfufwMLlO1xTejKtMR" +
		"CsoINg85NbUBsYTQxN3sGfQejNQfnTTgHAhbETi3Pwz8CyzHQvSm$MUx#nj#hxZ26rOruxg" +
		"e7xO7wk4rUYFlKzzpqGaCT2Ui2Min52DjETjBUqkqcvBpFeHJTDeJTTSdasiqZRRQ1iqJwK" +
		"QeoayUIvg5RDOfUUqoFPJKweZDbvRTGKzLMO5gwkMrcex#hTLHzz1gQRluJTqCxkTc2xggT" +
		"xm7ctMO0tN0ngb2Hfhgx3ZDL6JDLKpRBMjiHTiY#QeJ0jKPkkrKC$WbzbsR2dOhvqwm7DOB" +
		"r5wLGTrZ9EIoRSLCCl6dCiYTbyppbi#Ex0XUp311NpVwVLvxBPRqEl4z92PNySg9tPc0ISr" +
		"lRw0zuihNSzHwfsZnESNy8noSwZCBNAnEyS19w9IMZbnikzCqm9EqjboF$V#GLgxGj#k4df" +
		"o7P9zZURyLk94L42vY3DMn#kHaeqISiOgAekOAzbHjVaMapt4o$b4zOwjSoDEVkgOtS#CrD" +
		"fvBV0YRWN7MmRibOxk$TfmSgEe3ZuwQb$CwInqxnefEIZzp#cX4#SuuEujvbmFvaRDuOvCt" +
		"Bg5diMj5VLHh04QoCwyZttGXzsPnQafmTxFYhHZToQY4pQR5Ud2dPeeLQUSxMn5df4Wsptv" +
		"hbpHzTx2sHpUCk88kQph5TnZMSxMP3Lkm$R09YEIw4baw5RY7g8ZlpFd9SlL3U443#ERYTG" +
		"Hh58nO#ImIhdk1DPY5b5Ko2n2MbG3kMvaiIQ5hbKXwtErEv#vt7SjA4TFZlEZcTKWvYeGSN" +
		"tM9dGzHTz9NSUTE4SXdEDgGhV20VE8b69#0mB$v8BRNMHKc#2gRYR79yfzBW5DmGDIK0lU2" +
		"LU5FuAl1VD0RHyx7nzmLofO46dbWRfyp3Au0IZpskLWUEIRsV#WRc0s6Eth6tbk0ef0Krzk" +
		"2PRuyIU1ilB7rApppAKLPjpvvXgBRPFItnTUkzbpkvIuPg0vc0MwWvc8H#2Le2UOGla4MEd" +
		"xUWFKG#y5Lla##e0vE1$2gttSn$WTOtCQ2qf1Fx3EQ$qzhmTplJy0h0MRV7aZvdDui2zlzh" +
		"pLyt8m36nF6IlwxWU1NM0to0PRm1wm0um6Uy4OFz$Gjpi0He8NmJvVrydNJRZ0UZyCdiJfw" +
		"ik7m3Jl7mRJlHzzxoNUFnBhuwZdOvudOw9tE1wBUytpwvxtOqR19sDnRuBPtdyBd3fRfzhi" +
		"tO$1E$YRmOXotgb6nCISyFpU#TxVnxD$#3LLS7TIeysxAMFE00kelmFuTJgpjltzztwlryU" +
		"dz9kTZ2zdp5xbwOpxFdLLBZJVb7bDI$5xnEfcdVM3Ak0oq9l2F3$E9pvkaIz$bT8syBmcHT" +
		"lWkMAATcavxnMX0cPXYbOzfKsUrtBAUP#QAVuM7rUIeXq$jytPVlWiZVLtqCSCzrpVysJFK" +
		"rDYJte#7H#Zd9XJde#br9sEnNvwdZwIP$#65EspSkAIP#d15EtBS#E2UUSPvtXaR9gjKDh7" +
		"EE$s43XaX#su7RDNxQXnRzexqIy2##03xF$jLzXVWp$Rl#qh#vVzn$vh$tHr$m2$iI$iR$P" +
		"N#zp#GkdlzgNzrZwpFza7zhxzqJwrFzWddD6FxFVsE$iGzJrx6tkQs5$2lx1txKrxmqv5$Q" +
		"7zBC5uhpaRZNB2r$tSNdVybfsqARRSbhdIOi2TPIliMT$oES$Fs0ARP$EjrFVpk2rKkH$R1" +
		"DPv$sLx1RkDTzrdUssFxRPTjjFFu2Ld3pfxm5bkMDjiJzbIUzGUiUasm$TIPZFjQPjjZzai" +
		"c#ErHJRNfZfldBCJC5DS$X7bRn6tvSYqTPccG43k4OB0vKr9$zOOMZbaa6S53gqzUbq03Uc" +
		"$8To0FXlGDien6y6DoPBweFN1xutM6sv2kGbSG5rBXz1bPqNK5#4da47EaaN#dkKo#3YkTy" +
		"Xm#L0nV2FzT85l0ktGejopEVqqnu#Z3NDj0tUWpM3ymVX3YEyBzwLD2Le9$Y3yzc0evQ4kP" +
		"yuWKnG8#2#GINuOaZjcyBz28237v9w4oGz0GDOS8IIR5WZu1v95LfT9jfP9bfX9NXo0a4nO" +
		"8E2$HqZk6u2GR5SW81yDoPm344Rv6mZ8HqF#1$6RYZ$G8NIvLZVyqOnn5tFg3aQ1pjID#Hh" +
		"63$4J");

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	static final Action RETURN3 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 3];
		}
	};

	static final Action RETURN4 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 4];
		}
	};

	static final Action RETURN5 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 5];
		}
	};

	private final Action[] actions;

	public OberonParser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			RETURN2,	// [0] Selector = dot identifier; returns 'identifier' although none is marked
			RETURN3,	// [1] Selector = brack_open Expression brack_close; returns 'brack_close' although none is marked
			RETURN2,	// [2] Selector = Selector Selector; returns 'Selector' although none is marked
			new Action() {	// [3] lst$Selector = Selector
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			new Action() {	// [4] lst$Selector = lst$Selector Selector
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			Action.NONE,  	// [5] opt$lst$Selector = 
			Action.RETURN,	// [6] opt$lst$Selector = lst$Selector
			RETURN2,	// [7] Factor = identifier opt$lst$Selector; returns 'opt$lst$Selector' although none is marked
			Action.RETURN,	// [8] Factor = number
			RETURN3,	// [9] Factor = par_open Expression par_close; returns 'par_close' although none is marked
			RETURN2,	// [10] Factor = tilde Factor; returns 'Factor' although none is marked
			Action.RETURN,	// [11] Factor = string_literal
			Action.RETURN,	// [12] Operator = star
			Action.RETURN,	// [13] Operator = div
			Action.RETURN,	// [14] Operator = mod
			Action.RETURN,	// [15] Operator = amp
			new Action() {	// [16] Term = Factor
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			new Action() {	// [17] Term = Term Operator Factor
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3]); return _symbols[offset + 1];
				}
			},
			Action.RETURN,	// [18] PlusMinOperator = plus
			Action.RETURN,	// [19] PlusMinOperator = minus
			Action.RETURN,	// [20] ExpressionOperator = PlusMinOperator
			Action.RETURN,	// [21] ExpressionOperator = or
			Action.RETURN,	// [22] LogicalOperator = eq
			Action.RETURN,	// [23] LogicalOperator = hash
			Action.RETURN,	// [24] LogicalOperator = st
			Action.RETURN,	// [25] LogicalOperator = seq
			Action.RETURN,	// [26] LogicalOperator = gt
			Action.RETURN,	// [27] LogicalOperator = geq
			Action.RETURN,	// [28] LogicalOperator = pipe
			Action.NONE,  	// [29] opt$PlusMinOperator = 
			Action.RETURN,	// [30] opt$PlusMinOperator = PlusMinOperator
			RETURN2,	// [31] SimpleExpression = opt$PlusMinOperator Term; returns 'Term' although none is marked
			RETURN3,	// [32] SimpleExpression = SimpleExpression ExpressionOperator Term; returns 'Term' although none is marked
			Action.RETURN,	// [33] Expression = SimpleExpression
			RETURN3,	// [34] Expression = SimpleExpression LogicalOperator SimpleExpression; returns 'SimpleExpression' although none is marked
			RETURN4,	// [35] Assignment = identifier Selector assign Expression; returns 'Expression' although none is marked
			RETURN2,	// [36] ActualParameters = par_open par_close; returns 'par_close' although none is marked
			RETURN3,	// [37] ActualParameters = par_open CommaSeparatedExpressions par_close; returns 'par_close' although none is marked
			new Action() {	// [38] CommaSeparatedExpressions = Expression
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			new Action() {	// [39] CommaSeparatedExpressions = CommaSeparatedExpressions comma Expression
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3]); return _symbols[offset + 1];
				}
			},
			RETURN2,	// [40] ProcedureCall = identifier Selector; returns 'Selector' although none is marked
			RETURN3,	// [41] ProcedureCall = identifier Selector ActualParameters; returns 'ActualParameters' although none is marked
			RETURN4,	// [42] IfStatementStart = if_ Expression then StatementSequence; returns 'StatementSequence' although none is marked
			RETURN4,	// [43] ElseIfStatement = else_if Expression then StatementSequence; returns 'StatementSequence' although none is marked
			RETURN2,	// [44] ElseIfStatement = ElseIfStatement ElseIfStatement; returns 'ElseIfStatement' although none is marked
			RETURN3,	// [45] ElseStatement = else_ StatementSequence end; returns 'end' although none is marked
			Action.RETURN,	// [46] IfStatement = IfStatementStart
			RETURN2,	// [47] IfStatement = IfStatementStart ElseIfStatement; returns 'ElseIfStatement' although none is marked
			RETURN2,	// [48] IfStatement = IfStatementStart ElseStatement; returns 'ElseStatement' although none is marked
			RETURN3,	// [49] IfStatement = IfStatementStart ElseIfStatement ElseStatement; returns 'ElseStatement' although none is marked
			RETURN5,	// [50] WhileStatement = while_ Expression do_ StatementSequence end; returns 'end' although none is marked
			RETURN5,	// [51] RepeatStatement = repeat StatementSequence until Expression semicolon; returns 'semicolon' although none is marked
			Action.RETURN,	// [52] Statement = Assignment
			Action.RETURN,	// [53] Statement = ProcedureCall
			Action.RETURN,	// [54] Statement = IfStatement
			Action.RETURN,	// [55] Statement = WhileStatement
			Action.RETURN,	// [56] Statement = RepeatStatement
			Action.RETURN,	// [57] StatementSequence = Statement
			RETURN3,	// [58] StatementSequence = StatementSequence semicolon StatementSequence; returns 'StatementSequence' although none is marked
			Action.RETURN,	// [59] IdentifierList = identifier
			RETURN3,	// [60] IdentifierList = IdentifierList comma IdentifierList; returns 'IdentifierList' although none is marked
			RETURN4,	// [61] ArrayType = array Expression of Type; returns 'Type' although none is marked
			RETURN3,	// [62] FieldList = IdentifierList colon Type; returns 'Type' although none is marked
			RETURN3,	// [63] RecordType = record RecordTypeInner end; returns 'end' although none is marked
			Action.RETURN,	// [64] RecordTypeInner = FieldList
			RETURN3,	// [65] RecordTypeInner = RecordTypeInner semicolon RecordTypeInner; returns 'RecordTypeInner' although none is marked
			RETURN2,	// [66] Type = identifier opt$lst$Selector; returns 'opt$lst$Selector' although none is marked
			Action.RETURN,	// [67] Type = ArrayType
			Action.RETURN,	// [68] Type = RecordType
			Action.RETURN,	// [69] Type = integer
			Action.RETURN,	// [70] Type = long_
			Action.RETURN,	// [71] Type = char_
			Action.NONE,  	// [72] opt$var = 
			Action.RETURN,	// [73] opt$var = var
			RETURN4,	// [74] FPSection = opt$var IdentifierList colon Type; returns 'Type' although none is marked
			Action.NONE,  	// [75] opt$FormalParametersInner = 
			Action.RETURN,	// [76] opt$FormalParametersInner = FormalParametersInner
			RETURN3,	// [77] FormalParameters = par_open opt$FormalParametersInner par_close; returns 'par_close' although none is marked
			new Action() {	// [78] lst$FPSectionRepeat = FPSectionRepeat
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			new Action() {	// [79] lst$FPSectionRepeat = lst$FPSectionRepeat FPSectionRepeat
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			Action.NONE,  	// [80] opt$lst$FPSectionRepeat = 
			Action.RETURN,	// [81] opt$lst$FPSectionRepeat = lst$FPSectionRepeat
			RETURN2,	// [82] FormalParametersInner = FPSection opt$lst$FPSectionRepeat; returns 'opt$lst$FPSectionRepeat' although none is marked
			RETURN2,	// [83] FPSectionRepeat = semicolon FPSection; returns 'FPSection' although none is marked
			Action.NONE,  	// [84] opt$FormalParameters = 
			Action.RETURN,	// [85] opt$FormalParameters = FormalParameters
			RETURN3,	// [86] ProcedureHeading = procedure identifier opt$FormalParameters; returns 'opt$FormalParameters' although none is marked
			Action.NONE,  	// [87] opt$ProcedureBodyOptional = 
			Action.RETURN,	// [88] opt$ProcedureBodyOptional = ProcedureBodyOptional
			RETURN4,	// [89] ProcedureBody = Declarations opt$ProcedureBodyOptional end identifier; returns 'identifier' although none is marked
			RETURN2,	// [90] ProcedureBodyOptional = begin StatementSequence; returns 'StatementSequence' although none is marked
			RETURN3,	// [91] ProcedureDeclaration = ProcedureHeading semicolon ProcedureBody; returns 'ProcedureBody' although none is marked
			Action.NONE,  	// [92] opt$ConstDeclaration = 
			Action.RETURN,	// [93] opt$ConstDeclaration = ConstDeclaration
			Action.NONE,  	// [94] opt$TypeDeclaration = 
			Action.RETURN,	// [95] opt$TypeDeclaration = TypeDeclaration
			Action.NONE,  	// [96] opt$VarDeclaration = 
			Action.RETURN,	// [97] opt$VarDeclaration = VarDeclaration
			new Action() {	// [98] lst$ProcedureDeclaration = ProcedureDeclaration
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			new Action() {	// [99] lst$ProcedureDeclaration = lst$ProcedureDeclaration ProcedureDeclaration
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			Action.NONE,  	// [100] opt$lst$ProcedureDeclaration = 
			Action.RETURN,	// [101] opt$lst$ProcedureDeclaration = lst$ProcedureDeclaration
			RETURN5,	// [102] Declarations = opt$ConstDeclaration opt$TypeDeclaration opt$VarDeclaration opt$lst$ProcedureDeclaration semicolon; returns 'semicolon' although none is marked
			RETURN4,	// [103] ConstDeclarationPart = identifier eq Expression semicolon; returns 'semicolon' although none is marked
			RETURN4,	// [104] TypeDeclarationPart = identifier eq Type semicolon; returns 'semicolon' although none is marked
			RETURN4,	// [105] VarDeclarationPart = IdentifierList colon Type semicolon; returns 'semicolon' although none is marked
			new Action() {	// [106] lst$ConstDeclarationPart = ConstDeclarationPart
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			new Action() {	// [107] lst$ConstDeclarationPart = lst$ConstDeclarationPart ConstDeclarationPart
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			Action.NONE,  	// [108] opt$lst$ConstDeclarationPart = 
			Action.RETURN,	// [109] opt$lst$ConstDeclarationPart = lst$ConstDeclarationPart
			RETURN2,	// [110] ConstDeclaration = const_ opt$lst$ConstDeclarationPart; returns 'opt$lst$ConstDeclarationPart' although none is marked
			new Action() {	// [111] lst$TypeDeclarationPart = TypeDeclarationPart
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			new Action() {	// [112] lst$TypeDeclarationPart = lst$TypeDeclarationPart TypeDeclarationPart
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			Action.NONE,  	// [113] opt$lst$TypeDeclarationPart = 
			Action.RETURN,	// [114] opt$lst$TypeDeclarationPart = lst$TypeDeclarationPart
			RETURN2,	// [115] TypeDeclaration = type_dec opt$lst$TypeDeclarationPart; returns 'opt$lst$TypeDeclarationPart' although none is marked
			new Action() {	// [116] lst$VarDeclarationPart = VarDeclarationPart
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			new Action() {	// [117] lst$VarDeclarationPart = lst$VarDeclarationPart VarDeclarationPart
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			Action.NONE,  	// [118] opt$lst$VarDeclarationPart = 
			Action.RETURN,	// [119] opt$lst$VarDeclarationPart = lst$VarDeclarationPart
			RETURN2,	// [120] VarDeclaration = var opt$lst$VarDeclarationPart; returns 'opt$lst$VarDeclarationPart' although none is marked
			Action.NONE,  	// [121] opt$ImportStatement = 
			Action.RETURN,	// [122] opt$ImportStatement = ImportStatement
			new Action() {	// [123] lst$ModuleBegin = ModuleBegin
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			new Action() {	// [124] lst$ModuleBegin = lst$ModuleBegin ModuleBegin
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			Action.NONE,  	// [125] opt$lst$ModuleBegin = 
			Action.RETURN,	// [126] opt$lst$ModuleBegin = lst$ModuleBegin
			RETURN5,	// [127] Module = ModuleStart opt$ImportStatement Declarations opt$lst$ModuleBegin ModuleEnd; returns 'ModuleEnd' although none is marked
			RETURN3,	// [128] ModuleStart = module identifier semicolon; returns 'semicolon' although none is marked
			RETURN3,	// [129] ModuleEnd = end identifier dot; returns 'dot' although none is marked
			RETURN3,	// [130] ImportStatement = import_ IdentifierList semicolon; returns 'semicolon' although none is marked
			RETURN2	// [131] ModuleBegin = begin StatementSequence; returns 'StatementSequence' although none is marked
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}
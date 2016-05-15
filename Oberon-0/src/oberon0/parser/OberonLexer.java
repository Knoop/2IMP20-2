/* The following code was generated by JFlex 1.6.1 */

package oberon0.parser;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>E:/My documents/IdeaProjects/2IMP20-2/Oberon-0/Oberon0.flex</tt>
 */
class OberonLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\3\30\0\1\46\2\0\1\42\1\0\1\31\1\32\1\41"+
    "\1\43\1\34\1\44\1\33\1\0\12\2\1\51\1\35\1\47\1\45"+
    "\1\50\2\0\1\26\1\4\1\20\1\11\1\5\1\21\1\6\1\23"+
    "\1\7\2\1\1\15\1\12\1\10\1\13\1\16\1\1\1\17\1\25"+
    "\1\24\1\14\1\30\1\22\1\1\1\27\1\1\1\37\1\1\1\40"+
    "\35\1\3\0\1\36\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff91\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\15\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\0\3\1\1\24"+
    "\1\1\1\25\1\1\1\26\1\27\10\1\1\30\1\31"+
    "\1\32\1\1\1\33\1\1\1\34\1\35\7\1\1\36"+
    "\1\1\1\37\6\1\1\40\1\41\1\1\1\42\1\43"+
    "\3\1\1\44\1\45\1\46\1\47\1\1\1\50\2\1"+
    "\1\51";

  private static int [] zzUnpackAction() {
    int [] result = new int[92];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\52\0\124\0\176\0\250\0\322\0\374\0\u0126"+
    "\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\u0222\0\u024c\0\u0276"+
    "\0\u02a0\0\176\0\176\0\176\0\176\0\176\0\176\0\52"+
    "\0\52\0\176\0\176\0\176\0\176\0\176\0\176\0\u02ca"+
    "\0\u02f4\0\u031e\0\u0348\0\u0372\0\u039c\0\52\0\u03c6\0\52"+
    "\0\u03f0\0\52\0\52\0\u041a\0\u0444\0\u046e\0\u0498\0\u04c2"+
    "\0\u04ec\0\u0516\0\u0540\0\176\0\176\0\176\0\u056a\0\52"+
    "\0\u0594\0\52\0\u05be\0\u05e8\0\u0612\0\u063c\0\u0666\0\u0690"+
    "\0\u06ba\0\u06e4\0\52\0\u070e\0\52\0\u0738\0\u0762\0\u078c"+
    "\0\u07b6\0\u07e0\0\u080a\0\52\0\52\0\u0834\0\52\0\52"+
    "\0\u085e\0\u0888\0\u08b2\0\52\0\52\0\52\0\52\0\u08dc"+
    "\0\52\0\u0906\0\u0930\0\52";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[92];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\2\1\3\1\4\1\5\1\6\1\2\1\7"+
    "\1\2\1\10\1\11\1\12\2\2\1\13\1\14\1\15"+
    "\1\2\1\16\1\2\1\17\1\2\1\20\1\2\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\0\2\2\1\0\25\2\6\0\2\2\13\0"+
    "\1\3\122\0\2\2\1\0\1\2\1\43\23\2\6\0"+
    "\2\2\12\0\2\2\1\0\4\2\1\44\4\2\1\45"+
    "\13\2\6\0\2\2\12\0\2\2\1\0\15\2\1\46"+
    "\7\2\6\0\2\2\12\0\2\2\1\0\3\2\1\47"+
    "\3\2\1\50\15\2\6\0\2\2\12\0\2\2\1\0"+
    "\7\2\1\51\15\2\6\0\2\2\12\0\2\2\1\0"+
    "\13\2\1\52\1\2\1\53\7\2\6\0\2\2\12\0"+
    "\2\2\1\0\13\2\1\54\11\2\6\0\2\2\12\0"+
    "\2\2\1\0\1\2\1\55\23\2\6\0\2\2\12\0"+
    "\2\2\1\0\7\2\1\56\15\2\6\0\2\2\12\0"+
    "\2\2\1\0\17\2\1\57\5\2\6\0\2\2\12\0"+
    "\2\2\1\0\17\2\1\60\3\2\1\61\1\2\6\0"+
    "\2\2\12\0\2\2\1\0\13\2\1\62\11\2\6\0"+
    "\2\2\12\0\2\2\1\0\22\2\1\63\2\2\6\0"+
    "\2\2\56\0\1\64\51\0\1\65\51\0\1\66\5\0"+
    "\2\2\1\0\2\2\1\67\22\2\6\0\2\2\12\0"+
    "\2\2\1\0\5\2\1\70\17\2\6\0\2\2\12\0"+
    "\2\2\1\0\21\2\1\71\3\2\6\0\2\2\12\0"+
    "\2\2\1\0\24\2\1\72\6\0\2\2\12\0\2\2"+
    "\1\0\5\2\1\73\17\2\6\0\2\2\12\0\2\2"+
    "\1\0\7\2\1\74\15\2\6\0\2\2\12\0\2\2"+
    "\1\0\14\2\1\75\10\2\6\0\2\2\12\0\2\2"+
    "\1\0\4\2\1\76\20\2\6\0\2\2\12\0\2\2"+
    "\1\0\3\2\1\77\21\2\6\0\2\2\12\0\2\2"+
    "\1\0\1\2\1\100\23\2\6\0\2\2\12\0\2\2"+
    "\1\0\12\2\1\101\12\2\6\0\2\2\12\0\2\2"+
    "\1\0\13\2\1\102\11\2\6\0\2\2\12\0\2\2"+
    "\1\0\13\2\1\103\11\2\6\0\2\2\12\0\2\2"+
    "\1\0\3\2\1\104\21\2\6\0\2\2\12\0\2\2"+
    "\1\0\1\2\1\105\1\2\1\106\21\2\6\0\2\2"+
    "\12\0\2\2\1\0\10\2\1\107\14\2\6\0\2\2"+
    "\12\0\2\2\1\0\14\2\1\110\10\2\6\0\2\2"+
    "\12\0\2\2\1\0\7\2\1\111\15\2\6\0\2\2"+
    "\12\0\2\2\1\0\21\2\1\112\3\2\6\0\2\2"+
    "\12\0\2\2\1\0\11\2\1\113\13\2\6\0\2\2"+
    "\12\0\2\2\1\0\4\2\1\114\20\2\6\0\2\2"+
    "\12\0\2\2\1\0\1\2\1\115\23\2\6\0\2\2"+
    "\12\0\2\2\1\0\22\2\1\116\2\2\6\0\2\2"+
    "\12\0\2\2\1\0\4\2\1\117\20\2\6\0\2\2"+
    "\12\0\2\2\1\0\15\2\1\120\7\2\6\0\2\2"+
    "\12\0\2\2\1\0\11\2\1\121\13\2\6\0\2\2"+
    "\12\0\2\2\1\0\1\2\1\122\23\2\6\0\2\2"+
    "\12\0\2\2\1\0\13\2\1\123\11\2\6\0\2\2"+
    "\12\0\2\2\1\0\20\2\1\124\4\2\6\0\2\2"+
    "\12\0\2\2\1\0\1\2\1\125\23\2\6\0\2\2"+
    "\12\0\2\2\1\0\23\2\1\126\1\2\6\0\2\2"+
    "\12\0\2\2\1\0\1\2\1\127\23\2\6\0\2\2"+
    "\12\0\2\2\1\0\5\2\1\130\17\2\6\0\2\2"+
    "\12\0\2\2\1\0\5\2\1\131\17\2\6\0\2\2"+
    "\12\0\2\2\1\0\10\2\1\132\14\2\6\0\2\2"+
    "\12\0\2\2\1\0\13\2\1\133\11\2\6\0\2\2"+
    "\12\0\2\2\1\0\1\2\1\134\23\2\6\0\2\2"+
    "\11\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2394];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\1\1\11\15\1\6\11\2\1\6\11\2\1"+
    "\1\0\21\1\3\11\46\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[92];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  OberonLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 140) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public String yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return ("identifier");
            }
          case 42: break;
          case 2: 
            { return ("number");
            }
          case 43: break;
          case 3: 
            { return ("new_line");
            }
          case 44: break;
          case 4: 
            { return ("par_open");
            }
          case 45: break;
          case 5: 
            { return ("par_close");
            }
          case 46: break;
          case 6: 
            { return ("dot");
            }
          case 47: break;
          case 7: 
            { return ("comma");
            }
          case 48: break;
          case 8: 
            { return ("semicolon");
            }
          case 49: break;
          case 9: 
            { return ("tilde");
            }
          case 50: break;
          case 10: 
            { return ("brack_open");
            }
          case 51: break;
          case 11: 
            { return ("brack_close");
            }
          case 52: break;
          case 12: 
            { return ("star");
            }
          case 53: break;
          case 13: 
            { return ("amp");
            }
          case 54: break;
          case 14: 
            { return ("plus");
            }
          case 55: break;
          case 15: 
            { return ("minus");
            }
          case 56: break;
          case 16: 
            { return ("eq");
            }
          case 57: break;
          case 17: 
            { return ("hash");
            }
          case 58: break;
          case 18: 
            { return ("st");
            }
          case 59: break;
          case 19: 
            { return ("gt");
            }
          case 60: break;
          case 20: 
            { return ("if");
            }
          case 61: break;
          case 21: 
            { return ("do");
            }
          case 62: break;
          case 22: 
            { return ("or");
            }
          case 63: break;
          case 23: 
            { return ("of");
            }
          case 64: break;
          case 24: 
            { return ("seq");
            }
          case 65: break;
          case 25: 
            { return ("geq");
            }
          case 66: break;
          case 26: 
            { return ("assign");
            }
          case 67: break;
          case 27: 
            { return ("end");
            }
          case 68: break;
          case 28: 
            { return ("div");
            }
          case 69: break;
          case 29: 
            { return ("mod");
            }
          case 70: break;
          case 30: 
            { return ("var");
            }
          case 71: break;
          case 31: 
            { return ("else");
            }
          case 72: break;
          case 32: 
            { return ("then");
            }
          case 73: break;
          case 33: 
            { return ("type");
            }
          case 74: break;
          case 34: 
            { return ("begin");
            }
          case 75: break;
          case 35: 
            { return ("else_if");
            }
          case 76: break;
          case 36: 
            { return ("const");
            }
          case 77: break;
          case 37: 
            { return ("while");
            }
          case 78: break;
          case 38: 
            { return ("array");
            }
          case 79: break;
          case 39: 
            { return ("module");
            }
          case 80: break;
          case 40: 
            { return ("record");
            }
          case 81: break;
          case 41: 
            { return ("procedure");
            }
          case 82: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}

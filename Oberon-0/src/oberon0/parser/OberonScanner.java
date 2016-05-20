/* The following code was generated by JFlex 1.6.1 */

package oberon0.parser;

import beaver.Symbol;
import beaver.Scanner;

import oberon0.parser.OberonParser.Terminals;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>oberon0.flex</tt>
 */
public class OberonScanner extends Scanner {

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
    "\11\0\1\5\1\4\1\0\1\5\1\3\22\0\1\5\1\0\1\5"+
    "\1\50\2\0\1\44\1\0\1\6\1\10\1\7\1\45\1\37\1\46"+
    "\1\36\1\0\12\2\1\40\1\41\1\51\1\47\1\52\2\0\1\33"+
    "\1\11\1\25\1\16\1\12\1\26\1\13\1\30\1\14\2\1\1\22"+
    "\1\17\1\15\1\20\1\23\1\1\1\24\1\32\1\31\1\21\1\35"+
    "\1\27\1\1\1\34\1\1\1\42\1\1\1\43\35\1\3\0\1\53"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff91\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\4\1\5\1\6\15\1"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\0\3\1"+
    "\1\25\1\1\1\26\1\1\1\27\1\30\10\1\1\31"+
    "\1\32\1\33\1\0\1\1\1\34\1\1\1\35\1\36"+
    "\7\1\1\37\1\1\1\40\6\1\1\41\1\42\1\1"+
    "\1\43\1\44\3\1\1\45\1\46\1\47\1\50\1\1"+
    "\1\51\2\1\1\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[95];
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
    "\0\0\0\54\0\130\0\204\0\260\0\334\0\260\0\260"+
    "\0\u0108\0\u0134\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c"+
    "\0\u0268\0\u0294\0\u02c0\0\u02ec\0\u0318\0\260\0\260\0\u0344"+
    "\0\260\0\54\0\54\0\260\0\260\0\260\0\260\0\260"+
    "\0\u0370\0\u039c\0\260\0\u03c8\0\u03f4\0\u0420\0\u044c\0\54"+
    "\0\u0478\0\54\0\u04a4\0\54\0\54\0\u04d0\0\u04fc\0\u0528"+
    "\0\u0554\0\u0580\0\u05ac\0\u05d8\0\u0604\0\260\0\260\0\260"+
    "\0\u0630\0\u065c\0\54\0\u0688\0\54\0\u06b4\0\u06e0\0\u070c"+
    "\0\u0738\0\u0764\0\u0790\0\u07bc\0\u07e8\0\54\0\u0814\0\54"+
    "\0\u0840\0\u086c\0\u0898\0\u08c4\0\u08f0\0\u091c\0\54\0\54"+
    "\0\u0948\0\54\0\54\0\u0974\0\u09a0\0\u09cc\0\54\0\54"+
    "\0\54\0\54\0\u09f8\0\54\0\u0a24\0\u0a50\0\54";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[95];
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
    "\1\0\1\2\1\3\1\4\2\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\2\1\13\1\2\1\14\1\15\1\16"+
    "\2\2\1\17\1\20\1\21\1\2\1\22\1\2\1\23"+
    "\1\2\1\24\1\2\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\0\2\2\6\0\25\2\4\0\2\2"+
    "\12\0\1\3\55\0\1\5\132\0\1\44\45\0\2\2"+
    "\6\0\1\2\1\45\23\2\4\0\2\2\11\0\2\2"+
    "\6\0\4\2\1\46\4\2\1\47\13\2\4\0\2\2"+
    "\11\0\2\2\6\0\15\2\1\50\7\2\4\0\2\2"+
    "\11\0\2\2\6\0\3\2\1\51\3\2\1\52\15\2"+
    "\4\0\2\2\11\0\2\2\6\0\7\2\1\53\15\2"+
    "\4\0\2\2\11\0\2\2\6\0\13\2\1\54\1\2"+
    "\1\55\7\2\4\0\2\2\11\0\2\2\6\0\13\2"+
    "\1\56\11\2\4\0\2\2\11\0\2\2\6\0\1\2"+
    "\1\57\23\2\4\0\2\2\11\0\2\2\6\0\7\2"+
    "\1\60\15\2\4\0\2\2\11\0\2\2\6\0\17\2"+
    "\1\61\5\2\4\0\2\2\11\0\2\2\6\0\17\2"+
    "\1\62\3\2\1\63\1\2\4\0\2\2\11\0\2\2"+
    "\6\0\13\2\1\64\11\2\4\0\2\2\11\0\2\2"+
    "\6\0\22\2\1\65\2\2\4\0\2\2\57\0\1\66"+
    "\53\0\1\67\53\0\1\70\4\0\6\44\1\0\1\71"+
    "\1\0\43\44\1\0\2\2\6\0\2\2\1\72\22\2"+
    "\4\0\2\2\11\0\2\2\6\0\5\2\1\73\17\2"+
    "\4\0\2\2\11\0\2\2\6\0\21\2\1\74\3\2"+
    "\4\0\2\2\11\0\2\2\6\0\24\2\1\75\4\0"+
    "\2\2\11\0\2\2\6\0\5\2\1\76\17\2\4\0"+
    "\2\2\11\0\2\2\6\0\7\2\1\77\15\2\4\0"+
    "\2\2\11\0\2\2\6\0\14\2\1\100\10\2\4\0"+
    "\2\2\11\0\2\2\6\0\4\2\1\101\20\2\4\0"+
    "\2\2\11\0\2\2\6\0\3\2\1\102\21\2\4\0"+
    "\2\2\11\0\2\2\6\0\1\2\1\103\23\2\4\0"+
    "\2\2\11\0\2\2\6\0\12\2\1\104\12\2\4\0"+
    "\2\2\11\0\2\2\6\0\13\2\1\105\11\2\4\0"+
    "\2\2\11\0\2\2\6\0\13\2\1\106\11\2\4\0"+
    "\2\2\20\0\1\5\44\0\2\2\6\0\3\2\1\107"+
    "\21\2\4\0\2\2\11\0\2\2\6\0\1\2\1\110"+
    "\1\2\1\111\21\2\4\0\2\2\11\0\2\2\6\0"+
    "\10\2\1\112\14\2\4\0\2\2\11\0\2\2\6\0"+
    "\14\2\1\113\10\2\4\0\2\2\11\0\2\2\6\0"+
    "\7\2\1\114\15\2\4\0\2\2\11\0\2\2\6\0"+
    "\21\2\1\115\3\2\4\0\2\2\11\0\2\2\6\0"+
    "\11\2\1\116\13\2\4\0\2\2\11\0\2\2\6\0"+
    "\4\2\1\117\20\2\4\0\2\2\11\0\2\2\6\0"+
    "\1\2\1\120\23\2\4\0\2\2\11\0\2\2\6\0"+
    "\22\2\1\121\2\2\4\0\2\2\11\0\2\2\6\0"+
    "\4\2\1\122\20\2\4\0\2\2\11\0\2\2\6\0"+
    "\15\2\1\123\7\2\4\0\2\2\11\0\2\2\6\0"+
    "\11\2\1\124\13\2\4\0\2\2\11\0\2\2\6\0"+
    "\1\2\1\125\23\2\4\0\2\2\11\0\2\2\6\0"+
    "\13\2\1\126\11\2\4\0\2\2\11\0\2\2\6\0"+
    "\20\2\1\127\4\2\4\0\2\2\11\0\2\2\6\0"+
    "\1\2\1\130\23\2\4\0\2\2\11\0\2\2\6\0"+
    "\23\2\1\131\1\2\4\0\2\2\11\0\2\2\6\0"+
    "\1\2\1\132\23\2\4\0\2\2\11\0\2\2\6\0"+
    "\5\2\1\133\17\2\4\0\2\2\11\0\2\2\6\0"+
    "\5\2\1\134\17\2\4\0\2\2\11\0\2\2\6\0"+
    "\10\2\1\135\14\2\4\0\2\2\11\0\2\2\6\0"+
    "\13\2\1\136\11\2\4\0\2\2\11\0\2\2\6\0"+
    "\1\2\1\137\23\2\4\0\2\2\10\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2684];
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
    "\1\0\3\1\1\11\1\1\2\11\15\1\2\11\1\1"+
    "\1\11\2\1\5\11\2\1\1\11\1\0\21\1\3\11"+
    "\1\0\46\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[95];
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

  /* user code: */
    String string;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public OberonScanner(java.io.Reader in) {
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
    while (i < 154) {
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
  public Symbol nextToken() throws java.io.IOException, Scanner.Exception {
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
          { 	return new Symbol(Terminals.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return new Symbol(Terminals.IDENTIFIER, yyline, yycolumn, yylength(), yytext());
            }
          case 43: break;
          case 2: 
            { return new Symbol(Terminals.NUMBER, yyline, yycolumn, yylength(), yytext());
            }
          case 44: break;
          case 3: 
            { /* ignore */
            }
          case 45: break;
          case 4: 
            { return new Symbol(Terminals.PAR_OPEN, yyline, yycolumn, yylength());
            }
          case 46: break;
          case 5: 
            { return new Symbol(Terminals.STAR, yyline, yycolumn, yylength());
            }
          case 47: break;
          case 6: 
            { return new Symbol(Terminals.PAR_CLOSE, yyline, yycolumn, yylength());
            }
          case 48: break;
          case 7: 
            { return new Symbol(Terminals.DOT, yyline, yycolumn, yylength());
            }
          case 49: break;
          case 8: 
            { return new Symbol(Terminals.COMMA, yyline, yycolumn, yylength());
            }
          case 50: break;
          case 9: 
            { return new Symbol(Terminals.COLON, yyline, yycolumn, yylength());
            }
          case 51: break;
          case 10: 
            { return new Symbol(Terminals.SEMICOLON, yyline, yycolumn, yylength());
            }
          case 52: break;
          case 11: 
            { return new Symbol(Terminals.BRACK_OPEN, yyline, yycolumn, yylength());
            }
          case 53: break;
          case 12: 
            { return new Symbol(Terminals.BRACK_CLOSE, yyline, yycolumn, yylength());
            }
          case 54: break;
          case 13: 
            { return new Symbol(Terminals.AMP, yyline, yycolumn, yylength());
            }
          case 55: break;
          case 14: 
            { return new Symbol(Terminals.PLUS, yyline, yycolumn, yylength());
            }
          case 56: break;
          case 15: 
            { return new Symbol(Terminals.MINUS, yyline, yycolumn, yylength());
            }
          case 57: break;
          case 16: 
            { return new Symbol(Terminals.EQ, yyline, yycolumn, yylength());
            }
          case 58: break;
          case 17: 
            { return new Symbol(Terminals.HASH, yyline, yycolumn, yylength());
            }
          case 59: break;
          case 18: 
            { return new Symbol(Terminals.ST, yyline, yycolumn, yylength());
            }
          case 60: break;
          case 19: 
            { return new Symbol(Terminals.GT, yyline, yycolumn, yylength());
            }
          case 61: break;
          case 20: 
            { return new Symbol(Terminals.TILDE, yyline, yycolumn, yylength());
            }
          case 62: break;
          case 21: 
            { return new Symbol(Terminals.IF, yyline, yycolumn, yylength());
            }
          case 63: break;
          case 22: 
            { return new Symbol(Terminals.DO, yyline, yycolumn, yylength());
            }
          case 64: break;
          case 23: 
            { return new Symbol(Terminals.OR, yyline, yycolumn, yylength());
            }
          case 65: break;
          case 24: 
            { return new Symbol(Terminals.OF, yyline, yycolumn, yylength());
            }
          case 66: break;
          case 25: 
            { return new Symbol(Terminals.ASSIGN, yyline, yycolumn, yylength());
            }
          case 67: break;
          case 26: 
            { return new Symbol(Terminals.SEQ, yyline, yycolumn, yylength());
            }
          case 68: break;
          case 27: 
            { return new Symbol(Terminals.GEQ, yyline, yycolumn, yylength());
            }
          case 69: break;
          case 28: 
            { return new Symbol(Terminals.END, yyline, yycolumn, yylength());
            }
          case 70: break;
          case 29: 
            { return new Symbol(Terminals.DIV, yyline, yycolumn, yylength());
            }
          case 71: break;
          case 30: 
            { return new Symbol(Terminals.MOD, yyline, yycolumn, yylength());
            }
          case 72: break;
          case 31: 
            { return new Symbol(Terminals.VAR, yyline, yycolumn, yylength());
            }
          case 73: break;
          case 32: 
            { return new Symbol(Terminals.ELSE, yyline, yycolumn, yylength());
            }
          case 74: break;
          case 33: 
            { return new Symbol(Terminals.THEN, yyline, yycolumn, yylength());
            }
          case 75: break;
          case 34: 
            { return new Symbol(Terminals.TYPE, yyline, yycolumn, yylength());
            }
          case 76: break;
          case 35: 
            { return new Symbol(Terminals.BEGIN, yyline, yycolumn, yylength());
            }
          case 77: break;
          case 36: 
            { return new Symbol(Terminals.ELSIF, yyline, yycolumn, yylength());
            }
          case 78: break;
          case 37: 
            { return new Symbol(Terminals.CONST, yyline, yycolumn, yylength());
            }
          case 79: break;
          case 38: 
            { return new Symbol(Terminals.WHILE, yyline, yycolumn, yylength());
            }
          case 80: break;
          case 39: 
            { return new Symbol(Terminals.ARRAY, yyline, yycolumn, yylength());
            }
          case 81: break;
          case 40: 
            { return new Symbol(Terminals.MODULE, yyline, yycolumn, yylength());
            }
          case 82: break;
          case 41: 
            { return new Symbol(Terminals.RECORD, yyline, yycolumn, yylength());
            }
          case 83: break;
          case 42: 
            { return new Symbol(Terminals.PROCEDURE, yyline, yycolumn, yylength());
            }
          case 84: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}

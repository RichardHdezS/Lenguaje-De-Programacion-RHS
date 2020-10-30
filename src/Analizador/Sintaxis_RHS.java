/* Generated By:JavaCC: Do not edit this line. Sintaxis_RHS.java */
package Analizador;
public class Sintaxis_RHS implements Sintaxis_RHSConstants {

/** Comeizo a definir la sintaxis de mi lenguaje de programacion*/
  final public void EjecutarLP() throws ParseException {
    jj_consume_token(PROGRAMA);
    jj_consume_token(IDENTIDICADOR);
    jj_consume_token(LLAVEI);
    Bloque();
    jj_consume_token(LLAVED);
    jj_consume_token(0);
  }

  final public void Bloque() throws ParseException {
    if (jj_2_1(2)) {
      VariablesGlobales();
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MAIN:
        CuerpoPrincipal();
        break;
      default:
        jj_la1[0] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  final public void VariablesGlobales() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PUBLICO:
      jj_consume_token(PUBLICO);
      break;
    case PRIVADO:
      jj_consume_token(PRIVADO);
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
      jj_consume_token(INT);
      break;
    case DEC:
      jj_consume_token(DEC);
      break;
    case CHR:
      jj_consume_token(CHR);
      break;
    case STR:
      jj_consume_token(STR);
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(IDENTIDICADOR);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_1;
      }
      jj_consume_token(COMMA);
      jj_consume_token(IDENTIDICADOR);
    }
    jj_consume_token(PUNTCOM);
    Bloque();
  }

  final public void CuerpoPrincipal() throws ParseException {
    jj_consume_token(MAIN);
    jj_consume_token(LLAVEI);
    Sentencias();
    jj_consume_token(LLAVED);
  }

  final public void VariablesLocales() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
      jj_consume_token(INT);
      break;
    case DEC:
      jj_consume_token(DEC);
      break;
    case CHR:
      jj_consume_token(CHR);
      break;
    case STR:
      jj_consume_token(STR);
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(IDENTIDICADOR);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_2;
      }
      jj_consume_token(COMMA);
      jj_consume_token(IDENTIDICADOR);
    }
    jj_consume_token(PUNTCOM);
    VS();
  }

  final public void Sentencias() throws ParseException {
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case EVALUAR:
      case IF:
      case FOR:
      case SWITCH:
      case DO:
      case WHILE:
      case INT:
      case DEC:
      case CHR:
      case STR:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_3;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
      case DEC:
      case CHR:
      case STR:
        VariablesLocales();
        break;
      case IF:
        SentenciaIf();
        break;
      case FOR:
        SentenciaFor();
        break;
      case WHILE:
        SentenciaWhile();
        break;
      case DO:
        SentenciaDo();
        break;
      case SWITCH:
        SentenciaSwitch();
        break;
      case EVALUAR:
        Evaluar();
        break;
      default:
        jj_la1[7] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  final public void VS() throws ParseException {
    if (jj_2_2(3)) {
      VariablesLocales();
    } else {
      Sentencias();
    }
  }

  final public void SentenciaIf() throws ParseException {
    jj_consume_token(IF);
    jj_consume_token(PARENI);
    jj_consume_token(IDENTIDICADOR);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MEN:
      jj_consume_token(MEN);
      jj_consume_token(IDENTIDICADOR);
      break;
    case MAY:
      jj_consume_token(MAY);
      jj_consume_token(IDENTIDICADOR);
      break;
    case IGUAL:
      jj_consume_token(IGUAL);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENTIDICADOR:
        jj_consume_token(IDENTIDICADOR);
        break;
      case FALSE:
        jj_consume_token(FALSE);
        break;
      case TRUE:
        jj_consume_token(TRUE);
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    case MENQ:
      jj_consume_token(MENQ);
      jj_consume_token(IDENTIDICADOR);
      break;
    case MAYQ:
      jj_consume_token(MAYQ);
      jj_consume_token(IDENTIDICADOR);
      break;
    case DIF:
      jj_consume_token(DIF);
      jj_consume_token(IDENTIDICADOR);
      break;
    case AND:
      jj_consume_token(AND);
      jj_consume_token(IDENTIDICADOR);
      break;
    case OR:
      jj_consume_token(OR);
      jj_consume_token(IDENTIDICADOR);
      break;
    case BAN:
      jj_consume_token(BAN);
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(PAREND);
    jj_consume_token(LLAVEI);
    jj_consume_token(LLAVED);
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ELSEIF:
        SentenciaIfElse();
        break;
      case ELSE:
        Sino();
        break;
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ELSE:
      case ELSEIF:
        ;
        break;
      default:
        jj_la1[11] = jj_gen;
        break label_4;
      }
    }
  }

  final public void SentenciaIfElse() throws ParseException {
    jj_consume_token(ELSEIF);
    jj_consume_token(PARENI);
    jj_consume_token(IDENTIDICADOR);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MEN:
      jj_consume_token(MEN);
      jj_consume_token(IDENTIDICADOR);
      break;
    case IGUAL:
      jj_consume_token(IGUAL);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENTIDICADOR:
        jj_consume_token(IDENTIDICADOR);
        break;
      case FALSE:
        jj_consume_token(FALSE);
        break;
      case TRUE:
        jj_consume_token(TRUE);
        break;
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    case MENQ:
      jj_consume_token(MENQ);
      jj_consume_token(IDENTIDICADOR);
      break;
    case MAY:
      jj_consume_token(MAY);
      jj_consume_token(IDENTIDICADOR);
      break;
    case MAYQ:
      jj_consume_token(MAYQ);
      jj_consume_token(IDENTIDICADOR);
      break;
    case DIF:
      jj_consume_token(DIF);
      jj_consume_token(IDENTIDICADOR);
      break;
    case OR:
      jj_consume_token(OR);
      jj_consume_token(IDENTIDICADOR);
      break;
    case AND:
      jj_consume_token(AND);
      jj_consume_token(IDENTIDICADOR);
      break;
    case BAN:
      jj_consume_token(BAN);
      break;
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(PAREND);
    jj_consume_token(LLAVEI);
    jj_consume_token(LLAVED);
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ELSEIF:
        ;
        break;
      default:
        jj_la1[14] = jj_gen;
        break label_5;
      }
      SentenciaIfElse();
    }
    label_6:
    while (true) {
      Sino();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ELSE:
        ;
        break;
      default:
        jj_la1[15] = jj_gen;
        break label_6;
      }
    }
  }

  final public void Sino() throws ParseException {
    jj_consume_token(ELSE);
    jj_consume_token(PARENI);
    jj_consume_token(PAREND);
    jj_consume_token(LLAVEI);
    jj_consume_token(LLAVED);
  }

  final public void SentenciaFor() throws ParseException {
    jj_consume_token(FOR);
    jj_consume_token(PARENI);
    jj_consume_token(INT);
    jj_consume_token(IDENTIDICADOR);
    jj_consume_token(ASIGNACION);
    jj_consume_token(NUMERO);
    jj_consume_token(PUNTCOM);
    jj_consume_token(IDENTIDICADOR);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MEN:
      jj_consume_token(MEN);
      jj_consume_token(IDENTIDICADOR);
      break;
    case MENQ:
      jj_consume_token(MENQ);
      jj_consume_token(IDENTIDICADOR);
      break;
    case MAY:
      jj_consume_token(MAY);
      jj_consume_token(IDENTIDICADOR);
      break;
    case MAYQ:
      jj_consume_token(MAYQ);
      jj_consume_token(IDENTIDICADOR);
      break;
    default:
      jj_la1[16] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(PUNTCOM);
    jj_consume_token(IDENTIDICADOR);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INCR:
      jj_consume_token(INCR);
      break;
    case DECR:
      jj_consume_token(DECR);
      break;
    default:
      jj_la1[17] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(PAREND);
    jj_consume_token(LLAVEI);
    jj_consume_token(LLAVED);
  }

  final public void SentenciaWhile() throws ParseException {
    jj_consume_token(WHILE);
    jj_consume_token(PARENI);
    jj_consume_token(PAREND);
    jj_consume_token(LLAVEI);
    jj_consume_token(LLAVED);
  }

  final public void SentenciaDo() throws ParseException {
    jj_consume_token(DO);
    jj_consume_token(LLAVEI);
    jj_consume_token(LLAVED);
    jj_consume_token(WHILE);
    jj_consume_token(PARENI);
    jj_consume_token(PAREND);
    jj_consume_token(PUNTCOM);
  }

  final public void SentenciaSwitch() throws ParseException {
    jj_consume_token(SWITCH);
    jj_consume_token(PARENI);
    jj_consume_token(PAREND);
    jj_consume_token(LLAVEI);
    jj_consume_token(LLAVED);
  }

/****Seccion para evaluar las expreciones aritmeticas*******/
  final public void Evaluar() throws ParseException {
    label_7:
    while (true) {
      EvaluarOperacionesArit();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case EVALUAR:
        ;
        break;
      default:
        jj_la1[18] = jj_gen;
        break label_7;
      }
    }
  }

  final public void EvaluarOperacionesArit() throws ParseException {
 double e;
    jj_consume_token(EVALUAR);
    jj_consume_token(BRACKETI);
    e = Expresion();
    jj_consume_token(BRACKETD);
    jj_consume_token(PUNTCOM);
                                                                 System.out.println("El valor de la expresion es: "+e);
  }

/** Expresion -> ExpresionMultiplicativa ('+' ExpresionMultiplicativa)*
              |  ExpresionMultiplicativa ('-' ExpresionMultiplicativa)*
*/
  final public double Expresion() throws ParseException {
 double e, e1;
    e = ExpresionMultiplicativa();
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MAS:
      case MENOS:
        ;
        break;
      default:
        jj_la1[19] = jj_gen;
        break label_8;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MAS:
        jj_consume_token(MAS);
        e1 = ExpresionMultiplicativa();
                                            e += e1;
        break;
      case MENOS:
        jj_consume_token(MENOS);
        e1 = ExpresionMultiplicativa();
                                              e -= e1;
        break;
      default:
        jj_la1[20] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
     {if (true) return e;}
    throw new Error("Missing return statement in function");
  }

/** ExpresionMultiplicativa -> ExpresionUnaria ('*' ExpresionUnaria)*
                            |  ExpresionUnaria ('/' ExpresionUnaria)*
*/
  final public double ExpresionMultiplicativa() throws ParseException {
 double e, e1;
    e = ExpresionUnaria();
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MULTI:
      case DIV:
        ;
        break;
      default:
        jj_la1[21] = jj_gen;
        break label_9;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MULTI:
        jj_consume_token(MULTI);
        e1 = ExpresionUnaria();
                                      e *= e1;
        break;
      case DIV:
        jj_consume_token(DIV);
        e1 = ExpresionUnaria();
                                    e /= e1;
        break;
      default:
        jj_la1[22] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
     {if (true) return e;}
    throw new Error("Missing return statement in function");
  }

/** ExpresionUnaria -> '-' ExpresionUnaria
                    |  Primitivo
 */
  final public double ExpresionUnaria() throws ParseException {
 double e;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MENOS:
      jj_consume_token(MENOS);
      e = ExpresionUnaria();
                                 {if (true) return -e;}
      break;
    case PARENI:
    case NUMERO:
    case DECIMAL:
      e = Primitivo();
                   {if (true) return e;}
      break;
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

/** Primitivo -> Numero
              |  Decimal
              |  '(' Expresion ')' 
*/
  final public double Primitivo() throws ParseException {
 double e;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMERO:
      jj_consume_token(NUMERO);
              {if (true) return Double.parseDouble(token.image);}
      break;
    case DECIMAL:
      jj_consume_token(DECIMAL);
               {if (true) return Double.parseDouble(token.image);}
      break;
    case PARENI:
      jj_consume_token(PARENI);
      e = Expresion();
      jj_consume_token(PAREND);
                                     {if (true) return e;}
      break;
    default:
      jj_la1[24] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_3R_10() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(9)) {
    jj_scanpos = xsp;
    if (jj_scan_token(10)) return true;
    }
    xsp = jj_scanpos;
    if (jj_scan_token(48)) {
    jj_scanpos = xsp;
    if (jj_scan_token(49)) {
    jj_scanpos = xsp;
    if (jj_scan_token(50)) {
    jj_scanpos = xsp;
    if (jj_scan_token(51)) return true;
    }
    }
    }
    return false;
  }

  private boolean jj_3_2() {
    if (jj_3R_11()) return true;
    return false;
  }

  private boolean jj_3R_12() {
    if (jj_scan_token(COMMA)) return true;
    return false;
  }

  private boolean jj_3_1() {
    if (jj_3R_10()) return true;
    return false;
  }

  private boolean jj_3R_11() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(48)) {
    jj_scanpos = xsp;
    if (jj_scan_token(49)) {
    jj_scanpos = xsp;
    if (jj_scan_token(50)) {
    jj_scanpos = xsp;
    if (jj_scan_token(51)) return true;
    }
    }
    }
    if (jj_scan_token(IDENTIDICADOR)) return true;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_12()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(PUNTCOM)) return true;
    return false;
  }

  /** Generated Token Manager. */
  public Sintaxis_RHSTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[25];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x2000,0x600,0x0,0x0,0x0,0x0,0x18c8100,0x18c8100,0x0,0x0,0x30000,0x30000,0x0,0x0,0x20000,0x10000,0x0,0xc0,0x100,0xc,0xc,0x30,0x30,0x8000008,0x8000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0xf0000,0x4,0xf0000,0x4,0xf0000,0xf0000,0x40c000,0x3fe0,0x0,0x0,0x40c000,0x3fe0,0x0,0x0,0x3c0,0x0,0x0,0x0,0x0,0x0,0x0,0xa00000,0xa00000,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[2];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public Sintaxis_RHS(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Sintaxis_RHS(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new Sintaxis_RHSTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public Sintaxis_RHS(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new Sintaxis_RHSTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public Sintaxis_RHS(Sintaxis_RHSTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(Sintaxis_RHSTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[64];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 25; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 64; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 2; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}

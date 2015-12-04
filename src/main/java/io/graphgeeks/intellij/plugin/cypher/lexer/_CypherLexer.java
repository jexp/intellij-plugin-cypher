/* The following code was generated by JFlex 1.4.3 on 12/4/15 12:06 PM */

package io.graphgeeks.intellij.plugin.cypher.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static io.graphgeeks.intellij.plugin.cypher.psi.CypherTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12/4/15 12:06 PM from the specification file
 * <tt>/Users/fylmtm/workspace/GraphGeeks/intellij-plugin-cypher/src/main/java/io/graphgeeks/intellij/plugin/cypher/lexer/_CypherLexer.flex</tt>
 */
public class _CypherLexer implements FlexLexer {
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
    "\11\0\1\1\1\2\1\0\1\1\1\1\22\0\1\1\1\66\1\44"+
    "\1\0\1\34\1\67\1\0\1\42\1\47\1\50\1\46\1\62\1\63"+
    "\1\36\1\41\1\45\1\40\11\37\1\56\1\55\1\60\1\57\1\61"+
    "\1\64\1\0\1\4\1\31\1\6\1\14\1\11\1\23\1\27\1\7"+
    "\1\15\1\30\1\33\1\20\1\3\1\13\1\17\1\26\1\24\1\10"+
    "\1\16\1\5\1\12\1\21\1\22\1\25\1\32\1\34\1\53\1\43"+
    "\1\54\1\70\1\34\1\35\1\4\1\31\1\6\1\14\1\11\1\23"+
    "\1\27\1\7\1\15\1\30\1\33\1\20\1\3\1\13\1\17\1\26"+
    "\1\24\1\10\1\16\1\5\1\12\1\21\1\22\1\25\1\32\1\34"+
    "\1\51\1\65\1\52\1\71\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\21\3\1\4\1\5\2\6\1\7"+
    "\2\1\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\1\1\31\1\32\3\3\1\33\21\3"+
    "\1\34\6\3\1\35\13\3\2\0\1\36\1\0\1\37"+
    "\3\0\1\40\3\0\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\2\3\1\47\1\50\1\51\1\3\1\52\11\3"+
    "\1\53\1\54\6\3\1\55\13\3\1\56\17\3\1\57"+
    "\1\60\1\61\5\0\5\3\1\62\1\63\1\64\11\3"+
    "\1\65\4\3\1\66\1\67\1\70\1\71\1\3\1\72"+
    "\10\3\1\73\7\3\1\74\1\75\1\3\1\76\3\3"+
    "\1\77\1\100\1\0\1\101\1\0\1\102\1\103\4\3"+
    "\1\104\10\3\1\105\12\3\1\106\6\3\1\107\1\3"+
    "\1\110\2\3\1\111\3\3\1\112\1\113\1\3\1\114"+
    "\1\3\1\115\2\3\1\116\1\117\1\120\4\3\1\121"+
    "\7\3\1\122\2\3\1\123\3\3\1\124\10\3\1\125"+
    "\13\3\1\126\15\3\1\127\1\130\2\3\1\131\3\3"+
    "\1\132\5\3\1\133\3\3\1\134\1\135\7\3\1\136"+
    "\1\137\3\3\1\140\4\3\1\141\10\3\1\142\5\3"+
    "\1\143\15\3\1\144\4\3\1\145\1\146\15\3\1\147"+
    "\1\150\3\3\1\151\2\3\1\152\1\3\1\153\1\3"+
    "\1\154\1\3\1\155\1\3\1\156\1\157\1\3\1\160"+
    "\2\3\1\161\2\3\1\162\2\3\1\163\4\3\1\164"+
    "\1\165\3\3\1\166";

  private static int [] zzUnpackAction() {
    int [] result = new int[453];
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
    "\0\0\0\72\0\164\0\256\0\350\0\u0122\0\u015c\0\u0196"+
    "\0\u01d0\0\u020a\0\u0244\0\u027e\0\u02b8\0\u02f2\0\u032c\0\u0366"+
    "\0\u03a0\0\u03da\0\u0414\0\u044e\0\u0488\0\u04c2\0\u04fc\0\u0536"+
    "\0\u0570\0\u05aa\0\u05e4\0\u061e\0\72\0\u0658\0\72\0\72"+
    "\0\72\0\72\0\u0692\0\72\0\72\0\u06cc\0\u0706\0\u0740"+
    "\0\u077a\0\72\0\72\0\72\0\u07b4\0\72\0\72\0\u07ee"+
    "\0\u0828\0\u0862\0\u089c\0\u08d6\0\u0910\0\u094a\0\u0984\0\u09be"+
    "\0\u09f8\0\u0a32\0\u0a6c\0\u0aa6\0\u0ae0\0\u0b1a\0\u0b54\0\u0b8e"+
    "\0\u0bc8\0\u0c02\0\u0c3c\0\u0c76\0\u0196\0\u0cb0\0\u0cea\0\u0d24"+
    "\0\u0d5e\0\u0d98\0\u0dd2\0\u0e0c\0\u0e46\0\u0e80\0\u0eba\0\u0ef4"+
    "\0\u0f2e\0\u0f68\0\u0fa2\0\u0fdc\0\u1016\0\u1050\0\u108a\0\u10c4"+
    "\0\u10fe\0\72\0\u05aa\0\72\0\u1138\0\u05e4\0\u1172\0\u11ac"+
    "\0\u11e6\0\u1220\0\u125a\0\72\0\72\0\72\0\72\0\72"+
    "\0\72\0\u1294\0\u12ce\0\u0196\0\u0196\0\u1308\0\u1342\0\u137c"+
    "\0\u13b6\0\u13f0\0\u142a\0\u1464\0\u149e\0\u14d8\0\u1512\0\u154c"+
    "\0\u1586\0\u15c0\0\u15fa\0\u1634\0\u166e\0\u16a8\0\u16e2\0\u171c"+
    "\0\u1756\0\u0196\0\u1790\0\u17ca\0\u1804\0\u183e\0\u1878\0\u18b2"+
    "\0\u18ec\0\u1926\0\u1960\0\u199a\0\u19d4\0\u0196\0\u1a0e\0\u1a48"+
    "\0\u1a82\0\u1abc\0\u1af6\0\u1b30\0\u1b6a\0\u1ba4\0\u1bde\0\u1c18"+
    "\0\u1c52\0\u1c8c\0\u1cc6\0\u1d00\0\u1d3a\0\u0196\0\72\0\u10fe"+
    "\0\u1d74\0\u1dae\0\u1de8\0\u1e22\0\u1e5c\0\u1e96\0\u1ed0\0\u1f0a"+
    "\0\u1f44\0\u1f7e\0\u0196\0\u0196\0\u0196\0\u1fb8\0\u1ff2\0\u202c"+
    "\0\u2066\0\u20a0\0\u20da\0\u2114\0\u214e\0\u2188\0\u0196\0\u21c2"+
    "\0\u21fc\0\u2236\0\u2270\0\u0196\0\u0196\0\u0196\0\u22aa\0\u22e4"+
    "\0\u231e\0\u2358\0\u2392\0\u23cc\0\u2406\0\u2440\0\u247a\0\u24b4"+
    "\0\u24ee\0\u0196\0\u2528\0\u2562\0\u259c\0\u25d6\0\u2610\0\u264a"+
    "\0\u2684\0\u0196\0\u26be\0\u26f8\0\u0196\0\u2732\0\u276c\0\u27a6"+
    "\0\u11e6\0\72\0\u27e0\0\72\0\u281a\0\u0196\0\u0196\0\u2854"+
    "\0\u288e\0\u28c8\0\u2902\0\u0196\0\u293c\0\u2976\0\u29b0\0\u29ea"+
    "\0\u2a24\0\u2a5e\0\u2a98\0\u2ad2\0\u2b0c\0\u2b46\0\u2b80\0\u2bba"+
    "\0\u2bf4\0\u2c2e\0\u2c68\0\u2ca2\0\u2cdc\0\u2d16\0\u2d50\0\u2d8a"+
    "\0\u2dc4\0\u2dfe\0\u2e38\0\u2e72\0\u2eac\0\u2ee6\0\u0196\0\u2f20"+
    "\0\u0196\0\u2f5a\0\u2f94\0\u0196\0\u2fce\0\u3008\0\u3042\0\72"+
    "\0\72\0\u307c\0\u30b6\0\u30f0\0\u312a\0\u3164\0\u319e\0\u0196"+
    "\0\u31d8\0\u0196\0\u3212\0\u324c\0\u3286\0\u32c0\0\u0196\0\u32fa"+
    "\0\u3334\0\u336e\0\u33a8\0\u33e2\0\u341c\0\u3456\0\u0196\0\u3490"+
    "\0\u34ca\0\u0196\0\u3504\0\u353e\0\u3578\0\u0196\0\u35b2\0\u35ec"+
    "\0\u3626\0\u3660\0\u369a\0\u36d4\0\u370e\0\u3748\0\u0196\0\u3782"+
    "\0\u37bc\0\u37f6\0\u3830\0\u386a\0\u38a4\0\u38de\0\u3918\0\u3952"+
    "\0\u398c\0\u39c6\0\u0196\0\u3a00\0\u3a3a\0\u3a74\0\u3aae\0\u3ae8"+
    "\0\u3b22\0\u3b5c\0\u3b96\0\u3bd0\0\u3c0a\0\u3c44\0\u3c7e\0\u3cb8"+
    "\0\u0196\0\u0196\0\u3cf2\0\u3d2c\0\u0196\0\u3d66\0\u3da0\0\u3dda"+
    "\0\u0196\0\u3e14\0\u3e4e\0\u3e88\0\u3ec2\0\u3efc\0\u0196\0\u3f36"+
    "\0\u3f70\0\u3faa\0\u0196\0\u0196\0\u3fe4\0\u401e\0\u4058\0\u4092"+
    "\0\u40cc\0\u4106\0\u4140\0\u0196\0\u0196\0\u417a\0\u41b4\0\u41ee"+
    "\0\u0196\0\u4228\0\u4262\0\u429c\0\u42d6\0\u0196\0\u4310\0\u434a"+
    "\0\u4384\0\u43be\0\u43f8\0\u4432\0\u446c\0\u44a6\0\u0196\0\u44e0"+
    "\0\u451a\0\u4554\0\u458e\0\u45c8\0\u0196\0\u4602\0\u463c\0\u4676"+
    "\0\u46b0\0\u46ea\0\u4724\0\u475e\0\u4798\0\u47d2\0\u480c\0\u4846"+
    "\0\u4880\0\u48ba\0\u0196\0\u48f4\0\u492e\0\u4968\0\u49a2\0\u0196"+
    "\0\u0196\0\u49dc\0\u4a16\0\u4a50\0\u4a8a\0\u4ac4\0\u4afe\0\u4b38"+
    "\0\u4b72\0\u4bac\0\u4be6\0\u4c20\0\u4c5a\0\u4c94\0\u0196\0\u0196"+
    "\0\u4cce\0\u4d08\0\u4d42\0\u0196\0\u4d7c\0\u4db6\0\u0196\0\u4df0"+
    "\0\u0196\0\u4e2a\0\u0196\0\u4e64\0\u0196\0\u4e9e\0\u0196\0\u0196"+
    "\0\u4ed8\0\u0196\0\u4f12\0\u4f4c\0\u0196\0\u4f86\0\u4fc0\0\u0196"+
    "\0\u4ffa\0\u5034\0\u0196\0\u506e\0\u50a8\0\u50e2\0\u511c\0\u0196"+
    "\0\u0196\0\u5156\0\u5190\0\u51ca\0\u0196";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[453];
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
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\10\1\22\1\23\1\10\1\24\7\10\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\2\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
    "\1\56\1\57\1\2\73\0\2\3\72\0\1\10\1\60"+
    "\4\10\1\61\23\10\40\0\10\10\1\62\2\10\1\63"+
    "\1\10\1\64\14\10\40\0\4\10\1\65\1\66\24\10"+
    "\40\0\1\10\1\67\3\10\1\70\6\10\1\71\15\10"+
    "\40\0\32\10\40\0\6\10\1\72\23\10\40\0\10\10"+
    "\1\73\4\10\1\74\4\10\1\75\7\10\40\0\10\10"+
    "\1\76\2\10\1\77\16\10\40\0\7\10\1\100\4\10"+
    "\1\101\15\10\40\0\5\10\1\102\1\103\3\10\1\104"+
    "\17\10\40\0\10\10\1\105\2\10\1\106\16\10\40\0"+
    "\2\10\1\107\1\10\1\110\1\10\1\111\3\10\1\112"+
    "\15\10\1\113\1\10\40\0\5\10\1\114\2\10\1\115"+
    "\12\10\1\116\6\10\40\0\12\10\1\117\1\10\1\120"+
    "\15\10\40\0\4\10\1\121\5\10\1\122\17\10\40\0"+
    "\1\10\1\123\3\10\1\124\4\10\1\125\1\10\1\126"+
    "\15\10\40\0\14\10\1\127\15\10\35\0\35\130\1\0"+
    "\34\130\37\0\1\27\1\30\70\0\2\27\1\131\71\0"+
    "\1\131\71\0\1\132\30\0\42\133\1\134\1\135\26\133"+
    "\43\136\1\137\1\134\25\136\45\0\1\140\1\141\73\0"+
    "\1\142\57\0\1\143\124\0\1\144\57\0\1\145\1\0"+
    "\1\146\67\0\1\147\51\0\1\27\1\30\16\0\1\150"+
    "\71\0\1\151\15\0\2\10\1\152\27\10\40\0\5\10"+
    "\1\153\24\10\40\0\11\10\1\154\15\10\1\155\2\10"+
    "\40\0\3\10\1\156\7\10\1\157\16\10\40\0\15\10"+
    "\1\160\14\10\40\0\6\10\1\161\23\10\40\0\7\10"+
    "\1\162\22\10\40\0\13\10\1\163\16\10\40\0\6\10"+
    "\1\164\23\10\40\0\7\10\1\165\1\166\21\10\40\0"+
    "\1\167\1\10\1\170\6\10\1\171\3\10\1\172\14\10"+
    "\40\0\11\10\1\173\20\10\40\0\13\10\1\174\16\10"+
    "\40\0\2\10\1\175\27\10\40\0\12\10\1\176\4\10"+
    "\1\177\12\10\40\0\12\10\1\200\17\10\40\0\15\10"+
    "\1\201\14\10\40\0\2\10\1\202\5\10\1\203\1\204"+
    "\20\10\40\0\14\10\1\205\15\10\40\0\2\10\1\206"+
    "\10\10\1\207\1\10\1\210\14\10\40\0\13\10\1\211"+
    "\16\10\40\0\7\10\1\212\1\213\21\10\40\0\1\10"+
    "\1\214\30\10\40\0\14\10\1\215\15\10\40\0\2\10"+
    "\1\216\27\10\40\0\10\10\1\217\21\10\40\0\12\10"+
    "\1\220\17\10\40\0\11\10\1\221\20\10\40\0\1\222"+
    "\2\10\1\223\26\10\40\0\2\10\1\224\27\10\40\0"+
    "\1\225\31\10\40\0\1\10\1\226\30\10\40\0\6\10"+
    "\1\227\23\10\40\0\2\10\1\230\27\10\40\0\15\10"+
    "\1\231\14\10\40\0\14\10\1\232\15\10\40\0\6\10"+
    "\1\233\6\10\1\234\14\10\40\0\5\10\1\235\24\10"+
    "\40\0\5\10\1\236\24\10\35\0\35\130\1\237\34\130"+
    "\37\0\2\240\31\0\2\133\1\0\67\133\2\136\1\0"+
    "\67\136\2\140\1\0\67\140\46\141\1\241\23\141\36\0"+
    "\1\242\21\0\1\243\60\0\1\244\11\0\1\245\13\0"+
    "\3\10\1\246\26\10\40\0\24\10\1\247\5\10\40\0"+
    "\6\10\1\250\23\10\40\0\6\10\1\251\23\10\40\0"+
    "\13\10\1\252\16\10\40\0\10\10\1\253\21\10\40\0"+
    "\6\10\1\254\23\10\40\0\6\10\1\255\23\10\40\0"+
    "\1\10\1\256\30\10\40\0\10\10\1\257\21\10\40\0"+
    "\2\10\1\260\10\10\1\261\16\10\40\0\14\10\1\262"+
    "\15\10\40\0\7\10\1\263\22\10\40\0\7\10\1\264"+
    "\22\10\40\0\1\10\1\265\30\10\40\0\13\10\1\266"+
    "\16\10\40\0\6\10\1\267\23\10\40\0\5\10\1\270"+
    "\24\10\40\0\14\10\1\271\15\10\40\0\12\10\1\272"+
    "\17\10\40\0\10\10\1\273\21\10\40\0\15\10\1\274"+
    "\14\10\40\0\6\10\1\275\23\10\40\0\6\10\1\276"+
    "\23\10\40\0\23\10\1\277\6\10\40\0\1\10\1\300"+
    "\30\10\40\0\3\10\1\301\26\10\40\0\6\10\1\302"+
    "\23\10\40\0\2\10\1\303\27\10\40\0\10\10\1\304"+
    "\21\10\40\0\7\10\1\305\4\10\1\306\15\10\40\0"+
    "\5\10\1\307\24\10\40\0\5\10\1\310\24\10\40\0"+
    "\24\10\1\311\5\10\40\0\23\10\1\312\6\10\40\0"+
    "\6\10\1\313\23\10\40\0\1\10\1\314\30\10\40\0"+
    "\5\10\1\315\24\10\40\0\12\10\1\316\17\10\40\0"+
    "\12\10\1\317\17\10\40\0\11\10\1\320\20\10\40\0"+
    "\5\10\1\321\2\10\1\322\21\10\40\0\4\10\1\323"+
    "\25\10\40\0\13\10\1\324\16\10\40\0\1\325\31\10"+
    "\40\0\15\10\1\326\14\10\40\0\2\10\1\327\27\10"+
    "\40\0\6\10\1\330\23\10\35\0\45\141\1\331\1\241"+
    "\23\141\53\0\1\332\54\0\1\333\103\0\1\334\70\0"+
    "\1\335\25\0\4\10\1\336\25\10\40\0\6\10\1\337"+
    "\23\10\40\0\10\10\1\340\21\10\40\0\5\10\1\341"+
    "\24\10\40\0\4\10\1\342\25\10\40\0\2\10\1\343"+
    "\27\10\40\0\2\10\1\344\27\10\40\0\1\10\1\345"+
    "\30\10\40\0\2\10\1\346\27\10\40\0\16\10\1\347"+
    "\13\10\40\0\5\10\1\350\24\10\40\0\3\10\1\351"+
    "\26\10\40\0\2\10\1\352\27\10\40\0\17\10\1\353"+
    "\12\10\40\0\1\10\1\354\30\10\40\0\10\10\1\355"+
    "\21\10\40\0\10\10\1\356\21\10\40\0\24\10\1\357"+
    "\5\10\40\0\12\10\1\360\17\10\40\0\3\10\1\361"+
    "\26\10\40\0\6\10\1\362\23\10\40\0\2\10\1\363"+
    "\27\10\40\0\12\10\1\364\17\10\40\0\12\10\1\365"+
    "\17\10\40\0\15\10\1\366\14\10\40\0\2\10\1\367"+
    "\27\10\40\0\2\10\1\370\27\10\40\0\2\10\1\371"+
    "\27\10\40\0\15\10\1\372\14\10\40\0\5\10\1\373"+
    "\24\10\40\0\2\10\1\374\27\10\40\0\6\10\1\375"+
    "\23\10\40\0\14\10\1\376\15\10\40\0\2\10\1\377"+
    "\27\10\40\0\3\10\1\u0100\26\10\40\0\6\10\1\u0101"+
    "\23\10\40\0\4\10\1\u0102\4\10\1\u0103\20\10\40\0"+
    "\6\10\1\u0104\23\10\40\0\11\10\1\u0105\20\10\40\0"+
    "\6\10\1\u0106\23\10\40\0\1\10\1\u0107\30\10\110\0"+
    "\1\u0108\66\0\1\u0109\24\0\11\10\1\u010a\20\10\40\0"+
    "\2\10\1\u010b\27\10\40\0\14\10\1\u010c\15\10\40\0"+
    "\6\10\1\u010d\23\10\40\0\12\10\1\u010e\17\10\40\0"+
    "\5\10\1\u010f\24\10\40\0\6\10\1\u0110\23\10\40\0"+
    "\10\10\1\u0111\21\10\40\0\6\10\1\u0112\23\10\40\0"+
    "\12\10\1\u0113\17\10\40\0\12\10\1\u0114\17\10\40\0"+
    "\3\10\1\u0115\26\10\40\0\1\10\1\u0116\30\10\40\0"+
    "\11\10\1\u0117\20\10\40\0\12\10\1\u0118\1\u0119\7\10"+
    "\1\u011a\1\10\1\u011b\4\10\40\0\10\10\1\u011c\21\10"+
    "\40\0\4\10\1\u011d\25\10\40\0\10\10\1\u011e\21\10"+
    "\40\0\6\10\1\u011f\23\10\40\0\10\10\1\u0120\21\10"+
    "\40\0\21\10\1\u0121\10\10\40\0\15\10\1\u0122\14\10"+
    "\40\0\10\10\1\u0123\21\10\40\0\13\10\1\u0124\16\10"+
    "\40\0\6\10\1\u0125\23\10\40\0\6\10\1\u0126\23\10"+
    "\40\0\26\10\1\u0127\3\10\40\0\3\10\1\u0128\26\10"+
    "\40\0\1\10\1\u0129\30\10\40\0\10\10\1\u012a\21\10"+
    "\40\0\13\10\1\u012b\16\10\40\0\6\10\1\u012c\23\10"+
    "\40\0\12\10\1\u012d\17\10\40\0\2\10\1\u012e\27\10"+
    "\40\0\5\10\1\u012f\24\10\40\0\3\10\1\u0130\26\10"+
    "\40\0\12\10\1\u0131\17\10\40\0\6\10\1\u0132\23\10"+
    "\40\0\5\10\1\u0133\24\10\40\0\7\10\1\u0134\2\10"+
    "\1\u0135\17\10\40\0\10\10\1\u0136\21\10\40\0\1\10"+
    "\1\u0137\30\10\40\0\11\10\1\u0138\20\10\40\0\14\10"+
    "\1\u0139\15\10\40\0\2\10\1\u013a\27\10\40\0\2\10"+
    "\1\u013b\27\10\40\0\15\10\1\u013c\14\10\40\0\10\10"+
    "\1\u013d\21\10\40\0\3\10\1\u013e\26\10\40\0\6\10"+
    "\1\u013f\23\10\40\0\14\10\1\u0140\15\10\40\0\11\10"+
    "\1\u0141\20\10\40\0\11\10\1\u0142\20\10\40\0\11\10"+
    "\1\u0143\20\10\40\0\3\10\1\u0144\26\10\40\0\7\10"+
    "\1\u0145\22\10\40\0\7\10\1\u0146\22\10\40\0\17\10"+
    "\1\u0147\12\10\40\0\13\10\1\u0148\16\10\40\0\27\10"+
    "\1\u0149\2\10\40\0\4\10\1\u014a\25\10\40\0\2\10"+
    "\1\u014b\27\10\40\0\1\10\1\u014c\30\10\40\0\16\10"+
    "\1\u014d\13\10\40\0\1\10\1\u014e\30\10\40\0\13\10"+
    "\1\u014f\16\10\40\0\6\10\1\u0150\23\10\40\0\4\10"+
    "\1\u0151\25\10\40\0\10\10\1\u0152\21\10\40\0\22\10"+
    "\1\u0153\7\10\40\0\2\10\1\u0154\27\10\40\0\10\10"+
    "\1\u0155\21\10\40\0\10\10\1\u0156\21\10\40\0\13\10"+
    "\1\u0157\16\10\40\0\12\10\1\u0158\17\10\40\0\12\10"+
    "\1\u0159\17\10\40\0\10\10\1\u015a\21\10\40\0\4\10"+
    "\1\u015b\25\10\40\0\15\10\1\u015c\14\10\40\0\11\10"+
    "\1\u015d\20\10\40\0\1\10\1\u015e\30\10\40\0\5\10"+
    "\1\u015f\24\10\40\0\12\10\1\u0160\17\10\40\0\6\10"+
    "\1\u0161\23\10\40\0\6\10\1\u0162\23\10\40\0\12\10"+
    "\1\u0163\17\10\40\0\2\10\1\u0164\27\10\40\0\6\10"+
    "\1\u0165\23\10\40\0\15\10\1\u0166\14\10\40\0\12\10"+
    "\1\u0167\17\10\40\0\2\10\1\u0168\27\10\40\0\6\10"+
    "\1\u0169\23\10\40\0\15\10\1\u016a\14\10\40\0\11\10"+
    "\1\u016b\20\10\40\0\2\10\1\u016c\27\10\40\0\5\10"+
    "\1\u016d\24\10\40\0\24\10\1\u016e\5\10\40\0\12\10"+
    "\1\u016f\17\10\40\0\6\10\1\u0170\23\10\40\0\12\10"+
    "\1\u0171\17\10\40\0\11\10\1\u0172\20\10\40\0\10\10"+
    "\1\u0173\21\10\40\0\13\10\1\u0174\16\10\40\0\13\10"+
    "\1\u0175\16\10\40\0\6\10\1\u0176\23\10\40\0\10\10"+
    "\1\u0177\21\10\40\0\12\10\1\u0178\17\10\40\0\10\10"+
    "\1\u0179\21\10\40\0\22\10\1\u017a\7\10\40\0\15\10"+
    "\1\u017b\14\10\40\0\10\10\1\u017c\21\10\40\0\15\10"+
    "\1\u017d\14\10\40\0\2\10\1\u017e\27\10\40\0\23\10"+
    "\1\u017f\6\10\40\0\1\u0180\31\10\40\0\6\10\1\u0181"+
    "\23\10\40\0\12\10\1\u0182\17\10\40\0\1\u0183\31\10"+
    "\40\0\13\10\1\u0184\16\10\40\0\13\10\1\u0185\16\10"+
    "\40\0\21\10\1\u0186\10\10\40\0\6\10\1\u0187\23\10"+
    "\40\0\2\10\1\u0188\27\10\40\0\2\10\1\u0189\27\10"+
    "\40\0\4\10\1\u018a\25\10\40\0\22\10\1\u018b\7\10"+
    "\40\0\14\10\1\u018c\15\10\40\0\14\10\1\u018d\15\10"+
    "\40\0\14\10\1\u018e\15\10\40\0\6\10\1\u018f\23\10"+
    "\40\0\24\10\1\u0190\5\10\40\0\4\10\1\u0191\25\10"+
    "\40\0\1\10\1\u0192\30\10\40\0\1\10\1\u0193\30\10"+
    "\40\0\5\10\1\u0194\24\10\40\0\10\10\1\u0195\21\10"+
    "\40\0\12\10\1\u0196\17\10\40\0\2\10\1\u0197\27\10"+
    "\40\0\2\10\1\u0198\27\10\40\0\7\10\1\u0199\22\10"+
    "\40\0\22\10\1\u019a\7\10\40\0\14\10\1\u019b\15\10"+
    "\40\0\12\10\1\u019c\17\10\40\0\12\10\1\u019d\17\10"+
    "\40\0\11\10\1\u019e\20\10\40\0\10\10\1\u019f\21\10"+
    "\40\0\10\10\1\u01a0\21\10\40\0\2\10\1\u01a1\27\10"+
    "\40\0\2\10\1\u01a2\27\10\40\0\2\10\1\u01a3\27\10"+
    "\40\0\13\10\1\u01a4\16\10\40\0\3\10\1\u01a5\26\10"+
    "\40\0\10\10\1\u01a6\21\10\40\0\13\10\1\u01a7\16\10"+
    "\40\0\23\10\1\u01a8\6\10\40\0\6\10\1\u01a9\23\10"+
    "\40\0\14\10\1\u01aa\15\10\40\0\10\10\1\u01ab\21\10"+
    "\40\0\10\10\1\u01ac\21\10\40\0\23\10\1\u01ad\6\10"+
    "\40\0\12\10\1\u01ae\17\10\40\0\6\10\1\u01af\23\10"+
    "\40\0\4\10\1\u01b0\25\10\40\0\3\10\1\u01b1\26\10"+
    "\40\0\2\10\1\u01b2\27\10\40\0\1\10\1\u01b3\30\10"+
    "\40\0\1\10\1\u01b4\30\10\40\0\10\10\1\u01b5\21\10"+
    "\40\0\3\10\1\u01b6\26\10\40\0\3\10\1\u01b7\26\10"+
    "\40\0\4\10\1\u01b8\25\10\40\0\2\10\1\u01b9\27\10"+
    "\40\0\2\10\1\u01ba\27\10\40\0\2\10\1\u01bb\27\10"+
    "\40\0\3\10\1\u01bc\26\10\40\0\14\10\1\u01bd\15\10"+
    "\40\0\4\10\1\u01be\25\10\40\0\14\10\1\u01bf\15\10"+
    "\40\0\5\10\1\u01c0\24\10\40\0\13\10\1\u01c1\16\10"+
    "\40\0\1\u01c2\31\10\40\0\1\u01c3\31\10\40\0\12\10"+
    "\1\u01c4\17\10\40\0\2\10\1\u01c5\27\10\35\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[20996];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\32\1\1\11\1\1\4\11\1\1\2\11"+
    "\4\1\3\11\1\1\2\11\50\1\2\0\1\11\1\0"+
    "\1\11\3\0\1\1\3\0\6\11\65\1\1\11\1\1"+
    "\5\0\64\1\1\11\1\0\1\11\1\0\52\1\2\11"+
    "\274\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[453];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
  public _CypherLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _CypherLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 190) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
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
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 115: 
          { return K_RETURN_DISTINCT;
          }
        case 119: break;
        case 86: 
          { return K_EXTRACT;
          }
        case 120: break;
        case 19: 
          { return LESSTHEN;
          }
        case 121: break;
        case 47: 
          { return K_XOR;
          }
        case 122: break;
        case 28: 
          { return K_IN;
          }
        case 123: break;
        case 78: 
          { return K_REMOVE;
          }
        case 124: break;
        case 97: 
          { return K_ASCENDING;
          }
        case 125: break;
        case 73: 
          { return K_FALSE;
          }
        case 126: break;
        case 18: 
          { return EQUAL;
          }
        case 127: break;
        case 6: 
          { return L_INTEGER;
          }
        case 128: break;
        case 32: 
          { return LINECOMMENT;
          }
        case 129: break;
        case 60: 
          { return K_WHEN;
          }
        case 130: break;
        case 15: 
          { return RIGHTSQUAREBRACE;
          }
        case 131: break;
        case 17: 
          { return COLON;
          }
        case 132: break;
        case 109: 
          { return K_RELATIONSHIP;
          }
        case 133: break;
        case 87: 
          { return K_ORDER_BY;
          }
        case 134: break;
        case 10: 
          { return LEFTBRACE;
          }
        case 135: break;
        case 63: 
          { return BLOCKCOMMENT;
          }
        case 136: break;
        case 43: 
          { return K_REL;
          }
        case 137: break;
        case 116: 
          { return K_FIELDTERMINATOR;
          }
        case 138: break;
        case 55: 
          { return K_NONE;
          }
        case 139: break;
        case 111: 
          { return K_SHORTESTPATH;
          }
        case 140: break;
        case 90: 
          { return K_FOREACH;
          }
        case 141: break;
        case 29: 
          { return K_OR;
          }
        case 142: break;
        case 117: 
          { return K_ALLSHORTESTPATHS;
          }
        case 143: break;
        case 49: 
          { return L_DECIMAL;
          }
        case 144: break;
        case 88: 
          { return K_ON_MATCH;
          }
        case 145: break;
        case 112: 
          { return K_WITH_DISTINCT;
          }
        case 146: break;
        case 74: 
          { return STARTRELPATTERNDIRECTED;
          }
        case 147: break;
        case 72: 
          { return K_WHERE;
          }
        case 148: break;
        case 54: 
          { return K_NULL;
          }
        case 149: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 150: break;
        case 14: 
          { return LEFTSQUAREBRACE;
          }
        case 151: break;
        case 38: 
          { return NOTEQUALS;
          }
        case 152: break;
        case 93: 
          { return K_UNION_ALL;
          }
        case 153: break;
        case 16: 
          { return SEMICOLON;
          }
        case 154: break;
        case 81: 
          { return K_UNWIND;
          }
        case 155: break;
        case 57: 
          { return K_DROP;
          }
        case 156: break;
        case 37: 
          { return PLUSEQUALS;
          }
        case 157: break;
        case 22: 
          { return COMMA;
          }
        case 158: break;
        case 40: 
          { return K_ANY;
          }
        case 159: break;
        case 23: 
          { return QUESTIONSIGN;
          }
        case 160: break;
        case 26: 
          { return POW;
          }
        case 161: break;
        case 36: 
          { return GREATERTHANEQUALS;
          }
        case 162: break;
        case 66: 
          { return K_MATCH;
          }
        case 163: break;
        case 94: 
          { return K_DISTINCT;
          }
        case 164: break;
        case 118: 
          { return K_USING_PERIODIC_COMMIT;
          }
        case 165: break;
        case 71: 
          { return K_LIMIT;
          }
        case 166: break;
        case 21: 
          { return PLUS;
          }
        case 167: break;
        case 34: 
          { return LESSTHANEQUALS;
          }
        case 168: break;
        case 105: 
          { return K_WITH_HEADERS;
          }
        case 169: break;
        case 62: 
          { return K_FROM;
          }
        case 170: break;
        case 45: 
          { return K_NOT;
          }
        case 171: break;
        case 89: 
          { return K_LOAD_CSV;
          }
        case 172: break;
        case 84: 
          { return K_SINGLE;
          }
        case 173: break;
        case 13: 
          { return RIGHTCURLYBRACE;
          }
        case 174: break;
        case 92: 
          { return K_ENDS_WITH;
          }
        case 175: break;
        case 75: 
          { return ENDRELPATTERNDIRECTED;
          }
        case 176: break;
        case 27: 
          { return K_AS;
          }
        case 177: break;
        case 104: 
          { return K_DROP_INDEX_ON;
          }
        case 178: break;
        case 56: 
          { return K_NODE;
          }
        case 179: break;
        case 80: 
          { return K_REDUCE;
          }
        case 180: break;
        case 42: 
          { return K_ALL;
          }
        case 181: break;
        case 59: 
          { return K_SKIP;
          }
        case 182: break;
        case 64: 
          { return STARTRELPATTERN;
          }
        case 183: break;
        case 7: 
          { return DOT;
          }
        case 184: break;
        case 33: 
          { return REGEXMATCH;
          }
        case 185: break;
        case 79: 
          { return K_RETURN;
          }
        case 186: break;
        case 69: 
          { return K_UNION;
          }
        case 187: break;
        case 102: 
          { return K_STARTS_WITH;
          }
        case 188: break;
        case 82: 
          { return K_DELETE;
          }
        case 189: break;
        case 85: 
          { return K_FILTER;
          }
        case 190: break;
        case 76: 
          { return K_ASSERT;
          }
        case 191: break;
        case 31: 
          { return L_STRING;
          }
        case 192: break;
        case 106: 
          { return K_ASSERT_EXISTS;
          }
        case 193: break;
        case 8: 
          { return DIVIDE;
          }
        case 194: break;
        case 48: 
          { return L_IDENTIFIER_TEXT;
          }
        case 195: break;
        case 53: 
          { return K_ELSE;
          }
        case 196: break;
        case 4: 
          { return BACTICK;
          }
        case 197: break;
        case 61: 
          { return K_WITH;
          }
        case 198: break;
        case 50: 
          { return K_THEN;
          }
        case 199: break;
        case 113: 
          { return K_CREATE_INDEX_ON;
          }
        case 200: break;
        case 12: 
          { return LEFTCURLYBRACE;
          }
        case 201: break;
        case 83: 
          { return K_IS_NULL;
          }
        case 202: break;
        case 52: 
          { return K_CASE;
          }
        case 203: break;
        case 65: 
          { return ENDRELPATTERN;
          }
        case 204: break;
        case 39: 
          { return K_AND;
          }
        case 205: break;
        case 41: 
          { return K_ASC;
          }
        case 206: break;
        case 101: 
          { return K_DESCENDING;
          }
        case 207: break;
        case 107: 
          { return K_CREATE_UNIQUE;
          }
        case 208: break;
        case 24: 
          { return PIPE;
          }
        case 209: break;
        case 25: 
          { return MODULO;
          }
        case 210: break;
        case 3: 
          { return L_IDENTIFIER;
          }
        case 211: break;
        case 35: 
          { return INVALIDNOTEQUALS;
          }
        case 212: break;
        case 95: 
          { return K_IS_UNIQUE;
          }
        case 213: break;
        case 70: 
          { return K_START;
          }
        case 214: break;
        case 44: 
          { return K_END;
          }
        case 215: break;
        case 9: 
          { return MUL;
          }
        case 216: break;
        case 20: 
          { return GREATHERTHEN;
          }
        case 217: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 218: break;
        case 98: 
          { return K_USING_SCAN;
          }
        case 219: break;
        case 11: 
          { return RIGHTBRACE;
          }
        case 220: break;
        case 100: 
          { return K_USING_INDEX;
          }
        case 221: break;
        case 99: 
          { return K_IS_NOT_NULL;
          }
        case 222: break;
        case 96: 
          { return K_ON_CREATE;
          }
        case 223: break;
        case 91: 
          { return K_CONTAINS;
          }
        case 224: break;
        case 5: 
          { return MINUS;
          }
        case 225: break;
        case 30: 
          { return RANGE;
          }
        case 226: break;
        case 46: 
          { return K_SET;
          }
        case 227: break;
        case 68: 
          { return K_COUNT;
          }
        case 228: break;
        case 51: 
          { return K_TRUE;
          }
        case 229: break;
        case 110: 
          { return K_DETACH_DELETE;
          }
        case 230: break;
        case 114: 
          { return K_OPTIONAL_MATCH;
          }
        case 231: break;
        case 67: 
          { return K_MERGE;
          }
        case 232: break;
        case 77: 
          { return K_CREATE;
          }
        case 233: break;
        case 58: 
          { return K_DESC;
          }
        case 234: break;
        case 108: 
          { return K_CONSTRAINT_ON;
          }
        case 235: break;
        case 103: 
          { return K_USING_JOIN_ON;
          }
        case 236: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

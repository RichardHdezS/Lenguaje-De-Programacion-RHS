/* Generated By:JavaCC: Do not edit this line. Sintaxis_RHSTokenManager.java */
package Analizador;

/** Token Manager. */
public class Sintaxis_RHSTokenManager implements Sintaxis_RHSConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1fc00000707f00L) != 0L)
         {
            jjmatchedKind = 54;
            return 1;
         }
         if ((active0 & 0x1000000000L) != 0L)
            return 3;
         return -1;
      case 1:
         if ((active0 & 0x1fc00000707f00L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 1;
            return 1;
         }
         return -1;
      case 2:
         if ((active0 & 0xf000000000000L) != 0L)
            return 1;
         if ((active0 & 0x10c00000707f00L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 54;
               jjmatchedPos = 2;
            }
            return 1;
         }
         return -1;
      case 3:
         if ((active0 & 0x10400000401000L) != 0L)
            return 1;
         if ((active0 & 0x800000306f00L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 3;
            return 1;
         }
         return -1;
      case 4:
         if ((active0 & 0x800000004000L) != 0L)
            return 1;
         if ((active0 & 0x302f00L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 4;
            return 1;
         }
         return -1;
      case 5:
         if ((active0 & 0xa00L) != 0L)
            return 1;
         if ((active0 & 0x302500L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 5;
            return 1;
         }
         return -1;
      case 6:
         if ((active0 & 0x100400L) != 0L)
            return 1;
         if ((active0 & 0x202100L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 6;
            return 1;
         }
         return -1;
      case 7:
         if ((active0 & 0x202100L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 7;
            return 1;
         }
         return -1;
      case 8:
         if ((active0 & 0x202100L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 8;
            return 1;
         }
         return -1;
      case 9:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 9;
            return 1;
         }
         if ((active0 & 0x2000L) != 0L)
         {
            if (jjmatchedPos < 8)
            {
               jjmatchedKind = 54;
               jjmatchedPos = 8;
            }
            return -1;
         }
         if ((active0 & 0x200000L) != 0L)
            return 1;
         return -1;
      case 10:
         if ((active0 & 0x2000L) != 0L)
         {
            if (jjmatchedPos < 8)
            {
               jjmatchedKind = 54;
               jjmatchedPos = 8;
            }
            return -1;
         }
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 10;
            return 1;
         }
         return -1;
      case 11:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 11;
            return 1;
         }
         return -1;
      case 12:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 12;
            return 1;
         }
         return -1;
      case 13:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 13;
            return 1;
         }
         return -1;
      case 14:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 54;
            jjmatchedPos = 14;
            return 1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 61;
         return jjMoveStringLiteralDfa1_0(0x4000000000000000L);
      case 33:
         jjmatchedKind = 43;
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 34:
         return jjStartNfaWithStates_0(0, 36, 3);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 40:
         return jjStopAtPos(0, 27);
      case 41:
         return jjStopAtPos(0, 28);
      case 42:
         return jjStopAtPos(0, 4);
      case 43:
         jjmatchedKind = 2;
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 44:
         return jjStopAtPos(0, 34);
      case 45:
         jjmatchedKind = 3;
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 46:
         return jjStopAtPos(0, 35);
      case 47:
         return jjStopAtPos(0, 5);
      case 58:
         return jjStopAtPos(0, 58);
      case 59:
         return jjStopAtPos(0, 33);
      case 60:
         jjmatchedKind = 39;
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 61:
         jjmatchedKind = 1;
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 62:
         jjmatchedKind = 41;
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 91:
         return jjStopAtPos(0, 31);
      case 93:
         return jjStopAtPos(0, 32);
      case 95:
         return jjMoveStringLiteralDfa1_0(0x78f8000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x10000000004000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x4000000300000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x2000000400000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x800000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x1000000000000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x600L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x8000000002800L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 123:
         return jjStopAtPos(0, 29);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 125:
         return jjStopAtPos(0, 30);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, 0L);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x4000000000000000L) != 0L)
            return jjStopAtPos(1, 62);
         break;
      case 38:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStopAtPos(1, 45);
         break;
      case 43:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 45:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      case 61:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(1, 37);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         else if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(1, 42);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000300000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000002414000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x28000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000001000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000400L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000002800L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      case 124:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(1, 44);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, 0L);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x2900L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 67:
      case 99:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 49, 1);
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 70:
      case 102:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x420000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x1400L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000010000L);
      case 79:
      case 111:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(2, 23);
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000040000L);
      case 82:
      case 114:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 50, 1);
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 51, 1);
         break;
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x2300000L);
      case 84:
      case 116:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 48, 1);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000000L);
      case 87:
      case 119:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(2, 19);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 68:
      case 100:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(3, 12, 1);
         break;
      case 69:
      case 101:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 46, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x4320000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x1004000L);
      case 76:
      case 108:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 22, 1);
         else if ((active0 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 52, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x300L);
      case 82:
      case 114:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(3, 18);
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000010000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa5_0(active0, 0x300000L);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 69:
      case 101:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(4, 16);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 47, 1);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0xa00L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x1020000L);
      case 78:
      case 110:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 14, 1);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x6000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 95:
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(5, 26);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x100L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000L);
      case 67:
      case 99:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(5, 9, 1);
         else if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(5, 11, 1);
         break;
      case 69:
      case 101:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(5, 24);
         break;
      case 73:
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa6_0(active0, 0x120000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000000L);
      case 69:
      case 101:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(6, 10, 1);
         else if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(6, 17);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa7_0(active0, 0x200100L);
      case 87:
      case 119:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(6, 20, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x2200100L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x2000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0, 0L);
      return 8;
   }
   switch(curChar)
   {
      case 95:
         if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(8, 25);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa9_0(active0, 0x200000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa9_0(active0, 0x2000L);
      case 88:
      case 120:
         return jjMoveStringLiteralDfa9_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0, 0L);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0, 0L);
      return 9;
   }
   switch(curChar)
   {
      case 40:
         return jjMoveStringLiteralDfa10_0(active0, 0x2000L);
      case 75:
      case 107:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(9, 21, 1);
         break;
      case 80:
      case 112:
         return jjMoveStringLiteralDfa10_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0, 0L);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0, 0L);
      return 10;
   }
   switch(curChar)
   {
      case 41:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(10, 13);
         break;
      case 82:
      case 114:
         return jjMoveStringLiteralDfa11_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0, 0L);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0, 0L);
      return 11;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         return jjMoveStringLiteralDfa12_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0, 0L);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0, 0L);
      return 12;
   }
   switch(curChar)
   {
      case 67:
      case 99:
         return jjMoveStringLiteralDfa13_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0, 0L);
}
private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0, 0L);
      return 13;
   }
   switch(curChar)
   {
      case 73:
      case 105:
         return jjMoveStringLiteralDfa14_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0, 0L);
}
private int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0, 0L);
      return 14;
   }
   switch(curChar)
   {
      case 79:
      case 111:
         return jjMoveStringLiteralDfa15_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(13, active0, 0L);
}
private int jjMoveStringLiteralDfa15_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0, 0L);
      return 15;
   }
   switch(curChar)
   {
      case 78:
      case 110:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(15, 8, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(14, active0, 0L);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 14;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 53)
                        kind = 53;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 54)
                     kind = 54;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if (curChar == 34)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if ((0x3ff000100000000L & l) != 0L)
                     jjCheckNAddTwoStates(4, 5);
                  break;
               case 4:
                  if ((0xfff400100000000L & l) != 0L)
                     jjCheckNAddTwoStates(4, 5);
                  break;
               case 5:
                  if (curChar == 34 && kind > 56)
                     kind = 56;
                  break;
               case 6:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if (curChar == 39 && kind > 57)
                     kind = 57;
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 53)
                     kind = 53;
                  jjCheckNAddStates(0, 2);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 53)
                     kind = 53;
                  jjCheckNAdd(10);
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(11, 12);
                  break;
               case 12:
                  if (curChar == 46)
                     jjCheckNAdd(13);
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjCheckNAdd(13);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 54)
                     kind = 54;
                  jjCheckNAdd(1);
                  break;
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 54)
                     kind = 54;
                  jjCheckNAdd(1);
                  break;
               case 3:
               case 4:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(4, 5);
                  break;
               case 7:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 14 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   10, 11, 12, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\75", "\53", "\55", "\52", "\57", "\53\53", "\55\55", null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, "\50", "\51", "\173", "\175", "\133", "\135", "\73", "\54", "\56", 
"\42", "\75\75", "\74\75", "\74", "\76\75", "\76", "\41\75", "\41", "\174\174", 
"\46\46", null, null, null, null, null, null, null, null, null, null, null, null, "\72", 
null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7ffffffffffffffL, 0x0L, 
};
static final long[] jjtoSkip = {
   0xf800000000000000L, 0x0L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[14];
private final int[] jjstateSet = new int[28];
protected char curChar;
/** Constructor. */
public Sintaxis_RHSTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public Sintaxis_RHSTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 14; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}

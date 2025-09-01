package day4;

// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.PrintStream;

public class q26{
   public ShuffleChecker() {
   }

   public static boolean isValidShuffle(String var0, String var1, String var2) {
      if (var0.length() + var1.length() != var2.length()) {
         return false;
      } else {
         int var3 = 0;
         int var4 = 0;

         for(int var5 = 0; var5 < var2.length(); ++var5) {
            if (var3 < var0.length() && var2.charAt(var5) == var0.charAt(var3)) {
               ++var3;
            } else {
               if (var4 >= var1.length() || var2.charAt(var5) != var1.charAt(var4)) {
                  return false;
               }

               ++var4;
            }
         }

         return var3 == var0.length() && var4 == var1.length();
      }
   }

   public static void main(String[] var0) {
      String var1 = "abc";
      String var2 = "def";
      String var3 = "dabecf";
      PrintStream var10000 = System.out;
      boolean var10001 = isValidShuffle(var1, var2, var3);
      var10000.println("Is valid shuffle: " + var10001);
   }
}

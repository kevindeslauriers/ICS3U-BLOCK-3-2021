package week6;

public class WhileQuiz {
   public static void main(String[] args) {
      q1();
      q2();
      q3();
      q4();
      q5();
      q6();

      xyBalance("abxcyxbb");
      xyBalance2("abxcyxbb");

   }

   public static boolean xyBalance2(String str) {
      int index = 0;
      while (index < str.length()) {
         String nextChar = str.substring(index, index + 1);
         if ("x".equals(nextChar)) {
            if (str.substring(index + 1).indexOf("y") < 0)
               return false;
         }
         index++;
      }

      return true;
   }

   public static boolean xyBalance(String str) {
      int index = 0;
      while (index < str.length()) {
         String nextChar = str.substring(index, index + 1);
         if ("x".equals(nextChar)) {
            // check the right side of the x for a y
            int index2 = index + 1;
            boolean hasY = false;
            while (index2 < str.length()) {
               String nextChar2 = str.substring(index2, index2 + 1);
               if ("y".equals(nextChar2)) {
                  hasY = true;
               }
               index2++;
            }
            if (!hasY)
               return false;
         }
         index++;
      }

      return true;
   }

   private static void q6() {
   }

   private static void q5() {
   }

   private static void q4() {
   }

   private static void q3() {
   }

   private static void q2() {
   }

   private static void q1() {
      int count = 5;
      while (count < 100) {
         count = count * 2;
      }

      count = count + 1;
   }
}

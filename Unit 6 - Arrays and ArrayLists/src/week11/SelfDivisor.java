package week11;

public class SelfDivisor {
   public static boolean isSelfDivisor(int num) {
      String temp = "" + num;
      for (int i = 0; i < temp.length(); i++) {
         int digit = Integer.parseInt(temp.substring(i, i + 1));
         if (num % digit != 0)
            return false;
      }

      return true;
   }
   /*
    * public static boolean isSelfDivisor(int num) { int lastNum = (num % 10); int
    * temp = num; while (num % lastNum == 0) { temp = temp / 10; lastNum = (temp %
    * 10); }
    * 
    * return temp == 0; }
    */

   public static int[] firstNumSelfDivisors(int start, int num) {
      int[] temp = new int[num];

      int count = 0;
      while (count < temp.length) {
         if (isSelfDivisor(start)) {
            temp[count] = start;
            count++;
         }
         start++;
      }

      return temp;
   }

}

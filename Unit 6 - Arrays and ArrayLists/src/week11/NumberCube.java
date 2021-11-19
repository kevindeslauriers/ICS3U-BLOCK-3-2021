package week11;

public class NumberCube {
   public int toss() {
      return 0;
   }

   public static int[] getCubeTosses(NumberCube cube, int numTosses) {
      int[] tosses = new int[numTosses];
      for (int i = 0; i < tosses.length; i++) {
         tosses[i] = cube.toss();
      }

      return tosses;
   }

   public static int getLongestRun(int[] values) {
      int maxRun = 1;
      int currentRun = 1;

      for (int i = 1; i < values.length; i++) {
         if (values[i] == values[i - 1])
            currentRun++;
         else {
            if (currentRun > maxRun)
               maxRun = currentRun;
            currentRun = 1;
         }
      }

      if (maxRun > 1)
         return maxRun;
      else
         return -1;
   }
}

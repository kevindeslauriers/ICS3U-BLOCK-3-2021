package week8;

public class DieGame {
   public static void main(String[] args) {

      Die die1 = new Die();
      // System.out.println(die1.numSides); // public non-static
      // System.out.println(die1.topSide); // private non-static
      // System.out.println(Die.DEFAULT_NUM_SIDES); // public static

      Die die2 = new Die(6);

      int count = 0;
      for (int i = 0; i < 100; i++) {
         die1.roll();
         die2.roll();

         System.out.println(die1 + " " + die2);
         if (die1.equals(die2))
            count++;
      }
      System.out.println("Pairs: " + count);

   }
}

package week8;

public class DieGame {
   public static void main(String[] args) {
      Die die1 = new Die();
      Die die2 = new Die();

      int count = 0;
      for (int i = 0; i < 100; i++) {
         die1.roll();
         die2.roll();
         if (die1.getTopSide() == die2.getTopSide())
            count++;
      }
      System.out.println("Pairs: " + count);

   }
}

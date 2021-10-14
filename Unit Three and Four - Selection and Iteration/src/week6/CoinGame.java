package week6;

public class CoinGame {

   private int startingCoins; // starting number of coins
   private int maxRounds; // maximum number of rounds played

   public CoinGame(int s, int r) {
      startingCoins = s;
      maxRounds = r;
   }

   /**
    * Returns the number of coins (1, 2, or 3) that player 1 will spend.
    */
   public int getPlayer1Move() {
      return 0;
   }

   /**
    * Returns the number of coins (1, 2, or 3) that player 2 will spend, as
    * described in part (a).
    */
   public int getPlayer2Move(int round) {
      if (round % 3 == 0)
         return 3;
      else if (round % 2 == 0)
         return 2;
      else
         return 1;
   }

   /**
    * Plays a simulated game between two players, as described in part (b).
    * 
    */
   public void playGame() {

      int p1Coins = startingCoins;
      int p2Coins = startingCoins;

      int round = 1;

      while (round < maxRounds && p1Coins > 3 && p2Coins > 3) {
         int p1Move = getPlayer1Move();
         int p2Move = getPlayer2Move(round);

         p1Coins -= p1Move;
         p2Coins -= p2Move;

         // logic
         if (p1Move == p2Move)
            p2Coins++;
         else if (Math.abs(p1Move - p2Move) == 1)
            p2Coins++;
         else if (Math.abs(p1Move - p2Move) == 2)
            p2Coins += 2;
      }

      if (p1Coins == p2Coins)
         System.out.println("TIE");
      else if (p1Coins > p2Coins)
         System.out.println("P1 WINS");
      else if (p1Coins > p2Coins)
         System.out.println("P2 WINS");
   }

}

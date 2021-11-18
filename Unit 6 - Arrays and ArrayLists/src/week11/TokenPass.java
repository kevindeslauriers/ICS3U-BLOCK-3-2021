package week11;

public class TokenPass {
   private int[] tokens;
   private int currentPlayer;

   // Part (A)
   public TokenPass(int playerCount) {
      currentPlayer = (int) (Math.random() * playerCount);
      tokens = new int[playerCount];

      for (int i = 0; i < tokens.length; i++) {
         // for (int token : tokens) {
         tokens[i] = (int) (Math.random() * 10) + 1;
      }

   }

   // Part (B)
   public void distributeCurrentPlayerTokens() {
      int tokensLeft = tokens[currentPlayer];
      tokens[currentPlayer] = 0;

      int nextPlayer = currentPlayer + 1;

      while (tokensLeft > 0) {
         if (nextPlayer == tokens.length)
            nextPlayer = 0;

         tokens[nextPlayer]++;
         tokensLeft--;
         nextPlayer++;
      }
   }

}

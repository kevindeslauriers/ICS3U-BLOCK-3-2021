package week7;

public class CrazyEightsHelp {
   public static void main(String[] args) {
      int p1Points = 0, c1Points = 0, c2Points = 0;

      while (!gameOver(p1Points, c1Points, c2Points)) {
         String result = playRound();
         int firstDash = result.indexOf("-");
         int secondDash = result.indexOf("-", firstDash + 1);
         p1Points += Integer.parseInt(result.substring(0, firstDash));
         c1Points += Integer.parseInt(result.substring(firstDash + 1, secondDash));
         c2Points += Integer.parseInt(result.substring(secondDash + 1));

         System.out.println("Current Score: " + p1Points + " " + c1Points + " " + c2Points);
      }

   }

   private static String playRound() {

      String playerHand = "";
      String c1Hand = "";
      String c2Hand = "";

      String topCard = ""; // no eights

      // "7H 3D AC JS-9D"
      String temp = processPlayer(playerHand, topCard);
      playerHand = temp.substring(0, temp.indexOf("-"));
      topCard = temp.substring(temp.indexOf("-") + 1);
      temp = processComputer(c1Hand, topCard);
      c1Hand = temp.substring(0, temp.indexOf("-"));
      topCard = temp.substring(temp.indexOf("-") + 1);
      temp = processComputer(c2Hand, topCard);
      c2Hand = temp.substring(0, temp.indexOf("-"));
      topCard = temp.substring(temp.indexOf("-") + 1);

      return "37-0-12";
   }

   private static String processComputer(String c1Hand, String topCard) {
      return "-4D";
   }

   private static String processPlayer(String playerHand, String topCard) {
      return "7H 3D 4C-2D";
   }

   private static boolean gameOver(int p1Points, int c1Points, int c2Points) {
      return p1Points >= 100 || c1Points >= 100 || c2Points >= 100;
   }

}

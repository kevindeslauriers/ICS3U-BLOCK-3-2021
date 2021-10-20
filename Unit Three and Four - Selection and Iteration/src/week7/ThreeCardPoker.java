package week7;

import java.util.Scanner;

public class ThreeCardPoker {
   private static final int NUM_SUITS = 4;
   private static final String HEARTS = "H";
   private static final String DIAMONDS = "D";
   private static final String CLUBS = "C";
   private static final String SPADES = "S";
   private static final double CARDS_PER_SUIT = 13;
   private static final String ACE = "A";
   private static final String JACK = "J";
   private static final String QUEEN = "Q";
   private static final String KING = "K";

   public static void main(String[] args) {
      // 7H AC KD

      int wallet = 500;
      Scanner in = new Scanner(System.in);

      // int bet = getWager(in, 50, 100, wallet);

      String playerHand = "";
      playerHand = getCard(playerHand) + " ";
      playerHand += getCard(playerHand) + " ";
      playerHand += getCard(playerHand) + " ";

      System.out.println(playerHand);

      playerHand = discard(in, playerHand);

   }

   private static String getCard(String usedCards) {
      String card = getFace() + getSuit();

      while (usedCards.indexOf(card) >= 0) {
         card = getFace() + getSuit();
      }
      return card;
   }

   private static String getSuit() {
      int suit = (int) (Math.random() * NUM_SUITS);

      if (suit == 0)
         return HEARTS;
      else if (suit == 1)
         return DIAMONDS;
      else if (suit == 2)
         return CLUBS;
      else
         return SPADES;

   }

   private static String getFace() {
      int suit = (int) (Math.random() * CARDS_PER_SUIT);
      if (suit >= 2 && suit <= 10)
         return suit + "";
      else if (suit == 1)
         return ACE;
      else if (suit == 11)
         return JACK;
      else if (suit == 12)
         return QUEEN;
      else
         return KING;

   }

   private static int getWager(Scanner in, int minBet, int maxBet, int wallet) {
      boolean validBet = false;
      int bet = 0;
      while (!validBet) {
         System.out.print("Please enter your bet [$" + minBet + " - $" + maxBet + "]: ");
         try {
            bet = Integer.parseInt(in.nextLine());

            if (bet > maxBet || bet < minBet) {
               System.out.println("Your bet must be between [$" + minBet + " - $" + maxBet + "]");
            } else if (bet > wallet) {
               System.out.println("You only have $" + wallet);
            } else {
               validBet = true;
            }
         } catch (Exception ex) {
            System.out.println("Invalid Input!");
         }
      }

      return bet;
   }

   private static String discard(Scanner in, String playerHand) {
      int numCardsToReplace = getNumberToDiscard(in);
      String temp = playerHand;
      if (numCardsToReplace == 0)
         return playerHand;
      else if (numCardsToReplace == 3) {
         playerHand = getCard(playerHand + temp) + " ";
         playerHand += getCard(playerHand + temp) + " ";
         playerHand += getCard(playerHand + temp) + " ";
      } else {
         String cardToReplace = getCardsToDiscard(in, numCardsToReplace, playerHand);
         int space = cardToReplace.indexOf(" ");
         String card1 = "";
         if (space == -1)
            card1 = cardToReplace;
         else
            card1 = cardToReplace.substring(0, space);

         String card = getCard(playerHand + temp);
         playerHand = playerHand.replace(card1, card);
         if (numCardsToReplace == 2) {
            String card2 = cardToReplace.substring(space + 1);
            card = getCard(playerHand + cardToReplace + temp);
            playerHand = playerHand.replace(card2, card);
         }
      }
      return playerHand;
   }

   private static int getNumberToDiscard(Scanner in) {
      boolean validInput = false;
      int val = 0;
      while (!validInput) {
         System.out.print("Hoe many cards to discard [0,3]: ");
         try {
            val = Integer.parseInt(in.nextLine());

            if (val < 0 || val > 3) {
               System.out.println("Invalid input!");
            } else {
               validInput = true;
            }
         } catch (Exception ex) {
            System.out.println("Invalid input!");
         }
      }
      return val;
   }

   private static String getCardsToDiscard(Scanner in, int numCardsToReplace, String playerHand) {
      final String VALID_CARDS = "AS2S3S4S5S6S7S8S9S10SJSQSKSAC2C3C4C5C6C7C8C9C10CJCQCKCAD2D3D4D5D6D7D8D9D10DJDQDKDAH2H3H4H5H6H7H8H9H10HJHQHKH";
      boolean validInput = false;
      String cards = "";
      while (!validInput) {
         System.out.println("Please enter the cards to replace: (ex. 7H KD): ");
         cards = in.nextLine().toUpperCase();
         if (countOccurences(cards, " ") != numCardsToReplace - 1) {
            System.out.println("You must choose " + numCardsToReplace + " cards.");
         } else if ((numCardsToReplace == 1) && (playerHand.indexOf(cards) < 0))
            System.out.println("You don't have a " + cards);
         else if ((numCardsToReplace == 1) && (playerHand.indexOf(cards) >= 0))
            validInput = true;
         else if (numCardsToReplace == 2) {
            int space = cards.indexOf(" ");

            String card1 = cards.substring(0, space);
            String card2 = cards.substring(space + 1);
            if (VALID_CARDS.indexOf(card1) < 0)
               System.out.println("Not a valid card: " + card1);
            else if (VALID_CARDS.indexOf(card2) < 0)
               System.out.println("Not a valid card: " + card2);
            else if (playerHand.indexOf(card1) < 0)
               System.out.println("You don't have a " + card1);
            else if (playerHand.indexOf(card2) < 0)
               System.out.println("You don't have a " + card2);
            else if (playerHand.equals(card2))
               System.out.println("You cannot discard the same card.");
            else
               validInput = true;
         }

      }

      return cards;

   }

   private static int countOccurences(String str, String str2) {
      int count = 0;
      if (str2.length() > str.length())
         return 0;

      for (int i = 0; i < str.length(); i++) {
         String substr = str.substring(i, i + str2.length());
         if (str2.equals(substr))
            count++;
      }
      return count;

   }
}

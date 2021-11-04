package week9;

public class Beverage {

   private int numOunces;
   private static int numSold = 0;

   public Beverage(int numOz) {
      numOunces = numOz;
   }

   /* belongs to the class */
   public static void sell(int n) {
      numSold += n;
      // numOunces++;
   }

}

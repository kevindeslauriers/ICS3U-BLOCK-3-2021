package week3;

public class RandomNumberExamples {
   public static void main(String[] args) {

      System.out.println(Math.random()); // [0.0,0.999999999]

      double r = Math.random();

      int lower = -5;
      int upper = 5;
      int numPossibilities = (upper - lower + 1);

      int rand = (int) (numPossibilities * r) + lower; // brackets matter

      String str = "Random Numbers"; // replace a random character with an "x"

      int index = (int) (Math.random() * str.length());
      str = str.substring(0, index) + "x" + str.substring(index + 1);
      System.out.println(str);

   }
}

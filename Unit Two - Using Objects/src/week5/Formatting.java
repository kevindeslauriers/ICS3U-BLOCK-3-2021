package week5;

public class Formatting {
   public static void main(String[] args) {
      // 5:3.272 => 5 : 3.272
      // 5:03.272

      int minutes = 5;
      double seconds = 3.272676786;
      double seconds1 = 3.2;

      // What I want is this: 5:03.272

      // placeholders
      // %d -> ints
      // %f -> floating point numbers (double)
      // %06.3f -> pad the left side with 0 width of 6 and 3 decimal places

      // System.out.printf("blah%dtest %f", minutes, seconds);
      System.out.printf("Mile One: %d:%06.3f", minutes, seconds1);
   }
}

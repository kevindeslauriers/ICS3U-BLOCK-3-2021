package week6;

public class ForLoops {
   public static void main(String[] args) {

      whileLoopExample2();
      // forLoopExample3();
      forLoopExample4();

   }

   private static void forLoopExample4() {
      for (int i = 8, j = 5; j % i != 0; i += 2, j++) {
         System.out.println(i + " " + j);
      }
   }

   private static void forLoopExample3() {
      int i = 1;
      for (; i < 10;) {
         System.out.println("Hi");
         i++;
      }
   }

   private static void forLoopExample() {

      int sum = 0;

      /* for loops are meant for counting and incrementing */
      for (int i = 1; i <= 100; i++) {
         sum += i;

      }

      System.out.println(sum);
   }

   private static void forLoopExample2() {

      int sum = 0;

      /* for loops are meant for counting and incrementing */
      for (int i = 0; i <= 100; i += 2) {
         sum += i;

      }

      System.out.println(sum);
   }

   private static void whileLoopExample() {
      int i = 1; // I happen first and ONLY ONCE
      int sum = 0;

      while (i <= 100) { // CHECK the condition
         sum += i;
         i++; // increment after each time the body executed
      }

      System.out.println(sum);

   }

   /* adds all the even numbers by counting by 2 */
   private static void whileLoopExample2() {
      int i = 2;
      int sum = 0;

      while (i <= 100) {
         sum += i;
         i += 2;
      }

      System.out.println(sum);

   }
}

package week6;

public class NestedLoops {
   public static void main(String[] args) {
      exampleOne();
      framingSquares(1, 2, 3, 4);

   }

   private static void framingSquares(int M, int N, int P, int Q) {
      for (int i = 0; i < Q; i++) {
         for (int j = 0; j < 2 * P + 2 * Q + N; j++) {
            System.out.print("#");
         }
         System.out.println();
      }

      for (int i = 0; i < P; i++) {
         for (int j = 0; j < Q; j++) {
            System.out.print("#");
         }

         for (int j = 0; j < 2 * P + N; j++) {
            System.out.print("+");
         }

         for (int j = 0; j < Q; j++) {
            System.out.print("#");
         }
         System.out.println();
      }

      for (int i = 0; i < M; i++) {
         for (int j = 0; j < Q; j++) {
            System.out.print("#");
         }
         for (int j = 0; j < P; j++) {
            System.out.print("+");
         }

         for (int j = 0; j < N; j++) {
            System.out.print(".");
         }

         for (int j = 0; j < P; j++) {
            System.out.print("+");
         }
         for (int j = 0; j < Q; j++) {
            System.out.print("#");
         }
         System.out.println();
      }

      for (int i = 0; i < P; i++) {
         for (int j = 0; j < Q; j++) {
            System.out.print("#");
         }

         for (int j = 0; j < 2 * P + N; j++) {
            System.out.print("+");
         }

         for (int j = 0; j < Q; j++) {
            System.out.print("#");
         }
         System.out.println();
      }
      for (int i = 0; i < Q; i++) {
         for (int j = 0; j < 2 * P + 2 * Q + N; j++) {
            System.out.print("#");
         }
         System.out.println();
      }
   }

   private static void exampleOne() {
      for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <= 10; j++) {
            System.out.printf("%3d", (i * j));
         }
         System.out.println();
      }
   }
}

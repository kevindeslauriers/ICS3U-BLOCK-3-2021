package week10;

public class ArrayExamples {
   public static void main(String[] args) {
      primitiveArray();
      // arrayObjectExample();
      iterateArrayExample();

      int[] arr = { 5, 3, 2, 6, 3, 3 };
      mystery(arr);

   }

   private static void mystery(int[] arr) {
      int index = (int) (Math.random() * arr.length);

      arr[index] = -arr[index];
   }

   private static void iterateArrayExample() {
      int[] arr = { 5, 3, 2, 6, 3, 3 };

      int numOdd = 0;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] % 2 == 1)
            numOdd++;
      }

      System.out.println(numOdd);
   }

   private static void arrayObjectExample() {
      Animal[] animals = new Animal[3];
      animals[0] = new Animal();

   }

   private static void primitiveArray() {
      int[] arr = new int[5];

      arr[0] = 2;
      arr[1] = 6;
      arr[2] = 12;
      arr[3] = -3;
      arr[4] = 9;
      System.out.println(arr[2]);
   }
}

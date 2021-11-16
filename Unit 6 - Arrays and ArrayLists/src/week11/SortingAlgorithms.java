package week11;

public class SortingAlgorithms {
   public static void main(String[] args) {
      int[] arr = { 80, 70, 10, 15, 5, 90, 85 };

      // selectionSort(arr);
      insertionSort(arr);
   }

   private static void insertionSort(int[] arr) {
      for (int i = 1; i < arr.length; i++) {
         int temp = arr[i];
         int j;
         for (j = i; j > 0 && temp < arr[j - 1]; j--) { // shift
            arr[j] = arr[j - 1];
         }

         arr[j] = temp;
      }
   }

   private static void selectionSort(int[] arr) {
      for (int i = 0; i < arr.length - 1; i++) { // sort the next item
         int smallestIndex = i;
         for (int j = i + 1; j < arr.length; j++) { // find the smallest
            if (arr[j] < arr[smallestIndex])
               smallestIndex = j;
         }

         int temp = arr[i];
         arr[i] = arr[smallestIndex];
         arr[smallestIndex] = temp;
      }
   }
}

package week11;

import java.util.Arrays;

public class SearchingAlgorithms {
   public static void main(String[] args) {
      int[] arr = { 5, 91, 34, 83, 384, 49, 10, 31 };

      int index = linearSearch(arr, 83);
      index = linearSearch(arr, 84);

      int[] nums = new int[100000];

      for (int i = 0; i < nums.length; i++) {
         nums[i] = (int) (Math.random() * 1000);
      }

      Arrays.sort(nums);

      index = binarySearch(nums, -1);
   }

   private static int binarySearch(int[] arr, int findMe) {
      int lower = 0;
      int upper = arr.length - 1;
      int numComparisons = 0;

      while (upper >= lower) {
         numComparisons++;
         int mid = (upper + lower) / 2;

         if (arr[mid] == findMe)
            return mid;
         else if (arr[mid] > findMe)
            upper = mid - 1;
         else
            lower = mid + 1;
      }

      System.out.println(numComparisons);
      return -1;
   }

   private static int linearSearch(int[] arr, int findMe) {
      for (int j = 0; j < arr.length; j++) {
         if (arr[j] == findMe)
            return j;
      }

      return -1;

   }
}

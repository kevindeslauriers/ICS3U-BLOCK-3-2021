package week11;

public class ForEachExample {
   public static void main(String[] args) {
      int[] arr = { 5, 91, 34, 83, 384, 49, 10, 31 };
      /*
       * for (int el : arr) { System.out.println(el); }
       */
      String[] words = { "Hello", "Goodbye", "Steve", "Tristan", "Henry" };

      int numVowels = 0;
      String vowels = "aeiouAEIOU";
      for (String w : words) { // get the next word
         // iterate through the characters of w
         for (int i = 0; i < w.length(); i++) {
            String letter = w.substring(i, i + 1);
            if (vowels.indexOf(letter) >= 0) {
               numVowels++;
            }
         }
      }

      System.out.println(numVowels);

   }
}

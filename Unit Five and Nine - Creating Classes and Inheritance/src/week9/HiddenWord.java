package week9;

public class HiddenWord {
   private String hiddenWord;

   public HiddenWord(String hiddenWord) {
      this.hiddenWord = hiddenWord;
   }

   public String getHint(String str) {
      String result = "";

      for (int i = 0; i < str.length(); i++) {
         String a = str.substring(i, i + 1);
         String b = hiddenWord.substring(i, i + 1);
         if (a.equals(b))
            result += a;
         else if (hiddenWord.indexOf(a) >= 0)
            result += "+";
         else
            result += ".";
      }

      return result;
   }
}

package week6;

public class EquivalentExpressions {
   public static void main(String[] args) {
      // boolean expressions evaluate to TRUE / FALSE
      int x = 7;

      System.out.println(x > 3); // (x > 7) => TRUE

      // equivalent expressions are a different way to write the expression but it
      // evaluates to the same values.

      // (x < 3) || (x > 7) (diagram in one note - red part)
      // \ !((x >= 3) && (x <= 7)) (diagram in one note - not the blue part)

      // DeMorgan's Laws
      // \ !(A || B) = !A && !B A and B refer to SIMPLE expressions like (x > 8)
      // \ !(A && B) = !A || !B A and B refer to SIMPLE expressions like (x > 8)

   }
}

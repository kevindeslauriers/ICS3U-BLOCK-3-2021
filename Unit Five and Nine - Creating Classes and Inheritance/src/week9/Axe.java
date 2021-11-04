package week9;

public class Axe extends Weapon {
   public void use() {
      System.out.println("Swings Axe.");
   }

   public void test() {
      System.out.println(this);
   }

   public String toString() {
      return "This is an Axe.";
   }
}

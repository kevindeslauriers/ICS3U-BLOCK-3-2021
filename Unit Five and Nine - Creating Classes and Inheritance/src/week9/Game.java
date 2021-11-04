package week9;

public class Game {
   public static void main(String[] args) {
      Character steve = new Character();
      Axe axe = new Axe();
      Bow bow = new Bow();
      steve.setWeapon(axe);
      steve.useWeapon();
      steve.setWeapon(bow);
      steve.useWeapon();

   }
}

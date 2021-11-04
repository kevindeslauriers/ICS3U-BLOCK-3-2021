package week9;

public class Game {
   public static void main(String[] args) {
      Character steve = new Character();
      Axe axe1 = new Axe();
      axe1.test();
      Bow bow = new Bow();
      steve.setWeapon(axe1);
      steve.useWeapon();
      steve.setWeapon(bow);
      steve.useWeapon();

   }
}

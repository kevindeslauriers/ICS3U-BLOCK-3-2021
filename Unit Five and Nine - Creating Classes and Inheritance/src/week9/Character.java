package week9;

public class Character {
   private Weapon activeWeapon;

   public void setWeapon(Weapon w) {
      activeWeapon = w;
   }

   public void useWeapon() {
      activeWeapon.use();
   }

}

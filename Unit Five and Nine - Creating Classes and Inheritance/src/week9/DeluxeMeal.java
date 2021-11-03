package week9;

public class DeluxeMeal extends Meal {
   private String sideDish;
   private String drink;

   public DeluxeMeal(String entree, String sideDish, String drink, double cost) {
      super(entree, cost + 3);
      this.sideDish = sideDish;
      this.drink = drink;
   }

   public String toString() {
      return "deluxe " + super.toString();
   }
}

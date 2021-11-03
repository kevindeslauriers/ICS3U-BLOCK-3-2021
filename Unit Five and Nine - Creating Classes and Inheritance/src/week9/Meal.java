package week9;

public class Meal {
   private String entree;
   private double cost;

   public Meal(String entree, double cost) {
      this.entree = entree;
      this.cost = cost;
   }

   public String toString() {
      return entree + " meal, $" + cost;
   }
}

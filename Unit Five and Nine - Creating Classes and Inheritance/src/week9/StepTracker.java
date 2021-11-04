package week9;

public class StepTracker {
   private int minSteps;
   private int numDays = 0;
   private int totalSteps = 0;
   private int activeDays = 0;

   public StepTracker(int m) {
      minSteps = m;
   }

   public int activeDays() {
      return activeDays;
   }

   public void addDailySteps(int steps) {
      totalSteps += steps;
      numDays++;
      if (steps >= minSteps)
         activeDays++;
   }

   public double averageSteps() {
      return (double) totalSteps / numDays;
   }
}

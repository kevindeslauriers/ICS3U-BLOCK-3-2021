package week9;

public class StepTracker {
   private int minSteps;
   private int numDays;
   private int totalSteps;
   private int activeDays;

   public StepTracker(int minSteps) {
      this.minSteps = minSteps;
      this.numDays = 0;
      this.totalSteps = 0;
      this.activeDays = 0;
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

public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int numDays;
    private int numActiveDays;
    public StepTracker(int threshold) {
       minSteps = threshold;
       totalSteps = 0;
       numDays = 0;
       numActiveDays = 0;
    }
    public void addDailySteps(int steps) {
       totalSteps += steps;
       numDays++;
       if (steps >= minSteps) {
          numActiveDays++;
       }
    }
    public int activeDays() {
       return numActiveDays;
    }
    public double averageSteps() {
       if (numDays == 0) {
          return 0.0;
       } else {
          return (double) totalSteps / numDays;
       }
    }
 }
 
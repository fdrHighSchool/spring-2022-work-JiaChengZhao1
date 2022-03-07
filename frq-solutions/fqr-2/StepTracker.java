public class StepTracker{

  private int steps;
  private int totalSteps;
  private int totalDays;
  private int minStep;
  private int activeDays;

  public StepTracker(int tS, int tD, int mS, int aD, int s){
    this.totalSteps = tS;
    this.totalDays = tD;
    this.minStep = mS;
    this.activeDays = aD;
    this.steps = s;
  }
  public int addDailySteps(){
    return this.steps;
  }
  public boolean activeDays(){
      //if steps is less than 10000, then it is not an active day
      if (this.steps <= this.minStep){
        return false;
      }else{
        return true;
      }

  }
  public int averageSteps(){
    return totalSteps/activeDays;
    //total number of steps from each day divided by amount of days
  }
}

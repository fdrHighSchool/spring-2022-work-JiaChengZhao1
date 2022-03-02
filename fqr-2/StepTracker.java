public class StepTracker{

  private String name
  private int steps
  private int days

  public StepTracker(String n, int s, int d){
    this.name=n;
    this.steps=s;
    this.days=d;
  }
  public addDailySteps(){

  }
  public activeDays(){
      //if steps is less than 10000, then it is not an active day
      if (this.steps <=10000){
        return false;
      }else{
        return true;
      }

  }
  public averageSteps(){
    //total number of steps from each day divided by amount of days
  }
}

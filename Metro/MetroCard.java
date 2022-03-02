public class MetroCard{

  private String name;
  private double balance;
  private boolean freeRide;
  private int time;

  public MetroCard(String n, double bal, boolean fr, int t){
    this.name = n;
    this.balance = bal;
    this.freeRide = fr;
    this.time = t;
  }

  public void freeSwipe(){
  if (this.freeRide = true){
    free();
  } else if(this.freeRide = false) {
    deductBalance();
  }
}



  public void deductBalance(){
  if (this.balance >= 2.5) {this.balance -= 2.5;
      System.out.println("Enjoy your ride, Mr/Ms." + this.name);
      System.out.println("You have $" + this.balance + " remaining on your card.");
    } else {
      System.out.println("You don't have enough balance.");
    }
  }

public void free(){
  if (this.time >= 20){
    System.out.println("Your card is not valid currently.");
  }else {
      System.out.println("Enjoy your free ride, Mr/Ms." + this.name);
  }
}






}

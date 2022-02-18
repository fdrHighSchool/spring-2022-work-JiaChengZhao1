public class MetroCard{

  private String name;
  private double balance;
  private boolean freeRide;

  public MetroCard(String n, double bal, boolean fr){
    this.name = n;
    this.balance = bal;
    this.freeRide = fr;
  }

  public void deductBalance(){
    if (this.freeRide = true){
    System.out.println("Enjoy your ride, Mr/Ms." + this.name);
  }else if (this.balance >= 2.5) {
      this.balance -= 2.5;
      System.out.println("Enjoy your ride, Mr/Ms." + this.name);
      System.out.println("You have $" + this.balance + " remaining on your card.");
    } else {
      System.out.println("You don't have enough balance.");
    }
  }

}

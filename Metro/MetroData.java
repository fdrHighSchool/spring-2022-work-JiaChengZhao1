public class MetroData{
  public static void main(String[] args){
    MetroCard card1 = new MetroCard("Andy Zhu", 25, true);
    MetroCard card2 = new MetroCard("Sample", 1.50, false);

    card1.swipe();

    // card1.deductBalance();
    // card2.deductBalance();

    }
  }

public class MetroData{
  public static void main(String[] args){
    MetroCard card1 = new MetroCard("Andy Zhu", 25, false, 21);
    MetroCard card2 = new MetroCard("Sample", 1.50, true, 24);

    card1.freeSwipe();
    card2.freeSwipe();

    // card1.deductBalance();
    // card2.deductBalance();

    }
  }

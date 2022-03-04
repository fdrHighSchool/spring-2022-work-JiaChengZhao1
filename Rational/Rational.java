public class Rational {
  private int numerator;
  private int denominator;

  public Rational(){
    this.numerator = 4;
    this.denominator = 5;

  }

  public Rational(int n, int d){
    this.numerator = n;
    this.denominator = d;

  }
  public void printRational(int n, int d) {
    System.out.println(numerator + "/" + denominator);
    }

  public void printRational() {
    System.out.println(numerator + "/" + denominator);
  }
} public void negate() {
    this.num *= -1;
  }

  public void invert() {
    int temp = this.num;
    this.num = this.den;
    this.den = temp;
  }

  public double toDouble() {
    return (double)this.num / this.den;
  }

  // override toString
  public String toString() {
    return this.num + "/" + this.den;
  }
}

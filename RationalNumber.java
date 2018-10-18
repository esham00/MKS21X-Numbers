
public class RationalNumber extends RealNumber
{
  private int numerator, denominator;


  public RationalNumber(int nume, int deno){
    super(0);//this value is ignored!
    if (deno == 0) {numerator = 0; denominator = 1;}
    numerator = nume;
    denominator = deno;
    reduce();
  }

  public double getValue(){
    return (double)numerator / denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    if (numerator == 0) {return new RationalNumber(0,0);}
    return new RationalNumber(denominator, numerator);
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    if (other.numerator == numerator && other.denominator == denominator) {
      return true;
    }
      return false;
  }
  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    if (denominator == 1 || numerator == 0) {return "" + numerator;}
    if (denominator < 0 || numerator < 0) {return "-" + Math.abs(numerator) + "/" + Math.abs(denominator);}
    return numerator + "/" + denominator;
  }
  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    if (Math.abs(b) > Math.abs(a)) {
      int originalA = Math.abs(a);
      a = Math.abs(b);
      b = originalA;
    }
    if (b == 0) {
      return 1;
    }
    if (a % b == 0) {
      return b;
    }
    while (b!=0) {
        int originalB = Math.abs(b);
        b = (Math.abs(a))%(Math.abs(b));
        a = originalB;
      }
    return a;
  }
  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
     int gcf = RationalNumber.gcd(numerator, denominator);
     numerator = numerator / gcf;
     denominator = denominator / gcf;
     if (numerator < 0 && denominator < 0) {
       numerator *= -1;
       denominator *= -1;
     }
  }
  /******************Operations!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int newNum = (numerator * other.getNumerator());
    int newDen = (denominator * other.getDenominator());
    return new RationalNumber(newNum, newDen);
  }

  /**
  *Return a new RationalN that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    int newNum = (numerator * other.getDenominator());
    int newDen = (denominator * other.getNumerator());
    return new RationalNumber(newNum, newDen);
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int newNum = (numerator * other.getDenominator()) + (other.getNumerator() * denominator);
    int newDen = (denominator * other.getDenominator());
    RationalNumber brandNew = new RationalNumber(newNum, newDen);
    return brandNew;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int newNum = (numerator * other.getDenominator()) - (other.getNumerator() * denominator);
    int newDen = (denominator * other.getDenominator());
    RationalNumber brandNew = new RationalNumber(newNum, newDen);
    return brandNew;
    }
  }

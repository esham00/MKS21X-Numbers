public class MyDriver {
  public static void main(String[] args) {
  System.out.println("Real Numbers");
  RealNumber zero = new RealNumber(0);
  RealNumber first = new RealNumber(.5);
  RealNumber second = new RealNumber(1);
  RealNumber third = new RealNumber(-1 * first.getValue());
  System.out.println(zero + "(0)");
  System.out.println(first + "(.5)");
  System.out.println(second + "(1)");
  System.out.println(third + "(-.5)");
  System.out.println(third.add(second) + "(.5)");
  System.out.println(zero.multiply(first) + "(0)");
  System.out.println(zero.divide(second) + "(0)");
  System.out.println(first.subtract(second) + "(-.5)");
  System.out.println("Rational Numbers");
  RationalNumber fourth = new RationalNumber(1,2);
  RationalNumber fifth = new RationalNumber(1,-2);
  RationalNumber sixth = new RationalNumber(-3,4);
  RationalNumber seventh = new RationalNumber(5,10);
  RationalNumber eighth = new RationalNumber(0,3);
  RationalNumber ninth = new RationalNumber(5,1);
  System.out.println(fourth + " (1/2)");
  System.out.println(fifth + " (-1/2)");
  System.out.println(sixth + " (-3/4)");
  System.out.println(seventh + " (1/2)");
  }
}

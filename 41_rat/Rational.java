public class Rational{
    private int numerator;
    private int denominator;
    public Rational(){
      numerator = 0;
      denominator = 1;
    }
    public Rational(int a, int b){
      numerator = a;
      if (b == 0){
        System.out.println("error: cannot divide by 0 :(");
        numerator = 0;
        denominator = 1;
      }
      else {
        denominator = b;
      }
    }
    public String toString(){
      return numerator + "/" + denominator;
    }
    public double floatValue(){
      return ((double) numerator)/((double) denominator);
    }
    public void multiply(Rational a){
      numerator *= a.numerator;
      denominator *= a.denominator;
    }
    public void divide(Rational a){
      numerator *= a.denominator;
      denominator *= a.numerator;
    }
    public static void main(String[] args){
      
    }
}

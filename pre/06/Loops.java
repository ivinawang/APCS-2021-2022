public class Loops{

//exercise 7.9-3: In Exercise 9 we wrote a recursive version of power, which takes a double x and an integer n and returns x^n.
//Now write an iterative method to perform the same calculation.
  static class exercise3{
    public static void power(double x, int n){
      double term = 1;
      double result = x;
      while (term <= n){
        System.out.println(x + "^" + term + " = "+ result);
        term = term + 1;
        result = result * x;
      }
    }
  }

//exercise 7.9-4:
  static class exercise4{
    public static void factorial(int n){
        int term = 0;
        int result = 1;
        while (term <= n){
          System.out.println(term+"! = "+result);
          term = term + 1;
          result = result * term;
        }
    }
  }

//exercise 7.9-5:
  static class exercise5{
    public static double power(double x, double n){
      double term = 1;
      double result = x;
      while (term <= n){
        term = term + 1;
        result = result * x;
      }
      return result;
    }
    public static double factorial(double n){
        double term = 0;
        double total = 1;
        while (term <= n){
          term = term + 1;
          total = total * term;
        }
        return total;
    }
    public static void exp(double x, double i){
      double total = 1;
      for (int a = 1; a < i + 1; a++){
        total = total + power(x,a) / factorial(i);
        System.out.println(total);
      }
    }
  }

  public static void main(String[] args){
    new exercise3().power(3,4);
    new exercise4().factorial(4);
    new exercise5().exp(2,3);

  }
}

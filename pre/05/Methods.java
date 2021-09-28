public class Methods{

//exercise 6.11-2: Write a method named isDivisible that takes two integers,
// n and m, and that returns true if n is divisible by m, and false otherwise.
static class exercise2{
    public boolean isDivisible(int n, int m){
      if (n % m == 0) {
          return true;
      } else {
          return false;
    }
  }
}

//exercise 6.11-3: Write a method named isTriangle that takes three integers as arguments and returns either true or false,
// depending on whether you can or cannot form a triangle from sticks with the given lengths.
    //a, b ,c are the lengths of the three sticks
static class exercise3{
  public boolean isTriangle(int a, int b, int c){
    if (a > (b + c)){
      return false;
    } else if (b > (a + c)){
      return false;
    } else if (c > (a + b)){
      return false;
    } else {
      return true;
    }
  }
}

//exercise 6.11-8: Write a method called ack that takes two ints as parameters
//and that computes and returns the value of the Ackermann function.
static class exercise8{
  public static int ack(int m, int n){
    if (m == 0){
      return (n+1);
    } else if (n == 0){
      return (ack(m-1,1));
    } else {
      return (ack(m-1, ack(m,n-1)));
    }
  }
}

  public static void main(String[] args){
      System.out.println(new exercise2().isDivisible(6,2));
      System.out.println(new exercise3().isTriangle(2,3,4));
      System.out.println(new exercise8().ack(1,2));
  }
}

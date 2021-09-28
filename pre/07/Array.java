import java.util.Arrays;

public class Array{
//exercise 8.12-1:
//a. Starting with the code in Section 8.6, write a method called powArray that takes a double array, a, and returns a new array that contains the elements of a squared.
  // Generalize it to take a second argument and raise the elements of a to the given power.
  public static double[] powArray (double []a, double b) {
      for (int i = 0; i < a.length; i++){
        a[i] = Math.pow(a[i], b);
      }
      return a;
    }

//b. Starting with the code in Section 8.10, write a method called histogram that takes an int array of scores from 0 to (but not including) 100,
  //and returns a histogram of 100 counters. Generalize it to take the number of counters as an argument.
  public static void histogram (int[] scores, int counter) {
      int[] counts = new int[counter];
      for (int score : scores) {
        counts[score]++;
      }
      return counts;
    }

//exercise 8.12-4: Write a method called indexOfMax that takes an array of integers and returns the index of the largest element.
  // Can you write this method using an enhanced for loop? Why or why not?
  public static int indexOfMax(int[] a){


//exercise 8.12-5: Write a method called sieve that takes an integer parameter, n,
  //and returns a boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.


  public static void main(String[] args){
    double[] a = {1, 2, 3, 4};
    powArray(a, 2);
    System.out.println(Arrays.toString(a));
    int[] scores = {}

    System.out.println(indexOfMax(b));

  }
}

public class exer4_1{
  public static void zoop() {
      baffle();
      System.out.print("You wugga ");
      baffle();
  }

  public static void main(String[] args) {
      System.out.print("No, I ");
      zoop();
      System.out.print("I ");
      baffle();
  }

  public static void baffle() {
      System.out.print("wug");
      ping();
  }

  public static void ping() {
      System.out.println(".");
  }
}

//execise 1-1 output of program:
//  No, I wug.
//  You wugga wug.
//  I wug.

//exercsie 1-2 stack diagram showing the state of the program the first time ping is invoked
// main -> zoop -> baffle -> ping

//exercise 1-3 What happens if you invoke baffle(); at the end of the ping method?
//error, because it creates an indefinite loop

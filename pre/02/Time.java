public class Time{
  public static void main(String[] args){
    double hour = 13;
    double minute = 30;
    double second = 30;
    System.out.print("Number of seconds since midnight: ");
    System.out.println((hour * 60 + minute) * 60 + second);
    System.out.print("Number of seconds remaining: ");
    System.out.println((24 * 60 * 60)-(hour * 60 + minute) * 60 + second);
    System.out.print("Percentage of day that has passed: ");
    System.out.println(((hour * 60 + minute) * 60 + second) / (24 * 60 * 60) * 100 + "%");
    System.out.print("Elapsed time spent working on this exercise: ");
    System.out.println(((hour * 60 + minute) * 60 + second)-((13 * 60 + 20) * 60 + 22) + "seconds");
  }
}

import java.util.Scanner;

public class exer3_2{
  public static void main(String[] args){
    double celcius, farenheit;
    Scanner in = new Scanner(System.in);

    System.out.print("What degree in celcius? ");
    celcius = in.nextDouble();

    farenheit = celcius * (9.0/5.0) + 32.0;
    System.out.printf(celcius + " C = " + farenheit + " F");

  }
}

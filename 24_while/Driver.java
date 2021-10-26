/**
APLE - Jacc Chen (Large) + Ivina Wang (Sealie)
APCS
HW24 -- Get It While You Can
2021-10-25
time spent: 1.9 hours

DISCO:
- we learned how to use .equals
- x += 1 is the same as x = x + 1

QCC:
- how do add the number of matches divide by 2005 into the code?

Post-v0 Mods:
- we changed the instance variable to private

*/

public class Driver {
    public static void main( String[] args ) {
  		int x = 0;
      int y = 0;
  		Coin aple = new Coin();
      Coin pear = new Coin("quarter", "Heads" );
      aple.flip();

      while (y < 65536){
          if (pear.equals(aple)) {
              x += 1;
          }
          y += 1;
          aple.flip();
      }

      System.out.println("Heads rolled: " + x);
      System.out.println("Matches made: " + y);
      }
}

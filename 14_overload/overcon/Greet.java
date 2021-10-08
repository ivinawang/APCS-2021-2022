/*
Purple Turtle- Yuki Feng (Paul), Ivina Wang (Sealie), Faiyaz Rafee (Pivot and Atlas)
APCS
HW14 -- Customize Your Creation
2021-10-07

DISCOVERIES:
  - defcon = default constructor// overcon = overload constructor
  - default constructors is new BigSib(); no parameters
  - overload constructors can have the same name, with diff parameters

QCC:
  - how am I supposed to assign diff helloMsgs to the names in BigSib.java using a constructor?
*/

public class Greet{
  public static void main( String[] args) {
    String greeting;

    BigSib richard = new BigSib("Word up");
    BigSib grizz = new BigSib("Hey ya");
    BigSib dotCom = new BigSib("Sup");
    BigSib tracy = new BigSib("Salutations");
    greeting = richard.greet("freshman");
    System.out.println(greeting);
    greeting = tracy.greet("Dr. Spaceman");
    System.out.println(greeting);
    greeting = grizz.greet("Kong Fooey");
    System.out.println(greeting);
    greeting = dotCom.greet("mom");
    System.out.println(greeting);
  }
}

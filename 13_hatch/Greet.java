/*
Paul the Sealie- Yuki Feng (Paul), Ivina Wang (Sealie)
APCS
HW13 -- Where do BigSibs Come From?
2021-10-06

DISCOVERIES:
  - Unlike last night's homework, I have to create multiple instances for of the BigSibs class
  - Creating the Constructor class initialized the instance variable, so I didn't need to use setHelloMsg

QCC:
  - Is there a way to make this code more concise? ex. by using arrays?
*/

public class Greet{
  public static void main( String[] args) {
    String greeting;

    BigSib richard = new BigSib("Word up");
    greeting = richard.greet("freshman");
    System.out.println(greeting);

    BigSib spaceman = new BigSib("Salutations");
    greeting = spaceman.greet("Dr. Spaceman");
    System.out.println(greeting);

    BigSib fooey = new BigSib("Hey ya");
    greeting = fooey.greet("Kong Fooey");
    System.out.println(greeting);

    BigSib mom = new BigSib("Sup");
    greeting = mom.greet("mom");
    System.out.println(greeting);
  }
}

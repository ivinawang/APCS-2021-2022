/*
Paul the Sealie- Yuki Feng (Paul), Ivina Wang (Sealie)
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05

DISCOVERIES:
  - I am able to overwrite variables multiple times (greeting)
  - I was able to create multiple methods in one class

QCC:
  - I'm confused about what "BigSib richard = new BigSib();" means
*/
public class Greet{
  public static void main( String[] args) {
    String greeting;

    BigSib person = new BigSib();
    person.setHelloMsg("Word up");
    greeting = person.greet("freshman");
    System.out.println(greeting);

    person.setHelloMsg("Salutations");
    greeting = person.greet("Dr. Spaceman");
    System.out.println(greeting);

    person.setHelloMsg("Hey ya");
    greeting = person.greet("Kong Fooey");
    System.out.println(greeting);

    person.setHelloMsg("Sup");
    greeting = person.greet("mom");
    System.out.println(greeting);
  }
}

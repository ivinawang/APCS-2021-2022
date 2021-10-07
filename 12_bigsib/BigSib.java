/*
Paul the Sealie- Yuki Feng (Paul), Ivina Wang (Sealie)
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05
*/

public class BigSib{
  private String helloMsg;

  public void setHelloMsg(String hello){
    helloMsg = hello;
  }

  public String greet(String name){
    return (helloMsg + " " + name);
  }
}

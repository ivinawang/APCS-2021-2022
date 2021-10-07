/*
Paul the Sealie- Yuki Feng (Paul), Ivina Wang (Sealie)
APCS
HW13 -- Where do BigSibs Come From?
2021-10-06
*/

public class BigSib{
  private String helloMsg;

  public BigSib(String hello){
    helloMsg = hello;
  }

  public String greet(String name){
    return (helloMsg + " " + name);
  }
}

/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW89-- Queue Two Ways
2022-04-11t
time spent: .8 hrs
*/


import java.util.ArrayList;

public class ALQueue<T> implements Queue<T> {
  private ArrayList<T> array;

  public ALQueue(){
    array = new ArrayList<T>();
  }

  public T dequeue() {
    if (!isEmpty()){
      array.remove(0);
    }
    return null;
  } //O(n)

  public void enqueue( T x ){
    array.add(x);
  } //O(1)

  public boolean isEmpty(){
    return array.isEmpty();
  }

  public T peekFront(){
    return array.get(0);
  }

  public static void main(String[] args) {
    ALQueue<String> willSmith = new ALQueue<String>();
    willSmith.enqueue("get");
    willSmith.enqueue("my");
    willSmith.enqueue("wife/'s");
    willSmith.enqueue("name");
    willSmith.enqueue("out");
    willSmith.enqueue("your");
    willSmith.enqueue("mouth");

    System.out.println(willSmith.dequeue());
  }

}

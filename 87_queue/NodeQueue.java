/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW87-- The English Do Not Wait In Line for Soup
2022-04-04m
time spent: 1.5 hrs
*/

/*
DISCO:
* alot of the code for NodeQueue was similar to LList- like enqueue was the same as add, etc.

QCC:
* Our code compiled, but we got a null pointer exception when trying to test the main methods-
  we think there's a problem with the enqueue method, but we're not sure how to fix it?
*/

// public class NodeQueue<QUASAR> implements Queue<QUASAR>
// {
//   private int _size;
//   private LLNode<QUASAR> _front;
//
//   //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
//   public NodeQueue() {
//     _size = 0;
//     _front = null;
//   }
//
//   //means of removing an element from collection:
//   //Dequeues and returns the first element of the queue.
//   public QUASAR dequeue() {
//     if (!isEmpty()) {
//       QUASAR returns = _front.getCargo();
//       _front = _front.getNext();
//       return returns;
//     } else {
//       return null;
//     }
//   }
//
//   //means of adding an element to collection:
//   //Enqueue an element onto the back of this queue.
//   public void enqueue(QUASAR x){
//     LLNode<QUASAR> tmp = _front;
//     for( int i=0; i < _size-1; i++ ) {
//       tmp = tmp.getNext();
//     }
//     tmp.setNext(new LLNode<QUASAR> (x, tmp.getNext()));
//     _size++;
//   }
//
//   //Returns true if this queue is empty, otherwise returns false.
//   public boolean isEmpty(){
//     return _size == 0;
//   }
//
//   //Returns the first element of the queue without dequeuing it.
//   public QUASAR peekFront(){
//     return _front.getCargo();
//   }
//
//   public static void main(String[] args) {
//     NodeQueue<String> turtle = new NodeQueue<String>();
//     turtle.enqueue("a");
//     turtle.enqueue("b");
//     turtle.enqueue("c");
//     turtle.enqueue("d");
//     turtle.enqueue("e");
//     System.out.println(turtle);
//     turtle.dequeue();
//     System.out.println(turtle);
//
//   }
//   //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~
//
// }//end interface Queue

import java.util.NoSuchElementException;


public class NodeQueue<PIKACHU> implements Queue<PIKACHU>
{
  //instance variables
  private LLNode<PIKACHU> _front, _end;
  private int _size;

  public NodeQueue()
  {
    _front = _end = null;
    _size = 0;
  }


  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public PIKACHU dequeue()
  {
    PIKACHU retVal = _front.getCargo();
    _front = _front.getNext();

    if ( _front == null ) //just moved past last node
      _end = null;      //update _end to reflect emptiness

    _size--;

    return retVal;
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( PIKACHU enQVal )
  {
    //special case: when enqueuing to an empty list,
    //make _front && _end point to same node
    if ( isEmpty() ) {
      _front = _end = new LLNode<PIKACHU>( enQVal, null );
    }
    else {
      _end.setNext( new LLNode<PIKACHU>( enQVal, null ) );
      _end = _end.getNext();
    }
    _size++;
    System.out.println("enqueued " + enQVal);
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty()
  {
    return _size == 0;
  }

  //Returns the first element of the queue without dequeuing it.
  public PIKACHU peekFront()
  {
    return _front.getCargo();
  }

  // override inherited toString
  public String toString()
  {
    String retStr = "FRONT :: ";
    LLNode<PIKACHU> tmp = _front; //init tr
    while( tmp != null ) {
      retStr += tmp.getCargo() + " ";
      tmp = tmp.getNext();
    }
    retStr += " :: END";
    return retStr;
  }



  /***
   * class LLNode
   * Implements a node, for use in lists and other container classes.
   * Stores its data as a T
   **/
  private class LLNode<T>
  {
    //instance vars
    private T _cargo;    //cargo may only be of type T
    private LLNode<T> _nextNode; //pointer to next LLNode<T>

    // constructor -- initializes instance vars
    public LLNode( T value, LLNode<T> next ) {
      _cargo = value;
      _nextNode = next;
    }


    //--------------v  ACCESSORS  v--------------
    public T getCargo() { return _cargo; }

    public LLNode<T> getNext() { return _nextNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public T setCargo( T newCargo ) {
      T foo = getCargo();
      _cargo = newCargo;
      return foo;
    }

    public LLNode<T> setNext( LLNode<T> newNext ) {
      LLNode<T> foo = getNext();
      _nextNode = newNext;
      return foo;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() { return _cargo.toString(); }

  }//end class LLNode



  //main method for testing
  public static void main( String[] args )
  {

      Queue<String> qq = new NodeQueue<String>();

      System.out.println("\nnow enqueuing...");
      qq.enqueue("1");
      qq.enqueue("2");
      qq.enqueue("3");
      qq.enqueue("4");
      qq.enqueue("5");
      qq.enqueue("6");

      System.out.println("\nnow testing toString()...");
      System.out.println( qq ); //for testing toString()...

      System.out.println("\nnow dequeuing...");
      System.out.println( qq.dequeue() );
      System.out.println( qq.dequeue() );
      System.out.println( qq.dequeue() );
      System.out.println( qq.dequeue() );
      System.out.println( qq.dequeue() );
      System.out.println( qq.dequeue() );

      System.out.println("\nnow dequeuing fr empty queue...");
      System.out.println( qq.dequeue() );

    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class LList

/*
Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )
APCS pd7
HW88-- BPC Kiddies Do Not Wait in Line Either
2022-04-05t
time spent: 1.5 hrs
*/

/*
DISCO:
* We could usea private inner class to add LLNode instead of creating a new file
* to shuffle the deck you can just enqueue and dequeue the values multiple times

QCC:
* How do we randomly take out a node with dequeue? We couldn't get our method to work

*/

/***
 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/


public class RQueue<PIKACHU> implements Queue<PIKACHU>
{
  //instance variables
  private LLNode<PIKACHU> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue()
  {
    _front = null;
    _end = null;
    _size = 0;
  }


  public void enqueue( PIKACHU enQVal )
  {
    if ( isEmpty() ) {
      _front = _end = new LLNode<PIKACHU>( enQVal, null );
    }
    else {
      _end.setNext( new LLNode<PIKACHU>( enQVal, null ) );
      _end = _end.getNext();
    }
    _size++;
    System.out.println("enqueued " + enQVal);
  }//O(1)

  // remove and return thing at front of queue
  // assume _queue ! empty
  public PIKACHU dequeue()
  {
    LLNode<PIKACHU> temp = _front;
    for (int i = 0; i < (int)(_size * Math.random()) - 1; i++){
      temp = temp.getNext();
    }
    PIKACHU retVal = temp.getCargo();
    temp.setNext(new LLNode<PIKACHU>(temp.getNext().getCargo(), temp.getNext()));

    if ( _front == null ) //just moved past last node
      _end = null;      //update _end to reflect emptiness

    _size--;

    return retVal;
  } //O(1)


  public PIKACHU peekFront()
  {
    return _front.getCargo();
  }//O(1)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   * You dequeue an random value, then enqueue that same value and repeat that
   for a random number of times from 1 - the size
   **/
  public void sample()
  {
    PIKACHU hihi;
    for (int i = 0; i < _size-1 * Math.random(); i++){
      hihi = dequeue();
      enqueue(hihi);
    }
  }//O(n)


  public boolean isEmpty()
  {
    return _front == null;
  } //O(1)


  // print each node, separated by spaces
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
  }//end toString()


  //main method for testing
  public static void main( String[] args )
  {


    RQueue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing...");
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("\nnow testing toString()...");
    System.out.println( PirateQueue ); //for testing toString()...

    System.out.println("\nnow dequeuing...");
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n");
    System.out.println( PirateQueue.dequeue() );

    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue

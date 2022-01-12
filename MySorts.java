import java.util.ArrayList;
public class Sorts {

  /* bubbleSort
     * Starting from the 2 rightmost elements in the array, check to see
     if the element on the right is greater than the one on the left.
     If so, move over 1 element and check again. If this is not the
     case, switch positions of the two elements. Continue to do this
     until you reach to the leftmost elements. This will complete 1
     pass. Continue to pass until the number of passes reaches 1 less
     than the length of the array.
  */
  public static void bubbleSortV(ArrayList<Comparable> data) {
    int counter = 0;
    int numCompare = 0;
    int len = data.size();
    		int passNum = 0;
    		while (passNum < len) {
    			for (int i = len-1;i>0;i--) {

            numCompare += 1;

    				if (data.get(i).compareTo(data.get(i-1)) < 0){ //need to swap
    					data.set( i, data.set(i-1,data.get(i)) );

              counter += 1;

    				}
    			}
    			passNum += 1;
    		}
        System.out.println("Number of swaps: " + counter);
        System.out.println("Number of comparisons: " + numCompare);

  } // bubble

  /* insertionSort
  * An outer for loop that iterates through each element in the input array
  * An inner for loop that compares each element to the one that comes before import junit.framework.TestCase;
  * If the element with the smaller index is larger than the element with the larger index, they swap places
  * This process continues until the value with the smaller index is less than the element with the larger index
  */

  public static void insertionSortV(ArrayList<Comparable> data) {
    int counter = 0;
    int numCompare = 0;
    for(int partition = 1; partition < data.size(); partition++) {
      //partition marks first item in unsorted region

      // System.out.println( "\npartition: " + partition + "\ndataset: "); //diag
      // System.out.print( data +"\n");


      //traverse sorted region from right to left
      for(int i=partition; i > 0; i--) {
        numCompare += 1;
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (data.get(i).compareTo(data.get(i-1)) < 0) {
          // System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
	        data.set( i, data.set(i-1,data.get(i)) );

          counter += 1;
        }
        else
          break;
      }
    }
      System.out.println("Number of swaps: " + counter);
      System.out.println("Number of comparisons: " + numCompare);
  } // insertion

/* selectionSort
   * We iterated through each item of the array to check if it was the least value,
   and if it wasn't, we would swap it with the least value.
*/

  public static void selectionSortV(ArrayList<Comparable> data) {
    int maxPos;
    int counter = 0;
    int numCompare = 0;

        for( int pass = data.size()-1; pass > 0; pass-- ) {
          // System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
          maxPos = 0;
          for( int i = 1; i <= pass; i++ ) {
            // System.out.println( "maxPos: " + maxPos );//diag
            // System.out.println( data );//diag
            numCompare += 1;
            if ( data.get(i).compareTo( data.get(maxPos) ) > 0 )
              maxPos = i;

          }
          data.set( maxPos, ( data.set( pass, data.get(maxPos) ) ) );
          counter += 1;
          // System.out.println( "after swap: " +  data );//diag
        }
        System.out.println("Number of swaps: " + counter);
        System.out.println("Number of comparisons: " + numCompare);
  } // selection


} // end class

/**
   class BinSearch
   Binary search on array of Comparables
**/

public class BinSearch
{
  public static int average(int a, int b) {
  return (int) Math.round((a + b) / 2);
}

  /**
     int binSearch(Comparable[],Comparable) -- searches an array of
     Comparables for target Comparable
     pre:  input array is sorted in ascending order
     post: returns index of target, or returns -1 if target not found
  **/
  public static int binSearch ( Comparable[] a, Comparable target )
  {
    //uncomment exactly 1 of the 2 stmts below:

    return binSearchIter( a, target, 0, a.length-1 );
  }


  public static int binSearchIter( Comparable[] arr,
                                   Comparable value,
                                   int lo, int hi )
  {

      int low = lo;
      int high = hi;
      while (low <= high) {
          if (value.compareTo(arr[average(low, high)]) > 0) {
              low = average(low, high)+1;
          }
          else if (value.compareTo(arr[average(low, high)]) < 0) {
              high = average(low, high)-1;
          }
          else {
              return average(low,high);
          }
      }
      return -1;
  }//end binSearchIter



  //tell whether an array is sorted in ascending order
  private static boolean isSorted( Comparable[] arr )
  {

    boolean retBoo = true; //init to true, assume array is sorted

    //Q: Why would a FOREACH loop not suffice here?
    for( int i=0; i < arr.length-1; i++ ) {
      if ( ( arr[i].compareTo(arr[i+1]) > 0 ) ) {
        return false;
      }
    }
    return retBoo; //if entire array was traversed, it must be sorted
  }


  // utility/helper fxn to display contents of an array of Objects
  private static void toString( Comparable[] arr ) {
    String output = "[ ";

    for( Comparable c : arr )
	    output += c + ", ";

    output = output.substring( 0, output.length()-2 ) + " ]";

    System.out.println( output );
  }

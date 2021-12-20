/**
   class BinSearch
   Binary search on array of Comparables
**/

public class BinSearch
{
  public static int average(int a, int b) {
    if (b > a) {
      int half = (b - a) / 2;
      return a + half;
    } else {
      int half = (a - b) / 2;
      return b + half;
    }
}

  /**
     int binSearch(Comparable[],Comparable) -- searches an array of
     Comparables for target Comparable
     pre:  input array is sorted in ascending order
     post: returns index of target, or returns -1 if target not found
  **/
  public static int binSearch ( Comparable[] a, Comparable target )
  {
    return binSearchIter( a, target, 0, a.length - 1 );
  }


  public static int binSearchIter( Comparable[] arr,
                                   Comparable value,
                                   int lo, int hi )
  {

      int low = lo;
      int high = hi;
      int avg = average(low, high);
      while (low <= high) {
          if (value.compareTo(arr[avg]) > 0) {
              low = avg + 1;
          }
          else if (value.compareTo(arr[avg]) < 0) {
              high = avg - 1;
          }
          else {
              return avg;
          }
          avg = average(low, high);
      }
      return -1;
  }//end binSearchIter

  // utility/helper fxn to display contents of an array of Objects
  private static void toString( Comparable[] arr ) {
    String output = "[ ";

    for( Comparable c : arr )
	    output += c + ", ";

    output = output.substring( 0, output.length()-2 ) + " ]";

    System.out.println( output );
  }
}

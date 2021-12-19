/**
   class LinSearch
**/

public class LinSearch
{

  /**
     int linSearch(Comparable[],Comparable) -- searches an array of
     Comparables for target
     post: returns index of first occurrence of target, or
     returns -1 if target not found
  **/
  public static int linSearch ( Comparable[] a, Comparable target )
  {
    int i = 0;

    while ( i < a.length ) {
      if (a[i].compareTo(target) == 0) {
        return i;
      }
      i += 1;
    }
    return -1;
  }


  // utility/helper fxn to display contents of an array of Objects
  private static void toString( Object[] arr )
  {
    String output = "[ ";

    for( Object o : arr )
      output += o + ", ";

    output = output.substring( 0, output.length()-2 ) + " ]";

    System.out.println( output );
  }
}

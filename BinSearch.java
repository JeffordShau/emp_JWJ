
/**
 class BinSearch
 Binary search on array of Comparables
 **/

public class BinSearch
{
    public static int average(int a, int b) {
        return (int) Math.round((a + b) / 2);
    }

    public static int binSearch ( Comparable[] a, Comparable target )
    {
        return binSearchIter( a, target, 0, a.length-1 );
    }


    public static int binSearchIter( int[] arr,
                                     int value,
                                     int lo, int hi )
    {
        int low = lo;
        int high = hi;
        while (low <= high) {
            if (value<arr[average(low, high)]) {
                low = average(low, high)+1;
            }
            else if (value>arr[average(low, high)]) {
                high = average(low, high)-1;
            }
            else {
                return average(low,high); 
            }
        }
        return -1;
    }



    private static boolean isSorted( int[] arr )
    {
        boolean retBoo = true;

        for( int i=0; i < arr.length-1; i++ ) {
            if ( ( arr[i].compareTo(arr[i+1]) > 0 ) ) {
                return false;
            }
        }
        return retBoo;
    }

    private static void toString ( Comparable[] arr ) {
        String output = "[ ";
        for( Comparable c : arr )
            output += c + ", ";
        output = output.substring( 0, output.length()-2 ) + " ]";
        System.out.println( output );
    }
}

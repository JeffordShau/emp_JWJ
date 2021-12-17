/**
 class LinSearch
 **/

import java.Utils.ArrayList; 

public class LinSearch
{
    public static int linSearch ( ArrayList a, int target ) {
        int i = 0;
        while (i < a.length) {
            if (a[i],compareTo(target)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static void toString( Object[] arr )
    {
        String output = "[";
        for( Object o : arr )
            output += o + ", ";
        output = output.substring( 0, output.length()-2 ) + "]";
        System.out.println( output );
    }
}

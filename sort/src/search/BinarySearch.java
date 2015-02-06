package search;

import java.util.ArrayList;

/**
 * Created by shafe_000 on 2015-02-01.
 */
public class BinarySearch implements ArraySearchState{
    @Override
    public int search(ArrayList<Comparable> sortedArrayList, Object element) {
        return binarySearch(sortedArrayList, element, 0, sortedArrayList.size());
    }

    private static int binarySearch( ArrayList<Comparable> a, Object x, int first, int last )
    {
        if( first > last ) {
            return -1;
        }
        int middle = ( first + last ) / 2;
        if( a.get(middle).compareTo(x) < 0 ){
            return binarySearch( a, x, middle + 1, last );
        }
        else if( a.get(middle).compareTo(x) > 0 ) {
            return binarySearch(a, x, first, middle - 1);
        }
        else
            return middle;
    }
}

package search;

import java.util.ArrayList;

/**
 * Created by shafe_000 on 2015-02-01.
 */
public class ArraySearch implements ArraySearchState{
    private ArraySearchState state;

    public ArraySearch(ArraySearchState state){
        this.state = state;
    }

    @Override
    public int search(ArrayList<Comparable> comparableArrayList, Object element) {
        return state.search(comparableArrayList, element);
    }
}

package sort;

import java.util.ArrayList;

/**
 * Created by shafe_000 on 2015-02-01.
 */
public class ArraySort implements ArraySortState{
    private ArraySortState state;

    public ArraySort(ArraySortState state){
        this.state = state;
    }

    @Override
    public void sort(ArrayList<Comparable> comparableArrayList){
        state.sort(comparableArrayList);
    }
}

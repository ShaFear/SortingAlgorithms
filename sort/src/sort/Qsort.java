package sort;

import java.util.ArrayList;

/**
 * Created by shafe_000 on 2015-02-01.
 */
public class Qsort implements ArraySortState {
    @Override
    public void sort(ArrayList<Comparable> comparableArrayList) {
        qsort(comparableArrayList, 0, comparableArrayList.size()-1);
    }

    private void qsort(ArrayList<Comparable> comparableArrayList, int first, int last){
        if(first < last){
            int middle = split(comparableArrayList, first, last);
            qsort(comparableArrayList, first, middle - 1);
            qsort(comparableArrayList, middle + 1, last);
        }
    }

    private int split(ArrayList<Comparable> comparableArrayList, int first, int last) {
        int j = first;
        int i;
        for( i = first+1; i<= last; i++){
            if(comparableArrayList.get(i).compareTo(comparableArrayList.get(first)) < 0){
                j++;
                spare(comparableArrayList, i, j);
            }
        }
        spare(comparableArrayList, j, first);
        return j;
    }

    private void spare(ArrayList<Comparable> comparableArrayList, int j, int i) {
        Comparable tmp = comparableArrayList.get(j);
        comparableArrayList.set(j, comparableArrayList.get(i));
        comparableArrayList.set(i, tmp);
    }
}

package sort;

import java.util.ArrayList;

/**
 * Created by shafe_000 on 2015-02-01.
 */
public class BubbleSort implements ArraySortState {
    @Override
    public void sort(ArrayList<Comparable> comparableArrayList) {
        for(int j=0; j<comparableArrayList.size(); j++){
            for( int i=0; i<comparableArrayList.size(); i++){
                if(comparableArrayList.get(j).compareTo(comparableArrayList.get(i)) < 0){
                    spare(comparableArrayList, j, i);
                }
            }
        }
    }

    private void spare(ArrayList<Comparable> tab, int j, int i) {
        Comparable tmp = tab.get(j);
        tab.set(j, tab.get(i));
        tab.set(i, tmp);
    }
}

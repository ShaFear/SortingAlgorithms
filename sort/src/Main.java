import search.ArraySearch;
import search.BinarySearch;
import sort.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int range = 10;
        int quantity = 20;

        ArrayList<Comparable> list;
        list = new ArrayList<Comparable>();
        Random random = new Random();
        for(int j=0; j<quantity; j++){
            list.add(random.nextInt(range));
        }

        System.out.print("Nieposortowane: \n" + list);
        ArraySort arraySort = new ArraySort(new BubbleSort());
        arraySort.sort(list);
        System.out.print("\nPosortowane: \n" + list);

        ArraySearch arraySearch = new ArraySearch(new BinarySearch());
        Integer element = new Integer(random.nextInt(range));
        int result = arraySearch.search(list, element);
        System.out.print("\nPozycja " + element  + " ? " + result);
    }
}

package lab09;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayUtilDemo {
    public static void main(String[] args){
        Random random = new Random();
        ArrayList<Integer> tab = new ArrayList<>(5);

        for(int i = 0; i < 5; ++i){
            tab.add(random.nextInt(10));
//            System.out.println(tab.get(i));
        }

        Collections.sort(tab);
        System.out.println(ArrayUtil.isSorted(tab));


        ArrayList<LocalDate> tab2 = new ArrayList<>(3);
        tab2.add(LocalDate.of(2018, 12, 13));
        tab2.add(LocalDate.of(2002, 9, 5));
        tab2.add(LocalDate.of(1975, 4, 25));

        System.out.println(ArrayUtil.isSorted(tab2));

        Collections.sort(tab2);

        System.out.println(ArrayUtil.isSorted(tab2));

        System.out.println("index binary search: " + ArrayUtil.binSearch(tab, 8));
        System.out.println("index binary search: " + ArrayUtil.binSearch(tab2, LocalDate.of(2018, 12, 13)));

        Collections.shuffle(tab);

//        for(int i = 0; i < tab.size(); i ++)
//            System.out.println(tab.get(i));

        System.out.println("-------selectionsorted--------");

        ArrayUtil.selectionSort(tab);

        for(int i = 0; i < tab.size(); i ++)
            System.out.println(tab.get(i));

        Collections.shuffle(tab);

//        System.out.println("----------------");

//        for(int i = 0; i < tab.size(); i ++)
//            System.out.println(tab.get(i));

        Collections.shuffle(tab);

        System.out.println("--------Mergesorted--------");

        ArrayUtil.mergeSort(tab);

        for(int i = 0; i < tab.size(); i ++)
            System.out.println(tab.get(i));

    }
}


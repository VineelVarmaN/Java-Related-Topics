package javaCoding.streams;

import java.util.Comparator;
import java.util.List;

public class SortedAndReversedSorted {
    public static void main(String[] args) {
        //sort the numbers
        List<Integer> list1 = List.of(5,4,3,2,1);
        List<Integer> sorted = list1.stream().sorted().toList();
        System.out.println(sorted);

        List<Integer> list2 = List.of(1,2,3,4,5);
        List<Integer> reverseSorted = list1.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(reverseSorted);

        List<Integer> list3 = List.of(1,2,3,2,4,5);
        List<Integer> distinctList = list3.stream().distinct().toList();
        System.out.println(distinctList);

    }
}

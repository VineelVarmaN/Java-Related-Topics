package javaCoding.streams;

import java.util.List;
import java.util.stream.Stream;

/**
 * Merge two sorted lists in to a single sorted list using stream
 */
public class MergeTwoSortedListsToSingleSortedList {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,3,5);
        List<Integer> list2 = List.of(2,4,6);
        List<Integer> sortedCombinedList = Stream.concat(list1.stream(), list2.stream()).sorted().toList();
        sortedCombinedList.forEach(System.out::println);
    }
}

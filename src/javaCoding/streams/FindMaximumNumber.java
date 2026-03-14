package javaCoding.streams;

import java.util.Comparator;
import java.util.List;

public class FindMaximumNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        int maxNumber = list.stream().max(Integer::compare).get();
        System.out.println(maxNumber);
        int minNumber = list.stream().min(Integer::compare).get();
        System.out.println(minNumber);

        //count the elements
        long count = list.stream().count();
        System.out.println(count);

        //sort the numbers
        List<Integer> list1 = List.of(5,4,3,2,1);
        List<Integer> sorted = list1.stream().sorted().toList();
        System.out.println(sorted);

        //sort in reverse order
        List<Integer> reverseList = list.stream().sorted(Comparator.reverseOrder()).toList();
    }
}

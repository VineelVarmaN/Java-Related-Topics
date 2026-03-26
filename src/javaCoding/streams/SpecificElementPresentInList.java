package javaCoding.streams;

import java.util.List;

/**
 * check if a list contains a specific element
 */
public class SpecificElementPresentInList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,4,5,2);
        int num = 6;
        boolean result = list.stream().anyMatch(n -> n==num);
        System.out.println(result);
    }
}

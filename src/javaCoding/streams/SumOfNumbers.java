package javaCoding.streams;

import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}

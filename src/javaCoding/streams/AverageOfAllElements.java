package javaCoding.streams;

import java.util.List;

public class AverageOfAllElements {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
       double result = list.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(result);
    }
}

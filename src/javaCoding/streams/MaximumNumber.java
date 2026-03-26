package javaCoding.streams;

import java.util.List;

public class MaximumNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,4,5,2);
        int maxNum = list.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println(maxNum);

        int maxNumWithOutMapToInt = list.stream().max(Integer::compareTo).get();
        System.out.println(maxNumWithOutMapToInt);
    }
}

package javaCoding.streams;

import java.util.List;

public class MinimumValue {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,4,5,2);
        int minNum = list.stream().mapToInt(Integer::intValue).min().orElse(0);
        System.out.println(minNum);
        int minNumUsingSorted = list.stream().sorted().findFirst().get();
        System.out.println(minNumUsingSorted);
        int minNumUsingCompareToMethod = list.stream().min(Integer::compare).get();
        System.out.println(minNumUsingCompareToMethod);
    }
}

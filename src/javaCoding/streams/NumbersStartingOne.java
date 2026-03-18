package javaCoding.streams;

import java.util.List;

public class NumbersStartingOne {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,21,13,31,41,15);
        List<Integer> numberStartingOne = list.stream().filter(num -> String.valueOf(num).startsWith("1")).toList();
        numberStartingOne.forEach(System.out::println);
    }
}

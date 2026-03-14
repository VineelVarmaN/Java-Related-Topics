package javaCoding.streams;

import java.util.List;

public class SquareAllNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,3,4,5,6);
        List<Integer> squareNumbers = list.stream().map(n -> n*n).toList();
        System.out.println(squareNumbers);
    }
}

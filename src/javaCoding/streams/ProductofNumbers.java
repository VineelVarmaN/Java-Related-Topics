package javaCoding.streams;

import java.util.List;

public class ProductofNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);

        int result = list.stream().reduce(1, (a,b) -> a * b);
        System.out.println("result : " + result);
    }
}

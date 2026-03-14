package javaCoding.streams;

import java.util.List;

/**Find even numbers from a list**/

public class EvenNumbersFromList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        List<Integer> evenNumbers = list.stream().filter(n -> n%2 == 0).toList();
        System.out.println(evenNumbers);

        List<Integer> oddNumbers = list.stream().filter(n -> n % 2 != 0).toList();
        System.out.println(oddNumbers);
    }
}

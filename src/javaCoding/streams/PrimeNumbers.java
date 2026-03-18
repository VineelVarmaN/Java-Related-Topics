package javaCoding.streams;

import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10,11);
        List<Integer> primeNumberList = list.stream().
                //Math.sqrt(num) - to check all possible factorial combinations from 2 to till num
                filter(num -> num > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(num))
                .noneMatch(i -> num % i == 0))
                        .toList();
        primeNumberList.forEach(System.out::println);
    }
//    public static Boolean isPrime(int num){
//        if(num<=1) return false;
//
//        for (int i=2; i<=num; i++){
//            if(num % i == 0) return false;
//        }
//        return true;
//    }
}

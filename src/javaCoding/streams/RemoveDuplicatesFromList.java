package javaCoding.streams;

import java.util.List;

/**
 * Removing duplicates from a list and preserve the order using java
 */
public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Apple", "Guava", "Banana", "Mango");
        List<String> uniqueList = list.stream().distinct().toList();
        System.out.println(uniqueList);
    }
}

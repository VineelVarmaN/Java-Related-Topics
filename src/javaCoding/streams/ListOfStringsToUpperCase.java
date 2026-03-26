package javaCoding.streams;

import java.util.List;

public class ListOfStringsToUpperCase {
    public static void main(String[] args) {
        List<String> list = List.of("Nemmani", "Vineel", "Varma");
        List<String> upperCase = list.stream().map(String::toUpperCase).toList();
        System.out.println(upperCase);

    }
}

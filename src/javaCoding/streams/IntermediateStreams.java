package javaCoding.streams;

import java.util.Arrays;
import java.util.List;

public class IntermediateStreams {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        int firstNum = list.stream().findFirst().get();
        System.out.println(firstNum);
        List<Integer> list1 = List.of(2,3,4,5);
        int findAnyNum = list1.stream().findAny().get();
        System.out.println(findAnyNum);

        //if any match
        int num = 3;
        List<Integer> list2 = List.of(1,2,3,4,5);
        boolean anyMatch = list2.stream().anyMatch(n -> n==num);
        System.out.println(anyMatch);
        String name = "Vineel";
        List<String> nameList = List.of("Varma", "Nemmani", "Vineel");
        boolean anyNameMatch = nameList.stream().anyMatch(n -> n.equals(name));
        System.out.println(anyNameMatch);

        //check all match
        Boolean allMatch = list2.stream().allMatch(n -> n>0);
        System.out.println(allMatch);

        //skip first N elements
        List<String> skippedElements = nameList.stream().skip(2).toList();
        System.out.println(skippedElements);

        //limit elements - to get only required number of elements
        List<Integer> limitElements = list2.stream().limit(3).toList();
        System.out.println(limitElements);

        //convert limit string to uppercase
        List<String> upperCase = nameList.stream().map(String::toUpperCase).toList();
        System.out.println(upperCase);
    }
}

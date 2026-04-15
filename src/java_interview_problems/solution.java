package java_interview_problems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class solution {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,6,7,8,9,5);
        //even numbers
        List<Integer> evenNumbers = list.stream().filter(n -> n % 2 == 0).toList();
        //square each number
        List<Integer> squareNumber = list.stream().map(n -> n * n).toList();
        System.out.println("squareNumber : " + squareNumber);
        //sum of all element
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
        int sum1 = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum1);
        //max
        int max = list.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println(max);
        //min
        int min = list.stream().mapToInt(Integer::intValue).min().orElse(0);
        System.out.println(min);
        //count
        long count = list.stream().count();
        System.out.println(count);
        //sort
        List<Integer> sortedList = list.stream().sorted().toList();
        System.out.println(sortedList);
        List<Integer> sortedList1 = list.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println(sortedList1);
        //reverse sort
        List<Integer> reverseSorted = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(reverseSorted);
        //remove duplicates
        List<Integer> duplicatelist = List.of(1,2,3,2,3,1,2,3,3,4,5,4);
        List<Integer> uniqueValues = duplicatelist.stream().distinct().toList();
        System.out.println(uniqueValues);
        //limit elements
        List<Integer> limitElements = duplicatelist.stream().limit(5).toList();
        System.out.println(limitElements);
        //skip elements
        List<Integer> skipElements = duplicatelist.stream().skip(2).toList();
        System.out.println(skipElements);
        //check any match
        Boolean anyMatch = duplicatelist.stream().anyMatch(n -> n >= 5);
        System.out.println(anyMatch);
        //check all match
        Boolean allMatch = duplicatelist.stream().allMatch(n -> n > 0);
        System.out.println(allMatch);
        //find first element
        int findFirstValueGreaterThanTwo = duplicatelist.stream().filter(n -> n > 2).findFirst().orElse(0);
        System.out.println(findFirstValueGreaterThanTwo);
        int findFirst = reverseSorted.stream().findFirst().get();
        System.out.println(findFirst);
        //collect to List
        List<Integer> findValuesGreaterThanTwo = duplicatelist.stream().filter(n -> n > 2).map(n -> n * n).collect(Collectors.toList());
        System.out.println(findValuesGreaterThanTwo);
        //collect list to set
        Set<Integer> listToSet = duplicatelist.stream().collect(Collectors.toSet());
        System.out.println(listToSet);
        //join strings
        List<String> stringList = List.of("Vineel", "Varma");
        String joinedString = stringList.stream().collect(Collectors.joining(" "));
        System.out.println(joinedString);
        //count occurance of repeated strings
        List<String> stringList1 = List.of("E1", "E2", "E1", "E3", "E4", "E5", "E2", "E1", "E4");
        Map<String, Long> occurenceResult = stringList1.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(occurenceResult);
        //Group by field
    }
} 

package javaCoding.streams;

import javalearning.learningSamples.TopicWiseSamplePrograms.Lambda.StreamBuilder;

import java.util.List;
import java.util.stream.Stream;

public class JoinStream {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,3,5);
        List<Integer> list2 = List.of(2,4,6);
        Stream<Integer> finalList = Stream.concat(list1.stream(),list2.stream());
        finalList.forEach(System.out::println);
    }
}

package javaCoding.streams;

import java.util.List;

public class CountOfElementsInList {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,4,5,2);
        //int count = list.stream().mapToInt(Integer::intValue).count();
        int count = list.size();
        var listCount = list.stream().count();
        System.out.println(count);
        System.out.println(listCount);
    }
}

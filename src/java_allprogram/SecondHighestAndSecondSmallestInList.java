package java_allprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestAndSecondSmallestInList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,2,3,1,0,6,12,57,88,60);
        Collections.sort(list);
        System.out.println(list.get(list.size()-2));
        System.out.println(list.get(1));
    }
}

package java_allprogram;

import java.util.*;

public class PrintDuplicateElementUsingJava8 {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,2,5,4);
        //output=2,4
        Set<Integer> set= new LinkedHashSet<>();
        List<Integer> duplicateValues = list.stream().filter(t -> !set.add(t)).toList();
        System.out.println(duplicateValues);
    }
}

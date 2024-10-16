package java_allprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFirstAndLastElementInList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,2,3,1,6);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));


    }
}

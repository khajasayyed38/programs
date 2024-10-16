package java_allprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementBetweentwoArray {
    public static void main(String[] args) {
        //Using for loop
        int a1[]={1,6,3,4,5};
        int a2[]={7,4,9,6,0};
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]){
                    list.add(a1[i]);
                }
            }
        }
        System.out.println(list);
        //using ArrayList with retainAll method
        List<Integer> list1=new ArrayList(Arrays.asList(1,6,3,4,5));
        List<Integer>  list2=new ArrayList(Arrays.asList(7,4,9,6,0));
        list1.retainAll(list2);
        System.out.println(list1);

        //Using stream API
        List<Integer> list3 = list1.stream().filter(list2::contains).toList();
        System.out.println(list3);
    }
}

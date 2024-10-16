package java_allprogram;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {
        String[]a={"abc","def","abc","mno","xyz","pqr","xyz","pqr"};
        String[]s= new String[a.length-1];
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length-1;j++){
                if(a[i]==a[j]){
                    System.out.println(a[j]);
                }
            }
        }
        //Using Set
        Set<String> set= new LinkedHashSet<>();
        for(String g:a){
            set.add(g);
        }
        System.out.println(set);
        //using java8
        Arrays.stream(a).distinct().forEach(System.out::println);
    }
}

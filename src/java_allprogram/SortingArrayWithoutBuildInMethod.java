package java_allprogram;

import java.util.Arrays;
import java.util.Comparator;

public class SortingArrayWithoutBuildInMethod {
    public static void main(String[] args) {
        Integer[] a ={10,5,20,63,12,57,88,60};
        int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int s:a){
            System.out.print(s+" ");
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, Comparator.reverseOrder());
        System.out.println(Arrays.toString(a));
    }
    }


package java_allprogram;

import java.util.Arrays;

public class Anagram {
    public static boolean checkAnagram(String s1,String s2){
        char[] a1 = s1.toLowerCase().toCharArray();
        char[] a2 = s2.toLowerCase().toCharArray();
        if(a1.length!=a2.length){
            return false;
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);
    }
    public static void main(String[] args) {

        System.out.println(checkAnagram("silent","listen"));

    }
}

package java_allprogram;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurrenceCheck {
    public static void main(String[] args) {
        String s="java is a programming language";
        String g=s.replace(" ","");
        Map<Character,Integer> map= new LinkedHashMap<>();
        char[]b=g.toCharArray();
        for(char a:b){
            if(!map.containsKey(a)){
                map.put(a,1);
            }else {
                int v=map.get(a);
                map.put(a,v+1);
            }
        }
        System.out.println(map);
        workCountInString();
        reverseSentence();
        occurrenceCheckInWord();
    }
    public static void occurrenceCheckInWord(){
        String s="java is a programming language. Java widely used in software testing";
        String[] g=s.toLowerCase().split(" ");
        String s2="java";
        int count=0;
        for(int i=0;i<g.length;i++){
            if(g[i].equalsIgnoreCase(s2)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void workCountInString(){
        String s="Alice is girl and Bob is boy";
        String []a=s.split(" ");
        System.out.println(a.length);
    }
    public static void reverseCharacter(){
        String s="India is my country";
        char[]a=s.toCharArray();
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }
    public static void reverseSentence(){
        String s="India is my country";
       String []a= s.split(" ");
       for(int i=a.length-1;i>=0;i--){
           System.out.print(a[i]+" ");
       }
    }
}










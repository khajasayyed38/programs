package java_allprogram;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s="reverse each word in a string";
        String b="";
        String a[]=s.split(" ");
        for(String d:a){
            StringBuilder sb =  new StringBuilder(d);
            System.out.print(sb.reverse()+" ");

        }
    }
}

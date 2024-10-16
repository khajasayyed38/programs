package java_allprogram;

public class ReverseAString {
    public static void main(String[] args) {
        //Using toCharArray()
        String s= "madam";
        char[]a=s.toCharArray();
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
        System.out.println();
        //Using StringBuilder Class
        StringBuilder sb= new StringBuilder();
        for(int i=a.length-1;i>=0;i--){
            sb.append(a[i]);
        }
        System.out.println(sb);
    }
}

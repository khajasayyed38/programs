package java_allprogram;

public class CountTheCharacterInString {
    public static void main(String[] args) {
        String s="This is a string";
        String g = s.replace(" ", "");
        char[]a=g.toCharArray();
        int count=0;
        for(char c:a){
            count++;
        }
        System.out.println(count);
    }
}

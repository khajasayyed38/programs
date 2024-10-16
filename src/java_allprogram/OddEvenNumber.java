package java_allprogram;

public class OddEvenNumber {
    public static void main(String[] args) {
        int n=11;
        if(n%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        for(int i=1;i<=100;i++){
            getNumber(i);
        }
    }
    public static void getNumber(int n){
        if(n%2==0){
            System.out.println(n+" is even");
        }else{
            System.out.println(n+" is odd");
        }
    }
}

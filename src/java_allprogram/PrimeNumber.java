package java_allprogram;

public class PrimeNumber {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            primeCheck(i);
        }

    }
    public static void primeCheck(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.print(n+"  ");
        }
    }
}

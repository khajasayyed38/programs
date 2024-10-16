package java_allprogram;

public class SumOfDigitAndCount {
    public static void main(String[] args) {
        int n=987;
        int sum=0;
        while (n!=0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println(sum);
        count(987654321);
    }
    public static void count(int n){
        int count=0;
        int[] ints = Integer.toString(n).chars().toArray();
        System.out.println(ints.length);
    }

}

package java_allprogram;

public class FibonacciSeries {
    public static void main(String[] args) {
        //Fibonacci Series
        int c=0;int d=1;
        for(int i=0;i<10;i++){
            int e=c+d;
            System.out.println(e);
            c=d;
            d=e;
        }
    }
}

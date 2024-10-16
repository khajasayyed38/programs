package java_allprogram;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the factorial number");
       int num= sc.nextInt();
        long n = 1;
        for(int i=1;i<=num;i++){
            n*=i;
        }
        System.out.println(n);

    }
}

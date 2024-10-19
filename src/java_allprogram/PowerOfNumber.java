package java_allprogram;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        int base,exponent;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base number: ");
        base=sc.nextInt();
        System.out.println("Enter the exponent number: ");
        exponent=sc.nextInt();
        int result=1;
        for(int i=1;i<=exponent;i++){
            result*=base;
        }
        System.out.println(result);

        power(base,exponent);
    }

    public static void power(int a,int b){
        System.out.println(Math.pow(a,b));
    }

}

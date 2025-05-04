package first_java;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        sc.close();
        checkArmstrong(a,b);
    }

    private static void checkArmstrong(int a, int b) {
        
        for(int i=a;i<=b;i++){
            int num=i;
            int sum=0;
            int digits = String.valueOf(i).length();
            while(num>0){
                int digit=num%10;
                sum += Math.pow(digit,digits);
                num=num/10;
            }
            if(i==sum){
                System.out.println(i);
            }
        }
    }
}

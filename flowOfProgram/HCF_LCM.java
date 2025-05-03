package flowOfProgram;

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number: ");
        int x = sc.nextInt();
        System.out.println("Enter your second number: ");
        int y = sc.nextInt();
        sc.close();
        int hcf= findHcf(x,y);
        int lcm= findLcm(x,y);
        System.out.println("HCF: "+ hcf );
        System.out.println("LCM: "+ lcm );
    }

    static int findHcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int findLcm(int a, int b) {
       return (a*b) / findHcf(a, b);
    }
}

package conditional_loops.intermediate;

import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount (P): ");
        double principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (R) in %: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (T) in years: ");
        double time = sc.nextDouble();

        System.out.print("Enter Number of times interest applied per year (n): ");
        int n = sc.nextInt();

        sc.close();

        double A= principal*Math.pow((1+(rate/n/100)),(n*time)); 
        double CI=A-principal;
        System.out.println("CI "+CI);
        System.out.println("Final "+A);
    }
}

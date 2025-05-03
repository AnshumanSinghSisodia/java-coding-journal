package first_java;

import java.util.Scanner;

public class calcSimpleInterest {
    public static void main(String[] args) {
        si(10000,3,20);
        simple_interest();  
    }
    static void si(double p,double r, double t){
        System.out.println(p*r*t/100);
    }
    static void simple_interest(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Principle: ");
        double principal = sc.nextDouble();
        System.out.print("Time in years: ");
        double time = sc.nextDouble();
        System.out.print("Rate: ");
        double rate = sc.nextDouble();
        double simple_interest = principal*rate*time/100;
        System.out.println("The simple interest is "+simple_interest);
        sc.close();
    }
}

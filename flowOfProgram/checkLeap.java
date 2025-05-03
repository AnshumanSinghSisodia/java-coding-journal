package flowOfProgram;

import java.util.Scanner;

public class checkLeap {

    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the year: ");
        x = sc.nextInt();
        sc.close();
        checkLeapStatus(x);
    }

    static void checkLeapStatus(int x) {
        if(x%4==0 || x%400==0){
            System.out.println(x+" is a leap year.");
        }
        else {
            System.out.println(x+" is not a leap year.");
        }
    }

    
}
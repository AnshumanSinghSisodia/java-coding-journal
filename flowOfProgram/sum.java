package flowOfProgram;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x=sc.nextInt();
        System.out.println("Enter second number: ");
        int y=sc.nextInt();
        sc.close();
        sumation(x,y);
    }

    static void sumation(int x, int y) {
        System.out.println("The sum of "+ x + " and "+ y + " is " +(x+y)+".");
    }
}

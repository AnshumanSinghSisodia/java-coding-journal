package first_java;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        calculater();
    }

    static void calculater() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double a = sc.nextDouble();
        System.out.print("Enter number 2: ");
        double b = sc.nextDouble();
        sc.nextLine();  // Consume leftover newline
        System.out.print("Choose operator (+, -, *, /): ");
        String op = sc.nextLine();
        sc.close();
        
        if(op.equals("+")){     //.equals to compare strings....Imp
            System.out.println(a+" + "+b+" = "+(a+b));
        }else if(op.equals("-")){
            System.out.println(a+" - "+b+" = "+(a-b));
        }else if(op.equals("*")){
            System.out.println(a+" * "+b+" = "+(a*b));
        }else if(op.equals("/")){
            System.out.println(a+" / "+b+" = "+(a/b));
        }else{
            System.out.println("Incorrect operator selected.");
        }
    }

}

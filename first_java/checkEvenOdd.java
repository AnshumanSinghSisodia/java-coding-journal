package first_java;

import java.util.Scanner;

public class checkEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        checkEven_Odd(n);
    }

    static void checkEven_Odd(int n) {
        if(n%2==0){
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd.");
        }
    }
}

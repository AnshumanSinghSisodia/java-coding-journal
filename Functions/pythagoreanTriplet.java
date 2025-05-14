package Functions;

import java.util.Scanner;

public class pythagoreanTriplet {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        checkTriplet(a,b,c);

    }

    private static void checkTriplet(int a, int b, int c) {
        if(a*a + b*b == c*c){
            System.out.println("it is.");
        }else{
            System.out.println("its not.");
        }
    }
}

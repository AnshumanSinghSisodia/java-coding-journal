package Functions;

import java.util.Scanner;

public class primeRange {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.println("ans:");
        for (int i = a+1; i < b; i++) {
            if(checkPrime.primeStatus(i)){
                System.out.println(i);
            }
        }
    }
}

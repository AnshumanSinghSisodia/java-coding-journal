package Functions;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean val= primeStatus(n);
        if(val==true){
            System.out.println("It's prime.");
        }else{
            System.out.println("Not prime.");
        }
        
    }
    public static boolean primeStatus(int n){
        boolean z = true;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                z=false;
            }
        }
        return z;
    }
}

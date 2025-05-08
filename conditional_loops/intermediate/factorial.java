package conditional_loops.intermediate;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int ans =fact(n);
        System.out.println("Factorial "+ans);
    }

    public static int fact(int n) {
        int prod=1;
        
        for(int i=1;i<=n;i++){
            prod*=i;
        }
        return prod;
    }

}

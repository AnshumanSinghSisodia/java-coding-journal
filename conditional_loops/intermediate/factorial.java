package conditional_loops.intermediate;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod=1;
        sc.close();
        for(int i=1;i<=n;i++){
            prod*=i;
        }
        System.out.println("Factorial "+prod);
    }
}

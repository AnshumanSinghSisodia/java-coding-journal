package conditional_loops.intermediate;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        sc.close();
        int val=powerfn(m,n);
        System.out.println(val);
    }

    private static int powerfn(int m, int n) {
        int power=1;
        for(int i=1;i<=n;i++){
            power*=m;
        }
        return power;
    }
}

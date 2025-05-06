package conditional_loops.basic;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            
            System.out.println(a);
            int tmp=a;
            a=b;
            b=tmp+b;
        }
    }
}

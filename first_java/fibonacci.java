package first_java;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        sc.close();
        int a=0,b=1;
        
        for(int i=1; i<=n;i++){
            System.out.print(a+" ");
            int c = a+b;
            a=b;
            b=c;
        }
    }

}

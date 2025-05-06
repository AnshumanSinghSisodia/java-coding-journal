//Subtract the Product and Sum of Digits of an Integer
package conditional_loops.basic;

import java.util.Scanner;

public class subProdSum {
    public static void main(String[] args) {
        int sum=0, prod=1;
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        while (n>0) {
            int digit = n%10;
            sum+=digit;
            prod*=digit;
            n=n/10;
        }
        System.out.println(prod-sum);
    }
}

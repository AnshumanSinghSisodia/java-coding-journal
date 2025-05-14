package conditional_loops.intermediate;

import java.util.Scanner;

public class checkPerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum=0;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("It's a perfect number.");
        } else{
            System.out.println("Not a perfect number.");
        }
    }
}

package conditional_loops.basic;

import java.util.Scanner;

public class largestTillZero {
    public static void main(String[] args) {
        int largest=Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            if(n>largest){
                largest=n;
            }
        }
        sc.close();
        System.out.println(largest);
    }
}

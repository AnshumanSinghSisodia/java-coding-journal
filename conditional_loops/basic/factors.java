package conditional_loops.basic;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double n= sc.nextDouble();
        sc.close();
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
            
        }
    }
}

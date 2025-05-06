//Take integer inputs till the user enters 0 and print the sum of all numbers 
package conditional_loops.basic;

import java.util.Scanner;

public class sumInt {
    public static void main(String[] args) {
        double sum=0;
        Scanner sc= new Scanner(System.in);
            
        while (true) {
            
            double n= sc.nextDouble();
            
            if(n==0){
                break;
            }
            sum+=n;
        }
        sc.close();
        System.out.println(sum);
    }

}

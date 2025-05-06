package conditional_loops.basic;

import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r= sc.nextDouble();
        double h= sc.nextDouble();
        sc.close();
        System.out.println("Volume "+(r+h));
    
    }
}

package conditional_loops.basic;

import java.util.Scanner;

public class csaCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r= sc.nextDouble();
        double h= sc.nextDouble();
        sc.close();
        System.out.println("CSA "+(2*3.14*r*h));
    
    }
}

package conditional_loops.basic;

import java.util.Scanner;

public class volumePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l= sc.nextDouble();
        double b= sc.nextDouble();
        double h= sc.nextDouble();
        sc.close();
        double basearea = l*b;
        System.out.println("Volume "+(basearea*h/3));
    
    }
}

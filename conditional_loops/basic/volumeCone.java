package conditional_loops.basic;

import java.util.Scanner;

public class volumeCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r= sc.nextDouble();
        double h= sc.nextDouble();
        sc.close();
        System.out.println("Volume "+(3.14*r*r*h/3));
    }
}

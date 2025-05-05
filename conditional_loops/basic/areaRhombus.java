package conditional_loops.basic;

import java.util.Scanner;

public class areaRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1= sc.nextDouble();
        double d2= sc.nextDouble();
        sc.close();
        System.out.println("Area "+(0.5*d1*d2));
    }
}

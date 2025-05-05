package conditional_loops.basic;

import java.util.Scanner;

public class areaTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double b=sc.nextDouble();
        double h=sc.nextDouble();
        sc.close();
        triangleArea(b,h);
    }

    private static void triangleArea(double b,double h) {
        System.out.println("The area of triangle is "+(0.5*b*h));
    }
}

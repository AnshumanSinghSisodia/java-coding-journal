package conditional_loops.basic;

import java.util.Scanner;

public class isoTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        sc.close();
        areaofIsosceles(a,b);
    }

    private static void areaofIsosceles(double a, double b) {
        double area= (b/4)*Math.sqrt(4*a*a-b*b);
        System.out.println("Area "+area);
    }
}

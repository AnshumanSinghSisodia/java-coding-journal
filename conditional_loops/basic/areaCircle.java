package conditional_loops.basic;

import java.util.Scanner;

public class areaCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double r=sc.nextDouble();
        sc.close();
        circleArea(r);
    }

    private static void circleArea(double r) {
        System.out.println("The area of circle is "+(3.14*r*r));
    }
}

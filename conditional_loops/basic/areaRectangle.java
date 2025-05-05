package conditional_loops.basic;

import java.util.Scanner;

public class areaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        sc.close();
        System.out.println("Area "+l*b);
    }
}

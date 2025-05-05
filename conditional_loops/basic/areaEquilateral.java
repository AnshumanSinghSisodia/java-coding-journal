package conditional_loops.basic;

import java.util.Scanner;

public class areaEquilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        sc.close();
        System.out.println("Area "+(1.732*a*a/4));
    }
}

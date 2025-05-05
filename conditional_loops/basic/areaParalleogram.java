package conditional_loops.basic;

import java.util.Scanner;

public class areaParalleogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        sc.close();
        System.out.println("Area "+(b*h));
    }
}

package conditional_loops.basic;

import java.util.Scanner;

public class periParalleo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        sc.close();
        System.out.println("Perimeter "+(2*(a+b)));
    }
}

package conditional_loops.basic;

import java.util.Scanner;

public class perimeterCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r= sc.nextDouble();
        sc.close();
        System.out.println("Perimeter: "+(2*3.14*r));
    }
}

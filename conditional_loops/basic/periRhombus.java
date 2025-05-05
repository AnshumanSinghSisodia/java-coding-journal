package conditional_loops.basic;

import java.util.Scanner;

public class periRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        sc.close();
        System.out.println("Perimeter "+(4*side));

    }
}

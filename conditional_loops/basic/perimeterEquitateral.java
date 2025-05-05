package conditional_loops.basic;

import java.util.Scanner;

public class perimeterEquitateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r= sc.nextDouble();
        sc.close();
        System.out.println("Perimeter "+3*r); 
    }
}

package conditional_loops.basic;

import java.util.Scanner;

public class volumeSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r= sc.nextDouble();
        sc.close();
        System.out.println("Volume "+(4*3.14*r*r*r/3));
    
    }
}

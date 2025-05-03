package flowOfProgram;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int x = sc.nextInt();
        sc.close();
        mulTable(x);
    }

    static void mulTable(int x) {
       for (int i = 0; i < 10; i++) {
            System.out.println(x+" * "+(i+1)+" = "+(i+1)*x);
       }
    }
}

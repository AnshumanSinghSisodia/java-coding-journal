package first_java;

import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        greetings_fn(name);
    }

    private static void greetings_fn(String name) {
        System.out.println("Hello "+ name+".");
    }
}

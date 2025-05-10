package conditional_loops.intermediate;

import java.util.Scanner;

public class checkVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch= sc.next().toLowerCase().charAt(0);
        sc.close();
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch+" is a vowel.");
        }
        else{
            System.out.println(ch+" is a consonent.");

        }

    }
}

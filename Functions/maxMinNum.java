package Functions;

import java.util.Scanner;

public class maxMinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        System.out.println("max: " + maxNum(a,b,c));
        System.out.println("min: "+ minNum(a,b,c));
    }

    private static int maxNum(int a, int b, int c) {
        if(a>=b && a>=c){
            return a;
        } else if(b>=a && b>=c){
            return b;
        } else{
            return c;
        }
        
    }

    private static int minNum(int a, int b, int c) {
        if(a<=b && a<=c){
            return a;
        } else if(b<=a && b<=c){
            return b;
        } else{
            return c;
        }
    }
}

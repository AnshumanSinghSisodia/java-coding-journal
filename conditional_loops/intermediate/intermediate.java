package conditional_loops.intermediate;

import java.util.Scanner;

public class intermediate {
    public static void main(String[] args) {
        int sumNeg=0, sumPosEven=0 , sumPosOdd=0; 
        Scanner sc = new Scanner(System.in);
        while (true) {
            
            int n = sc.nextInt();
            
            if(n==0){
                break;
            }
            if(n<0){
                sumNeg+=n;
            }
            if(n>0 && n%2==0){
                sumPosEven+=n;
            }
            if(n>0 && n%2!=0){
                sumPosOdd+=n;
            }
            
        }
        sc.close();
        System.out.println("sumNeg:"+sumNeg);
        System.out.println("sumPosEven:"+sumPosEven);
        System.out.println("sumPosOdd:"+sumPosOdd);
    }
}

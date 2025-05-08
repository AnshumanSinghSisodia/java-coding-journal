package conditional_loops.intermediate;

import java.util.Scanner; 

public class ncrNpr {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        sc.close();
        double nc =ncr(n,r);
        int np=npr(n,r);
        System.out.println("NPR: "+np);
        System.out.println("NCR: "+nc);
    }

    private static int npr(int n, int r) {
        int prod=1;
        while(r!=0){
            prod*=n;
            r--;
            n--;
        }
        return prod;
    }

    private static Double ncr(int n, int r) {
        Double ans=npr(n,r)/(double)factorial.fact(r);
        return ans;
    }
}

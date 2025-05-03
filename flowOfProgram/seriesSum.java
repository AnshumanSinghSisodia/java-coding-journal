package flowOfProgram;

import java.util.Scanner;

public class seriesSum {
    public static void main(String[] args) {
        int w = sumofseries();
        System.out.println("Sum is: "+w);
    }

    static int sumofseries() {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        while(true){
            String z = sc.next();
            if(z.equalsIgnoreCase("x")){
                sc.close();
                return sum;
            }
            else {
                int num= Integer.parseInt(z);
                sum+=num;
            }
            
        }
    }
}

package first_java;

public class findLargest {
    public static void main(String[] args) {
        largestNumber(4,5);
    }

    private static void largestNumber(double a, double b) {
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else if(b>a){
            System.out.println(b+" is greater than "+a);
        }
        else{
            System.out.println("The numbers are equal.");
        }
    }
}

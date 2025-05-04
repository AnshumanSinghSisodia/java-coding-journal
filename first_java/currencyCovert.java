package first_java;

public class currencyCovert {
    public static void main(String[] args) {
        double n=rupeeToUsd(1000000);
        System.out.println(n+" USD");
    }

    private static double rupeeToUsd(double i) {
        return i/85;
    }
}

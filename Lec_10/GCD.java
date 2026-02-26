package Lec_10;

public class GCD {
    public static void main(String[] args) {

        int num1 = 36;
        int num2 = 60;
        int min;
        if(num1>num2) min=num2;
        else min = num1;
        int gcd = 1;

        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD is: " + gcd);
    }
}

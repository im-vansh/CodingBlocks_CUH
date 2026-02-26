package Lec_10;

public class primeFactors {
    public static void main(String[] args) {

        int number = 60;

        System.out.println("Prime factors of " + number + " are:");

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
            }
        }
    }
}

package Lec_9;

public class prime {
    public static void main(String[] args) {

        int number = 29;
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }
    }
}

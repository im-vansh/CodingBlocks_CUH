package Lec_12;

public class Armstrong{
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;

        // Count digits without using String
        int digits = 0;
        int temp = number;

        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = number; // reset temp

        // Calculate Armstrong sum
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int num = 153;

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}

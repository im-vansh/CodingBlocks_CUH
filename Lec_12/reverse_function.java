package Lec_12;

public class reverse_function {
    public static int reverseNumber(int n) {
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        int num1 = 10834;
        System.out.println(reverseNumber(num1));
    }
}

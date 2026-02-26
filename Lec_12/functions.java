package Lec_12;

public class functions {
    // Function for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Function for subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Function for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
    }
}

package Lec_9;

public class swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int temp;   // third variable

        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping logic
        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

package Lec_9;

public class fibonnachi {
    public static void main(String[] args) {

        int n = 10;
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}

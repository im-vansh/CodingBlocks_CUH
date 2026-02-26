package Lec_22;

import java.util.Scanner;

public class hour_glass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // example n = 5

        int row = 1;
        int star = n;          // controls number count
        int space = 0;         // leading spaces

        while (row <= 2 * n + 1) {

            // 1️⃣ Spaces
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            // 2️⃣ Numbers (decreasing then increasing)
            int j = 1;
            int num = star;

            // decreasing part
            while (j <= star) {
                System.out.print(num + " ");
                num--;
                j++;
            }

            // increasing part
            num = 1;
            while (num <= star) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();

            // 🔁 Mirror logic
            if (row <= n) {
                star--;
                space++;
            } else {
                star++;
                space--;
            }

            row++;
        }
    }
}

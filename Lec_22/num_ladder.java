package Lec_22;

import java.util.Scanner;

public class num_ladder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // example 4

        int row = 1;
        int star = 1;
        int num = 1;           // continuous number

        while (row <= n) {

            int i = 1;
            while (i <= star) {
                System.out.print(num + " ");
                num++;
                i++;
            }

            System.out.println();

            row++;
            star++;
        }
    }
}

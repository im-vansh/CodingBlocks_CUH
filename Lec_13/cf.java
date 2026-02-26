import java.util.Scanner;

public class cf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // example 5

        int row = 1;
        int space = n - 1;

        while (row <= n) {

            // 1️⃣ Leading spaces
            int i = 1;
            while (i <= space) {
                System.out.print(" ");
                i++;
            }

            // 2️⃣ Stars
            int star = 1;
            while (star <= n) {

                if (row == 1  || row == n || star == 1 || star == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                star++;
            }

            System.out.println();

            space--;
            row++;
        }
    }
}


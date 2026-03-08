import java.util.Scanner;

public class RC_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter number of rows (M): ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns (N): ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Row-wise sum
        System.out.println("\nRow-wise sums:");
        for (int i = 0; i < m; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + rowSum);
        }

        // Column-wise sum
        System.out.println("\nColumn-wise sums:");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < m; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + " = " + colSum);
        }

        sc.close();
    }
}

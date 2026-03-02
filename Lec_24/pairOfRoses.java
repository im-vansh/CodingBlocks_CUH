
import java.util.Arrays;
import java.util.Scanner;

// OPTIMISED

public class pairOfRoses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // Number of test cases

        while (T-- > 0) {

            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int M = sc.nextInt();  // Money Deepak has

            Arrays.sort(arr);

            int left = 0;
            int right = N - 1;

            int price1 = 0;
            int price2 = 0;
            int minDiff = Integer.MAX_VALUE;

            while (left < right) {

                int sum = arr[left] + arr[right];

                if (sum == M) {

                    int diff = arr[right] - arr[left];

                    if (diff < minDiff) {
                        minDiff = diff;
                        price1 = arr[left];
                        price2 = arr[right];
                    }

                    left++;
                    right--;

                } else if (sum < M) {
                    left++;
                } else {
                    right--;
                }
            }

            System.out.println("Deepak should buy roses whose prices are "
                    + price1 + " and " + price2 + ".");

            System.out.println();  // Blank line after each test case
        }
    }
}

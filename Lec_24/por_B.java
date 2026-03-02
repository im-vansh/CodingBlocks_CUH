import java.util.*;

public class por_B{

    // BRUTEFORCE

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

            Arrays.sort(arr);  // Sort to ensure i ≤ j

            int price1 = 0;
            int price2 = 0;
            int minDiff = Integer.MAX_VALUE;

            // Check all pairs
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {

                    if (arr[i] + arr[j] == M) {

                        int diff = arr[j] - arr[i];

                        if (diff < minDiff) {
                            minDiff = diff;
                            price1 = arr[i];
                            price2 = arr[j];
                        }
                    }
                }
            }

            System.out.println("Deepak should buy roses whose prices are "
                    + price1 + " and " + price2 + ".");

            System.out.println();  // Blank line after each test case
        }

        sc.close();
    }
}

public class subarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        int n = arr.length;

        // Pick starting point
        for (int start = 0; start < n; start++) {

            // Pick ending point
            for (int end = start; end < n; end++) {

                // Print subarray from start to end
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }

                System.out.println(); // Move to next line
            }
        }
    }
}


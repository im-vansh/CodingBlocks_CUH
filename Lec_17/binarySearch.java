public class binarySearch {

    public static int bs(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // avoids overflow

            if (arr[mid] == target) {
                return mid;  // element found
            }

            if (arr[mid] < target) {
                left = mid + 1;   // search right half
            } else {
                right = mid - 1;  // search left half
            }
        }

        return -1;  // element not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;

        int result = bs(arr, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}

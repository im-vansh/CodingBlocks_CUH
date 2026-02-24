public class lc_278 {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                high = mid;      // mid might be the answer
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

}

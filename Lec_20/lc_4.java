import java.util.Arrays;

public class lc_4 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        // initialise array
        int arr[] = new int[n+m];
        int idx=0;
        //Stroing all the elements of array 1 & 2 in our new array
        for(int i=0; i<n; i++){
            arr[idx] = nums1[i];
            idx++;
        }
        for(int i=0; i<m; i++){
            arr[idx] = nums2[i];
            idx++;
        }
        // step 2 to sort the array
        Arrays.sort(arr);

        // step3 we have to calculate median
        if((n+m)%2==0){
            return (float)(arr[(m+n)/2]+arr[((m+n)/2)-1])/2;
        }
        // when length of array is odd
        else return arr[(m+n)/2];
    }
    public static void main(String[] args) {
        int nums[] = {1,2};
        int arr[] = {3,7};
        double ans = findMedianSortedArrays(nums,arr);
        System.out.println(ans);
    }
}

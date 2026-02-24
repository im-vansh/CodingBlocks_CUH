

public class lc_189 {
     public static void rotate(int[] nums, int k) {
        // 0th step is to update our k value
        k%=nums.length;

        //1st step is to reverse the whole array
        reverse(nums,0,nums.length-1);

        //2nd step to reverse our forst k elements
        reverse (nums,0,k-1);

        //3rd step reverse the remaining elements of our array
        reverse (nums,k,nums.length-1);
        
    }
    public static void reverse (int nums[], int start, int end){
        int temp;
        while(start<end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);   // Pass k
        for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

    }
}

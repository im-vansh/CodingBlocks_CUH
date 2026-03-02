import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int nums[] = {3, 2, 4};
        int target = 6;
        
        System.out.println(Arrays.toString(solve(nums, target)));
    }
    
    public static int[] solve(int[] nums, int target) {
        int arr[] = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;   // return immediately once found
                }
            }
        }
        
        return arr;  // default return
    }
}
public class kadanes {
    public static void main(String[] args) {
        int ans = Integer.MIN_VALUE;
        int curr = 0;
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        // THE TIME COMPLEXITY OF THIS CODE IS o(n)
        for(int i=0; i<nums.length; i++){
            // firstly we are calcultating the sum
            curr+=nums[i];
            // we are just updating our maximum value from the current sum
            ans = Math.max(ans,curr);
            // we are checkiong if our curr sum is less than 0 then we will ignore it 
            if(curr<0) curr=0; 
        }
        System.out.println(ans);
    }
}


import java.util.Arrays;

public class lc_169 {
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        Arrays.sort(nums);
        int n = nums.length; int cnt=0;
        if(n==1) System.out.println(nums[0]);
        else{
            for(int i=1; i<n; i++){
                if(nums[i]==nums[i-1]) cnt++;
                if(cnt+1>n/2) System.out.println(nums[i-1]);
            }
        }
        System.out.println("-1");
    }
}

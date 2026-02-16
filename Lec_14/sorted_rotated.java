package Lec_14;
import java.util.*;
public class sorted_rotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int cnt=0;
        for(int i=1; i<nums.length; i++){
            // 1st condition
            if(nums[i]<nums[i-1]) cnt++;
        }
        // 2nd condition
        if(nums[0]<nums[n-1]) cnt++;
        if(cnt==1 || cnt==0) System.out.println("true");
        else System.out.println("false");
    }
}

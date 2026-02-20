package Lec_17;

public class lc_704 {
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int target = 5;
        int s=0, e=nums.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(nums[mid]==target) System.out.println(mid);
            else if(nums[mid]>target) e = mid-1;
            else if(nums[mid]<target) s = mid+1;
        }
        System.out.println("-1");
   
    }
}

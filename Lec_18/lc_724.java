package Lec_18;

public class lc_724 {
    public static void main(String[] args) {
        int tot = 0;
        int nums[] = {1,7,3,6,5,6};
        int n = nums.length;
        for(int i=0; i<n; i++) tot+=nums[i];

        int left=0;
        for(int i=0; i<n; i++){
            tot-=nums[i];
            if(tot==left) System.out.println(i);
            left+=nums[i];
        }
        System.out.println("-1");
    }
}

/* DRY RUN

 total =0, left=0;
 total = 28

 total = 27;
 tot==left
 left = 1;

 total = 20
 tot=left
 left = 8

 idx=2;
 total = 17
 tot==left
 left = 11

 idx=3
 total =11
 tot==left
 */

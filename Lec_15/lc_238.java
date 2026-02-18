import java.util.*;

public class lc_238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        // we have declared our answer array in which we will store the answer
        int ans[] = new int [n];
        int zero=0;
        int tot=1;

        // first loop to calculate number of zeroes and total product of array
        for(int i=0; i<n; i++){
            if(nums[i]==0) zero++;
            else tot*=nums[i];
        }

        //1st condition when there is 1 zero is present
        if(zero==1){
            for(int i=0; i<n; i++){
                // if the given index element is non-zero then at result we have to put zero there
                if(nums[i]!=0) ans[i] = 0;
                else ans[i] = tot;
            }
        }
        // when there will be no zero present in the array
        else if(zero==0){
            for(int i=0; i<n; i++){
                ans[i] = tot/nums[i];
            }
        }
        for(int i=0; i<n; i++) System.out.print(ans[i]+" ");
    }
}

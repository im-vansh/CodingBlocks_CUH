package Lec_14;
import java.util.*;

public class missing_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int nums[] = new int[n];

    for(int i=0; i<n; i++){
        nums[i] = sc.nextInt();
    }
    
    int sum=0;
    for(int i=0; i<n; i++) sum+=nums[i];
    int expected_sum =  (n*(n+1)/2) ;
    System.out.println(expected_sum - sum);
    }
}


/*
the length of the array is 3 here 
the sum of he array is 4

we know that the formula of the sum of first n numbers is n*(n+1)/2
3*(3+1)/2 = 6
 */
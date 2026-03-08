import java.util.*;

public class AgressiveCows{
    public static boolean Isvalid(int stalls[], int k, int dist){
        int cow=1;  
        int lastPos = stalls[0];

        for(int i=1; i<stalls.length; i++){
            /* 0,1 2 3 4 5 6 
              0 1 6 ----1
              0 2 6-----2
              0 3 6 ----3 
              0 4 6 -----2
              0 5 6------1
            */
            if(stalls[i]-lastPos>=dist){ // we are calcualting the min distance between 2 consective cows
                // if this dis is greater than our stored dis then we will place the cow at that stall
                cow++;
                lastPos = stalls[i];
            }
            if(cow==k) return true;
        }
        return false;
    }
    public static int solve(int stalls[], int k){
        // sort the array
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length-1]-stalls[0];// max distance 

        int ans=0;


        while(low<=high){
            int mid = (low+high)/2;// distance
            if(Isvalid(stalls,k,mid)){
                ans = mid;
                low = mid+1; // to find the greater value mid=5 5 ke dis se cows ko place kr skte kya??
            }
            else high = mid-1; // we have to minimise it to find a smaller value so that we can place all the cows
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {0, 3, 4, 7, 10, 9};
        int k = 4;// cows 

    }
}

/*
0 3 4 7 9 10 
laspos 1st idx=0
cpw=1
cow 1->0,
0
10
2 cows placed ---- min=10
 0 3 10 ----- 3
 0 4 10------4
 0 7 10---3
 0 9 10----1

 0 4 10 mindis 4
 0 4 7 10


 */
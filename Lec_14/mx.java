package Lec_14;
import java.util.*;
public class mx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;   i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int mx= 0;
        for(int i=0; i<n; i++){
            mx = Math.max(mx,arr[i]);
        }
        System.out.println(mx);
    }
}

/*
      mx=9;
      18>mx
      mx = 18;
      mx = 266;
 */

package Lec_25;
import java.util.*;

public class arr {
    public static void main(String[] args) {
        // take input 
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // initialise our 2d array
        int arr[][] = new int[n][m];

        // we have to take input values in our array
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // we have to print it
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

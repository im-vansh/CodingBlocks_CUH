package Lec_25;

import java.util.Scanner;

public class search2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int target = sc.nextInt();

        // initialise our 2d array
        int arr[][] = new int[n][m];


        // we have to take input values in our array
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==target) System.out.println("true");
            }
        }
        System.out.println("false");
    }
}

package Lec_25;

import java.util.Scanner;

public class display {
    public static void main(String[] args) {
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
        // calling the fxn to print the values
        display(arr);
    }

    public static void display(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

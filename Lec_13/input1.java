package Lec_13;

import java.util.Scanner;

public class input1 {
    public static void main(String[] args) {
        // Here we will see how to take input in an array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// length of array
        
        // Initialise array
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        // printing
        for(int i=0; i<n; i++) System.out.println(arr[i]);
    }
}

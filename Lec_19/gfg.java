import java.io.*;

public class gfg {

    // Function to return the minimum
    // required value
    static int findMinValue(int arr[], int n)
    {

        // Find the sum of the
        // array elements
        long sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        // Return the required value
        return ((int)(sum / n) + 1);
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 4, 2, 1, 10, 6 };
        int n = arr.length;

        System.out.print(findMinValue(arr, n));
    }
}
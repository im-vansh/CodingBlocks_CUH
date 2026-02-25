package Lec_13;

public class basics {
    public static void main(String[] args) {
        // Primitive array
        int[] arr = {10, 20, 30, 40};
        int n = arr.length;

        // Traversing and printing array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        // Accessing fourth element
        System.out.print(arr[3] + " ");

        // Accessing first element
        System.out.print(arr[0]);

        // Updating first element
        arr[0] = 90;
        System.out.println(arr[0]);

        // Printing the size of array
        System.out.println("Size of array: " + arr.length);
        
    }
}

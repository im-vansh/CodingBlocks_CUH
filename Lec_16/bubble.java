import java.util.*;

public class bubble {
    public static void main(String[] args) {
        int arr[] = {15,3,81,4,1};
        int n = arr.length;
        bubbleSort(arr);
        System.out.println("sorted array");    
        for(int i=0; i<n; i++) System.out.print(arr[i]+" ");
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

   
}

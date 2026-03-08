import java.util.Scanner;

public class wave {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][]= new int [n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) arr[i][j] = sc.nextInt();
        }

        // the main logic
        for(int j=0; j<m; j++){
            // when col is even we have to traverse top to bottom
            if(j%2==0){
                for(int i=0; i<n; i++) System.out.print(arr[i][j]+" ");
            }
            else {
                // on odd traverse from bottom to top
                for(int i=n-1; i>=0; i--) System.out.print(arr[i][j]+" ");
            }
        }
    }
}
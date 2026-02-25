import java.util.*;
public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
            
            // Logic to find the largest number
        long largest;
            
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }
            
            // Print the result
        System.out.println(largest);
    }
}

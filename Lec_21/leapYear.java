import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int year = sc.nextInt();
        // Applying the rules:
            // (year % 400 == 0) covers Rule 1
            // (year % 4 == 0 && year % 100 != 0) covers Rule 2
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}

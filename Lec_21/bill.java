import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int units = sc.nextInt();
        int bill;

        if (units <= 100) {
            bill = units * 2;
        } 
        else if (units>100 && units <= 200) {
            bill = units * 3;
        } 
        else {
            bill = units * 5;
        }

        System.out.println(bill);
    }
}

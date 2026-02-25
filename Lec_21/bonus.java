import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long salary = sc.nextLong();   // Salary
        int experience = sc.nextInt(); // Years of Experience
        long bonus;

        if (experience >= 5) {
            bonus = salary / 10;  // 10% of salary
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
    }
}

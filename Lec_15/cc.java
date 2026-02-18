import java.util.*;

public class cc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(n>=2*x && n>2*y) System.out.println("true");
        else System.out.println("false");
    }
}

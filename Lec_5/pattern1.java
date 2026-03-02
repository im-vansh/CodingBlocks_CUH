package Lec_5;
import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int row=1;
        int star=5;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("*");
                i++;
                
            }
            System.out.println();
            row++;
        }
    }
}

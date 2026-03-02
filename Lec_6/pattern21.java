package Lec_6;

import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int row=1;
        int star=n/2;
        int space=1;
        while(row<=n){
            int i=1;
            if(row==1) i=2;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print(" ");
                j++;
            }
            int k=1;
            if(row==n) k=2;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            // mirror
            if(row<=n/2) {space+=2;star--;}
            else  {space-=2;star++;}


            System.out.println();
            row++;
        }
    }
}
/*
5
*  * * 
*    *

*    *
* *  *
*/
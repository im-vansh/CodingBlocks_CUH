 import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		// contest - 224 div 4 ques 2
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		    
		    int curr=0, mx=0;
		    for(int i=0; i<n; i++){
		        if(arr[i]!=0){
		            curr++;
		            mx = Math.max(curr,mx);
		        }
		        else {
		            curr=0;
		        }
		    }
		    System.out.println(mx);
		}

	}
}
 {
    
}

import java.util.*;
public class goodStr {
    public static void main(String[] args) {
        // input in the string you can use .next()
        Scanner sc = new Scanner (System.in);
        // this is how you take the input in the string 
        String s = sc.next();

        int curr=0;
        int mx=0;
        // time complexity of this code o(n)

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'|| ch=='o'|| ch=='u'){
                curr++;
                mx = Math.max(mx,curr);
            }
            else{
                curr=0;
            }
        }
        System.out.println(mx);
    }
}
/*
 s = cbaeiciouacd  the length will be 4
  2nd idx we get a which is a vowel
     curr=1
     mx = 1;

3rd curr=2 mx=2
4th curr =3 mx=3

5th curr=0 mx=3
curr =1 2 3 4
mx = 4

 */

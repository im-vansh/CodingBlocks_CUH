import java.util.*;

public class lc387 {
    public static int firstUniqChar(String s) {
        // first make a freq array to count the frequencies of every character in our string
        int freq[] = new int[26];

        // This is how we calculate the frequencies of every character in our string
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }

        // We have to return the character whose freq is 1
        int ans=-1;
        for(int i=0; i<s.length(); i++){
            // we have to check which character has freq equals to 1
            if(freq[s.charAt(i)-'a']==1){
                ans = i;// which is 2
                // once we stored our answer we have to break and exit from the loop
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        int ans = firstUniqChar(s);
        System.out.println(ans);
    }
}

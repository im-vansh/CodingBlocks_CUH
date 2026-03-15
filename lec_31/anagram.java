import java.util.*;

public class anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int freq[] = new int[26];

        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for(char ch : t.toCharArray()) {
            freq[ch - 'a']--;
        } 

        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        /*
        two strings are said to be anagram if they have the same chaarcters with identical frquencies
        regardless of their order

        s= anagram       t = nagaram

        ++                  --  

        a  b c d e f g h i j k l m n o p q r s t
        [0][0][0][][][0][1][][][][][0][][0][0][][0][][][]


         */
        String s = "car";
        String t = "rac";
        System.out.println(isAnagram(s,t));
    }
}

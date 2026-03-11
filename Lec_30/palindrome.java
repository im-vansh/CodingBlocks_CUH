public class palindrome {
    public static void main(String[] args) {
        // Palindrome is a varibale which is same when we read it from left to right or from right to left
        // varibale  = saras
        // saras
        String name  = "saras";
        System.out.println(isPalindrome(name));
    }

    public static boolean isPalindrome(String s){
        int i=0; // it is the starting point
        int j = s.length()-1; // this refers to the last position of the variable

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;// which means the given string is not a palindrome
            }
            i++;
            j--;
        }
        return true; // which means the given string is palindrome
    }
}
// Dry run of the code
/* 

saras
i=0 and j=4
s and s

i=1 and j=3
a and a

i=2 and j=2
here the condition i<j is not true so we will exit form theloop and return true

*/
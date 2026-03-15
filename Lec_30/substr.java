public class substr {
    public static void main(String[] args) {
        String s = "code";
                   // 02  co
        Print(s);
    }
    // we know that when we use substring method ending index is not printed
    public static void Print(String s){
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
}

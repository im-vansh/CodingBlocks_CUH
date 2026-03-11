public class basics{
    public static void main(String[] args) {
        // HOW TO DEFINE OR INITIALISE OUR STRING
        // there are 2 methods to intialise our string variable


        // 1st Method
        // data_type variable name = define your variable in quoted form
        String str = "hello";
        String str2 = "hello";
        // both of the strings str and str2 shares the same location in memory
        // and when our == comparators compares, it  compares the location in which
        // the string is stored which we let 2k
        // so our str is at locaton 2k and str2 is also in the saqme location 
        // thats why itis  giving true in the output
        System.out.println(str==str2);

        // == comparator compares the address of the varibales


        //2nd Method

        // when we use new string then this varibake is stored in the new memory location lets say 9k
        // thats why it is gvinvg false when we are comparing the str and s varibales because they share
        // different locations in the heap memory
        String s = new String("hello");
        System.out.println(s);

        // the question is if we compare both the strings s and str did it give me true or false
        System.out.println(str==s);// false


        // to calculate the length of the string varibale we use 
        //.length()
        // in array we just use .length method to find the length of our array
        String name  = "Vansh";
        System.out.println(name.length());


        //Strings in java immutable it cannot be changed once defines 
        String s2 = "hey";
        String s3 = "class";
        System.out.println(s2+s3);

        System.out.println("hey" + 10 + 220 + "bye");
        // hey
        // 10 will be concatinate in our strings
        // hey10220bye

        System.out.println("hey" + (10 + 220) + "bye");
        // hey + 230 + bye
        // output will be hey230bye

        // .equlas Method
        /*
        As we know thatcomparator compares the adress of the 2 variables
         .equlas compares the info or data stored in the string varibale
         */

         System.out.println(s.equals(str));
         // .equlas compares the info or data stored in the string varibale



        String name2 = "SunstoneAcademy";
        
        // .charAt(index) helps us in getting the particular character in our string varibale
        System.out.println(name2.charAt(3));
        // similarly like arrays here the indexing is starting from index0

        // .substring() Method
        System.out.println(name2.substring(2,5));
        // we got nst as the ouptut so we can observe that it is not printing the index 5
        // here we can tell that last index is not included in the substring method
        //  i=2; i<5  

        // the conversion part 
        // how to convert the string in to the integer and into a long value

        String c = "354473883838383";
        long x = Long.parseLong(c);
        System.out.println(x);

        // how to convert a integer to string variable
        int x1 = 55644;
        String s21 = String.valueOf(x1);
        System.out.println(s21);



    }
}
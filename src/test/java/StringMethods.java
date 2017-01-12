/**
 * Created by alex on 12.01.2017.
 */

public class StringMethods {
    public static void main(String[] args) {
        String str = "this is the test string";
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Welcome";
        String str4 = "";
        String str5 = "Spaces all around               ";


        System.out.println(str.length());           // length of the string
        System.out.println(str.charAt(2));          // returns a char value at the given index number
        System.out.println(str.concat("This is the appended string"));       // combines specified string at the end of this string
        System.out.println(str.contains("is"));     // returns true if chars are found in the string
        System.out.println(str.contains("si"));
        System.out.println(str.startsWith("this")); //checks if this string starts with given prefix
        System.out.println(str.endsWith("string"));
        System.out.println(str.endsWith("is"));
        System.out.println(str1.equals(str2));      // compares the contents of two given strings
        System.out.println(str1.equals(str3));
        System.out.println(str.indexOf("h"));       // returns index of given character value or substrin
        System.out.println(str4.isEmpty());
        System.out.println(str.isEmpty());
        System.out.println(str5.trim());            // eliminates leading and trailing spaces
    }
}


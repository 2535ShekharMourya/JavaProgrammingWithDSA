package AbbhyashProgram;


import java.util.Arrays;
import java.util.SplittableRandom;
import java.util.Stack;

public class Abbhyash3 {
    public static void main(String[] args) {
       boolean ans=validPalindrome("abc");
        System.out.println(ans);

        String strWithSpaces = "Hello,  world! This has spaces.";
        String[] parts = strWithSpaces.split("\\s");
        String strWithoutSpaces = String.join("", parts);
        String newStr=strWithoutSpaces.toLowerCase();

        System.out.println("Original String: " + strWithSpaces);
        System.out.println("String without spaces: " + strWithoutSpaces);
        System.out.println(newStr);
    }
    public static boolean validPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1, false);


    }
    public static boolean isPalindrome(String s, int i, int j, boolean isDeleted) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (isDeleted) return false;
                return isPalindrome(s, i + 1, j, true) || isPalindrome(s, i, j - 1, true);
            }

            i++; j--;
        }

        return true;
    }
}



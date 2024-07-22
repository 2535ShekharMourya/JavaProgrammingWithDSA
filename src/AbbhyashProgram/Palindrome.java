package AbbhyashProgram;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while (start<end){
            if (s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Tests");
        int T=s.nextInt();
        while (T>0){
            T--;
            String str=s.next();
            System.out.println(isPalindrome(str));
        }
    }

}

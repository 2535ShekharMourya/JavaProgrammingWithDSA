package Maths_and_BitManipulation;

import java.util.Scanner;

public class BasicMaths1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();
        /* use num%10 for last 1 digit,  num%100 for 2 digits , num%1000 for last 3 digits, num%10000 for last 4 digits
        in general num%1*10^n = n digits from last    */
        // sum of digits of a number using % operator
       /* for (int i = 0; i < noOfTest; i++) {
            int num = sc.nextInt();
            int ans = 0;
            while (num > 0) {
                int rem = num % 10;
                ans = ans + rem;
                num /= 10;
            }
            System.out.println(ans);
        }*/

        // multiplication of digits of a number
    /*    for (int i = 0; i < noOfTest; i++) {
            int num = sc.nextInt();
            int ans = 1;
            while (num > 0) {
                int rem = num % 10;
                ans = ans * rem;
                num /= 10;
            }
            System.out.println(ans);
        }*/

        // Reverse of a number
        for (int i = 0; i < noOfTest; i++) {
            int num = sc.nextInt();
            int ans = 0;
            while (num > 0) {
                int rem = num % 10;
                ans = ans * 10 + rem;
                num /= 10;
            }
            System.out.println(ans);
        }
    }
}

package JavaNotesPrograms;

import java.util.Arrays;
import java.util.SplittableRandom;

public class MainMethodInjava {
    // you can write main method in multiple way ex.

   /*4 static final synchronized strictfp public void main(String ...args){
        System.out.println("or bhai");
    }

    */
    /*5static final synchronized strictfp public void main(String []args){
        System.out.println("or bhai kya hal hai");
    }

    */
   /*3 static public void main(String... args){
        System.out.println("hello bro");
    }

    */
   /*2 static public void main(String args[]){
        System.out.println("hello");
    }

    */
   /*1. public static void main(String args[]){
    }
    */

    public static void main(String args[]) {
        System.out.println("Main main method");
        int arr[] = {1, 2, 3};
        main(arr);
        C.sum();
    }

    public static void main(int[] args) {
        System.out.println("Normal main method");
        System.out.println(Arrays.toString(args));
    }
    /* Note . main method can be overloaded but jvm will always call String[] argument in main only
    and other main method jvm treat as normal method and call explicitly
     */


    class C extends MainMethodInjava {
        static int a = 20;
        static int b = 20;

        static void sum() {
            int c = a + b;
            System.out.println(c);
            /*  main method can be inherite if child class do not have main() method then parent
            main() executes
             */
        }
    }

    class Q extends MainMethodInjava {
        public static void main(String[] args) {
            System.out.println("Ram Ram");
        }
    }
    /*  So inheritance , overloading possible of main() method but overriding not possble but
    hiding possible
     */




}

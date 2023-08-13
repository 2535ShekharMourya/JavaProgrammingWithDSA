package JavaNotesPrograms;

import java.util.Scanner;

public class DeffWbEqualEqualAndDotEqual {
    public static void main(String args[]){
        // == for address comparision and .equals for content comparision
        String s1=new String("azad");
        String s2=new String("azad");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==null);
        System.out.println(null==null);
        String s3=null;
        System.out.println(s3==null);

        // instanceOf operator
        // we can use instanceOf operator wether the given object is of particular type or not
        Thread t=new Thread();
        System.out.println(t instanceof Thread);
        System.out.println(t instanceof Runnable);
        System.out.println(t instanceof Object);
        //System.out.println(t instanceof String); error : can't' cast thred into String
        System.out.println(null instanceof Thread);
        System.out.println(null instanceof Runnable);

        // Bitwise operator
        System.out.println(true&false);
        System.out.println(true&true);
        System.out.println(true|false);
        System.out.println(false^true);
        System.out.println(4&5);
        System.out.println(5|2);
        System.out.println(5^2);
      //  System.out.println(~true); ~ can't apply on boolean
        System.out.println(~4);
     //   System.out.println(!5); can't apply on Integer
        System.out.println(!true);
        /* 1. ! only for boolean
           2. ~ only for Integer
           3. &,|,^ apply for both

              &,|,^                               Vs             && , ||
       1.both argument evaluted                      1. second argument is optional

       2.applicable for both boolean and Integer     2. applicable only for boolean

            */


    }
}

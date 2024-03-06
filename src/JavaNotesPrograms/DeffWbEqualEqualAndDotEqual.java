package JavaNotesPrograms;

import InnerClasses.LinkedLis;

import java.math.MathContext;
import java.util.*;

public class DeffWbEqualEqualAndDotEqual {
    public static void main(String args[]){
        /*
        // == for address comparision and .equals for content comparision
        String s1=new String("azad");
        String s2=new String("azad");
        String st=new String("shekhar");
        String s4=s2;
        String s5=s4;
        String st1=st;
        System.out.println(s1==s2 || s1.equals(s2));
        System.out.println(s1==s2 && s1.equals(s2));
        System.out.println(st==s2 && st.equals(s2));
        System.out.println(st==st1 && st.equals(st1));
        System.out.println(s5.equals(s4) && s5==s4);
        System.out.println(s2==s4);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==null);
        System.out.println(null==null);
        String s3=null;
        System.out.println(s3==null);

         */
/*
        // instanceOf operator
        // we can use instanceOf operator weather the given object is of particular type or not
        Object o=new Object();
        System.out.println(o instanceof String);
        System.out.println(o instanceof Thread);
        System.out.println(o instanceof Integer);
        System.out.println(o instanceof Runnable);
        System.out.println(o instanceof Collections);
        System.out.println(o instanceof Throwable);
        System.out.println(o instanceof Timer);
        System.out.println(o instanceof Date);
        System.out.println(o instanceof Object);
        System.out.println();

        String st=new String();
        System.out.println(st instanceof Object);
        System.out.println(st instanceof String);
        System.out.println();

        ArrayList list=new ArrayList();
        System.out.println(list instanceof Object);
        System.out.println(list instanceof ArrayList);
        System.out.println();

        Thread t=new Thread();
        System.out.println(t instanceof Thread);
        System.out.println(t instanceof Runnable);
        System.out.println(t instanceof Object);
        //System.out.println(t instanceof String); error : can't' cast thred into String
        System.out.println(null instanceof Thread);
        System.out.println(null instanceof Runnable);

 */
        // Bitwise operator
        System.out.println(true&false);
        System.out.println(true&true);
        System.out.println(true|false);
        System.out.println(false^false);
        System.out.println(false^true);
        System.out.println(true^true);
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

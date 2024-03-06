package JavaNotesPrograms;

public class OperatorAndAsignment {
    public static void main(String[] args) {
        byte a = 10;
        a = (byte) (a + 1); // here 1 take as integer so typecast into byte first
        a++;
        System.out.println(a);
        if (a++ == a + 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

/*
  if we apply any arithmatic operation between to variables a and b then Resultant type always Max
   Ex is below
 */
        byte n = 10, m = 20;
        byte p = (byte) (n + m); // byte + byte =int  or

        final int v = 10;
        //  v++; error : cannot assign value to the final 'v'
        // ++ or -- allow for every primitive but not for boolean

       /* byte + short + int + long + float +double
                 char ->

          if we apply any arithmatic operation between to variable a and b then Resultant type always
           Max  (int, byte of a, byte of b)
        */
        System.out.println('a' + 'b');
        System.out.println('a' + .2);
        System.out.println('a' + 4);
      /*  System.out.println(12/0); RE Arithmatic /by zero
        System.out.println(13/0.0);
        System.out.println(-23/0.0); RE Arithmatic - infinity
       */

        System.out.println();
        System.out.println();
                       // '+' as a Arithmatic and cancatenation operator
        /*
        + only operator which can be overloded Ex below
       */
        int n1 = 2, n2 = 2;
        System.out.println(n1 + n2);
        System.out.println("azad" + "shekhar");
        System.out.println();
        String name = "azad";
        int n3 = 30, n4 = 10, n5 = 20;
        System.out.println(name + n3 + n4 + n5);
        System.out.println(n3 + n4 + name + n5);
        System.out.println(n3 + n4 + n5 + name);
        name = n3 + name + n3;
        System.out.println(name);
        name = name + n3 + n4 + n5;
        System.out.println(name);
        //   n3=name+n4+n3; CTE

        System.out.println();
        System.out.println();
        //Assignment operator(>,<,>=,<=)
        boolean p1 = 'a' > 'b';
        //  boolean p2="azad">"shekhar";   assignment operator can't apply on object type data
        //  boolean p3=true>false;   assignment operator can't apply on boolean type
        // boolean p4=10<20<30; nesting of assignment operator not allow
        boolean p4 = 10 < 20;
        System.out.println(p4);

        System.out.println();
        System.out.println();
        // Equality operator(== , !=)
        /*
        1. equality operator apply for everywhere including boolean type
        2. also apply on objects
        3. for object Reference r1 ,r2 to compare his address
            Ex below
         */
        boolean c1=20==20;
        System.out.println(c1);
        boolean c2= 'a'=='b';
        System.out.println(c2);
        boolean c3=true==true;
        boolean c4=true==false;
        boolean c5="azad"=="azad";
        System.out.println(c5);
        Thread t1=new Thread();
        Thread t2=new Thread();
        Thread t3=t1;
        boolean c6=t1==t2;
        boolean c7=t1==t3;
        System.out.println(c6);
        System.out.println(c7);
        Object o=new Object();
        String s1=new String();
        System.out.println(o==s1);
        System.out.println(t1==o);
       // System.out.println(s1==t2); can't apply String and thread


        System.out.println();
        System.out.println();
       int an=7/2; // int/int=int
        System.out.println(an);
        double an1=7/2;  // int/int =int-->double =num.0
        System.out.println(an1);
        double an2=7/2.0;  // int/float=float , float/int=float , float/float=float
        System.out.println(an2);
        System.out.println();
        int an4=7/2;
        System.out.println(an4);
        an4=-7/2;
        System.out.println(an4);
        an4=7/-2;
        System.out.println(an4);
        an4=-7/-2;
        System.out.println(an4);
        System.out.println();
        int an5=7%2;
        System.out.println(an5);
        an5=-7%2;  // if numerator -ve then ans is negative otherwise ans is positive
        System.out.println(an5);
        an5=7%-2;
        System.out.println(an5);
        an5=-7%-2;
        System.out.println(an5);
        System.out.println();
       /*
       1. * / % all have same priority matlab go paihle aa jaye bo execute ho jayega (Left to Right)
       2. + -  have same priority Remaining same as 1 . low priority abow 1
       3. =   low priority abow 1 and 2
       4. programming(c,c++ java ....)
        me koi BODMAS Rule nahi hota math ki tarah yaha priority and precedence hoti hai operators ki
        */
        int numb1=10,numb2=5;
        int Answ=numb1*5/3+numb2%2;
        System.out.println(Answ);
        Answ=12*numb2%4/numb1+numb1/numb2-3;
        System.out.println(Answ);

    }
}

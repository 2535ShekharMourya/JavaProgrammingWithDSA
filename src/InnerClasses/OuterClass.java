package InnerClasses;

public class OuterClass {
    static int a=20;
    int b=30;
    static void display(){
        System.out.println(a);
    }
    static class inner{
        /*
        1. static inner class access all static variables and methods of outer class
        2. static inner class can't access non-static variables and methods of outer class
           error->Non-static field 'b' cannot be referenced from a static context
         */
    inner(){
        System.out.println("this is inner constructor");
        System.out.println("this is outer class static variable "+a);
        display();
       // System.out.println(b);
    }
    }
    public static void main(String ag[]){
        System.out.println(OuterClass.a);
        OuterClass.display();
        //  inner class object syntax:  OuterClass.InnerClass variable = new OuterClass.InnerClass();
        OuterClass.inner obj=new OuterClass.inner(); // in general

        inner ob=new inner(); // when static inner class and main() both in same class
    }
}

package InnerClasses;

/*
  1.Nested Classes
      1.static nested Classes
      2.non-static Classes or inner classes
            1.inner classes
            2.method local inner classes
            3.anonymous inner classes
 */
/*1. it is a way of logically grouping classes that are only  used in one place
  2. it increases encapsulation means hide outer world
  3. increase readability and maintainability of code
  4. there are two type of nested classes  first is non-static class or inner class and
     second is static class just similar to class member variable may be static or non-static
  5. static class directly associated with outer class as static variables . no need to create object of outer class

 */

public class Example { // outer class only can be public , not private , not protected
    private class inner1 {
        /*1. inner class just like class member you can use public, private,protected ,default
          2. associated with object
          3. can access static non-static variables and methods even variables is private
         */
         String city="lucknow";
        void showCity() {
            System.out.println("the city is  " + city);
        }
    }
    private int a = 90;
    static String name = "Shekhar";


    static class inner2{
        /* 1. can access static variables and methods of outer class
           2. associated with class
         */

    }
}

package JavaNotesPrograms;

/*   you have to do on daily basis
1. earn 400 points in problem-solving: easy problem=100 points, medium problem=200 points, hard problem=400 points
2. Revision and practice old concepts
3. learn new patterns, concepts, tips-tricks for level up your problem-solving
*/
// Note: lamda expression only work with functional interface mean interface has only one method
@FunctionalInterface
interface Calc {
    int add(int num1, int num2);

    String toString();
    //  ? :     but @FunctionalInterface has only one method then why toString()
    // answer: every class in java extends object class and toString() is object class method
}

// create  Anonymous class instead of creating  a new class
/* class Calcu implements Calc{
    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }
}*/
@FunctionalInterface
interface MyInterface {
    void myMethod();
}

@FunctionalInterface
interface A_A {
    void show();
}

@FunctionalInterface
interface B_B {
    void root(int i);
}

class _A {

}


public class Day1_27_02_2024 {
    public static void main(String[] args) {

        // Example 1
        Calc obj1 = new Calc() {
            // inner Anonymous class implementation
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
        int result = obj1.add(3, 4);
        System.out.println(result);
        // lamda expression: same logic of above code but reduce lines of code easy and simple
        Calc obj2 = (num1, num2) -> num1 + num2;
        // Or you can write
        Calc obj_1 = (int i, int j) -> {
            return i + j;
        };
        // Or you can write
        Calc obj_2 = (i, j) -> i + j; // if single statement that means it is a return value ex: -> i+j;
        System.out.println(obj2.add(2, 2));
        System.out.println();

        // Example 2
        MyInterface anonymousObject = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("Anonymous class implementation");
            }
        };
        anonymousObject.myMethod();
        // lamda expression
        MyInterface lambdaObject = () -> System.out.println("Lambda expression implementation");
        lambdaObject.myMethod();
        System.out.println();
        /* the lambda expression () -> System.out.println("Lambda expression implementation") is used to implement the myMethod of the MyInterface.
         It's a more concise way to achieve the same result as the anonymous class example.
         ?:      why anonymous class
         answer: this class use only once in my project and I don't want to create new class in project
        * */

        // Example 3
       /* A_A obj3=new A() {
            @Override
            public void show() {
                System.out.println("this is show method");
            }
        };*/
        // Anonymous class implementation
        //obj3.show();
        // lamda expression
        A_A obj4 = () -> {
            System.out.println("this is show method");
            System.out.println("{} for multi line in a block");
        };
        // lamda expression more simple and concise way
        A_A obj5 = () -> System.out.println("this is show method");
        // all above 3 objects do same thing but syntax different

        // Example 4
        B_B obj6 = i -> System.out.println("the number is 2 " + i);
        B_B obj7 = (i) -> System.out.println("the number is 2 " + i);
        obj6.root(2);

        // Object class methods
        _A o = new _A();
        o.toString();
        //o.equals()
        o.hashCode();
        o.getClass();
        o.notify();
        // o.wait();


    }
}

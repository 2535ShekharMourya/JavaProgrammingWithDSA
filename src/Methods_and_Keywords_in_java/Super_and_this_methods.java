package Methods_and_Keywords_in_java;
//Use of super with variables
//Use of super with methods
//Use of super with constructors
//1. Super method: super() method call parent class constructor
//2. this method: this() method call another constructor within the class

class A extends Object {
    // Note: every class in java extends Object class
    public A() {
        super();
        // note. every constructor in java has a method which is there even if you don't mention and that method is super()

        System.out.println("in A");
    }

    public A(int n) {
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    /* 1. Question: you mean class B and class A both extends Object class.
     Ans is no because of this is multiple inheritence but java don't support multiple inheritence
    Right Ans: class B extends class A and class A extends Object class so this is multilevel inheritence
    2. (i) The super keyword refers to superclass (parent) objects.

        (ii) It is used to call superclass methods, and to access the superclass constructor.

         (iii) The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.
     */
    public B() {
        // Note. Every constructor has first statement is super()
        //  super(); super means superclass's constructor(default or non-parameteraise constructor) of this class
        super(4);
        System.out.println("in B");
        System.out.println();
    }

    public B(int n) {
        // Every constructor will hava super() method
        super(n);// call parameteraise constructor of super class
        System.out.println("in B int");
    }
}

class C extends A {
    public C() {
        System.out.println("in C");
    }

    public C(int n) {
        this();
        System.out.println("in C int");
    }
}


class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    void drawShapeAndCircle() {
        super.draw(); // Call the draw method of the superclass (Shape)
        draw();       // Call the overridden draw method in the current class (Circle)
    }
}

/*
1. Use of super with Variables
This scenario occurs when a derived class and base class has the same data members.
In that case, there is a possibility of ambiguity for the JVM.
 */
// Java code to show use of super
// keyword with variables

// Base class vehicle
class Vehicle {
    int maxSpeed = 120;
}

// sub class Car extending vehicle
class Car extends Vehicle {
    int maxSpeed = 180;

    void display() {
        // print maxSpeed of base class (vehicle)
        System.out.println("Maximum Speed: "
                + super.maxSpeed +" max speed  "+maxSpeed);
    }
}



/*
2. Use of super with Methods
This is used when we want to call the parent class method.
So whenever a parent and child class have the same-named methods then to resolve ambiguity we use the super keyword.
 */
// Java program to show use of super with methods

// superclass Person
class Person {
    void message() {
        System.out.println("This is person class\n");
    }
}

// Subclass Student
class Student extends Person {
    void message() {
        System.out.println("This is student class");
    }

    // Note that display() is
    // only in Student class
    void display() {
        // will invoke or call current
        // class message() method
        message();

        // will invoke or call parent
        // class message() method
        super.message();
    }
}

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }

    void animalSound() {
        // Calling the superclass (Animal) method using super
        super.makeSound();
    }
}


class Parent {
    int value;

    Parent(int value) {
        this.value = value;
    }
}

class Child extends Parent {
    int childValue;

    Child(int value, int childValue) {
        super(value); // Call the constructor of the superclass (Parent)
        this.childValue = childValue;
    }
}


public class Super_and_this_methods {
    public static void main(String ag[]) {
        //  B Obj=new B(); Q1.what would be the output and explain output ?
        // B Obj1=new B();
        // B Obj2=new B(5);
        // B Obj3=new B();
        // Note. can i execute both constructor of same class with one object ans is yes with this() method
        // C Obj4=new C(4);


        Car small = new Car();
        small.display();


        Student s = new Student();
        // calling display() of Student
        s.display();


        Dog myDog = new Dog();
        myDog.makeSound();     // Calls the overridden method in Dog class
        myDog.animalSound();   // Calls the superclass (Animal) method using super


        Circle circle = new Circle();
        circle.drawShapeAndCircle();

        Child child = new Child(10, 20);
        System.out.println("Parent Value: " + child.value);
        System.out.println("Child Value: " + child.childValue);
    }
}

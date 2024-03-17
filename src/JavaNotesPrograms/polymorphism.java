package JavaNotesPrograms;
/* It refers to the ability of an entity (such as a method, operator, or object) to take on multiple forms.
In other words, the same entity can behave differently in different scenarios.
 two common types of polymorphism in Java:
  1. Method Overriding (Runtime Polymorphism)
  2. Method Overloading (Compile-Time Polymorphism
  */

// 1. Method Overriding (Runtime Polymorphism):
/* Inheritance in Java allows us to override methods from the superclass in the subclass.
 When the same method is present in both the superclass and the subclass,
 the method in the subclass overrides the one in the superclass.
The overridden method performs one operation in the superclass and a different operation in the subclass.*/
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}
class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

// 2. Method Overloading (Compile-Time Polymorphism):
/* Method overloading allows us to define multiple methods with the same name in a class.
These methods have different parameter lists (different number or types of parameters).
The appropriate method to invoke is determined at compile time based on the method signature (number and types of arguments).
*/
class Calculator {
public int add(int a, int b) {
        return a + b;
        }
public double add(double a, double b) {
        return a + b;
        }
    public double add(int a, double b) {
        return a + b;
    }
    public double add(double a, int b) {
        double c= a + b;
        return c;
    }
        }

public class polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

        Calculator obj=new Calculator();
        System.out.println(obj.add(2,2));
        System.out.println(obj.add(2.5,2.5));
        System.out.println(obj.add(2,2.5));
        System.out.println(obj.add(2.5,2));
    }
}

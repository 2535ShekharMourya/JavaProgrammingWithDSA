import java.util.Stack;
public class tack{
    public static void main(String[] args){
    Stack<String> animal = new Stack<>();
    animal.push("Lion");
    animal.push("Dog");
    animal.push("Horse");
    animal.push("Cat");
    System.out.println("Stack"+animal);
    System.out.println(animal.peek());
    animal.pop();
    System.out.println("Stack"+animal);
    System.out.println(animal.peek());
    /*Stack<> square = new Stack<>();
    square.push(2);
    square.push(3);
    square.push(4);
    square.push(5);
    System.out.println(square.peek());*/
    }
}
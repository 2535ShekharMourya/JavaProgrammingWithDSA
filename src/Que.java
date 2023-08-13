import java.util.LinkedList;
import java.util.Queue;
 //queue using LinkedList
public class Que{
    public static void main(String[] args){

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        //the alternative of offer() is add() fuction
        queue.add(7);
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.poll());
        //the alternative of poll() is remove() function
        System.out.println(queue);
        System.out.println(queue.peek());
        //the alternative of peek() is element() function
        //if queue is empty then the element() show exception error


    }
}

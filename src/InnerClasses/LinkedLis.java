package InnerClasses;

public class LinkedLis {
    private int size;
    private Node head;
    private Node tail;
    public void insertAtfi(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insertAtLa(int val){
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void display(){
        Node temp;
        temp=head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("end");
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String ag[]){
        LinkedLis list=new LinkedLis();
        list.insertAtfi(3);
        list.insertAtfi(4);
        list.insertAtfi(5);
        list.insertAtfi(6);
        list.insertAtfi(7);
        list.insertAtLa(8);
        list.display();

    }
}

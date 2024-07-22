package AbbhyashProgram;

public class DoublyLinkedList {
   Node head;
   Node tail;
   Node prev;
    int size;

    public DoublyLinkedList() {
        this.size = 0;
    }
    public  void insertFirst(int val){
        Node node=new Node(val);
        head=node;
        if (tail==null){
            tail=head;
        }
        size++;
    }
    public void display(){
        Node node=head;
        while (node!=null){
            System.out.println(node.value);
            node=node.next;
        }
    }
    class Node {
        Node next;
        int value;

        public Node(int val) {
            this.value = val;
        }

        public Node(Node node, int val) {
            this.next = node;
            this.value = val;
        }

        public Node() {
        }
    }
        public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.insertFirst(3);
            list.insertFirst(4);
            list.insertFirst(6);
            list.insertFirst(2);
            list.display();

        }
}

package AbbhyashProgram;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    public LinkedList() {
        this.size = 0;
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

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }
    }
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int val, int index) {
        if (index == 0) insertLast(val);
        if (index == size) insertLast(val);
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(temp.next, val);
        temp.next = node;
        size++;

    }
    public int deleteFirst() {
        int val = head.value;
        if (head == null) {
            tail = null;
        }
        head = head.next;
        size--;
        return val;
    }
    public int deleteLast() {
       if (size<=1){
           deleteFirst();
       }
       Node secondLast=getIndex(size-2);
       int val =tail.value;
       tail=secondLast;
       tail.next=null;
        size--;
        return val;
    }
    public int deletAnyIndex(int index) {
        if (index == 0) deleteFirst();
        if (index == size - 1) deleteLast();
        Node pre = getIndex(index - 1);
        int val = pre.next.value;
        pre.next = pre.next.next;
        return val;
    }
    public Node findNode(int val){
        Node node=head;
        while (node!=null){
            if (node.value==val){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public Node getIndex(int index){
        Node node=head;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(8);
      /*  list.insertLast(8);
        list.insert(10, 2);*/
        //list.deleteFirst();
        //list.deleteLast();
        list.deletAnyIndex(1);
        System.out.println(list.findNode(3));

        list.display();


    }
}

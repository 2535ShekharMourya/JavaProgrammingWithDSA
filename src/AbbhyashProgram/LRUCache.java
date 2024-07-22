package AbbhyashProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LRUCache {
    Node head = new Node(0, 0), tail = new Node(0, 0);
    Map<Integer, Node> map = new HashMap();
    static int capacity;

    public LRUCache(int _capacity) { // Set Capacity of LRU cache
        capacity = _capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) { // get value mapping with key
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) { // put key-values pairs into the LRU cache
        if (map.containsKey(key)) {
            remove(map.get(key));
        }
        if (map.size() == capacity) {
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    private void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node) {
        map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    class Node {
        Node prev, next;
        int key, value;

        Node(int _key, int _value) {
            key = _key;
            value = _value;
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // Number of Test Cases
        int T=s.nextInt();
        while (T>0) {
            T--;
            int n = s.nextInt();
            capacity = n;
            LRUCache obj = new LRUCache(capacity);
            for (int i = 1; i <= capacity; i++) {
                int value = i + 1;
                obj.put(i, value);
            }
            for (int i = 1; i <= capacity; i++) {
                int myvalue = obj.get(i);
                System.out.println("key "+i+" "+"value "+myvalue);
            }
        }
    }
}

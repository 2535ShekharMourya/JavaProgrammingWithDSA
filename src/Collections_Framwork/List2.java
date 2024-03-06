package Collections_Framwork;

import java.util.LinkedList;
import java.util.List;
//list using Linkedlist
public class List2{
    public static void main(String[] args){
        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.add(6);
        System.out.println(list);
        //add a element in between
        list.add(1,38);
        System.out.println(list);
        List<Integer> newlist = new LinkedList<>();
        newlist.add(20);
        newlist.add(21);
        list.addAll(newlist);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.remove(1));
        System.out.println(list);
        list.remove(Integer.valueOf(20));
        System.out.println(list);
        list.set(2,399);
        System.out.println(list);
      //  list.clear();
     System.out.println (list.contains(6));
     System.out.println (list.contains(545
     ));

        

    }
}
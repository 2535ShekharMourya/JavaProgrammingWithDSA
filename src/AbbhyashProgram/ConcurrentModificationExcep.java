package AbbhyashProgram;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationExcep {
    public static void main(String[] args) {
        List<String>list=new CopyOnWriteArrayList<>();
        // add element to the list
        list.add("shekhar");
        list.add("azad");
        list.add("shubham");
        list.add("shiv");


        // Create a thread to modify the HashMap while iterating
        Thread modifyThread=new Thread(()->{
            Iterator<String>iterator=list.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
                // add one value in list
                list.add("shipra");
                list.add("sobhit");

            }
        }
        );
        // Start  modify thread
        modifyThread.start();;
        try {
            modifyThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(list.size());


    }
}

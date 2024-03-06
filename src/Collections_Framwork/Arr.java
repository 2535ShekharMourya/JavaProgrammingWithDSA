package Collections_Framwork;

import java.util.ArrayList;
import java.util.Collections;
 class Arr{
    public static void main(String[] args){
       // ArrayList<Integer> list = new ArrayList<Integer>();
ArrayList<Double> list = new ArrayList<Double>();
      //  ArrayList<Boolean> list3 = new ArrayList<Boolean>();
      //use add function 
      list.add(3.22);
      list.add(3.23);
      list.add(3.24);
      System.out.println(list);
      //Get an element
      double element = list.get(1);
      System.out.println(element);
      //adding element in between 
      list.add(1, 8.4);
      System.out.println(list);
      //set element or change element at particular index 
      list.set(1,3.48);
      System.out.println(list);
      //delet element or remove a element at amy index
      list.remove(3);
      System.out.println(list);
      // size 
      int size = list.size();
      System.out.println(size);
      //loops on Arraylist 
      for(int i=0; i<list.size(); i++){
          System.out.println(list.get(i));
      }
      System.out.println();
      //sorting
      Collections.sort(list);
      System.out.println(list);
      

    }
}
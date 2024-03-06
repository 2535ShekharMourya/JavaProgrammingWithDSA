package JavaNotesPrograms;
import java.util.*;
class Box{
    // Problem with Object type: Store all type values but don't provide  type safety
    // Solution is Generics: Store all type values and also provide type safety means if Integer then all values is integer,float then all float
    // problem solve on compile time only
    Object Container;
    String Name;
    public Box(Object container){
        this.Container=container;
    }
    public Object getValue(){
        return this.Container;
    }
}
// Generics
class NewBox<T>{
    T Container;
    public NewBox(T container){
        this.Container=container;
    }
    public void PerformTask(){
        if (Container instanceof String){
            System.out.println("length of String  "+Container +" is "+(((String) this.Container).length()));
        } else if (Container instanceof Integer) {
            System.out.println("this is a integer value "+Container);

        }
    }
    public T getValue(){  // public Object getValue(){} is also right syntax
        return this.Container;
    }

}
public class Generics {

    public static void main(String ag[]){
        List<String>list=new ArrayList<>();
        list.add("azad");
        list.add("shekhar");
       // list.add(23);
        //list.add(23.3);
        //list.add(true);

        List anotherList=new ArrayList();
        anotherList.add(12);
        anotherList.add("azad1");
        anotherList.add(12.3);
        anotherList.add('a');
        anotherList.add(true);
        System.out.println(list);
        System.out.println(anotherList);
        System.out.println();

        Box box=new Box("My name is Azad");
        System.out.println(box.getValue());
        box.Container=123;
        System.out.println(box.getValue());
        box.Container=123.4;
        System.out.println(box.getValue());
        box.Name="shekhar";
        System.out.println(box.Name);
        System.out.println();
      //  box.Name=123;  error
     //   box.Name=123.9; error

        NewBox<String>newbox=new NewBox<>("hellow bro");
        newbox.Container="hellow bhai";
      //  newbox.Container=String.valueOf(1223);
        newbox.PerformTask();
       // newbox.Container=24; error
       // newbox.Container=23.4; error
        System.out.println(newbox.getValue());
        System.out.println(newbox.Container.getClass().getTypeName());
        NewBox<Integer>newBox2=new NewBox<>(13);
       // NewBox<Integer>newBox3=new NewBox<>("I am Azad"); error
        System.out.println(newBox2.getValue());
        System.out.println(newBox2.Container.getClass().getTypeName());
        NewBox<Double>box1=new NewBox<>(13.4);
        NewBox<Boolean>box2=new NewBox<>(false);
        NewBox<Float>box3=new NewBox<>(1.2f);
      //  NewBox<Box>box4=new NewBox<>("sh"); error but i don't know






    }
}

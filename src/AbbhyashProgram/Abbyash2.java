package AbbhyashProgram;

import java.util.*;
class Fruit{
    String test;
    String color;
    String name;

    public Fruit(String test, String color, String name) {
        this.test = test;
        this.color = color;
        this.name = name;
    }

    public Fruit(String test, String color) {
        this.test = test;
        this.color = color;
    }

    public Fruit(String test) {
        this.test = test;
    }
}
class appele extends Fruit{

    public appele(String test, String color, String name) {
        super(test, color, name);
    }

    public appele(String test, String color) {
        super(test, color);
    }

    public appele(String test) {
        super(test);
    }
}
public class Abbyash2 {
    public static void main(String[] args) {
        Fruit obj=new Fruit("sweet","Red");
        System.out.println(obj.color+" "+ obj.test);
        changeFruit(obj);
        System.out.println(obj.color+" "+ obj.test);
         Fruit obj2=new appele("apple");


    }

    private static void changeFruit(Fruit obj) {
        obj.test="little sweet";
        obj.color="yellow";
    }
}




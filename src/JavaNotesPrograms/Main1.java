package JavaNotesPrograms;

import JavaNotesPrograms.StudentGS;

public class Main1 {
    public static void main(String args[]){
        StudentGS s1=new StudentGS();
      /*
       1. you can't access directly in another class because StudentGS class member is private
       s1.name="shekhar";
        s1.Rollnumber=-1;

       */
        s1.setName("azad");
        s1.setRollnumber(209);
     //   s1.display();
        System.out.println( s1.getName());
        System.out.println(s1.getRollnumber());
    }

}

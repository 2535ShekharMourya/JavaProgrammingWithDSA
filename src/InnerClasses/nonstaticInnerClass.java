package InnerClasses;

public class nonstaticInnerClass {
    int a=20;
    private int b=20;
    static int c=20;
    // simple member inner class
    class inner3{
        // can access static , non-static ,private and all variables of outer class
   public void dosum(){
       System.out.println("the sum is  "+ (a+b+c));
   }

    }
    public static void main(String ag[]){
        /*
        1. outer class ka her object inner class ke sath associated hoga
         */
        nonstaticInnerClass obj1=new nonstaticInnerClass();// 1st method
        nonstaticInnerClass.inner3 obj2=obj1.new inner3();

        nonstaticInnerClass.inner3 obj3=new nonstaticInnerClass().new inner3(); // 2nd method
        obj3.dosum();
        obj2.dosum();
    }
}

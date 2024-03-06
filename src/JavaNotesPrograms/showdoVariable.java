package JavaNotesPrograms;

public class showdoVariable {
    static int x=20;
    public static void main(String[] args) {
        System.out.println(x);
        int x=30;
        System.out.println(x);
        fun();

    }
    public static void fun(){
        System.out.println(x);
    }

}

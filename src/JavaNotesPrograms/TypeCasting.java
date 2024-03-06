package JavaNotesPrograms;

public class TypeCasting {
    public static void main(String args[]){
        // implicit typeCasting : by compiler Ex below
        int character='a';
        System.out.println(character);

        // explicit typeCasting : by programmer itself Ex below
         int number1=10;
        byte number2= (byte) number1;
        System.out.println(number2);

        // Assignment Operator :
        int num1=19; // simple
        int a,b,c,d; // chained
        a=b=c=d=20;
        System.out.println(a+" "+b+" "+c+" "+d);
        int num2,num3,num4;
        int num5=num2=num3=num4=30;
        System.out.println(num5+" "+num4+" "+num3+" "+num2);
      //  int number=number3=number4=number5=40; //error : cannot resolve symbol number3,4,5 so we can't do this during declaration time
        int comp=20; // compound assignment
        comp+=comp;
        System.out.println(comp);
        byte p1=10;
        p1= (byte) (p1+1);
        p1+=1;
        System.out.println(p1);
        p1++;
        System.out.println(p1);

        // turnary operator
        int x=(10<20)? 40:50;
        int x1=(20<10)?100:200;
        System.out.println(x1);
        System.out.println(x);

        // Operator precedence
        System.out.println(1+2*3/4+5*6);

        // instance operator

        // final
        int case1=10;
       final int case2=20;
        switch (case2){
            case 10 :
                System.out.println("sai hai");
                break;
            case case2: // case case2 error : only define constant
                System.out.println("or bhai");
                break;
            default:
                System.out.println("nothing");
        }

        // loop
        /*
        1. break uses only 3 place inside switch , inside loops , one more yaad ni a raha
        2. continue  only use in loops
         */
        int i=0;
        for (System.out.println("namaste");i<3;i++){
            System.out.println("Namaste");
        }
        for (System.out.println("india");i<6;){
            System.out.println("सच्चाई की जीत तो होनी ही थी ");
            i++;
        }

        // iterator vs iterable
        byte arr[]={1,2,3,4,5};
        for(byte items:arr){ //iterable
            System.out.println(items);
        }

    }
}

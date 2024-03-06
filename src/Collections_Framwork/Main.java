package Collections_Framwork;

import JavaNotesPrograms.StudentGS;

public class Main {
   public static void main(String args[]) {
     //  System.out.println(fibo(3));
       StudentGS s2=new StudentGS();
       s2.age=23;
     String st="kayfak";
     boolean flage=true;
     for(int i=0;i<st.length()/2;i++){
         if(st.charAt(i)!=st.charAt(st.length()-i-1)){
             flage =false;
             break;
         }
     }
     if(flage){
         System.out.println("palindrome");
     }else {
         System.out.println("not a palindrome");
     }
   }

  /*  private static int  fibo(int i) {
       if (i<2){
           return i;
       }
      return fibo(i-1)+fibo(i-2);
    }

   */


}
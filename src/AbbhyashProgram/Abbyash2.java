package AbbhyashProgram;

import java.util.*;


public class Abbyash2 {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int T=s.nextInt();
      while (T>0){
          T--;
          int n=s.nextInt();
          int m=s.nextInt();
          int num1=n;
          int num2=m;
          String st=String.valueOf(n);
          int len=st.length();
          int result=0;
          while (n>0){
              int rem=n%10;
              result+=Math.pow(rem,len);
              n/=10;

          }
          if(result==num){
              System.out.println("sai hai");
          }else {
              System.out.println("wrong");
          }
      }

    }
}





package Collections_Framwork;

public class Main3 {
    public static void main(String args[]) {
        String st="the sky is blue";
        System.out.println(st.substring(0,3));
        System.out.println( Revers(st));
    }

    private static String  Revers(String st) {

        int n=st.length();
        int i=0;
        while (i<n){
            while ((i < n) && st.charAt(i)==' '){
                i++;
            }
           int j=i+1;
            while (j<n && st.charAt(j)!=' '){
                j++;
            }
            String sub=st.substring(i,j);
            st=st.replace(sub,"");
            i=j+1;
            n=n-i;

        }
        return st;

    }
}

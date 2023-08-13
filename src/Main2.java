import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.Integer.sum;

public class Main2 {
    public static void main(String args[]) {
        System.out.println(Fibo(7));
    }

    private static int Fibo(int i) {
        if(i<2){
            return i;
        }
        return Fibo(i-1)+Fibo(i-2);
    }


}

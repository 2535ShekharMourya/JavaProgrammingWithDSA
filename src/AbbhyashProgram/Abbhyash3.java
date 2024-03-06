package AbbhyashProgram;


import java.util.Arrays;
import java.util.SplittableRandom;
import java.util.Stack;

public class Abbhyash3 {
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7};
    int k=3;
    leftRotat(arr,k);
    }

    private static void leftRotat(int[] arr, int k) {
        k=k%arr.length;
        int temp[]=new int[k];
        for (int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for (int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }

        for (int i=arr.length-k;i<arr.length;i++){
            arr[i]=temp[i-(arr.length-k)];

        }
        System.out.println(Arrays.toString(arr));
    }
}



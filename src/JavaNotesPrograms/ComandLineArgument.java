package JavaNotesPrograms;

public class ComandLineArgument {
    public static void main(String args[]){
        System.out.println(args.length);
        int arr[]=new int[0];// empty array with length 0 it is good instead of null array
        // when you do not have any idea how many elements store this array in future
        System.out.println(arr.length);
    }
}

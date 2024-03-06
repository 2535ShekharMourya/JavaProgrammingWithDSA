package Testing_JUnit;
class student{
    String name;
    int age;
    String gender;
}
public class Calculation {
    // find max in array
    public static int findMax(int arr[]) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
   // Binary search on array
    public static int findTarget(int []arr){
        int target=23;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target>arr[mid])start=mid+1;
            else if (target<arr[mid])end=mid-1;
            else return arr[mid];
        }
        return -1;
    }

    // try again : error
    /*public static student findObj(student s1){
        student s=new student();
        s.name="azad";
        s.age=23;
        s.gender="male";
        return s;
    }*/

}

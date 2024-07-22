package TwoPointerAndSlidingWindow;

public class SlidingWindowProblems {
    public static void main(String[] args) {
        int arr1[]={2,3,1,2,4,3};
        int res1=findMaxWindowLength(arr1,7);
    }
    private static int findMaxWindowLength(int[] arr1, int target) {
        int R=0,L=0,sum=0;
        int maxLen=Integer.MIN_VALUE;
        while (L<=R){
            while (arr1[R]<=target){
                sum+=arr1[R];
                R++;
            }


        }
        return 0;
    }
}

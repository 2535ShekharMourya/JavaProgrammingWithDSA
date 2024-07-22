package TwoPointerAndSlidingWindow;

import java.util.*;

public class TwoSum {
    public static void main(String ag[]){
        // Problem1: 2 Sum
        int arr[] = {2, 6, 5, 8, 11};
        int target = 16;
        boolean ans = TwoSum.BruteTwoSumVarient1(arr, target);// Tc=O(n^2),Sc=O(1)
        System.out.println(ans);
        int ans2[] = TwoSum.BruteTwoSumVarient2(arr, target); // Tc=O(n^2),Sc=O(1)
        System.out.println(Arrays.toString(ans2));
        System.out.println();
        boolean ans3= TwoSum.BetterTwoSumV1(arr,target);// Tc=O(nlogn) or O(n) or O(n^2) depend on which type map and Sc=O(n)
        System.out.println(ans3);
        int ans4[]= TwoSum.BetterTwoSumV2(arr,target);//Tc=O(nlogn) or O(n) or O(n^2) depend on which type map and Sc=O(n)
        System.out.println(Arrays.toString(ans4));
        System.out.println();
        boolean ans5= TwoSum.OptimalTwoSumV1(arr,target);//Tc=O(n)+O(nlogn) and Sc=O(1)
        System.out.println(ans5);
    }
    // 2 Sum Brute solution using two for loops
    public static boolean BruteTwoSumVarient1(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
          /*  for (int j=0;j<n;j++){
                if (i==j){
                    continue;
                }

           */
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] BruteTwoSumVarient2(int[] arr, int target) {
        int n=arr.length;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
    // 2 Sum Better solution using hashing
    public static boolean BetterTwoSumV1(int[] arr, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int moreNeeded = target - num;
            if (map.containsKey(moreNeeded)) {
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
        }

    public static int[] BetterTwoSumV2(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int moreNeeded = target - num;
            if (map.containsKey(moreNeeded)) {
                ans[0]=map.get(moreNeeded);
                ans[1]=i;
                return ans;
            }
            map.put(arr[i], i);
        }
        return ans;
    }
// 2 Sum optimal solution using 2 pointer approach
    public static boolean OptimalTwoSumV1(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        Arrays.sort(arr);
        while (start<end){
            if (arr[start]+arr[end]==target){
                return true;
            } else if (arr[start]+arr[end]>target) {
                end--;

            }else {
               start++;
            }
        }
        return false;
    }


}







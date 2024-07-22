package AbbhyashProgram;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargest {
        public static int findKthLargest(int[] nums, int k) {
            // Initialize an empty list
            PriorityQueue<Integer> kNumbersMinHeap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);

            // Add first k elements to the list
            for (int i = 0; i < k; i++) {
                kNumbersMinHeap.add(nums[i]);
            }

            // Loop through the remaining elements in the 'nums' array
            for (int i = k; i < nums.length; i++) {
                // Compare the current element with the minimum
                // element (root) of the min-heap
                if (nums[i] > kNumbersMinHeap.peek()) {
                    // Remove the smallest element
                    kNumbersMinHeap.poll();
                    // Add the current element
                    kNumbersMinHeap.add(nums[i]);
                }
            }

            // The root of the heap has the Kth largest element
            return kNumbersMinHeap.peek();
        }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Tests");
        int T=s.nextInt();
        // [3,2,1,5,6,4], k = 2
        // [3,2,1,5,6,4], k = 2
        while (T>0){
            System.out.println("k value");
            int k=s.nextInt();
            int nums[]=new int[6];
            System.out.println("my Array");
            for (int i=0;i<nums.length;i++){
                nums[i]=s.nextInt();
            }
            int ans=findKthLargest(nums,k);
            System.out.println(ans);

        }
    }
    }


package AbbhyashProgram;

import java.util.Scanner;

public class MostWater {
    public static int trapWater(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int waterTrapped = 0;
        int leftMax = 0;
        int rightMax = 0;

        while (left <= right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    waterTrapped += leftMax - height[left];
                }
                left++;

            }//if ends
            else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    waterTrapped += rightMax - height[right];
                }
                right--;

            }
        }//while ends
        return waterTrapped;
    }//function ends

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T > 0) {
            T--;
            int nums[] = new int[6];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = s.nextInt();
            }
            int mostWater = trapWater(nums);
            System.out.println(mostWater);
        }

    }
}//class ends





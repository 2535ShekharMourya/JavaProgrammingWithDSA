package TwoPointerAndSlidingWindow;

import java.util.*;

public class ThreeSum {
    public static void main(String ag[]) {
        // problem 2. 3 Sum
        int[] arr1 = { -1, 0, 1, 2, -1, -4};
        int n = arr1.length;
        List<List<Integer>> ans6 = Brutetriplet(n, arr1);//Tc=O(n^3logn), Sc=O(n) for taking set
        for (List<Integer> it : ans6) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
    // 3 sum brute solution k
    public static List<List<Integer>> Brutetriplet(int n, int[] arr) {
        Set<List<Integer>> st = new HashSet<>();// take O(n) space

        // check all possible triplets:
        for (int i = 0; i < n; i++) {  // take O(n^3) time
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);// for sort elements in ascending order (arr1[i],arr1[j],arr1[k])
                        st.add(temp);// take log(n) time to insert into set
                    }
                }
            }
        }

        // store the set elements in the answer:
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    }




package AbbhyashProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Abbyash1 {
    public static void main(String[] args) {
       int array[][]={};
        Arrays.sort(array, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[a.length-1] - b[b.length-1];
            }
        });
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        /* // Flatten the 2D array to a 1D array
        int rows = array.length;
        int cols = array[0].length;
        int[] flatArray = new int[rows * cols];
        int index = 0;

        for (int[] row : array) {
            for (int element : row) {
                flatArray[index++] = element;
            }
        }

        // Sort the 1D array
        Arrays.sort(flatArray);

        // Convert back to a 2D array
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = flatArray[index++];
            }
        }

        // Print the sorted array
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }

        for (int i=0;i<array.length;i++){
            System.out.println(Arrays.toString(array[i]));
        }
        */
    }

     }






package _21_Linear_Search;

import java.util.Arrays;

public class _04_Search_in_2D_arrays {

    public static void main(String[] args) {

        // 2D array → collection of multiple 1D arrays (rows)
        int[][] arr = {

                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 12 }
        };

        // Element we want to find
        int target = 34;

        // Calling search() method
        // It returns the row and column of target
        int[] ans = search(arr, target);

        // Printing the returned row and column
        // Output: [2, 2]
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {

        // Loop through each row
        for (int row = 0; row < arr.length; row++) {

            // Loop through each element of the current row
            // arr[row].length → length of that particular row
            for (int col = 0; col < arr[row].length; col++) {

                // Check whether current element is equal to target
                if (arr[row][col] == target) {

                    // Target found → return its row and column
                    return new int[] { row, col };
                }
            }
        }

        // Target not found → return [-1, -1]
        return new int[] { -1, -1 };
    }
}
package ch01.sec08;

import java.util.Arrays;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        int[][] square = {
                { 16, 3, 2, 13 },
                { 3, 10, 11, 8 },
                { 9, 6, 7, 12 },
                { 4, 15, 14, 1}
            };
        
        // Swap two rows
        // To access an element, use two bracket pairs:
        int elements = square[1][2]; // Setselementto11
        
        // You can even swap rows:
        int[] temp = square[0];
        square[0] = square[1];
        square[1] = temp;
        System.out.println(Arrays.deepToString(square));
        
        int n = 5;
        // construct an array of n rows:
        int[][] triangle = new int[n][];
        // Then construct each row in a loop and fill it.
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        // To traverse a two-dimensional array, you need two loops, one for the rows and one for the columns:
        for (int r = 0; r < triangle.length; r++) {
            for (int c = 0; c < triangle[r].length; c++) {
                System.out.printf("%4d", triangle[r][c]);
            }
            System.out.println();
        }
        // You can also use two enhanced for loops:
        for (int[] row : triangle) {
            for (int element : row) {
               System.out.printf("%4d", element);
            }
            System.out.println();
        }
    }
}

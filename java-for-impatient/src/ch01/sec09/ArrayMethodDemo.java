package ch01.sec09;

import java.util.Arrays;

public class ArrayMethodDemo {
	// This method swaps two elements in an array:
    public static void swap(int[] values, int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }
    // This method returns an array consisting of the first and last values of a given array (which is not modified):
    public static int[] firstLast(int[] values) {
        if (values.length == 0) return new int[0]; // return imprime el resultado
        else return new int[] { values[0], values[values.length - 1] };
    }
    
    public static void main(String[] args) {
        int[] fibs = { 1, 1, 2, 3, 5, 8, 11, 13 };
        swap(fibs, 2, fibs.length - 2);
        System.out.println(Arrays.toString(fibs));
        System.out.println(Arrays.toString(firstLast(fibs)));        
    }
}
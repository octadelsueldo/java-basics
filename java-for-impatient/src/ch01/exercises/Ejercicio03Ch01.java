package ch01.exercises;

/*
 * Using only the conditional operator, write a program that reads three integers and prints 
 * the largest. 
 * 
 * Repeat with Math.max.
 * 
 */
public class Ejercicio03Ch01 {

	public static void main(String[] args) {
        printLargest(2, 1, 0);
        printLargestMax(2, 1, 0);
    }

    public static void printLargest(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println(max);
    }

    public static void printLargestMax(int a, int b, int c) {
        int max = a;
        max = Math.max(max, b);
        max = Math.max(max, c);

        System.out.println(max);
    }

}
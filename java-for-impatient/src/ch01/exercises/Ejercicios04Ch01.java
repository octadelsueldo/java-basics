package ch01.exercises;

/*
 * 
 * Write a program that prints the smallest and largest positive double values. 
 * 
 * Hint: Look up Math.nextUp in the Java API.
 */

public class Ejercicios04Ch01 {

	public static void main(String[] args) {
        printExtremeDoubles();
    }

    public static void printExtremeDoubles() {
    	// Math.nextUp imprime el mas grande
        System.out.println(Math.nextUp(0.0d));
        
        // Math.nextDown imprime el mas grande
        System.out.println(Math.nextDown(Double.POSITIVE_INFINITY));
    }
}
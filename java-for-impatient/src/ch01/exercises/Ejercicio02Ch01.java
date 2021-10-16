package ch01.exercises;

/*
 * Write a program that reads an integer angle (which may be positive or negative) and normalizes it
 *  to a value between 0 and 359 degrees. Try it first with the % operator, then with floorMod.
 * 
 */

public class Ejercicio02Ch01 {

	public static void main(String[] args) {
		// probamos los resultados con 1200 y -1300
	      System.out.println(normalize359(1200));
	        System.out.println(normalize359(-1300));
	        System.out.println(normalize359floorMod(1200));
	        System.out.println(normalize359floorMod(-1300));
	    }

	    private static int normalize359 (int integer) {
	    	// normalizamos con %
	        if (integer < 0) {
	            integer = integer / -1;
	        }
	        while (integer > 359) {
	            integer %= 359;
	        }
	        return integer;
	    }

	    private static int normalize359floorMod (int integer) {
	    	// normalizamos con Math.floorMod
	        if (integer < 0) {
	            integer = integer / -1;
	        }
	        integer = Math.abs(Math.floorMod(integer, 359));
	        return integer;
	    }
	}
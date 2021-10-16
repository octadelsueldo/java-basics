package ch01.exercises;

/*
 * 
 *  Write a program that produces a random string of letters and digits by generating a random long 
 *  value and printing it in base 36.
 */


import java.util.Random;



public class Ejercicio10Ch01 {

	public static void main(String[] args) {
        printBase36();
    }

    public static void printBase36() {
        long r = new Random(1L).nextLong();

        System.out.println(Long.toString(r, 36));
    }
}
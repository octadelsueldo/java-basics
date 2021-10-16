package ch01.exercises;

/*
 * Write a program that computes the factorial n! = 1 × 2 × ... × n, using BigInteger. 
 * Compute the factorial of 1000.
 * 
 */


import java.math.BigInteger;


public class Ejercicio06Ch01 {

	public static void main(String[] args) {
        System.out.println(factorial(BigInteger.valueOf(1000)));
    }

    public static BigInteger factorial(BigInteger n) {
        BigInteger res = BigInteger.ONE;
        while (n.compareTo(BigInteger.ONE) != 0) {

            res = res.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }

        return res;
    }
}
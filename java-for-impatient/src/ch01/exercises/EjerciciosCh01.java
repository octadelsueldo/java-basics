package ch01.exercises;

import java.util.Scanner;
/*
 * Ejercicio 01
 * Write a program that reads an integer and prints it in binary, octal, and hexadecimal. 
 * Print the reciprocal as a hexadecimal floating-point number.
 * 
 */
public class EjerciciosCh01 {

	public static void main(String[] args) {
        var in = new Scanner(System.in);
        
        // definimos la variable value como integer
        var value = in.nextInt();
        
        // imprimeme la variable value como string binario
        System.out.printf("Binary: %s\n", Integer.toBinaryString(value));
        
        // imprimeme la variable como octal
        System.out.printf("Octal: %o\n", value);
        
        // imprimimela como numero hexadecimal
        System.out.printf("Hexadecimal: %x\n", value);
        
        // definimos el reciprocal
        var reciprocal = 1.0 / value;
        
        // imprimimos la variable con mensaje de hexadecimal
        System.out.printf("Hexadecimal floating point: %a\n", reciprocal);
    }
}
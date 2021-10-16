package ch01.exercises;


// Write a program that reads a string and prints all of its nonempty substrings.
public class Ejercicio08Ch01 {

	public static void main(String[] args) {
        printString("Hello World");
    }

    public static void printString(String s) {
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current != ' ') {
                System.out.println(s.charAt(i));
            }
        }
    }
}
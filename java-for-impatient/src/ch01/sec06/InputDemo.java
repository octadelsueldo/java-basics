package ch01.sec06;

// To read strings and numbers, construct a Scanner that is attached to System.in
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine(); // Here, it makes sense to use the nextLine method because the input might contain spaces
        System.out.println("How old are you?"); 
        if (in.hasNextInt()) { // to check that there is another line, word, integer, or floating-point number available
            int age = in.nextInt(); // To read an integer, use the nextInt method
            System.out.printf("Hello, %s. Next year, you'll be %d.\n", name, age + 1); // printf especifica cuantos espacios tendra cuando seteamos %. Each of the format specifiers that start with a % character is replaced with the corresponding argument. The conversion character that ends a format specifier indicates the type of the value to be formatted: f is a floating-point number, s a string, and d a decimal integer
        } else {
            System.out.printf("Hello, %s. Are you too young to enter an integer?", name);
        }
    }
}

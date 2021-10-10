package ch01.sec01;

// importamos el paquete Random
import java.util.Random;

// definimos nuestra clase
public class Metodos {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!".length());
        System.out.println(new Random().nextInt());

        //If you want to invoke more than one method on an object, store it in a variable
        Random generator = new Random();
        System.out.println(generator.nextInt());
        System.out.println(generator.nextInt());
    }
}
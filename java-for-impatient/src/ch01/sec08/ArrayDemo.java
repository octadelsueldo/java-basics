package ch01.sec08;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] names = new String[10]; // Now names refers to an array with 10 elements, which you can access as
         // names[0] ... names[9]
        for (int i = 0; i < names.length / 2; i++) { // names.length sirve para ver la longitud del array
            names[i] = ""; // this loop fills the array with empty strings:
        }
        names[0] = "Fred";
        names[1] = names[0];
        System.out.println("names="+Arrays.toString(names));
        
        int[] primes = { 17, 19, 23, 29, 31 };
        primes = new int[] { 2, 3, 5, 7, 11, 13 }; // Use a similar initialization syntax if you don't want to give the array a name—for example, to assign it to an existing array variable:
        
        // Enhanced for loop
        int sum = 0;
        for (int n : primes) {
            sum += n;
        }
        
        System.out.println("sum=" +sum);
        
        // Aliasing and copying
        int[] numbers = primes;
        numbers[5] = 42; // Also changes primes
        System.out.println("primes=" + Arrays.toString(primes));
        
        primes[5] = 13;
        int[] copiedPrimes = Arrays.copyOf(primes, primes.length);
        copiedPrimes[5] = 31; // Doesn't change primes
        System.out.println("primes=" + Arrays.toString(primes));
        System.out.println("copiedPrimes=" + Arrays.toString(copiedPrimes));
    }
}

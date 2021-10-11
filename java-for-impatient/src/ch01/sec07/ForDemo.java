package ch01.sec07;

import java.util.*;

// This loop computes the sum of a fixed number of random values:
public class ForDemo {
   public static void main(String[] args) {
      Random generator = new Random();      
      int count = 20;
      int sum = 0;
      for (int i = 1; i <= count; i++) {
    	  // This loop runs 20 times, with i set to 1, 2, ..., 20 in each loop iteration.
         int next = generator.nextInt(10);
         sum = sum + next;         
      }
      System.out.println("After " + count 
         + " iterations, the sum is " + sum);
   }
}

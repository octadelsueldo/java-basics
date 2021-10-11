package ch01.sec07;

// In the following sections, you will see how to implement branches and loops.
import java.util.*;

public class DoDemo {
   public static void main(String[] args) {
      Random generator = new Random();      
      int target = 5;
      int count = 1;
      int next;
      // Sometimes, you need to execute the loop body before you can evaluate the condition. 
      // Suppose you want to find out how long it takes to get a particular value. 
      // Before you can test that condition, you need to enter the loop and get the value.
      do {
         next = generator.nextInt(10);
         count++;
      } while (next != target);
         
      System.out.println("After " + count + " iterations, there was a values of " + target);
   }
}

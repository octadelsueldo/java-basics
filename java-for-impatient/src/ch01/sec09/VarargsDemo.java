package ch01.sec09;

public class VarargsDemo {
	// Let us define an average method that works the same way, so we can call average with as many arguments as we like
	
	// Declarea“varargs”parameterwith...after the type
    public static double average(double... values) {
    	
    	// When the method is called, an array is created and filled with the arguments. In the method body, you use it as you would any other array.
        double sum = 0;
        for (double v : values) sum += v;
        return values.length == 0 ? 0 : sum / values.length;
    }    
    
    public static double max(double first, double... rest) {
        double result = first;
        for (double v : rest) result = Math.max(v, result);
        return result;
    }
    
    public static void main(String[] args) {
        int n = 42;
        System.out.printf("%d\n", n);
        System.out.printf("%d %s\n", n, "widgets");
        
        // If you already have the arguments in an array, you don't have to unpack them. You can pass the array instead of the list of arguments:
        double[] scores = { 3, 4.5, 10, 0 };
        double avg = average(scores);
        System.out.println(avg);
        double largest = max(3, 4.5, 10, 0);
        System.out.println(largest);
            // average() returns 0, but max() doesn't compile
    }
}
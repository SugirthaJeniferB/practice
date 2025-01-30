public class FibonacciBottomUp {
 public int fib(int n) {
 // Base cases
 if (n == 0) return 0;
 if (n == 1) return 1;

 // Create an array to store Fibonacci numbers
 int[] fib = new int[n + 1];
 fib[0] = 0;
 fib[1] = 1;

 // Build the Fibonacci sequence iteratively
 for (int i = 2; i <= n; i++) {
 fib[i] = fib[i - 1] + fib[i - 2];
 }

 return fib[n];
 }

 public static void main(String[] args) {
 FibonacciBottomUp fibonacci = new FibonacciBottomUp();
 
int n = 10; // Example input

 System.out.println("Fibonacci number at position " + n + " is: " + fibonacci.fib(n));
 }
}
import java.util.HashMap;

public class FibonacciTopDown {
private HashMap<Integer, Integer> memo = new HashMap<>();

 public int fib(int n) {
 // Base cases
 if (n == 0) return 0;
 if (n == 1) return 1;

 // Check if the result is already in the memo
 if (memo.containsKey(n)) {
 return memo.get(n);
 }
 
 // Calculate the Fibonacci number and store it in the memo
 int result = fib(n - 1) + fib(n - 2);
 memo.put(n, result);
 return result; }

 public static void main(String[] args) {
 FibonacciTopDown fibonacci = new FibonacciTopDown();
 int n = 10; // Example input
 System.out.println("Fibonacci number at position " + n + " is: " + fibonacci.fib(n));
 }
}
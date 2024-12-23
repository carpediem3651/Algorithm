package RecursiveAndForLoop;

public class Fibonacci {
    public static int fibonacciRecursive(int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacciRecursive((n-1)+fibonacciRecursive((n-2));
    }

    public static int fibonacciForLoop(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
}

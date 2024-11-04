package RecursiveAndForLoop;

public class Sum {
    public static int sumForLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumRecursive(n - 1);
    }
}

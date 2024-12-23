package RecursiveAndForLoop;

public class SumArray {
    public static int sumArrayRecursive(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + sumArrayRecursive(arr, n - 1);
    }

    public static int summArrayForLoop(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

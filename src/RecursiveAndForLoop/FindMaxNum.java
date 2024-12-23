package RecursiveAndForLoop;

public class FindMaxNum {
    public static int findMaxRecursive(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], findMaxRecursive(arr, n - 1));
    }
    public static int findMaxForLoop(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

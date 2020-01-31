package DP;

public class MatrixChainMultiplication {
    public static int MatrixChainOrder(int[] p, int i, int j) {
        if (i == j) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int count = MatrixChainOrder(p, i, k) + MatrixChainOrder(p, k + 1, j) + p[i - 1] * p[k] * p[j];
            if (count < min) {
                min = count;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] test = new int[]{10, 20, 30, 40, 30};
        int n = test.length;
        System.out.println(MatrixChainOrder(test, 1, n - 1));
    }
}

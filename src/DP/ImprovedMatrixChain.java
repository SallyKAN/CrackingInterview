public class ImprovedMatrixChain {
    public static int MatrixChainMultiplication(int[] p, int n) {
        int[][] m = new int[n][n];
        int i, L, j, k, q;
        for (L = 2; L < n; L++) {
            for (i = 1; i < n - L + 1; i++) {
                j = i + L - 1;
                if (j == n) continue;
                m[i][j] = Integer.MAX_VALUE;
                for (k = i; k < j; k++) {
                    q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < m[i][j]) {
                        m[i][j] = q;
                    }
                }
            }
        }
        return m[1][n - 1];
    }

    public static void main(String[] args) {
        int[] test = new int[]{10, 20, 30, 40, 30};
        int n = test.length;
        System.out.println(MatrixChainMultiplication(test, n));
    }
}


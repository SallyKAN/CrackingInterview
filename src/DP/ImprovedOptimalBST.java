package DP;

public class ImprovedOptimalBST {

    public static int OptCost(int[] keys, int[] freq, int n) {
        int[][] cost = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            cost[i][i] = freq[i];
        }
        for (int L = 2; L <= n; L++) {
            for (int i = 0; i <= n - L + 1; i++) {
                int j = i + L - 1;
                cost[i][j] = Integer.MAX_VALUE;
                for (int r = i; r <= j; r++) {
                    int c = ((r < i) ? cost[i][r - 1] : 0) + ((r < j) ? cost[r + 1][j] : 0) + sum(freq, i, j);
                    if (c < cost[i][j]) {
                        cost[i][j] = c;
                    }
                }

            }
        }
        return cost[0][n-1];
    }

    public static int sum(int[] freq, int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            if (k>freq.length){
                continue;
            }
            sum += freq[k];
        }
        return sum;
    }
}

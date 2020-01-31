package DP;

public class OptimalBST {
    public static int OptCost(int[] costs, int i, int j) {
        if (j < i) {
            return 0;
        }
        if (i == j) {
            return costs[i];
        }
        int sum = sum(costs, i, j);
        int min = Integer.MAX_VALUE;
        for (int r = i; r <= j; ++r) {
            int cost = OptCost(costs, i, r - 1) + OptCost(costs, r + 1, j);
            if (cost < min) {
                min = cost;
            }
        }
        return sum + min;
    }

    public static int OptimalSearchTree(int[] keys, int[] costs, int n) {
        return OptCost(costs, 0, n - 1);
    }

    public static int sum(int[] costs, int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += costs[k];
        }
        return sum;
    }

    public static void main(String[] args) {
        int keys[] = {10, 12, 20};
        int freq[] = {34, 8, 50};
        int n = keys.length;
        System.out.println("Cost of Optimal BST is " +
                OptimalSearchTree(keys, freq, n));
    }

}

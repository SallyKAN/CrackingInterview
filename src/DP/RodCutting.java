package DP;

public class RodCutting {
    public static int naiveSolution(int[] price, int n) {
        if (n == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int revenue;
        for (int i = 0; i < n; i++) {
            revenue = price[i] + naiveSolution(price, n - i - 1);
            if (revenue > max)
                max = revenue;
        }
        return max;
    }

    public static int memorizedSolution(int[] price, int n, int[] res) {
        int revenue;
        if (res[n] >= 0)
            return res[n];
        if (n == 0)
            return 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            revenue = price[i] + memorizedSolution(price, n - i - 1, res);
            if (revenue > max)
                max = revenue;
        }
        res[n] = max;
        return max;
    }

    public static int bottomUpSolution(int[] prices, int n) {
        int[] res = new int[prices.length + 1];
        for (int i = 1; i < res.length; i++) {
            res[i] = Integer.MIN_VALUE;
        }
        res[0] = 0;
        for (int j = 1; j <= n; j++) {
            int revenue = Integer.MIN_VALUE;
            for (int i = 0; i < j; i++) {
                revenue = Math.max(revenue, prices[i] + res[j - i - 1]);
            }
            res[j] = revenue;
        }
        return res[n];
    }

    public static void main(String[] args) {
        long starttime = System.nanoTime();
        int[] prices = new int[]{1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
//        int[] res = new int[prices.length + 1];
//        for (int i = 0; i < res.length; i++) {
//            res[i] = Integer.MIN_VALUE;
//        }
        System.out.println(bottomUpSolution(prices, 10));
        long endtime = System.nanoTime();
        System.out.println("duration:" + (endtime - starttime) / 1000000);

    }
}

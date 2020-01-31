package DP;

public class StaircaseProblem {
    public static int countWays(int n) {
        int a, b, c;
        a = 1;
        b = 1;
        if (n <= 1) {
            return n;
        }
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        int s = 4;
        System.out.println("Number of ways = " + countWays(s));
    }
}

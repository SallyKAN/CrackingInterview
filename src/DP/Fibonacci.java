package DP;

public class Fibonacci {
    public static int OptCost1(int n) {
        if (n <= 1) {
            return n;
        } else {
            return OptCost1(n - 1) + OptCost1(n - 2);
        }
    }

    public static int OptCost2(int n) {
        int[] res = new int[n + 2];
        int i;
        res[0] = 0;
        res[1] = 1;
        for (i = 2; i <= n; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[n];
    }

    public static int OptCost3(int n) {
        int a, b, c;
        a = 0;
        b = 1;
        if (n == 0){
            return 0;
        }
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
//        long starttime = System.nanoTime();
//        System.out.println(OptCost1(40));
//        long endtime = System.nanoTime();
//        System.out.println("duration:" + (endtime - starttime) / 1000000);
//        long starttime2 = System.nanoTime();
//        System.out.println(OptCost2(40));
//        long endtime2 = System.nanoTime();
//        System.out.println("duration:" + (endtime2 - starttime2) / 1000000);
        int t = 75;
        for (;t!=0;t>>=1){
            System.out.println(t);
        }
    }
}

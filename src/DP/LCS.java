package DP;

public class LCS {
    public static int LCSLength(String X, String Y) {
        int m = X.length();
        int n = Y.length();
        int[][] c = new int[m + 1][n + 1];
        char[][] b = new char[m][n];
        for (int i = 0; i < m + 1; i++) {
            c[i][0] = 0;
        }
        for (int i = 0; i < n + 1; i++) {
            c[0][i] = 0;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (X.charAt(i) == Y.charAt(j)){
                    c[i+1][j+1] = c[i][j]+1;
                    b[i+1][j+1] = '\\';
                }else if (c[i][j+1] >= c[i][j-1]){
                    c[i][j] = c[i-1][j];
                    b[i][j] = '|';
                }else{
                    c[i][j] = c[i][j-1];
                    b[i][j] = '-';
                }
            }
        }
        return c[m][n];
    }

    public static void main(String[] args) {
        String x = "hellok";
        String y = "asdfghko";
        System.out.println(LCSLength(x,y));
//        System.out.println(x.indexOf(2));
    }
}

package ArraysAndMatrix;

public class MultiMatrix {
    public static int[][] solution(int[][] m1, int[][] m2) {
        int m = m1.length;
        int n = m2[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = 0;
                for (int k = 0; k < m1[0].length; k++) {
                    res[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int mat1[][] = {{1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};

        int mat2[][] = {{1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};
        int[][] res = solution(mat1, mat2);
        for (int i = 0; i < res.length; i++) {
            System.out.println();
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j]+" ");
            }
        }
    }
}

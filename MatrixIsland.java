package practice;

public class MatrixIsland {
    public static void main(String[] args) {
        int a[][] = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 1, 1}
        };
        int n = 5;
        int m = 5;
        System.out.println(findIsland(a, n, m));
    }

    public static int findIsland(int a[][], int n, int m) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 1) {
                    count++;
                    destroy(a, i, j, n, m);
                }
            }
        }
        return count;
    }

    public static void destroy(int a[][], int i, int j, int n, int m) {
        if (a[i][j] != 1) return;
        a[i][j] = 0;
        if (i + 1 < n) destroy(a, i + 1, j, n, m);
        if (i - 1 >= 0) destroy(a, i - 1, j, n, m);
        if (j - 1 >= 0) destroy(a, i, j - 1, n, m);
        if (j + 1 < m) destroy(a, i, j + 1, n, m);
    }
}

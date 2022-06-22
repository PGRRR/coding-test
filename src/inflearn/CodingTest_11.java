package inflearn;

public class CodingTest_11 {
    static int[][] ints = {
            {1,0,1,0,1,0},
            {1,1,1,1,1,1},
            {0,0,0,0,0,1},
            {1,1,1,1,1,1},
            {1,1,1,1,1,1}
    };
    static int n = 5;
    static int m = 6;
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) {

                }
            }
        }
    }
    public static boolean dfs(int x, int y) {
        if (x <= -1 || x > n || y >= m || y <= -1) {
            return false;
        }
        if (ints[x][y] == 1) {
            ints[x][y] += 1;
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
        }
        return true;
    }
}

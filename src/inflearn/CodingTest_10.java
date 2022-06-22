package inflearn;

public class CodingTest_10 {
    static int n = 5;
    static int m = 5;
    static int[][] ints = {
            {0, 0, 1, 1, 0},
            {0, 0, 0, 1, 1},
            {1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0}
    };
    public static void main(String[] args) {


        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) {
                    result += 1;
                }
            }
        }
    }
    // DFS 로 특정 노드를 방문하고 연결된 모든 노드들도 방문
    public static boolean dfs(int x, int y) {
        // 주어진 범위를 벗어나는 경우에는 즉시 종료
        if (x <= -1 || x >= n || y <= -1 || y >= m) {
            return false;
        }
        // 현재 노드를 방문하지 않았다면
        if (ints[x][y] == 0) {
            ints[x][y] = 1;
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }
}

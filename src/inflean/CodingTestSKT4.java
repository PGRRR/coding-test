package inflean;

public class CodingTestSKT4 {
    public static void main(String[] args) {
        String[] grid = {
                "..FF",
                "###F",
                "###."
        };
        int k = 4;
        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};
        int x = 0;
        int y = 0;
        int nx = 0;
        int ny = 0;
        for (int i = 0; i < k; i++) {
            nx += x + dx[i];
            ny += y + dy[i];
            System.out.println(nx + " " + ny);
        }
        for (int i = 0; i < k; i++) {
            if (grid[0].charAt(i) != '#') {

            }
            if (grid[i].charAt(0) != '#') {

            }
        }

    }
}

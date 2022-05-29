package inflean;

import java.util.Arrays;

public class CodingTestNHN_3 {
    public static void main(String[] args) {
        String[] maze = {"AAAAA", "AABBB", "CAEFG", "AAEFF"};
        String[] queries = {"1 1 1 5 AF", "1 1 4 5 AF", "2 1 4 5 FAE", "1 5 4 5 ABF", "1 1 4 1 A"};
        char[][] user = new char[5][5];
        for (int i = 0; i < 5; i++) {
           user[0][i] = queries[0].strip().charAt(i);
        }
        System.out.println(Arrays.deepToString(user));

        char[][] realMaze = new char[maze.length][maze[0].length()];
        for (int i = 0; i < realMaze.length; i++) {
            for (int j = 0; j < realMaze[0].length; j++) {
                realMaze[i][j] = maze[i].charAt(j);
            }
        }
        System.out.println(Arrays.deepToString(realMaze));

    }
}

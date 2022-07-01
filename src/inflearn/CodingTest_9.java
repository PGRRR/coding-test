package inflearn;

public class CodingTest_9 {

    public void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n - 1); // 재귀 함수
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        CodingTest_9 T = new CodingTest_9();
        T.DFS(3);
    }
}

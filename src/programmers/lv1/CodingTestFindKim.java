package programmers.lv1;

public class CodingTestFindKim {
    public static void main(String[] args) {
        String[] seoul = {"Lee", "J", "K", "Kim"};
//        StringBuilder sb = new StringBuilder(strArr);
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                System.out.println("김서방은 " + i + "에 있다");
            }
        }
    }
}

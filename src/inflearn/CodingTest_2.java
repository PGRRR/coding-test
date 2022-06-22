package inflearn;

public class CodingTest_2 {
    public static void main(String[] args) {
        String question = "aaaa ccc bbbb";
        String[] strings = question.split(" ");
        int max = 0;
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > max) {
                max = strings[i].length();
                count = i;
            }
        }
        System.out.println(strings[count]);
    }
}


package inflearn;

public class CodingTestKingKnight {
    public static void main(String[] args) {
        int p1 = 0;
        int p2 = 0;
        char[] chArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        String pos = "c2";
        String str = new String(chArr);
        p1 = pos.charAt(1) - 49;
        p2 = str.indexOf(pos.charAt(0));
        int count = 0;
        if (p1 + 2 <= 7 && p2 + 1 <= 7) {
            count++;
        }
        if (p1 + 2 <= 7 && p2 - 1 >= 0) {
            count++;
        }
        if (p1 - 2 >= 0 && p2 + 1 <= 7) {
            count++;
        }
        if (p1 - 2 >= 0 && p2 - 1 >= 0) {
            count++;
        }
        if (p1 + 1 <= 7 && p2 + 2 <= 7) {
            count++;
        }
        if (p1 + 1 <= 7 && p2 - 2 >= 0) {
            count++;
        }
        if (p1 - 1 >= 0 && p2 + 2 <= 7) {
            count++;
        }
        if (p1 - 1 >= 0 && p2 - 2 >= 0) {
            count++;
        }
        System.out.println(count);
    }
}

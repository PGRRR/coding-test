package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class CodingTestRunner {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        Arrays.sort(participant);
        Arrays.sort(completion);
        StringBuilder answer = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(participant));
        for (String str : completion) {
            arrayList.remove(str);
        }
        answer.append(arrayList.get(0));
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//        for (int i = 0; i < participant.length; i++) {
//            for (int j = 0; j < completion.length; j++) {
//                if (!(participant[i].equals(completion[j]))) {
//
//                }
//            }
//        }
        System.out.println(answer);
    }
}

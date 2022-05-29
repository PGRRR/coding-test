package inflean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class CodingTestNHN_2 {
    public static void main(String[] args) {
        int[] balance = {30, 30, 30, 30};
        int[][] transaction = {
                {1, 2, 10},
                {2, 3, 20},
                {3, 4, 5},
                {3, 4, 30}
        };
        int[] adnormal = {1};
        for (int i = 0; i < adnormal.length; i++) {
            if (adnormal[i] == i+1) {
                balance[i] = 0;
            }
        }
        for (int i = 0; i < transaction.length; i++) {
            balance[transaction[i][0]-1] -= transaction[i][2];
            balance[transaction[i][1]-1] += transaction[i][2];
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Stack<HashMap<Integer,Integer>> hashMapStack1 = new Stack<>();
        Stack<HashMap<Integer,Integer>> hashMapStack2 = new Stack<>();
        Stack<HashMap<Integer,Integer>> hashMapStack3 = new Stack<>();
        Stack<HashMap<Integer,Integer>> hashMapStack4 = new Stack<>();
        hashMap.put(1, balance[0]);
        hashMap.put(2, balance[1]);
        hashMap.put(3, balance[2]);
        hashMap.put(4, balance[3]);
        for (int i = 0; i < transaction.length; i++) {
            if (transaction[i][0] == 1) {
//                hashMap.replace();
            }
        }
        System.out.println(Arrays.toString(balance));

        }


    }


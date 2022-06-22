package inflearn;

import java.util.Stack;

public class CodingTest_8 {
    public static void main(String[] args) {
        String str = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";
        char[] chars = str.toCharArray();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            st.push(chars[i]);
            if (chars[i] == ')') {
                while (st.peek() != '(') {
                    st.pop();
                }
                if (st.peek() == '(') {
                    st.pop();
                }
            }
        }
        System.out.println(st);
    }
}


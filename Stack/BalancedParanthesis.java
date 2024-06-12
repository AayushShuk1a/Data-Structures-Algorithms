import java.util.ArrayDeque;

public class BalancedParanthesis {

    static boolean checkBalance(String str) {
        ArrayDeque<Character> st = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else if (ch == ')' && st.peek() != '(')
                    return false;
                else if (ch == '}' && st.peek() != '{')
                    return false;
                else if (ch == ']' && st.peek() != '[')
                    return false;
                else
                    st.pop();
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String st = "((([[({})]])))}";
        System.out.println(checkBalance(st));
    }
}

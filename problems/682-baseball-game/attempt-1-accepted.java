import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            char curr = operations[i].charAt(0);

            if (Character.isDigit(curr) || curr == '-') {
                stk.push(Integer.parseInt(operations[i]));
            }
            else if (curr == 'C') {
                stk.pop();
            }
            else if (curr == 'D') {
                stk.push(stk.peek() * 2);
            }
            else if (curr == '+') {
                int top = stk.pop();
                int secondTop = stk.peek();
                stk.push(top);
                stk.push(top + secondTop);
            }
        }

        int result = 0;
        while (!stk.isEmpty()) {
            result += stk.pop();
        }
        return result;
    }
}

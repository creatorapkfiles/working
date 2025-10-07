package ValidParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();


        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                stack.push(chars[i]);
            }
            if (chars[i] == ')') {
                if (stack.isEmpty()) return false;
                if (stack.pop() == '(');
                else return false;
            }
            if  (chars[i] == ']') {
                if (stack.isEmpty()) return false;
                if (stack.pop() == '[');
                else return false;
            }
            if (chars[i] == '}') {
                if (stack.isEmpty()) return false;
                if (stack.pop() == '{');
                else return false;
            }
        }
        if (stack.isEmpty()) return true;
        return stack.isEmpty();
    }

}



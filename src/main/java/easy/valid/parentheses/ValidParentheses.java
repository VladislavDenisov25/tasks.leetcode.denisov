package easy.valid.parentheses;

import java.util.*;

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> chars = new Stack<>();

        for (char c : charArray) {
            switch (c) {
                case '[', '{', '(' -> chars.push(c);
                case '}' -> {
                    if (chars.empty() || chars.peek() != '{') return false;
                    else chars.pop();
                }
                case ')' -> {
                    if (chars.empty() || chars.peek() != '(') return false;
                    else chars.pop();
                }
                case ']' -> {
                    if (chars.empty() || chars.peek() != '[') return false;
                    else chars.pop();
                }
            }
        }
        return chars.empty();
    }
}


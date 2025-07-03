package Stack_Quees;

import java.util.Stack;

public class Parenthesis_cheacker {

    public static class Solution {

        // Method to check if the string has balanced brackets
        static boolean isBalanced(String s) {
            Stack<Character> stack = new Stack<>();

            for (char ch : s.toCharArray()) {
                // Push opening brackets to stack
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else {
                    // If stack is empty or mismatched closing bracket
                    if (stack.isEmpty()) return false;

                    char top = stack.pop();
                    if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                        return false;
                    }
                }
            }

            // Return true only if stack is empty (all brackets matched)
            return stack.isEmpty();
        }

        // Main method to test the function
        public static void main(String[] args) {
            System.out.println(isBalanced("[{()}]"));     // true
            System.out.println(isBalanced("[()()]{}"));   // true
            System.out.println(isBalanced("[({)]"));      // false
            System.out.println(isBalanced("((()))"));     // true
            System.out.println(isBalanced("(()"));        // false
        }
    }
}

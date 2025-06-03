package Stack_Quees;

import java.util.Stack;

public class Parenthesis_cheacker {

    public class Solution {

        // Method to check if the string has balanced brackets
        static boolean isBalanced(String s) {
            Stack<Character> stack = new Stack<>();

            for (char ch : s.toCharArray()) {
                // Push opening brackets to stack
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } // Check for matching closing brackets
                else {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    char top = stack.pop();
                    if ((ch == ')' && top != '(')
                            || (ch == '}' && top != '{')
                            || (ch == ']' && top != '[')) {
                        return false;
                    }
                }
            }

            // Return true only if stack is empty (all matched)
            return stack.isEmpty();
        }

        // Main method to test the function
        public static void main(String[] args) {
            System.out.println(isBalanced("[{()}]"));     // true
            System.out.println(isBalanced("[()()]{}"));   // true
            System.out.println(isBalanced("[({)]"));      // false
        }
    }

}

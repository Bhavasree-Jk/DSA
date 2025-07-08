import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        // Stack to store indices
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);  // Base case to handle edge cases

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);  // Push the index of the opening parenthesis
            } else {
                stack.pop();  // Pop the last opening parenthesis
                if (stack.isEmpty()) {
                    stack.push(i);  // If the stack is empty, push the current index
                } else {
                    // Calculate the length of the valid substring
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }
}
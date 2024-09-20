import java.util.Stack;

public class DelimiterChecker {

    // Static method to check if delimiters are balanced
    public static boolean check(String input) {
        // Stack to hold opening delimiters
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // If the character is an opening delimiter, push it onto the stack
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            }
            // If the character is a closing delimiter, check for matching opening delimiter
            else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                // If stack is empty, there is no matching opening delimiter
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top of the stack and check if it matches the current closing delimiter
                char lastOpened = stack.pop();
                if (!isMatchingPair(lastOpened, currentChar)) {
                    return false;
                }
            }
        }

        // After processing all characters, the stack should be empty if delimiters match
        return stack.isEmpty();
    }

    // Helper method to check if the pair of delimiters matches
    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }
}

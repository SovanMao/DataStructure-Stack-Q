public class StringReverser {
    public static String reverse(String input) {
        // Stack to hold characters of the string
        Stack<String> stack = new Stack<>(input.length());

        // Push each character of the input string into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(String.valueOf(input.charAt(i)));
        }

        // Build the reversed string by popping characters from the stack
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        // Return the reversed string
        return reversedString.toString();
    }
}

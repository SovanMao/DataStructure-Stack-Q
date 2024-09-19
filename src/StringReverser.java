public class StringReverser {
    public static String reverse(String input) {
        Stack stack = new Stack(input.length());
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder reversed = new StringBuilder();
        while (true) {
            try {
                reversed.append(stack.pop());
            } catch (IllegalStateException e) {
                break;
            }
        }
        return reversed.toString();
    }
}

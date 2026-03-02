import java.util.Stack;

public class PalindromeChecker {

    // Inner class encapsulating palindrome logic
    static class PalindromeCheckerApp {

        public boolean checkPalindrome(String input) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < input.length(); i++) {
                stack.push(input.charAt(i));
            }

            String reversed = "";
            while (!stack.isEmpty()) {
                reversed += stack.pop();
            }

            return input.equals(reversed);
        }
    }

    public static void main(String[] args) {

        PalindromeCheckerApp checker = new PalindromeCheckerApp();

        String input = "radar";

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}
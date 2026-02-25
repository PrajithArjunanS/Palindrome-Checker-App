/**
 * =====================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Encapsulates palindrome validation logic inside a
 * PalindromeService class.
 *
 * @version 11.0
 */

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        PalindromeService service = new PalindromeService();
        boolean result = service.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

class PalindromeService {

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start <= end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
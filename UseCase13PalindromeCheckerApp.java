/**
 * =====================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Measures execution time of palindrome validation
 * using System.nanoTime().
 *
 * @version 13.0
 */

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        long startTime = System.nanoTime();

        boolean result = checkPalindrome(input);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + duration + " ns");
    }

    private static boolean checkPalindrome(String input) {

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
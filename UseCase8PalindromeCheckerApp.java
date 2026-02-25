/**
 * =====================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Checks whether a string is a palindrome using LinkedList
 * by comparing elements from both ends.
 *
 * @version 8.0
 */

import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        LinkedList<Character> list = new LinkedList<>();

        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
package strings.task_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    private final Palindrome palindrome = new Palindrome();

    @Test
    void testIsPalindrome_true_1() {
        String str = "a";
        assertTrue(palindrome.isPalindrome(str));
    }

    @Test
    void testIsPalindrome_true_2() {
        String str = "aba";
        assertTrue(palindrome.isPalindrome(str));
    }

    @Test
    void testIsPalindrome_true_3() {
        String str = "abba";
        assertTrue(palindrome.isPalindrome(str));
    }
    @Test
    void testIsPalindrome_true_4() {
        String str = "abcdeffedcba";
        assertTrue(palindrome.isPalindrome(str));
    }

    @Test
    void testIsPalindrome_true_5() {
        String str = "racecar";
        assertTrue(palindrome.isPalindrome(str));
    }

    @Test
    void testIsPalindrome_false_1 () {
        String str = "ab";
        assertFalse(palindrome.isPalindrome(str));
    }

    @Test
    void testIsPalindrome_false_2 () {
        String str = "abca";
        assertFalse(palindrome.isPalindrome(str));
    }

    @Test
    void testIsPalindrome_false_3 () {
        String str = "helloh";
        assertFalse(palindrome.isPalindrome(str));
    }
}

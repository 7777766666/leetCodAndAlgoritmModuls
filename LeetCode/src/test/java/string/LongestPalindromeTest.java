package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {

    @Test
    void longestPalindrome() {
        String s = "abccccdd";
        int result = LongestPalindrome.longestPalindrome(s);



        assertAll(
                () -> assertEquals(7, result)


        );
    }
}
package org.example.second;

import junit.framework.TestCase;

public class LengthOfLongestSubstring3Test extends TestCase {

    public void testLengthOfLongestSubstring() {
        LengthOfLongestSubstring3 lengthOfLongestSubstring = new LengthOfLongestSubstring3();
        int result = lengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb");
        int expected = 3;
        assertEquals(expected, result);

        LengthOfLongestSubstring3 lengthOfLongestSubstring1 = new LengthOfLongestSubstring3();
        int result2 = lengthOfLongestSubstring1.lengthOfLongestSubstring("bbbbb");
        int expected2 = 1;
        assertEquals(expected2, result2);




        LengthOfLongestSubstring3 lengthOfLongestSubstring2 = new LengthOfLongestSubstring3();
        int result3 = lengthOfLongestSubstring2.lengthOfLongestSubstring(new String("pwwkew"));
        int expected3 = 3;
        assertEquals(expected3, result3);


        LengthOfLongestSubstring3 lengthOfLongestSubstring4 = new LengthOfLongestSubstring3();
        int result4 = lengthOfLongestSubstring4.lengthOfLongestSubstring(new String("dvdf"));
        int expected4 = 7;
        assertEquals(expected3, result3);
    }
}
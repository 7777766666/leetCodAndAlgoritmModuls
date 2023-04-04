package org.example.second;

import junit.framework.TestCase;


public class ReverseWords557Test extends TestCase {

    public void testReverseWords() {

        ReverseWords557 reverseWords557 = new ReverseWords557();
        String result = reverseWords557.reverseWords(new String("Let's take LeetCode contest"));
        String expected = new String("s'teL ekat edoCteeL tsetnoc");
        assertEquals (expected, result);

        String result2 = reverseWords557.reverseWords(new String("God Ding"));
        String expected2 = new String("doG gniD");
        assertEquals(expected2, result2);


    }
}
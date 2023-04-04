package org.example.second;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseStringTest extends TestCase {


    @Test
    public void testReverseString() {
        ReverseString reverseString = new ReverseString();
        char[] result = reverseString.reverseStripng(new char[]{'h', 'e', 'l', 'l', 'o'});
        char[] expected = new char[]{'o', 'l', 'l', 'e', 'h'};
        assertTrue(Arrays.equals(expected, result));
        assertArrayEquals(expected, result);
    }

}
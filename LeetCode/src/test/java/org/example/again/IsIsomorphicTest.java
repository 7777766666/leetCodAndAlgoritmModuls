package org.example.again;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsIsomorphicTest {

    @Test
    void isIsomorphic() {
        String str1 = "paper";
        String str2 = "title";
        String q = "egg", q1 = "add";
        String w = "foo", w1 = "bar";
        String a1 = "baba",  a2 = "badc";
        IsIsomorphic isomorphic = new IsIsomorphic();
        boolean result = isomorphic.isIsomorphic(str1, str2);
        boolean result2 = isomorphic.isIsomorphic(q, q1);
        boolean result3 = isomorphic.isIsomorphic(w, w1);
        boolean result4 = isomorphic.isIsomorphic(a2, a1);
        try {
            assertTrue(result);
        } catch (AssertionError e) {
            System.out.println("AssertionError in assert 1: " + e.getMessage());
        }
        try {
            assertTrue(result2);
        } catch (AssertionError e) {
            System.out.println("AssertionError in assert 2: " + e.getMessage());
        }
        try {
            assertFalse(result3);
        } catch (AssertionError e) {
            System.out.println("AssertionError in assert 3: " + e.getMessage());
        }
        try {
            assertFalse(result4);
        } catch (AssertionError e) {
            System.out.println("AssertionError in assert 4: " + e.getMessage());
        }
    }



}
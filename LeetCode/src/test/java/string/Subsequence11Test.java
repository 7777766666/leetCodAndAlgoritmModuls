package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Subsequence11Test {

    @Test
    void subsequence() {
        Subsequence11 sub = new Subsequence11();
        String s = "axc", t = "ahbgdc";
        String s1 = "abc", t1 = "ahbgdc";
        String s2 = "a", t2 = "dkxeeeamlfrfr";
        String s3 = "axc", t3 = "ahbgdc";
        String s4 = "abc", t4 =  "ahbgdc";
        String s5 = "",  t5 = "ahbgdc";
        String s6 = "bb", t6 = "ahbgdc";

        assertAll(
                () ->assertFalse(sub.subsequence(s, t)),
                () ->assertTrue(sub.subsequence(s1, t1)),
                () ->assertTrue(sub.subsequence(s2, t2)),
                () ->assertFalse(sub.subsequence(s3, t3)),
                () -> assertTrue(sub.subsequence(s4, t4)),
                () ->assertTrue(sub.subsequence(s5, t5)),
                () ->assertFalse(sub.subsequence(s6, t6))
        );



    }
}
package string;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;


public class CheckInclusion567Test extends TestCase {


    @Test
    public void testCheckInclusion() {
        CheckInclusion567 checkInclusion = new CheckInclusion567();

        boolean result1 = checkInclusion.checkInclusion("ab", "eidbaooo");
        boolean expected1 = true;
        assertEquals(expected1, result1);

        boolean result2 = checkInclusion.checkInclusion("ab", "eidboaoo");
        boolean expected2 = false;
        assertEquals(expected2, result2);

        boolean result3 = checkInclusion.checkInclusion("abc", "dcda");
        boolean expected3 = true;
        assertEquals(expected3, result3);

    }


//    @Test
//    public void testCheckInclusion() {
//        CheckInclusion567 checkInclusion = new CheckInclusion567();
////        boolean result1 = checkInclusion.checkInclusion("ab", "eidbaooo");
////        boolean expected1 = true;
////
////        boolean result2 = checkInclusion.checkInclusion("ab", "eidboaoo");
////        boolean expected2 = false;
//
//        assertAll("checkInclusion",
//                () -> assertTrue(checkInclusion.checkInclusion("ab", "eidbaooo")),
//                () -> assertFalse(checkInclusion.checkInclusion("ab", "eidboaoo"))
//        );
//    }



}
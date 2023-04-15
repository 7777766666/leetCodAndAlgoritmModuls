package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarTest {

    @Test
    void search() {
        int[] x = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        int target2 = 2;
        Binar binar = new Binar();
        int result1 = binar.search(x, target1);
        int result2 = binar.search(x, target2);

        int[] x1 = {-1, 0, 3, 5, 9, 12};
        int target3 = 13;
        int result3 = binar.search(x1, target3);

        assertAll(

                () -> assertEquals(4, result1),
                () -> assertEquals(-1, result2),
                () -> assertEquals(-1, result3)

        );


    }
}
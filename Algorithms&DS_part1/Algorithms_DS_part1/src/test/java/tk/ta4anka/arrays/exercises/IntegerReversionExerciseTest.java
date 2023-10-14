package tk.ta4anka.arrays.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerReversionExerciseTest {

    private IntegerReversionExercise ire;

    @BeforeEach
    void setUp() {
        ire = new IntegerReversionExercise();
    }

    @Test
    void testPositiveInteger() {
        assertEquals(4321, ire.reverse(1234));
    }

    @Test
    void testNegativeInteger() {
        assertEquals(-8765, ire.reverse(-5678));
    }

    @Test
    void testSingleDigit() {
        assertEquals(7, ire.reverse(7));
    }

    @Test
    void testZero() {
        assertEquals(0, ire.reverse(0));
    }

    @Test
    void testLargeNumber() {
        assertEquals(987654321, ire.reverse(123456789));
    }

    @Test
    void testNegativeSingleDigit() {
        assertEquals(-9, ire.reverse(-9));
    }

    @Test
    void testLeadingZeros() {
        assertEquals(1, ire.reverse(1000));
    }
}

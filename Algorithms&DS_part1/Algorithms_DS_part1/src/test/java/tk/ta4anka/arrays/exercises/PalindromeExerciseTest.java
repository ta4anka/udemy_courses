package tk.ta4anka.arrays.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeExerciseTest {

    private PalindromeExercise pe;

    @BeforeEach
    void setUp() {
        pe = new PalindromeExercise();
    }

    @Test
    void testValidPalindrome() {
        assertTrue(pe.solve("radar"));
    }

    @Test
    void testNonPalindrome() {
        assertFalse(pe.solve("hello"));
    }

    @Test
    void testEmptyString() {
        assertTrue(pe.solve(""));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(pe.solve("a"));
    }

    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> {
            pe.solve(null);
        });
    }
}

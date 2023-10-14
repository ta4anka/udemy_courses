package tk.ta4anka.arrays.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramExerciseTest {

    private AnagramExercise anagramExercise;

    @BeforeEach
    void setUp() {
        anagramExercise = new AnagramExercise();
    }

    @Test
    void testAnagram() {
        assertTrue(anagramExercise.solve("restful", "fluster"));
    }

    @Test
    void testNotAnagramDifferentLength() {
        assertFalse(anagramExercise.solve("hello", "world"));
    }

    @Test
    void testNotAnagram() {
        assertFalse(anagramExercise.solve("hello", "holla"));
    }

    @Test
    void testEmptyStrings() {
        assertTrue(anagramExercise.solve("", ""));
    }

    @Test
    void testSameString() {
        assertTrue(anagramExercise.solve("hello", "hello"));
    }

    @Test
    void testAnagramV2() {
        assertTrue(anagramExercise.solveV2("restful", "fluster"));
    }

    @Test
    void testNotAnagramDifferentLengthV2() {
        assertFalse(anagramExercise.solveV2("hello", "world"));
    }

    @Test
    void testNotAnagramV2() {
        assertFalse(anagramExercise.solveV2("word", "test"));
    }

    @Test
    void testEmptyStringsV2() {
        assertTrue(anagramExercise.solveV2("", ""));
    }

    @Test
    void testSameStringV2() {
        assertTrue(anagramExercise.solveV2("hello", "hello"));
    }

}


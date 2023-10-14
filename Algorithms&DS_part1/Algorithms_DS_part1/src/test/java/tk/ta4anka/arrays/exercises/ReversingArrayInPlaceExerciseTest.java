package tk.ta4anka.arrays.exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReversingArrayInPlaceExerciseTest {

    private ReversingArrayInPlaceExercise exercise;

    @BeforeEach
    void setUp() {
        exercise = new ReversingArrayInPlaceExercise();
    }

    @Test
    void testReverseArrayWithEvenLength() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expectedOutput = {6, 5, 4, 3, 2, 1};
        int[] result = exercise.solve(input);

        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void testReverseArrayWithOddLength() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expectedOutput = {5, 4, 3, 2, 1};
        int[] result = exercise.solve(input);

        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void testReverseEmptyArray() {
        int[] input = {};
        int[] expectedOutput = {};
        int[] result = exercise.solve(input);

        assertArrayEquals(expectedOutput, result);
    }

    @Test
    void testReverseArrayWithSingleElement() {
        int[] input = {1};
        int[] expectedOutput = {1};
        int[] result = exercise.solve(input);

        assertArrayEquals(expectedOutput, result);
    }
}

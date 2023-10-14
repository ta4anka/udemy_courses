package tk.ta4anka.arrays.exercises;

/**
 * Integer reversion exercise
 * <p>
 * Your task is to design an efficient algorithm to reverse a given integer.
 * For example if the input of the algorithm is 1234 then the output should be 4321.
 * <p>
 * NOTE: the input is an integer (and not a string)
 */
public class IntegerReversionExercise {
    // O(N) - linear running time complexity
    public int reverse(int n) {
        int reversed = 0;
        int remainder = 0;
        int absoluteN = Math.abs(n);

        while (absoluteN > 0) {
            remainder = absoluteN % 10;
            absoluteN = absoluteN / 10;
            reversed = reversed * 10 + remainder;
        }

        if (n < 0) {
            reversed = -reversed;
        }

        return reversed;
    }
}

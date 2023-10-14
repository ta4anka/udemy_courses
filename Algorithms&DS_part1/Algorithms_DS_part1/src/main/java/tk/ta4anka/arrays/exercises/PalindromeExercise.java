package tk.ta4anka.arrays.exercises;

/**
 * Palindrome problem exercise
 * <p>
 * "A palindrome is a string that reads the same forward and backward"
 * For example: "radar" or "madam"
 * <p>
 * Your task is to design an optimal algorithm for checking whether a given string is palindrome or not!
 */
public class PalindromeExercise {
    // it has O(N/2) = O(N) linear running time complexity
    public boolean solve(String s) {
        int forward = 0;
        int backward = s.length() - 1;

        while (forward < backward) {
            if (s.charAt(forward) != s.charAt(backward))
                return false;
            forward++;
            backward--;
        }
        return true;
    }
}

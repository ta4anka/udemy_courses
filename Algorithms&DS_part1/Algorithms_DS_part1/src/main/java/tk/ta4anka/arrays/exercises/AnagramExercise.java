package tk.ta4anka.arrays.exercises;

import java.util.Arrays;

/**
 * Anagram problem exercise
 * <p>
 * Your task is to construct an algorithm to check whether two words (or phrases) are anagrams or not!
 * <p>
 * Info: "An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once"
 * For example: "restful" and "fluster" are anagrams.
 */
public class AnagramExercise {
    public boolean solve(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        if (charArray1.length != charArray2.length) {
            return false;
        }

        // sort the letters of the strings
        // O(NlogN) this is the "bottleneck" of the algorithm
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // consider all the letters one by one, and we have to compare these letters
        // O(N) but the overall running time is O(NlogN) + O(N) = O(NlogN)
        for (int i = 0; i < charArray1.length; ++i) {
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }


    // This solution has a time complexity of O(n), where n is the length of the input strings.
    public boolean solveV2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charFrequency = new int[26]; // Assuming only lowercase English letters

        for (int i = 0; i < str1.length(); ++i) {
            charFrequency[str1.charAt(i) - 'a']++;
            charFrequency[str2.charAt(i) - 'a']--;
        }

        for (int frequency : charFrequency) {
            if (frequency != 0) {
                return false;
            }
        }

        return true;
    }
}

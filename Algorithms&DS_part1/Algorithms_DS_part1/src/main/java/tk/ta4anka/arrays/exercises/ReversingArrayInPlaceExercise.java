package tk.ta4anka.arrays.exercises;


/**
 * Reversing an array in-place exercise
 * <p>
 * In this exercise, you have to reverse a T[] array in O(N) linear time complexity,
 * and we want the algorithm to be in-place as well - so the algorithm can not use additional memory!
 * For example: input is [1,2,3,4,5] then the output is [5,4,3,2,1]
 * <p>
 * Hint: define 2 pointers (pointing to the last and first item of the array) and make a single iteration
 */
public class ReversingArrayInPlaceExercise {
    public int[] solve(int[] nums) {
        // define 2 pointers
        int lowIndex = 0;
        int highIndex = nums.length - 1;

        while (lowIndex < highIndex) {
            swap(nums, lowIndex, highIndex);
            lowIndex++;
            highIndex--;
        }
        return nums;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}

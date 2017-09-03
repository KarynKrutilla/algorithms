package com.algorithms.sort.SelectionSort;

/**
 * Selection Sort:
 * O(N^2) runtime
 */
public class SelectionSort {

    /**
     * Run a Selection Sort.
     * Expect the output to be:
     *
     * 4
     * 8
     * 11
     * 17
     * 20
     * 52
     * 67
     * 110
     *
     */
    public static void main(String[] args) {
        // Some test data
        int[] nums = new int[]{110,17,20,4,67,52,8,11};

        // Sort and print
        int[] sortedArray = selectionSort(nums);
        for(int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }

    /**
     * Uses selection sort to sort the input array of ints
     * selection sort =
     *      loop through array
     *      on each pass, find the next smallest number in the un-sorted group
     *      and move to the next index of the sorted group
     * @param nums the array to sort
     * @return the sorted array
     */
    public static int[] selectionSort(int[] nums) {
        // loop until 2nd to last item (at that point we can assume the last is sorted)
        for(int i = 0; i < nums.length - 1; i++) {
            // init index
            int index = i;
            // loop from current position to end of array
            for(int j = i; j < nums.length; j++) {
                // find the index of the lowest num
                if(nums[j] < nums[index]) {
                    index = j;
                }
            }
            // swap
            int nextSmallestNum = nums[index];
            nums[index] = nums[i];
            nums[i] = nextSmallestNum;
        }
        return nums;
    }
}

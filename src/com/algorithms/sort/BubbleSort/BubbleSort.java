package com.algorithms.sort.BubbleSort;

/**
 * Bubble Sort is very inefficient!
 * O(N*N) running time
 */
public class BubbleSort {

    /**
     * Run a Bubble Sort.
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
        int[] sortedArray = bubbleSort(nums);
        for(int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }

    /**
     * Uses bubble sort to sort the input array of ints
     * @param nums the array to sort
     * @return the sorted array
     */
    private static int[] bubbleSort(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            // Only loop to length - i because we can consider the right-most elements already sorted
            for (int j = 1; j < (nums.length - i); j++) {
                // If these two elements are out of order, swap them
                if(nums[j-1] > nums[j]) {
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}

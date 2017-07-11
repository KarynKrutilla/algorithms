package com.algorithms.search.BinarySearch;

public class BinarySearch {

    /**
     * Run a binary search
     * Expect output to be:
     * 5
     * -1
     */
    public static void main(String[] args) {
        // Some test data
        int[] nums = new int[]{1,4,7,8,10,11,14,17,100,110};

        System.out.println(binarySearch(nums, 11));
        System.out.println(binarySearch(nums, 12));
    }

    /**
     * Kicks off the recursive binarySearch method with starter values for 'low' and 'high'
     * @param nums the int[] to search
     * @param numToFind the number to find in the int[]
     * @return the index of the numToFind, or -1 if it doesn't exist
     */
    static int binarySearch(int[] nums, int numToFind) {
        return binarySearch(nums, numToFind, 0, nums.length);
    }

    /**
     * Runs binary search on the input int[]
     * @param nums the int[] to search
     * @param numToFind the number to find in the int[]
     * @param low the lowest index to check - 0 to start
     * @param high the highest index to check - nums.length to start
     * @return the index of the numToFind, or -1 if it doesn't exist
     */
    private static int binarySearch(int[] nums, int numToFind, int low, int high) {
        // Set middle to be the middle of the current subset we are searching
        int middle = (low+high)/2;

        // If low and high have passed each other, numToFind is not in the array
        if(low > high) {
            return -1;
        }

        // Check if we found numToFind
        if(nums[middle] == numToFind) {
            return middle;
        }

        // Otherwise, check which side of the array it will be on and search there
        if(nums[middle] < numToFind) {
            return binarySearch(nums, numToFind, middle+1, high);
        }
        else {
            return binarySearch(nums, numToFind, low, middle-1);
        }
    }
}

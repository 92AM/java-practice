package com.am92;

import java.util.Arrays;

/**
 * Find the largest number in a given int array.
 */
public class FindLargestNumInIntArray {

    public static void main(String[] args) {

        System.out.println(findLargestNumberInArray(new int[] {19,1,10,3,4}));

    }

    /**
     * Finds the largest number in a given int array.
     *
     * @param intArr int []
     * @return int largest number in the given array
     */
    private static int findLargestNumberInArray(int [] intArr) {

        /*

        // Conventional way (very expensive way ... doing a linear search here)

        int largestNumber = 0;

        for (int i : intArr) {

            if (i > largestNumber) {

                largestNumber = i;

            }
        }

        return largestNumber;

         */

        // TODO : Implement tree structure to implement the search algorithm.

        return Arrays.stream(intArr).filter(i -> i >= 0).max().orElse(0);
    }
}

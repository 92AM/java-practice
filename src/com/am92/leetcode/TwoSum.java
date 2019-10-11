package com.am92.leetcode;

import java.util.Arrays;

/**
 * Two Sum
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 */
public class TwoSum {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSumBruteForce(new int[]{2, 7, 11, 15}, 22)));
    }

    /**
     * Two sum - brute force method.
     *
     * Worst case complexity here is O(n^2).
     *
     * @param givenNums Array of input numbers
     * @param target The target integer to meet
     * @return array of integers
     */
    private static int [] twoSumBruteForce(int[] givenNums, int target) {

        for (int i = 0; i < givenNums.length-1; i++) {

            for (int j = 1; j < givenNums.length; j++) {

                if (givenNums[i] + givenNums[j] == target) {

                    return new int [] {i,j};
                }
            }
        }

        return new int []{};
    }


}

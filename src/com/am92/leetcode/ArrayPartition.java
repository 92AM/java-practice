package com.am92.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * 561. Array Partition I
 *
 * Easy
 *
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer,
 * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 *
 * Example 1:
 * Input: [1,4,3,2]
 *
 * Output: 4
 * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 * Note:
 * 1.	n is a positive integer, which is in the range of [1, 10000].
 * 2.	All the integers in the array will be in the range of [-10000, 10000].
 *
 * Hints :
 * •	Obviously, brute force won't help here. Think of something else, take some example like 1,2,3,4.
 * •	How will you make pairs to get the result? There must be some pattern.
 * •	Did you observe that- Minimum element gets add into the result in sacrifice of maximum element.
 * •	Still won't able to find pairs? Sort the array and try to find the pattern.
 *
 * Link: https://leetcode.com/problems/array-partition-i/
 *
 */
public class ArrayPartition {

    public static void main(String[] args) {

        System.out.println("Sum : " + arrayPairSum(new int[]{1,4,3,2}) + "\n");
        System.out.println("Sum : " + arrayPairSum(new int[]{1,4,3,2,6,5}) + "\n");
        System.out.println("Sum : " + arrayPairSum(new int[]{1,4,3,2,-5,5}) + "\n");
    }

    private static int arrayPairSum(int[] nums) {

        System.out.println("Input Array : " + Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println("Input Array Sorted : " + Arrays.toString(nums));

        int sum = 0;

        for (int idx = 0; idx < nums.length; idx = idx + 2) {

            sum += nums[idx];
        }

        return sum;
    }
}

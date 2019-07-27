package com.am92.leetcode;

/**
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 *
 * Example 1:
 *
 * Input: "Hello"
 * Output: "hello"
 * Example 2:
 *
 * Input: "here"
 * Output: "here"
 * Example 3:
 *
 * Input: "LOVELY"
 * Output: "lovely"
 *
 * Link : https://leetcode.com/problems/to-lower-case/
 */
public class ToLowerCase {

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
        System.out.println(toLowerCase("LOVELY"));
        System.out.println(toLowerCase("here"));
    }

    private static String toLowerCase(String str) {

        char [] charArr = str.toCharArray();

        for (int idx = 0; idx < charArr.length; idx++) {

            if(Character.isUpperCase(charArr[idx])) {

                charArr[idx] = Character.toLowerCase(charArr[idx]);
            }
        }

        return new String(charArr);
    }

    /*private static String toLowerCase(String str) {

        return str.toLowerCase();
    }*/
}

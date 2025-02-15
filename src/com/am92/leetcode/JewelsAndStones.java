package com.am92.leetcode;

/**
 * 771. Jewels and Stones
 * Easy

 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive,
 * so "a" is considered a different type of stone from "A".
 *
 *
 * Example 1:
 *
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 *
 *
 * Example 2:
 *
 * Input: J = "z", S = "ZZ"
 * Output: 0
 * Note:
 *
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 *
 * Link : https://leetcode.com/problems/jewels-and-stones/
 */
public class JewelsAndStones {

    public static void main(String[] args) {

        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("zhj", "ZZZzzzZZzzZZZZzjHhgfjhffhkjghjkgmnkjffkhZZZ"));
    }


    private static int numJewelsInStones(String J, String S) {

        char [] sCharArr = S.toCharArray();
        char [] jCharArr = J.toCharArray();
        int result = 0;

        for (char aSCharArr : sCharArr) {
            for (char aJCharArr : jCharArr) {
                if (aSCharArr == aJCharArr) {
                    result++;
                }
            }
        }

        return result;
    }
}

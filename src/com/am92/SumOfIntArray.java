package com.am92;

import java.util.Arrays;

/**
 * Print sum of an int array [1,2,3,4,5]
 */
public class SumOfIntArray {

    public static void main(String[] args) {

       System.out.println(sumUpArray());

    }

    /**
     * Returns sum of an int array [1,2,3,4,5]
     *
     * @return int sum
     */
    private static int sumUpArray() {

        return Arrays.stream(new int[] {1,2,3,4,5}).sum();

        /*
        Conventional way

        int sumOfIntArr = 0;

        for (int i : intArr) {

            sumOfIntArr += i;
        }

        return sumOfIntArr;

        */
    }
}

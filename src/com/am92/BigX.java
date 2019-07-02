package com.am92;

/**
 * Write a program that takes as input an integer size and outputs big ASCII "X" on the console * with size rows and columns.
 *
 *
 * Examples :
 *
 *
 * size = 3
 *
 *   *  *
 *     *
 *   *  *
 *
 *
 * size = 4
 *
 *   *    *
 *     **
 *     **
 *   *    *
 *
 *
 * size = 5
 *
 *  *      *
 *    *  *
 *      *
 *    *  *
 *  *      *
 *
 */
public class BigX {

    public static void main(String[] args) {

        drawExpoX(5);
    }

    /**
     * Draws a 'X' based on a given size (int)
     *
     * Time complexity : O(n^2)
     *
     * @param size int
     */
    private static void drawExpoX(int size) {

        /*  Imagine rendering the X on a square 2 X 2 grid, this loop iterates
        through the rows of the grid (top -> bottom)  */
        for (int i = 0; i < size; i++) {

            /*  Decrementing from given 'size' by one and the increment index
            This is done to find the other point that is eligible for printing '*'
            in a given row */
            int j = size - 1 - i;

            /* Loop through again to check for intersections and print out accordingly
             This loop iterates through the columns of the grid (left -> right) */
            for (int k = 0; k < size; k++) {

                // Check for the intersections and print accordingly, if intersection is found print '*', else '  '
                System.out.print((k == i || k == j) ? "*" : "  ");
            }

            // print a new blank line after printing a row
            System.out.println();
        }
    }

}


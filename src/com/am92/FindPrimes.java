package com.am92;

import java.util.stream.IntStream;

/**
 * Find prime numbers based on a given integer size.
 * <p>
 * For example if the input parameter is 10 then 2, 3, 5 and 7 should be printed.
 */
public class FindPrimes {

    public static void main(String[] args) {

        primeNumberPrinter(10);
    }

    /**
     * Based on the max check integer passed in this method will iterate through all the integers, starting from 1 to
     * the maxCheck and identify if a number is prime by calling the checkPirme() method.
     *
     * @param maxCheck int
     */
    private static void primeNumberPrinter(int maxCheck) {

        //Empty String
        StringBuilder primeNumbersFound = new StringBuilder();

        IntStream.rangeClosed(1, maxCheck)
                .filter(FindPrimes::checkPrime)
                .forEachOrdered(i -> primeNumbersFound.append(i).append(" "));

        System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
        // Print prime numbers from 1 to maxCheck
        System.out.println(primeNumbersFound);

        // Conventional / old fashioned way
        /*//Start loop 1 to maxCheck
        for (int i = 1; i <= maxCheck; i++) {

            if (checkPrime(i)) {

                primeNumbersFound.append(i).append(" ");
            }
        }*/
    }

    /**
     * Checks if the given integer number is a prime number or not, returns 'true' or 'false' accordingly.
     *
     * @param numberToCheck int
     * @return boolean true or false based on the outcome
     */
    private static boolean checkPrime(int numberToCheck) {

        // If the number is 1 then return false straight away.
        if (numberToCheck == 1) {

            return false;
        }

        return IntStream.rangeClosed(2, numberToCheck / 2).noneMatch(i -> numberToCheck % i == 0);

        /*// Iterate through the
        for (int i = 2; i <= numberToCheck / 2; i++) {

            //if remainder is 0 then numberToCheck is not prime and break loop. Else continue loop
            if (numberToCheck % i == 0) {

                return false;
            }
        }*/

    }
}

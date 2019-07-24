package com.am92;

/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *
 *         A defanged IP address replaces every period "." with "[.]".
 *
 *
 *
 *         Example 1:
 *
 *         Input: address = "1.1.1.1"
 *         Output: "1[.]1[.]1[.]1"
 *         Example 2:
 *
 *         Input: address = "255.100.50.0"
 *         Output: "255[.]100[.]50[.]0"
 *
 *
 *         Constraints:
 *
 *         The given address is a valid IPv4 address.
 *
 */

public class DefangingAnIPAddress {

    public static void main(String[] args) {

        System.out.println(defangIPaddr("0.0.0.0"));
    }


    private static String defangIPaddr(String address) {

        StringBuilder newAddress = new StringBuilder();

        for (int idx = 0; idx < address.length(); idx++) {

            if(address.charAt(idx) == '.') {

                newAddress.append('[').append(address.charAt(idx)).append(']');

            } else {

                newAddress.append(address.charAt(idx));
            }
        }

        return newAddress.toString();
    }

}

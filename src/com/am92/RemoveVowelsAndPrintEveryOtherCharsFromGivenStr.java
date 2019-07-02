package com.am92;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement the scenario below.
 *
 *         input = "LaunchCode"
 *         1 . Remove all vowels (a,e,i,o,u)
 *         2 . Remove every other characters
 *         3 . Return what is left
 *
 */
public class RemoveVowelsAndPrintEveryOtherCharsFromGivenStr {

    public static void main(String[] args) {

        System.out.println(removeVowelsAndThenEveryOtherCharacterFromString("LAunchCodE"));

    }

    private static String removeVowelsAndThenEveryOtherCharacterFromString(String inputString) {

        return removeEveryOtherCharacters(removeVowelsFromString(inputString));
    }

    private static String removeVowelsFromString(String inputString) {

        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char [] inputChars = inputString.toCharArray();

        StringBuilder stringCons = new StringBuilder();

        for (char inputChar : inputChars) {

            if (!vowels.contains(inputChar)) {

                stringCons.append(inputChar);
            }
        }

        return stringCons.toString();
    }

    private static String removeEveryOtherCharacters(String inputString) {

        char [] inputChars = inputString.toCharArray();

        StringBuilder stringCons = new StringBuilder();

        for (int i = 0; i < inputChars.length; i++) {

            if (i%2 == 0) {

                stringCons.append(inputChars[i]);
            }

        }

        return stringCons.toString();
    }

}

/* Copyright 2019 Diffblue Limited. All Rights Reserved. */
package com.diffblue;

/**
 * This class implements some static string utility methods.
 *
 * To test all branches of these methods, the test generator needs to produce
 * input strings with specific properties (palindromes, whitespace, uppercase &
 * so on). This class has coverage for every line, which means the generator has
 * successfully identified suitable parameters.
 */
public class StringUtility {

    public static boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2 + 1; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String everyNthCharacterOf(String input, int n) {
        String output = "";
        for (int i = 0; i < input.length(); i += n) {
            output += input.charAt(i);
        }
        return output;
    }

    public static String reverse(String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }

    public static String repeat(String input, int n) {
        String output = "";
        for (int i = 0; i < n; i++) {
            output += input;
        }
        return output;
    }

    public boolean isUpperCase(String input) {
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c) && Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean isDayOfMonth(String input) {
        int i = Integer.parseInt(input);
        return i > 0 && i < 32;
    }

    public static boolean isWhitespace(char c) {
        return (c == ' ') || (c == '	');
    }
}
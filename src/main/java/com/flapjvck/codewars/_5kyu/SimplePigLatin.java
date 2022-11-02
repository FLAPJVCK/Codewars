package com.flapjvck.codewars._5kyu;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word.
 * Leave punctuation marks untouched.
 */
public class SimplePigLatin {
    public static String pigIt(String str) {
        return Arrays.stream(str.split("\\s+"))
                .map(s -> s.matches("[a-zA-Z]+") ? s.substring(1) + s.charAt(0) + "ay" : s)
                .collect(Collectors.joining(" "));
    }
}

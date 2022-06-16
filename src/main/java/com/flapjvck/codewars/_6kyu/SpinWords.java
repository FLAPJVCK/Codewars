package com.flapjvck.codewars._6kyu;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Write a function that takes in a string of one or more words, and returns the same string, but with all five or
 * more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters
 * and spaces. Spaces will be included only when more than one word is present.
 * <p>
 * Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" spinWords( "This is a test") =>
 * returns "This is a test" spinWords( "This is another test" )=> returns "This is rehtona test"
 */
public class SpinWords {
    public String spinWords(String sentence) {
        String[] array = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String a : array) {
            if (a.length() > 4) {
                result.append(new StringBuffer(a).reverse()).append(" ");
            } else {
                result.append(a).append(" ");
            }
        }
        result.setLength(result.length() - 1);
        return result.toString();
    }
}

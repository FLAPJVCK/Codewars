package com.flapjvck.codewars._4kyu;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codewars.com/kata/51b66044bce5799a7f000003
 */
public class RomanNumerals {
    static Map<Character, Integer> dictionary = new HashMap<>();
    static String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    static int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

    static {
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);
    }

    public static String toRoman(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = values.length - 1; i >= 0; i--) {
            while (n >= values[i]) {
                n -= values[i];
                result.append(roman[i]);
            }
        }
        return result.toString();
    }

    public static int fromRoman(String romanNumeral) {
        int result = 0;
        for (int i = 0; i < romanNumeral.length(); i++) {
            if (i != romanNumeral.length() - 1 && dictionary.get(romanNumeral.charAt(i)) < dictionary.get(romanNumeral.charAt(i + 1))) {
                result += dictionary.get(romanNumeral.charAt(i + 1)) - dictionary.get(romanNumeral.charAt(i));
                i++;
            } else {
                result += dictionary.get(romanNumeral.charAt(i));
            }
        }
        return result;
    }
}

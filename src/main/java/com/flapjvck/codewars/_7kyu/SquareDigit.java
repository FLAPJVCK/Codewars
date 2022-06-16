package com.flapjvck.codewars._7kyu;

/**
 * Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
 *
 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
 *
 * Note: The function accepts an integer and returns an integer
 */
public class SquareDigit {
    public int squareDigits(int n) {
        char[] values = String.valueOf(n).toCharArray();
        StringBuilder result = new StringBuilder();
        for (char s : values) {
            result.append((int) Math.pow(Integer.parseInt(String.valueOf(s)), 2));
        }
        return Integer.parseInt(result.toString());
    }
}

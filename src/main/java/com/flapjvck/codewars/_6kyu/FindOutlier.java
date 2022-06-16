package com.flapjvck.codewars._6kyu;

import java.util.Arrays;
import java.util.Optional;

/*
You are given an array (which will have a length of at least 3, but could be very large) containing integers.
The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single
integer N. Write a method that takes the array as an argument and returns this "outlier" N.

Examples
[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)
 */
public class FindOutlier {
    static int find(int[] integers) {
        int countEven = 0;
        int countOdd = 0;
        int tempOdd = 0;
        int tempEven = 0;
        for (int integer : integers) {
            if (integer % 2 == 0 && countEven < 2) {
                countEven++;
                tempEven = integer;
            } else if (integer % 2 == 1 && countOdd < 2) {
                countOdd++;
                tempOdd = integer;
            }
        }
        return countEven == 1 ? tempEven : tempOdd;
    }
}

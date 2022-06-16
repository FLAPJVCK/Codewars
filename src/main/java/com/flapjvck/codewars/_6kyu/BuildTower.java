package com.flapjvck.codewars._6kyu;

import java.util.Arrays;

/**
 * Build a pyramid-shaped tower given a positive integer number of floors. A tower block is represented with "*" character.
 * <p>
 * For example, a tower with 3 floors looks like this:
 * <p>
 * [
 * "  *  ",
 * " *** ",
 * "*****"
 * ]
 * And a tower with 6 floors looks like this:
 * <p>
 * [
 * "     *     ",
 * "    ***    ",
 * "   *****   ",
 * "  *******  ",
 * " ********* ",
 * "***********"
 * ]
 */
public class BuildTower {
    public static String[] towerBuilder(int nFloors) {
        String[] tower = new String[nFloors];
        StringBuilder result = new StringBuilder();
        for (int i = 1, j = 0; j < nFloors; i = i + 2, j++) {
            String repeat = " ".repeat(Math.max(0, (nFloors - j - 1)));
            result.append(repeat);
            result.append("*".repeat(Math.max(0, i)));
            result.append(repeat);
            tower[j] = result.toString();
            result.setLength(0);
        }
        return tower;
    }
}

package com.flapjvck.codewars._4kyu;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/5263c6999e0f40dee200059d
 */
public class ObservedPin {
    public static void main(String[] args) {
        System.out.println(getPINs("11"));
    }

    public static List<String> getPINs(String observed) {
        List<String> result = new ArrayList<>();
        String[] digits = observed.split("");

        List<List<StringBuilder>> dictionary = new ArrayList<>();
        dictionary.add(0, List.of(new StringBuilder("0"), new StringBuilder("8")));
        dictionary.add(1, List.of(new StringBuilder("1"), new StringBuilder("2"), new StringBuilder("4")));
        dictionary.add(2, List.of(new StringBuilder("1"), new StringBuilder("2"), new StringBuilder("3"), new StringBuilder("5")));
        dictionary.add(3, List.of(new StringBuilder("2"), new StringBuilder("3"), new StringBuilder("6")));
        dictionary.add(4, List.of(new StringBuilder("1"), new StringBuilder("4"), new StringBuilder("5"), new StringBuilder("7")));
        dictionary.add(5, List.of(new StringBuilder("2"), new StringBuilder("4"), new StringBuilder("5"), new StringBuilder("6"), new StringBuilder("8")));
        dictionary.add(6, List.of(new StringBuilder("3"), new StringBuilder("5"), new StringBuilder("6"), new StringBuilder("9")));
        dictionary.add(7, List.of(new StringBuilder("4"), new StringBuilder("7"), new StringBuilder("8")));
        dictionary.add(8, List.of(new StringBuilder("5"), new StringBuilder("7"), new StringBuilder("8"), new StringBuilder("9"), new StringBuilder("0")));
        dictionary.add(9, List.of(new StringBuilder("6"), new StringBuilder("8"), new StringBuilder("9")));

        List<List<StringBuilder>> data = new ArrayList<>();
        for (String digit : digits) {
            data.add(dictionary.get(Integer.parseInt(digit)));
        }

        List<List<StringBuilder>> cp = Collections.singletonList(Collections.emptyList());
        for (List<StringBuilder> list : data) {
            if (list == null || list.size() == 0) continue;
            List<List<StringBuilder>> next = new ArrayList<>();
            for (List<StringBuilder> row : cp) {
                for (StringBuilder el : list) {
                    List<StringBuilder> nRow = new ArrayList<>(row);
                    nRow.add(el);
                    next.add(nRow);
                }
            }
            cp = next;
        }

        for (int i = 0; i < digits.length; i++) {
            for (List<StringBuilder> row : cp) {
                StringBuilder temp = new StringBuilder();
                for (StringBuilder el : row) {
                    temp.append(el);
                }
                result.add(i,temp.toString());
            }
        }

        return result.stream().distinct().collect(Collectors.toList());
    }
}

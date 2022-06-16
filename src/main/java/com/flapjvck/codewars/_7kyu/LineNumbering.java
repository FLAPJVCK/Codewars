package com.flapjvck.codewars._7kyu;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/*
Your team is writing a fancy new text editor, and you've been tasked with implementing the line numbering.

Write a function which takes a list of strings and returns each line prepended by the correct number.

The numbering starts at 1. The format is n: string. Notice the colon and space in between.

Examples: (Input --> Output)

[] --> []
["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
 */
public class LineNumbering {
    public static List<String> number(List<String> lines) {
        AtomicInteger i = new AtomicInteger(1);
        return lines.stream().map(line -> i.getAndIncrement() + ": " + line).collect(Collectors.toList());
    }
}

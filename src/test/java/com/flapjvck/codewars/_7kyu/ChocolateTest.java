package com.flapjvck.codewars._7kyu;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ChocolateTest {
    @Test
    public void myTests() {
        assertEquals(24, Chocolate.breakChocolate(5, 5));
        assertEquals(0, Chocolate.breakChocolate(1, 1));
    }

}
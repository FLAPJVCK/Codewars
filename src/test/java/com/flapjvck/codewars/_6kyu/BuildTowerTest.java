package com.flapjvck.codewars._6kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildTowerTest {
    @Test
    public void basicTests() {
        assertEquals(String.join(",", "*"), String.join(",", BuildTower.towerBuilder(1)));
        assertEquals(String.join(",", " * ", "***"), String.join(",", BuildTower.towerBuilder(2)));
        assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", BuildTower.towerBuilder(3)));
    }
}
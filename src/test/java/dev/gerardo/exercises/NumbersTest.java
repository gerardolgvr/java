package dev.gerardo.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersTest {

    @Test
    public void testHighAndLow() {
        assertEquals("42 -9", Numbers.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

}

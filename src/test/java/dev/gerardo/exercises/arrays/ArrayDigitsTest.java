package dev.gerardo.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayDigitsTest {

    @Test
    public void testCase0() {
        assertArrayEquals(new int[] { 2, 3, 4, 5}, ArrayDigits.digitalize(2345));
    }

}

package dev.gerardo.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumSwapsTest {

    @Test
    public void testCase0() {
        assertEquals(3, MinimumSwaps.process(new int[] { 4, 3, 1, 2}));
    }

    @Test
    public void testCase1() {
        assertEquals(3, MinimumSwaps.process(new int[] { 2, 3, 4, 1, 5 }));
    }

    @Test
    public void testCase2() {
        assertEquals(3, MinimumSwaps.process(new int[] { 1, 3, 5, 2, 4, 6, 7 }));
    }

}

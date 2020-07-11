package dev.gerardo.exercises.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarkAndToysTest {

    @Test
    public void test0(){
        assertEquals(4, MarkAndToys.maximumToys(new int[] { 1, 12, 5, 111, 200, 1000, 10 }, 50));
    }

    @Test
    public void test16(){
        assertEquals(3, MarkAndToys.maximumToys(new int[] { 1, 2, 3, 4 }, 7));
    }

    @Test
    public void test17(){
        assertEquals(3, MarkAndToys.maximumToys(new int[] { 3, 7, 2, 9, 4 }, 15));
    }
}

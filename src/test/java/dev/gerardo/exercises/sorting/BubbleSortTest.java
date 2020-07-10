package dev.gerardo.exercises.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {

    @Test
    public void test0(){
        assertEquals(0, BubbleSort.countSwaps(new int[] { 1, 2, 3 }));
    }

    @Test
    public void test1(){
        assertEquals(3, BubbleSort.countSwaps(new int[] { 3, 2, 1 }));
    }

    @Test
    public void test2(){
        assertEquals(5, BubbleSort.countSwaps(new int[] { 4, 2, 3, 1 }));
    }

}

package dev.gerardo.exercises.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {

    @Test
    public void test0(){
        assertArrayEquals(new int[] { 1, 2, 3 }, InsertionSort.sort(new int[] { 1, 2, 3 }));
    }

    @Test
    public void test1(){
        assertArrayEquals(new int[] { 1, 2, 3 }, InsertionSort.sort(new int[] { 3, 2, 1 }));
    }

    @Test
    public void test2(){
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, InsertionSort.sort(new int[] { 4, 2, 3, 1 }));
    }
}

package dev.gerardo.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumbersTest {

    @Test
    public void numberTest0(){
        assertArrayEquals(new int[] { 5, 1, 2, 3, 4 }, Numbers.rotLeft(new int[] { 1, 2, 3, 4, 5}, 4));
    }

    @Test
    public void numberTest1(){
        assertArrayEquals(new int[] { 77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77}, Numbers.rotLeft(new int[] { 41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51}, 10));
    }

    @Test
    public void numberTest3(){
        assertArrayEquals(new int[] { 87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60 }, Numbers.rotLeft(new int[] { 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97 }, 13));
    }
}

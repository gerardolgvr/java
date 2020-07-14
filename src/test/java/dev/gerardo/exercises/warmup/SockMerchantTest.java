package dev.gerardo.exercises.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SockMerchantTest {

    @Test
    public void firstSampleTest(){
        Assertions.assertEquals(3, SockMerchant.countPairs(9, new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }

    @Test
    public void secondSampleTest(){
        assertEquals(4, SockMerchant.countPairs(10, new int[] {1, 1, 3, 1, 2, 1, 3, 3, 3, 3}));
    }

    @Test
    public void testCase1(){
        assertEquals(6, SockMerchant.countPairs(15, new int[] {6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5}));
    }

    @Test
    public void testCase2(){
        assertEquals(9, SockMerchant.countPairs(20, new int[] {4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5}));
    }

    @Test
    public void testCase6(){
        assertEquals(28, SockMerchant.countPairs(100, new int[] {50, 49, 38, 49, 78, 36, 25, 96, 10, 67, 78, 58, 98, 8, 53, 1, 4, 7, 29, 6, 59, 93, 74, 3, 67, 47, 12, 85, 84, 40, 81, 85, 89, 70, 33, 66, 6, 9, 13, 67, 75, 42, 24, 73, 49, 28, 25, 5, 86, 53, 10, 44, 45, 35, 47, 11, 81, 10, 47, 16, 49, 79, 52, 89, 100, 36, 6, 57, 96, 18, 23, 71, 11, 99, 95, 12, 78, 19, 16, 64, 23, 77, 7, 19, 11, 5, 81, 43, 14, 27, 11, 63, 57, 62, 3, 56, 50, 9, 13, 45}));
    }

    @Test
    public void testCase7(){
        assertEquals(50, SockMerchant.countPairs(100, new int[] {42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42}));
    }
}

package dev.gerardo.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SockMerchantTest {

    @Test
    public void firstSampleTest(){
        assertEquals(3, SockMerchant.countPairs(9, new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }

    @Test
    public void secondSampleTest(){
        assertEquals(4, SockMerchant.countPairs(10, new int[] {1, 1, 3, 1, 2, 1, 3, 3, 3, 3}));
    }
}

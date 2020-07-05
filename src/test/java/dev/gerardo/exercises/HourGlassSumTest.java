package dev.gerardo.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HourGlassSumTest {

    @Test
    public void hourGlassSumTest1(){
        int[][] arr = {
                { 1, 1, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0 },
                { 1, 1, 1, 0, 0, 0 },
                { 0, 0, 2, 4, 4, 0 },
                { 0, 0, 0, 2, 0, 0 },
                { 0, 0, 1, 2, 4, 0 }
        };

        assertEquals(19, HourGlassSum.getHigher(arr));
    }

    @Test
    public void hourGlassSumTest2(){
        int[][] arr = {
                { 1, 1, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0 },
                { 1, 1, 1, 0, 0, 0 },
                { 0, 9, 2, -4, -4, 0 },
                { 0, 0, 0, -2, 0, 0 },
                { 0, 0, -1, -2, -4, 0 }
        };

        assertEquals(13, HourGlassSum.getHigher(arr));
    }

    @Test
    public void hourGlassSumTest3(){
        int[][] arr = {
                { -9, -9, -9, 1, 1, 1 },
                { 0, -9, 0, 4, 3, 2 },
                { -9, -9, -9, 1, 2, 3 },
                { 0, 0, 8, 6, 6, 0 },
                { 0, 0, 0, -2, 0, 0 },
                { 0, 0, 1, 2, 4, 0 }
        };

        assertEquals(28, HourGlassSum.getHigher(arr));
    }

}

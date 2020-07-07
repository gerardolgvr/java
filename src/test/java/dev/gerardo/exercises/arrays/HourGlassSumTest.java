package dev.gerardo.exercises.arrays;

import dev.gerardo.exercises.arrays.HourGlassSum;
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

    @Test
    public void hourGlassSumTest33(){
        int[][] arr = {
                { -1, -1,  0, -9, -2, -2 },
                { -2, -1, -6, -8, -2, -5 },
                { -1, -1, -1, -2, -3, -4 },
                { -1, -9, -2, -4, -4, -5 },
                { -7, -3, -3, -2, -9, -9 },
                { -1, -3, -1, -2, -4, -5 }
        };

        assertEquals(-6, HourGlassSum.getHigher(arr));
    }

    @Test
    public void hourGlassSumTest7(){
        int[][] arr = {
                { 0, -4, -6, 0, -7, -6 },
                { -1, -2, -6, -8, -3, -1 },
                { -8, -4, -2, -8, -8, -6 },
                { -3, -1, -2, -5, -7, -4 },
                { -3, -5, -3, -6, -6, -6 },
                { -3, -6, 0, -8, -6, -7 }
        };

        assertEquals(-19, HourGlassSum.getHigher(arr));
    }

}

package dev.gerardo.exercises.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SkyTest {

    @Test
    public void sample(){
        Assertions.assertEquals(3, Sky.jumpingOnClouds(6, new int[] {0, 0, 0, 1, 0, 0}));
        assertEquals(4, Sky.jumpingOnClouds(7, new int[] {0, 0, 1, 0, 0, 1, 0}));
    }
}

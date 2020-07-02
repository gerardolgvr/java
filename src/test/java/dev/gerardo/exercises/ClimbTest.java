package dev.gerardo.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbTest {

    @Test
    public void sample(){
        assertEquals(3, Climb.countingValleys(8, "UDDDUDUU"));
    }

}

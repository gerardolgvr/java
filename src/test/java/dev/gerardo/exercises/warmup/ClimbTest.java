package dev.gerardo.exercises.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbTest {

    @Test
    public void sample(){
        Assertions.assertEquals(3, Climb.countingValleys(8, "UDDDUDUU"));
    }

}

package dev.gerardo.exercises.warmup;

import dev.gerardo.exercises.warmup.RepeatedString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedStringTest {

    @Test
    public void test1(){
        assertEquals(7, RepeatedString.process("aba", (long) 10));
    }

    @Test
    public void test2(){
        assertEquals(1000000, RepeatedString.process("a", (long) 1000000));
    }
}

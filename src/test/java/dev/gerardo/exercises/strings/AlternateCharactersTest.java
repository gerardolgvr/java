package dev.gerardo.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlternateCharactersTest {

    @Test
    public void test0(){
        assertEquals(3, AlternateCharacters.process("AAAA"));
    }

    @Test
    public void test1(){
        assertEquals(6, AlternateCharacters.process("AAABBBAABB"));
    }

    @Test
    public void test2(){
        assertEquals(4, AlternateCharacters.process("AABBAABB"));
    }

    @Test
    public void test3(){
        assertEquals(1, AlternateCharacters.process("ABABABAA"));
    }

    @Test
    public void test4(){
        assertEquals(3, AlternateCharacters.process("ABBABBAA"));
    }

    @Test
    public void test5(){
        assertEquals(4, AlternateCharacters.process("AAABBB"));
    }

    @Test
    public void test6(){
        assertEquals(0, AlternateCharacters.process("BABABA"));
    }
}

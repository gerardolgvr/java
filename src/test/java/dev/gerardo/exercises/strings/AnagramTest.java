package dev.gerardo.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {

    @Test
    public void test0(){
        assertEquals(2, Anagram.process("showman", "woman"));
    }

    @Test
    public void test1(){
        assertEquals(30, Anagram.process("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }

    @Test
    public void test2(){
        assertEquals(4, Anagram.process("cde", "abc"));
    }
}

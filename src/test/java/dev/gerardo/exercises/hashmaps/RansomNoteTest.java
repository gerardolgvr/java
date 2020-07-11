package dev.gerardo.exercises.hashmaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RansomNoteTest {

    @Test
    public void test0(){
        assertEquals("Yes", RansomNote.checkMagazine(new String[] { "give", "me", "one", "grand", "today", "night" }, new String[] { "give", "one", "grand", "today" }));

    }

    @Test
    public void test20(){
        assertEquals("No", RansomNote.checkMagazine(new String[] { "two", "times", "three", "is", "not", "four" }, new String[] { "two", "times", "two", "is", "four" }));
    }

    @Test
    public void test21(){
        assertEquals("No", RansomNote.checkMagazine(new String[] { "two", "times", "three", "is", "not", "four" }, new String[] { "two", "times", "two", "is", "four" }));
    }
}

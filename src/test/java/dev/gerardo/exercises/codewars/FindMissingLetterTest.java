package dev.gerardo.exercises.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMissingLetterTest {

    @Test
    void exampleTest() {
        Assertions.assertEquals('e', FindMissingLetter.find(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', FindMissingLetter.find(new char[] { 'O','Q','R','S' }));
    }
}

package dev.gerardo.exercises.hashmaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoStringsTest {

    @Test
    public void tes0(){
        assertEquals("YES", TwoStrings.compare("hello", "world"));
        assertEquals("NO", TwoStrings.compare("hi", "world"));
    }

    @Test
    public void tes6(){
        assertEquals("NO", TwoStrings.compare("wouldyoulikefries", "abcabcabcabcabcabc"));
        assertEquals("YES", TwoStrings.compare("hackerrankcommunity", "cdecdecdecde"));
        assertEquals("YES", TwoStrings.compare("jackandjill", "wentupthehill"));
        assertEquals("NO", TwoStrings.compare("writetoyourparents", "fghmqzldbc"));
    }

    @Test
    public void tes7(){
        assertEquals("YES", TwoStrings.compare("aardvark", "apple"));
        assertEquals("NO", TwoStrings.compare("beetroot", "sandals"));
    }
}

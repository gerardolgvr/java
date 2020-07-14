package dev.gerardo.exercises.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PinTest {

    @Test
    public void validPins() {
        Assertions.assertEquals(true, Pin.validate("1234"));
        assertEquals(true, Pin.validate("0000"));
        assertEquals(true, Pin.validate("1111"));
        assertEquals(true, Pin.validate("123456"));
        assertEquals(true, Pin.validate("098765"));
        assertEquals(true, Pin.validate("000000"));
        assertEquals(true, Pin.validate("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, Pin.validate("a234"));
        assertEquals(false, Pin.validate(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, Pin.validate("1"));
        assertEquals(false, Pin.validate("12"));
        assertEquals(false, Pin.validate("123"));
        assertEquals(false, Pin.validate("12345"));
        assertEquals(false, Pin.validate("1234567"));
        assertEquals(false, Pin.validate("-1234"));
        assertEquals(false, Pin.validate("1.234"));
        assertEquals(false, Pin.validate("00000000"));
    }

}

package dev.gerardo.exercises.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneNumberTest {

    @Test
    public void tests() {
        Assertions.assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

}

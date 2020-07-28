package dev.gerardo.exercises.regex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegexExercisesTest {

    @Test
    public void testValidName() {
        assertEquals(true, RegexExercises.validateName("youyou"));
        assertEquals(true, RegexExercises.validateName("u"));
        assertEquals(true, RegexExercises.validateName("uuuuuuu"));
        assertEquals(true, RegexExercises.validateName("youuuuu"));


    }

    @Test
    public void replace() {
        assertEquals("your client", RegexExercises.replacement("you"));
        assertEquals("your client", RegexExercises.replacement("youyou"));
        assertEquals("your client", RegexExercises.replacement("youyouyou"));
        assertEquals("your client", RegexExercises.replacement("youyouyou"));
        assertEquals("your client", RegexExercises.replacement("youuuyouyou"));
        assertEquals("your client", RegexExercises.replacement("youuuuuuyou"));
        assertEquals("ube", RegexExercises.replacement("ube"));
        assertEquals("youtube", RegexExercises.replacement("youtube"));
    }

    @Test
    public void validateISBNTest() {
        assertEquals(true, RegexExercises.validateISBN("9781234567890"));
        assertEquals(true, RegexExercises.validateISBN("9791234567890"));
        assertEquals(false, RegexExercises.validateISBN("9801234567890"));
        assertEquals(false, RegexExercises.validateISBN("980123456789"));
    }

    @Test
    public void validateTwitterUser() {
        assertEquals(true, RegexExercises.validateTwitterUser("@gerar"));
        assertEquals(true, RegexExercises.validateTwitterUser("@gerardo_lgvr"));
        assertEquals(true, RegexExercises.validateTwitterUser("@_gerardo_lgvr0310"));
        assertEquals(true, RegexExercises.validateTwitterUser("@_Gerardo_lgvr0310"));
    }

    @Test
    public void validateEmail() {
        assertEquals(true, RegexExercises.validateEmailAlt("luis@gmail.com"));
        assertEquals(true, RegexExercises.validateEmailAlt("luis_12@gmail.com"));
        assertEquals(true, RegexExercises.validateEmailAlt("luis.-12@gmail.com"));
    }

    @Test
    public void validateName() {
        assertEquals(true, RegexExercises.validateNameM("Luis Gerardo"));
        assertEquals(true, RegexExercises.validateNameM("Luis Gerardo Ricardo"));
    }
}

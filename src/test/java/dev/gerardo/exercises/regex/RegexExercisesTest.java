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

    @Test
    public void validateInteger() {
        assertEquals(true, RegexExercises.validateInteger("24324"));
        assertEquals(false, RegexExercises.validateInteger("243.24"));
        assertEquals(true, RegexExercises.validateInteger("-24324"));
        assertEquals(false, RegexExercises.validateInteger("2-4324"));
        assertEquals(false, RegexExercises.validateInteger("-24.324"));
    }

    @Test
    public void validatePositiveInteger() {
        assertEquals(true, RegexExercises.validatePositiveInteger("5345"));
        assertEquals(false, RegexExercises.validatePositiveInteger("-5345"));
        assertEquals(false, RegexExercises.validatePositiveInteger("53-45"));
    }

    @Test
    public void validateNegativeInteger() {
        assertEquals(false, RegexExercises.validateNegativeInteger("5345"));
        assertEquals(true, RegexExercises.validateNegativeInteger("-5345"));
        assertEquals(false, RegexExercises.validateNegativeInteger("53-45"));
    }

    @Test
    public void validateDNI() {
        assertEquals(true, RegexExercises.validateDNI("12345678A"));
        assertEquals(false, RegexExercises.validateDNI("12345678"));
        assertEquals(false, RegexExercises.validateDNI("12345678AA"));
        assertEquals(false, RegexExercises.validateDNI("A12345678AA"));
    }

    @Test
    public void validateIP() {
        assertEquals(true, RegexExercises.validateIP("192.168.2.1"));
        assertEquals(false, RegexExercises.validateIP("256.168.0.1"));
    }

    @Test
    public void validateReg(){
        assertEquals(false, RegexExercises.validateReg("aa", "a"));
        assertEquals(true, RegexExercises.validateReg("aa", "a*"));
        assertEquals(true, RegexExercises.validateReg("ab", ".*"));
        assertEquals(true, RegexExercises.validateReg("aab", "c*a*b"));
        assertEquals(false, RegexExercises.validateReg("mississippi", "mis*is*p*."));

    }

    @Test
    public void validateW(){
        assertEquals(true, RegexExercises.validateW("www.google.com"));
        assertEquals(true, RegexExercises.validateW("www.google.com"));
        assertEquals(true, RegexExercises.validateW("www.google.maps.com"));
        assertEquals(true, RegexExercises.validateW("www.maps.google.com"));
        assertEquals(true, RegexExercises.validateW("http://www.google.com"));
        assertEquals(true, RegexExercises.validateW("https://www.google.com"));
        assertEquals(false, RegexExercises.validateW("http://www.sample.com/#xyz"));
    }

    @Test
    public void validateV(){
        /*System.out.println(RegexExercises.validateV("www.algo.com"));
        assertEquals("wwwlgcm", RegexExercises.validateV("www.algo.com"));
        System.out.println(RegexExercises.validateV("www.studio17mx.com"));
        assertEquals("wwwstdmxcm", RegexExercises.validateV("www.studio17mx.com"));
        System.out.println(RegexExercises.validateV("www.studio17mx.com/home#"));
        assertEquals("wwwstdmxcmhm", RegexExercises.validateV("www.studio17mx.com/home#"));*/
        System.out.println(RegexExercises.validateV("https://www.studio17mx.com/home#"));
        //assertEquals("wwwstdmxcmhm", RegexExercises.validateV("https://www.studio17mx.com/home#"));
    }
}

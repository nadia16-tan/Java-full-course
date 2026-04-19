package module05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringExercisesTest {

    @Test
    void testExercise1_extractMiddleName() {
        assertEquals("Michael", StringExercises.exercise1_extractMiddleName("John Michael Doe"));
        assertEquals("", StringExercises.exercise1_extractMiddleName("John Doe"));
    }

    @Test
    void testExercise2_validateIDPrefix() {
        assertTrue(StringExercises.exercise2_validateIDPrefix("ZA1234"));
        assertFalse(StringExercises.exercise2_validateIDPrefix("ZA12"));
        assertFalse(StringExercises.exercise2_validateIDPrefix("US1234"));
    }

    @Test
    void testExercise3_removeProtocol() {
        assertEquals("example.com", StringExercises.exercise3_removeProtocol("https://example.com"));
        assertEquals("example.com", StringExercises.exercise3_removeProtocol("http://example.com"));
    }

    @Test
    void testExercise4_isPalindrome() {
        assertTrue(StringExercises.exercise4_isPalindrome("madam"));
        assertFalse(StringExercises.exercise4_isPalindrome("hello"));
        assertTrue(StringExercises.exercise4_isPalindrome("a"));
    }

    @Test
    void testExercise5_formatPhoneNumber() {
        assertEquals("(123) 456-7890", StringExercises.exercise5_formatPhoneNumber("1234567890"));
        assertEquals("Invalid phone number", StringExercises.exercise5_formatPhoneNumber("123"));
    }

    @Test
    void testExercise6_validateEmail() {
        assertTrue(StringExercises.exercise6_validateEmail("test@example.com"));
        assertTrue(StringExercises.exercise6_validateEmail("test@example.org"));
        assertFalse(StringExercises.exercise6_validateEmail("invalid_email"));
        assertFalse(StringExercises.exercise6_validateEmail("test@ex@mple.com"));
    }

    @Test
    void testExercise7_capitalizeFirstLetter() {
        assertEquals("Hello", StringExercises.exercise7_capitalizeFirstLetter("hello"));
        assertEquals("World", StringExercises.exercise7_capitalizeFirstLetter("World"));
        assertEquals("", StringExercises.exercise7_capitalizeFirstLetter(""));
    }

    @Test
    void testExercise8_extractDomain() {
        assertEquals("example.com", StringExercises.exercise8_extractDomain("https://example.com"));
        assertEquals("example.com", StringExercises.exercise8_extractDomain("http://example.com/path"));
    }
}
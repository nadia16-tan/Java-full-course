package module01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasicConversionExercisesTest {

    @Test
    void testExercise1_addNumbers() {
        assertEquals(5, BasicConversionExercises.exercise1_addNumbers(2, 3));
        assertEquals(0, BasicConversionExercises.exercise1_addNumbers(0, 0));
        assertEquals(-1, BasicConversionExercises.exercise1_addNumbers(2, -3));
    }

    @Test
    void testExercise2_isEven() {
        assertTrue(BasicConversionExercises.exercise2_isEven(4));
        assertFalse(BasicConversionExercises.exercise2_isEven(5));
        assertTrue(BasicConversionExercises.exercise2_isEven(0));
    }

    @Test
    void testExercise3_greet() {
        assertEquals("Hello, John", BasicConversionExercises.exercise3_greet("John"));
        assertEquals("Hello, ", BasicConversionExercises.exercise3_greet(""));
    }

    @Test
    void testExercise4_calculateArea() {
        assertEquals(3.14159, BasicConversionExercises.exercise4_calculateArea(1), 0.0001);
        assertEquals(0.0, BasicConversionExercises.exercise4_calculateArea(0), 0.0001);
    }

    @Test
    void testExercise5_maxOfTwo() {
        assertEquals(5, BasicConversionExercises.exercise5_maxOfTwo(5, 3));
        assertEquals(7, BasicConversionExercises.exercise5_maxOfTwo(2, 7));
        assertEquals(4, BasicConversionExercises.exercise5_maxOfTwo(4, 4));
    }

    @Test
    void testExercise6_isPositive() {
        assertTrue(BasicConversionExercises.exercise6_isPositive(5));
        assertFalse(BasicConversionExercises.exercise6_isPositive(0));
        assertFalse(BasicConversionExercises.exercise6_isPositive(-3));
    }

    @Test
    void testExercise7_getFirstChar() {
        assertEquals("H", BasicConversionExercises.exercise7_getFirstChar("Hello"));
        assertEquals("", BasicConversionExercises.exercise7_getFirstChar(""));
    }
}
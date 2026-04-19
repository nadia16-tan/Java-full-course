package module03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoopExercisesTest {

    @Test
    void testExercise1_guessingGame() {
        assertEquals(2, LoopExercises.exercise1_guessingGame(new int[]{5, 7}, 7));
        assertEquals(1, LoopExercises.exercise1_guessingGame(new int[]{3}, 3));
    }

    @Test
    void testExercise2_pinValidator() {
        assertEquals(2, LoopExercises.exercise2_pinValidator(new int[]{1111, 1234}));
        assertEquals(1, LoopExercises.exercise2_pinValidator(new int[]{1234}));
    }

    @Test
    void testExercise3_sumUntilZero() {
        assertEquals(10, LoopExercises.exercise3_sumUntilZero(new int[]{5, 3, 2, 0}));
        assertEquals(0, LoopExercises.exercise3_sumUntilZero(new int[]{0}));
    }

    @Test
    void testExercise4_numberPrinter() {
        assertEquals("1, 2, 3, 4, 6, 7, 8, 9",
                LoopExercises.exercise4_numberPrinter(10));
    }

    @Test
    void testExercise5_passwordChecker() {
        assertEquals("Access granted!",
                LoopExercises.exercise5_passwordChecker(new String[]{"wrong", "secret"}));

        assertEquals("Access denied",
                LoopExercises.exercise5_passwordChecker(new String[]{"a", "b", "c"}));
    }

    @Test
    void testExercise6_evenNumbers() {
        assertEquals("2, 4, 6, 8",
                LoopExercises.exercise6_evenNumbers(8));
    }
}
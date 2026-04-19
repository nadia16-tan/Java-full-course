package module06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedLoopExercisesTest {

    @Test
    void testExercise1_printNumbers() {
        assertEquals("1, 2, 4, 5, 7, 8, 10",
                AdvancedLoopExercises.exercise1_printNumbers(10));
    }

    @Test
    void testExercise2_printNumbers() {
        assertEquals("1, 2, 3, 4, 5",
                AdvancedLoopExercises.exercise2_printNumbers(1, 10));
    }

    @Test
    void testExercise3_printNumbers() {
        assertEquals("Num: 1, Num: 3, Num: 5",
                AdvancedLoopExercises.exercise3_printNumbers(5, "Num: "));
    }

    @Test
    void testExercise4_printArray() {
        assertEquals("1, 3, 5",
                AdvancedLoopExercises.exercise4_printArray(new int[]{1, -2, 3, -4, 5}));
    }

    @Test
    void testExercise5_printArray() {
        assertEquals("1, 2",
                AdvancedLoopExercises.exercise5_printArray(new int[]{1, 2, 3, 4}, 3));
    }

    @Test
    void testExercise6_printArray() {
        assertEquals("Word: hello, Word: world",
                AdvancedLoopExercises.exercise6_printArray(
                        new String[]{"hello", "ignore me", "world"}, "Word: "));
    }
}
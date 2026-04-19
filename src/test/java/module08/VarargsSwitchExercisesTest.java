package module08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VarargsSwitchExercisesTest {

    @Test
    void testExercise1_sumNumbers() {
        assertEquals(6, VarargsSwitchExercises.exercise1_sumNumbers(1, 2, 3));
        assertEquals(0, VarargsSwitchExercises.exercise1_sumNumbers());
    }

    @Test
    void testExercise2_findMax() {
        assertEquals(5, VarargsSwitchExercises.exercise2_findMax(1, 5, 3));
        assertEquals(Integer.MIN_VALUE, VarargsSwitchExercises.exercise2_findMax());
    }

    @Test
    void testExercise3_countEven() {
        assertEquals(2, VarargsSwitchExercises.exercise3_countEven(1, 2, 3, 4));
        assertEquals(0, VarargsSwitchExercises.exercise3_countEven(1, 3, 5));
    }

    @Test
    void testExercise4_dayType() {
        assertEquals("Weekday", VarargsSwitchExercises.exercise4_dayType("MONDAY"));
        assertEquals("Weekend", VarargsSwitchExercises.exercise4_dayType("SUNDAY"));
        assertEquals("Invalid day", VarargsSwitchExercises.exercise4_dayType("XYZ"));
    }

    @Test
    void testExercise5_gradeEvaluator() {
        assertEquals("Excellent", VarargsSwitchExercises.exercise5_gradeEvaluator("A"));
        assertEquals("Fail", VarargsSwitchExercises.exercise5_gradeEvaluator("F"));
        assertEquals("Invalid grade", VarargsSwitchExercises.exercise5_gradeEvaluator("Z"));
    }

    @Test
    void testExercise6_calculator() {
        assertEquals(5.0, VarargsSwitchExercises.exercise6_calculator(2, 3, "+"));
        assertEquals(0.0, VarargsSwitchExercises.exercise6_calculator(5, 0, "/"));
    }

    @Test
    void testExercise7_monthDays() {
        assertEquals(31, VarargsSwitchExercises.exercise7_monthDays("JAN"));
        assertEquals(28, VarargsSwitchExercises.exercise7_monthDays("FEB"));
        assertEquals(-1, VarargsSwitchExercises.exercise7_monthDays("XYZ"));
    }
}
package module13;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedJavaExercisesTest {

    @Test
    void testExercise1_getCurrentDate() {
        String result = AdvancedJavaExercises.exercise1_getCurrentDate();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void testExercise2_getCurrentTime() {
        String result = AdvancedJavaExercises.exercise2_getCurrentTime();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void testExercise3_formatDate() {
        String result = AdvancedJavaExercises.exercise3_formatDate();
        assertTrue(result.matches("\\d{2}-\\d{2}-\\d{4}"));
    }

    @Test
    void testExercise4_anonymousRunnable() {
        assertEquals("Running",
                AdvancedJavaExercises.exercise4_anonymousRunnable());
    }

    @Test
    void testExercise5_timerTask() {
        assertEquals("Task executed",
                AdvancedJavaExercises.exercise5_timerTask());
    }
}
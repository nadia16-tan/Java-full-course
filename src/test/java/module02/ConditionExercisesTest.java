package module02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConditionExercisesTest {

    @Test
    void testExercise1_temperatureAlert() {
        assertEquals("It's not hot.", ConditionExercises.exercise1_temperatureAlert(25));
        assertEquals("It's not hot.", ConditionExercises.exercise1_temperatureAlert(30));
        assertEquals("It's hot!", ConditionExercises.exercise1_temperatureAlert(35));
    }

    @Test
    void testExercise2_ageVerification() {
        assertEquals("Access denied", ConditionExercises.exercise2_ageVerification(15));
        assertEquals("Access granted", ConditionExercises.exercise2_ageVerification(18));
        assertEquals("Access granted", ConditionExercises.exercise2_ageVerification(25));
    }

    @Test
    void testExercise3_evenOrOdd() {
        assertEquals("7 is odd", ConditionExercises.exercise3_evenOrOdd(7));
        assertEquals("10 is even", ConditionExercises.exercise3_evenOrOdd(10));
        assertEquals("0 is even", ConditionExercises.exercise3_evenOrOdd(0));
    }

    @Test
    void testExercise4_discountCalculator() {
        assertEquals("Discount: 20%, Final price: R960.00",
                ConditionExercises.exercise4_discountCalculator(1200));

        assertEquals("Discount: 10%, Final price: R675.00",
                ConditionExercises.exercise4_discountCalculator(750));

        assertEquals("Discount: 0%, Final price: R300.00",
                ConditionExercises.exercise4_discountCalculator(300));
    }

    @Test
    void testExercise5_weatherAdvisor() {
        assertEquals("Temperature: 35°C, Advice: It's hot!",
                ConditionExercises.exercise5_weatherAdvisor(35));

        assertEquals("Temperature: 20°C, Advice: It's mild.",
                ConditionExercises.exercise5_weatherAdvisor(20));

        assertEquals("Temperature: 5°C, Advice: It's cold.",
                ConditionExercises.exercise5_weatherAdvisor(5));
    }

    @Test
    void testExercise6_ageGroup() {
        assertEquals("Age: 10, Group: Child",
                ConditionExercises.exercise6_ageGroup(10));

        assertEquals("Age: 15, Group: Teen",
                ConditionExercises.exercise6_ageGroup(15));

        assertEquals("Age: 25, Group: Adult",
                ConditionExercises.exercise6_ageGroup(25));
    }
}
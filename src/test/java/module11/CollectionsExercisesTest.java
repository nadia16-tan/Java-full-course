package module11;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class CollectionsExercisesTest {

    @Test
    void testExercise1_sumWrapper() {
        assertEquals(5, CollectionsExercises.exercise1_sumWrapper(2, 3));
        assertEquals(3, CollectionsExercises.exercise1_sumWrapper(null, 3));
        assertEquals(0, CollectionsExercises.exercise1_sumWrapper(null, null));
    }

    @Test
    void testExercise2_filterEven() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4));
        assertEquals(Arrays.asList(2,4),
                CollectionsExercises.exercise2_filterEven(input));
    }

    @Test
    void testExercise3_listToString() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3));
        assertEquals("1, 2, 3",
                CollectionsExercises.exercise3_listToString(input));
    }

    @Test
    void testExercise4_mapLookup() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a",1);

        assertEquals(1,
                CollectionsExercises.exercise4_mapLookup(map,"a"));

        assertEquals(-1,
                CollectionsExercises.exercise4_mapLookup(map,"b"));
    }

    @Test
    void testExercise5_countFrequencies() {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("a","b","a"));

        HashMap<String,Integer> result =
                CollectionsExercises.exercise5_countFrequencies(words);

        assertEquals(2, result.get("a"));
        assertEquals(1, result.get("b"));
    }

    @Test
    void testExercise6_dayType() {
        assertEquals("Weekday",
                CollectionsExercises.exercise6_dayType(Day.MONDAY));

        assertEquals("Weekend",
                CollectionsExercises.exercise6_dayType(Day.SUNDAY));
    }

    @Test
    void testExercise7_gradeDescription() {
        assertEquals("Excellent",
                CollectionsExercises.exercise7_gradeDescription(Grade.A));

        assertEquals("Fail",
                CollectionsExercises.exercise7_gradeDescription(Grade.F));
    }
}
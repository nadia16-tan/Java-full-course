package module07;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayStringExercisesTest {

    @Test
    void testExercise1_splitString() {
        assertArrayEquals(
                new String[]{"hel", "lo ", "wor", "ld"},
                ArrayStringExercises.exercise1_splitString("hello world", 3)
        );

        assertArrayEquals(
                new String[]{"ab", "cd", "ef", "g"},
                ArrayStringExercises.exercise1_splitString("abcdefg", 2)
        );

        assertArrayEquals(
                new String[]{"short"},
                ArrayStringExercises.exercise1_splitString("short", 10)
        );
    }

    @Test
    void testExercise2_findLongestWord() {
        assertEquals("longest",
                ArrayStringExercises.exercise2_findLongestWord(
                        new String[]{"hello", "world", "abc", "longest"}));

        assertEquals("a",
                ArrayStringExercises.exercise2_findLongestWord(
                        new String[]{"a", "b", "c"}));

        assertEquals("hello",
                ArrayStringExercises.exercise2_findLongestWord(
                        new String[]{"", "hello", "", "world"}));
    }

    @Test
    void testExercise3_countVowels() {
        assertArrayEquals(
                new int[]{0,1,0,2,0},
                ArrayStringExercises.exercise3_countVowels("hello world")
        );

        assertArrayEquals(
                new int[]{1,1,1,1,1},
                ArrayStringExercises.exercise3_countVowels("aeiou")
        );

        assertArrayEquals(
                new int[]{0,0,0,0,0},
                ArrayStringExercises.exercise3_countVowels("bcdfg")
        );
    }
}
package module12;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

public class FileExercisesTest {

    @Test
    void testExercise1_safeDivide() {
        assertEquals(2, FileExercises.exercise1_safeDivide(4, 2));
        assertEquals(0, FileExercises.exercise1_safeDivide(5, 0));
    }

    @Test
    void testExercise2_parseInteger() {
        assertEquals(10, FileExercises.exercise2_parseInteger("10"));
        assertEquals(-1, FileExercises.exercise2_parseInteger("abc"));
    }

    @Test
    void testExercise3_writeAndReadFile() {
        String fileName = "test.txt";

        assertTrue(FileExercises.exercise3_writeFile(fileName, "Hello"));
        assertEquals("Hello", FileExercises.exercise4_readFile(fileName));
    }

    @Test
    void testExercise5_countLines() {
        String fileName = "lines.txt";

        FileExercises.exercise3_writeFile(fileName, "a\nb\nc");

        assertEquals(3, FileExercises.exercise5_countLines(fileName));
    }
}
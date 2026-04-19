package module10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RelationshipTest {

    @Test
    void testAggregation() {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        School school = new School("MySchool", new Student[]{s1, s2});

        assertEquals(2, school.countStudents());
    }

    @Test
    void testComposition() {
        Car car = new Car("Toyota", "V6");

        assertEquals("Model: Toyota, Engine: V6", car.describe());
    }
}
package module09;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OOPTest {

    @Test
    void testPersonConstructors() {
        Person p1 = new Person();
        Person p2 = new Person("John", 20);
        Person p3 = new Person("Alice");

        assertNotNull(p1);
        assertEquals("John", p2.getName());
        assertEquals(20, p2.getAge());
        assertEquals("Alice", p3.getName());
    }

    @Test
    void testEncapsulation() {
        Person p = new Person();
        p.setAge(-5);
        assertEquals(0, p.getAge());
    }

    @Test
    void testStudentInheritance() {
        Student s = new Student("John", 20, "A");
        assertEquals("John", s.getName());
        assertEquals("A", s.getGrade());
    }

    @Test
    void testToString() {
        Student s = new Student("John", 20, "A");
        assertEquals("Name: John, Age: 20, Grade: A", s.toString());
    }

    @Test
    void testPolymorphism() {
        Animal animal = new Animal() {
            @Override
            public String makeSound() {
                return "Sound";
            }
        };

        assertEquals("Sound", animal.makeSound());
    }
}
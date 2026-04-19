package module14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TCPSocketExercisesTest {

    @Test
    void testExercise1_createServer() {
        assertEquals("Server created",
                TCPSocketExercises.exercise1_createServer());
    }

    @Test
    void testExercise2_createClient() {
        assertEquals("Client connected",
                TCPSocketExercises.exercise2_createClient());
    }

    @Test
    void testExercise3_sendMessage() {
        assertEquals("Message sent",
                TCPSocketExercises.exercise3_sendMessage());
    }

    @Test
    void testExercise4_receiveMessage() {
        assertEquals("Message received",
                TCPSocketExercises.exercise4_receiveMessage());
    }

    @Test
    void testExercise5_fullCommunication() {
        assertEquals("Hello Server",
                TCPSocketExercises.exercise5_fullCommunication());
    }
}
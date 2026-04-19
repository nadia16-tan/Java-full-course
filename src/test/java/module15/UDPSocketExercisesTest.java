package module15;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UDPSocketExercisesTest {

    @Test
    void testExercise1_createSocket() {
        assertEquals("Socket created",
                UDPSocketExercises.exercise1_createSocket());
    }

    @Test
    void testExercise2_sendPacket() {
        assertEquals("Packet sent",
                UDPSocketExercises.exercise2_sendPacket());
    }

    @Test
    void testExercise3_receivePacket() {
        assertEquals("Packet received",
                UDPSocketExercises.exercise3_receivePacket());
    }

    @Test
    void testExercise4_connectionless() {
        assertEquals("No connection needed",
                UDPSocketExercises.exercise4_connectionless());
    }

    @Test
    void testExercise5_udpCommunication() {
        assertEquals("Hello UDP",
                UDPSocketExercises.exercise5_udpCommunication());
    }
}
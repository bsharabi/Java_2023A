package Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Sol_01Test {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();



    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void givenSystemOutRedirection_whenInvokePrintln_thenOutputCaptorSuccess() {
        System.out.println("Hello Baeldung Readers!!");

       assertEquals("Hello Baeldung Readers!!", outputStreamCaptor.toString()
                .trim());
    }
    @Test
    void q1() {
        Sol_01.q1(2);
        System.out.println(outputStreamCaptor.toString());
        System.out.println("Hello");

    }

    @Test
    void q2() {
    }

    @Test
    void q3() {
    }
}
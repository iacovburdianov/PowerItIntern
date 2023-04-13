package TaskNo4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainEx1Test {

    @Test
    void adding() throws UnderflowException, OverflowException {
        MainEx1 mainEx1 = new MainEx1();
        assertEquals(4.0,mainEx1.adding(2.0,2.0));
    }

    @Test
    void dividing() {
    }

    @Test
    void average() {
    }
}
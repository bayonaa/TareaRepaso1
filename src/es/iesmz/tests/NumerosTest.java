package es.iesmz.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumerosTest {
    @BeforeEach
    public void beforeEach() {
        System.out.println("EXECUTE PROVA");
    }

    @Test // todos diferentes
    public void test1() {
        assertEquals(2, Numeros.soniguales(4, 55, 7));
    }

    @Test // todos diferentes
    public void test2() {
        assertEquals(2, Numeros.soniguales(14, 23, 27));
    }
}
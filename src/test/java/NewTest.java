import org.example.Fibo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewTest {
    @Test
    public void testTest() {
        assertEquals(7, 10);
    }

    @Test
    public void firstTest() {
        assertEquals(1, Fibo.fibo_recursion(11));
    }

    @Test
    public void secondTest() {
        assertEquals(1, Fibo.fibo_recursion(12));
    }

    @Test
    public void bigintTest() {
        assertEquals(14930352, Fibo.fibo_recursion(316));
    }
}

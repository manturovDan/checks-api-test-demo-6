import org.example.Fibo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecTest {
    @Test
    public void testTest() {
        assertEquals(7, 8);
    }

    @Test
    public void firstTest() {
        assertEquals(1, Fibo.fibo_recursion(1));
    }

    @Test
    public void secondTest() {
        assertEquals(1, Fibo.fibo_recursion(2));
    }

    @Test
    public void bigintTest() {
        assertEquals(14930352, Fibo.fibo_recursion(36));
    }
}

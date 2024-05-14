import org.example.Fibo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoopTest {
    @Test
    public void testTest() {
        assertEquals(6, 7);
    }

    @Test
    public void firstTest() {
        assertEquals(2, Fibo.fibo_loop(1));
    }

    @Test
    public void secondTest() {
        assertEquals(1, Fibo.fibo_loop(2));
    }

    @Test
    public void bigintTest() {
        assertEquals(14930352, Fibo.fibo_loop(36));
    }

    @Test
    public void veryBigintTest() {
        assertEquals(1134903170, Fibo.fibo_loop(45));
    }
}

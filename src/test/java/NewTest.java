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
        assertEquals(1, Fibo.fibo_recursion(7));
    }

    @Test
    public void secondTest() {
        assertEquals(1, Fibo.fibo_recursion(8));
    }

    @Test
    public void bigintTest() {
        assertEquals(14930352, Fibo.fibo_recursion(2));
    }

    @Test
    public void bigintTestNew() {
        assertEquals(14930352, Fibo.fibo_recursion(2));
    }

    @Test
    public void bigintTestNew1() {
        assertEquals(14930352, Fibo.fibo_recursion(2));
    }
}

import org.example.Fibo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoopTest {
    @Test
    public void testTest() {
        assertEquals(7, 7);
    }

    @Test
    public void firstTest() {
        assertEquals(1, Fibo.fibo_loop(1));
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

    @Test
    public void bigintTestNew1007x() {
        assertEquals(2, Fibo.fibo_recursion(2));
    }
    @Test
    public void bigintTestNew1008x() {
        assertEquals(2, Fibo.fibo_recursion(2));
    }
    @Test
    public void bigintTestNew1009x() {
        assertEquals(2, Fibo.fibo_recursion(2));
    }
    @Test
    public void bigintTestNewnew1110x() {
        assertEquals(2, Fibo.fibo_recursion(2));
    }
    @Test
    public void bigintTestNew111100x() {
        assertEquals(2, Fibo.fibo_recursion(2));
    }
    @Test
    public void bigintTestNew1112x() {
        assertEquals(2, Fibo.fibo_recursion(2));
    }
    @Test
    public void bigintTestNew1113x() {
        assertEquals(14930352, Fibo.fibo_recursion(2));
    }
}

import junit.framework.*;
import org.junit.Test;

public class FizzbuzzTest extends TestCase {
    @Test
    public void testTrue() throws Exception {
        assertEquals(true, true);
    }

    @Test
    public void test1() throws Exception {
        assertEquals("fizz",Ex.fizzbuzz(3));
    }

    @Test
    public void test2() throws Exception {
        assertEquals("buzz",Ex.fizzbuzz(5));
    }

    @Test
    public void test3() throws Exception {
        assertEquals("fizzbuzz",Ex.fizzbuzz(15));

    }

    @Test
    public void test4() throws Exception {
        assertEquals("8",Ex.fizzbuzz(8));

    }

    @Test
    public void test5() throws Exception {
        assertEquals("fizz",Ex.fizzbuzz(9));
    }
}
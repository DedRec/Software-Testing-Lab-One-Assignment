import org.junit.Test;

import static org.junit.Assert.*;

public class Watermelon_problemTest {

    @Test
    public void testmain() {
    }

    @Test
    public void testdivide() {
        Watermelon_problem tester = new Watermelon_problem();
        assertEquals("NO",tester.divide(-1));
        assertEquals("NO",tester.divide(0));
        assertEquals("NO",tester.divide(1));
        assertEquals("NO",tester.divide(2));
        assertEquals("YES",tester.divide(8));
        assertEquals("YES",tester.divide(50));
        assertEquals("YES",tester.divide(100));
        assertEquals("NO",tester.divide(101));

    }
}
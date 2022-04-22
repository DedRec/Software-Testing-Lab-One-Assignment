import org.junit.Test;

import static org.junit.Assert.*;

public class Young_PhysicistTest {

    @Test
    public void maintest() {
    }

    @Test
    public void vectortest() {
        Young_Physicist tester = new Young_Physicist();
        assertEquals("YES",tester.vector(0,0,0));
        assertEquals("NO",tester.vector(1,9,-9));
    }
}
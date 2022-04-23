import org.junit.Test;

import static org.junit.Assert.*;

public class Young_PhysicistTest {

    @Test
    public void maintest() {
    }

    @Test
    public void vectorTestInEquilibriumGiveYES() {
        Young_Physicist tester = new Young_Physicist();
        assertEquals("YES",tester.vector(0,0,0));
    }

    @Test
    public void vectorTestNotInEquilibriumGiveNO() {
        Young_Physicist tester = new Young_Physicist();
        assertEquals("NO",tester.vector(1,9,-9));
    }

}
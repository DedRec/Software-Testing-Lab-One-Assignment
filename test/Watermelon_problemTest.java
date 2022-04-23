import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class Watermelon_problemTest {

    @Test
    public void testmain() {
    }

    @Test
    public void testInput(){
    }

    @Test
    public void testdivideInvalid() {
        Watermelon_problem tester = new Watermelon_problem();
        assertEquals("NO",tester.divide(-1));
        assertEquals("NO",tester.divide(101));
    }

    @Test
    public void testdivideZeroshouldreturnNO(){
        Watermelon_problem tester = new Watermelon_problem();
        assertEquals("NO",tester.divide(0));
    }
    @Test
    public void testdivideOneshouldreturnNO(){
        Watermelon_problem tester = new Watermelon_problem();
        assertEquals("NO",tester.divide(1));
    }
    @Test
    public void testdivideTwoshouldreturnNO(){
        Watermelon_problem tester = new Watermelon_problem();
        assertEquals("NO",tester.divide(2));
    }
    @Test
    public void testdivideEightshouldreturnYES(){
        Watermelon_problem tester = new Watermelon_problem();
        assertEquals("YES",tester.divide(8));
    }
    @Test
    public void testdivideFiftyshouldreturnYES(){
        Watermelon_problem tester = new Watermelon_problem();
        assertEquals("YES",tester.divide(50));
    }
    @Test
    public void testdivideHundredshouldreturnYES(){
        Watermelon_problem tester = new Watermelon_problem();
        assertEquals("YES",tester.divide(100));
    }
}
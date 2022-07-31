import static org.junit.Assert.*;
import org.junit.*;

public class TestKeypadTest {

    @Test
    public void simpleTest() {
        assertEquals(9, Main.presses("LOL"));

    }
    @Test
    public void simpleTest2() {
        assertEquals(13, Main.presses("HOW R U"));
    }
}

import static org.junit.Assert.*;
import org.junit.*;

public class TestEvaporator {

    @Test
    public void testEvaporatorOne() {
        assertEquals(22 , Main.evaporator(10, 10, 10));
    }
}

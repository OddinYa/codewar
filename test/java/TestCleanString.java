import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCleanString {


    @Test
    public void examples() {

        assertEquals("ac", Main.cleanString("abc#d##c"));

    }

    @Test
    public void examplesNext() {

        assertEquals("", Main.cleanString("abc####d##c#"));

    }

}

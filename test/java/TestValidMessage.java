import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;



public class TestValidMessage {
    @Test
    void basicTests() {
        assertTrue(ValidMessage.isAValidMessage("3hey5hello2hi"), "3hey5hello2hi");

        assertTrue(ValidMessage.isAValidMessage("4code13hellocodewars"), "4code13hellocodewars");

        assertFalse(ValidMessage.isAValidMessage("3hey5hello2hi5"), "3hey5hello2hi5");
        assertFalse(ValidMessage.isAValidMessage("code4hello5"), "code4hello5");
        assertTrue(ValidMessage.isAValidMessage("1a2bb3ccc4dddd5eeeee"), "1a2bb3ccc4dddd5eeeee");
        assertTrue(ValidMessage.isAValidMessage("0"), "");
        assertTrue(ValidMessage.isAValidMessage(""), "");
    }
}

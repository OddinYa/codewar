import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestHello {




        @Test
        public void test1() throws Exception {
            Main main = new Main();
            String[] name = {"John", "Smith"};
            assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
                    main.sayHello(name, "Phoenix", "Arizona"));
        }
    }


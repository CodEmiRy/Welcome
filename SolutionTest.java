import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {


    @Test
    public void exampleTest() {
        assertEquals("Your function should have returned 'Welcome!'. Try again.","Welcome!", Main.greet("english"));
        assertEquals("Your function should have returned 'Witamy!'. Try again.", "Witamy!", Main.greet("polish"));
        assertEquals("Your function should have returned 'Welcome!'. Try again.", "Welcome!", Main.greet("IP_ADDRESS_INVALID"));
    }
}

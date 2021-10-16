import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void testTrue() {
        assertEquals(BooleanToString.convert(true), "true");
    }

    @Test
    public void testFalse() {
        assertEquals(BooleanToString.convert(false), "false");
    }

    private static class BooleanToString {
        public static String convert(boolean b) {
            String value = Boolean.toString(b);
            if (value == "true") {
                return "true";
            } else {
                return "false";
            }
        }

    }
}
package pwani.ddd.guards;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringGuardsTest {
    @Test
    void testCheckNotEmpty() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> StringGuards.checkNotEmpty("TestAttribute", null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringGuards.checkNotEmpty("TestAttribute", ""));
        Assertions.assertDoesNotThrow(() -> StringGuards.checkNotEmpty("TestAttribute", "Test Value"));
    }

    @Test
    void testCheckNotMultiline() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> StringGuards.checkNotMultiline("TestAttribute", null));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> StringGuards.checkNotMultiline("TestAttribute", "\n"));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> StringGuards.checkNotMultiline("TestAttribute", " " + StringUtils.LF + " "));
        Assertions.assertDoesNotThrow(() -> StringGuards.checkNotMultiline("TestAttribute", "Not a problem"));
    }
}

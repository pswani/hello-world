package pwani.ddd.framework.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberIdTest {

    @Test
    void testConstructor() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new NumberId(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new NumberId(-1));
        Assertions.assertDoesNotThrow(() -> new NumberId(1));
    }

    @Test
    void testCopy() {
        NumberId id1 = NumberId.nextId();
        NumberId id2 = id1.copy();
        Assertions.assertNotNull(id2);
        Assertions.assertTrue(id1.sameAs(id2));
    }

    @Test
    void testNextId() {
        NumberId id = NumberId.nextId();
        Assertions.assertNotNull(id, "Successfully created the Number Id");
        Assertions.assertTrue(id.value() > 0);
    }

    @Test
    void testSameAs() {
        NumberId id1 = NumberId.nextId();
        NumberId id3 = new NumberId(id1.value() + 1);
        Assertions.assertFalse(id1.sameAs(id3));
    }
}

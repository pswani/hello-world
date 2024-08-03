package pwani.ddd.framework.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberSequenceTest {
    @Test
    void testDefaultConstructor() {
        NumberSequence sequence = new NumberSequence();
        Assertions.assertEquals(1, sequence.value());
        
    }

    @Test
    void testInitializationConstructor() {
        NumberSequence sequence = new NumberSequence(25);
        Assertions.assertEquals(25, sequence.value());
        Assertions.assertThrows(IllegalArgumentException.class, () -> new NumberSequence(-10));
    }

    @Test
    void testNextValue() {
        NumberSequence sequence = new NumberSequence();
        Assertions.assertEquals(2, sequence.nextValue());
        Assertions.assertEquals(3, sequence.nextValue());
        Assertions.assertEquals(4, sequence.nextValue());
    }

    @Test
    void testSetValue() {
        NumberSequence sequence = new NumberSequence();
        Assertions.assertEquals(2, sequence.nextValue());
        Assertions.assertThrows(IllegalArgumentException.class, () -> sequence.setValue(-10));
        Assertions.assertEquals(2, sequence.value());
        sequence.setValue(25);
        Assertions.assertEquals(25, sequence.value());
        Assertions.assertEquals(26, sequence.nextValue());
    }

    @Test
    void testValue() {
        NumberSequence sequence = new NumberSequence();
        sequence.setValue(25);
        Assertions.assertEquals(25, sequence.value());
    }
}

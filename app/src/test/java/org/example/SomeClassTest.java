package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SomeClassTest {
    @Test
    public void testSum() {
        var expected = 12;
        var actual = SomeClass.sum(5, 7);
        assertEquals(expected, actual);
    }
}

package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteFTest {

    @Test
    void testeQueFalha() {
        assertEquals(1, 2); // falha proposital
    }
}

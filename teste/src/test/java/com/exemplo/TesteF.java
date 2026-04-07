package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteF {

    @Test
    public void testeQueFalha() {
        // Falha proposital
        assertEquals(1, 2, "Este teste foi feito para falhar!");
    }
}
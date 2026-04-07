package br.com.teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteFalha {

    @Test
    void testeErrado() {
        assertEquals(5, App.somar(2, 2));
    }
}

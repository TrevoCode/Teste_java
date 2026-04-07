package br.com.teste;
//teste
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteSucesso {

    @Test
    void testeCerto() {
        assertEquals(4, App.somar(2, 2));
    }
}

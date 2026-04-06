package com.br.streaming.flix;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StreamingFlixFailTest {

    @Test
    @DisplayName("Teste que sempre falha - comparacao incorreta")
    void deveCompararValoresIguais() {
        assertEquals(1, 2, "Valores deveriam ser iguais, mas 1 != 2");
    }

    @Test
    @DisplayName("Teste que passa - apenas para contraste")
    void devePassarSemProblemas() {
        assertEquals(4, 2 + 2);
    }
}

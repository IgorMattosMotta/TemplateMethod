package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoDeSaudeBasicoTest {

    @Test
    void deveRetornarDesconto10Porcento() {
        PlanoDeSaudeBasico plano = new PlanoDeSaudeBasico();
        assertEquals(0.10f, plano.getDesconto());
    }

    @Test
    void deveRetornarCabeNoSeuBolso() {
        PlanoDeSaudeBasico plano = new PlanoDeSaudeBasico();
        plano.setValor(100f);
        assertEquals("Cabe no seu bolso!", plano.conseguePagarPlano(90f));
    }

    @Test
    void deveRetornarTenteUmPlanoMaisEmConta() {
        PlanoDeSaudeBasico plano = new PlanoDeSaudeBasico();
        plano.setValor(100f);
        assertEquals("Tente um plano mais em conta!", plano.conseguePagarPlano(89.9f));
    }

    @Test
    void deveLancarExcecaoPrecoMaximoInvalido() {
        PlanoDeSaudeBasico plano = new PlanoDeSaudeBasico();
        plano.setValor(100f);
        assertThrows(IllegalArgumentException.class, () -> plano.conseguePagarPlano(0f));
        assertThrows(IllegalArgumentException.class, () -> plano.conseguePagarPlano(-10f));
    }
}

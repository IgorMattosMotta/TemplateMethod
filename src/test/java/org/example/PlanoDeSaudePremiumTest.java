package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoDeSaudePremiumTest {

    @Test
    void deveRetornarDesconto30Porcento() {
        PlanoDeSaudePremium plano = new PlanoDeSaudePremium();
        assertEquals(0.30f, plano.getDesconto());
    }

    @Test
    void deveRetornarCabeNoSeuBolso() {
        PlanoDeSaudePremium plano = new PlanoDeSaudePremium();
        plano.setValor(100f);
        assertEquals("Cabe no seu bolso!", plano.conseguePagarPlano(70f));
    }

    @Test
    void deveRetornarTenteUmPlanoMaisEmConta() {
        PlanoDeSaudePremium plano = new PlanoDeSaudePremium();
        plano.setValor(100f);
        assertEquals("Tente um plano mais em conta!", plano.conseguePagarPlano(69.9f));
    }

    @Test
    void deveLancarExcecaoPrecoMaximoInvalido() {
        PlanoDeSaudePremium plano = new PlanoDeSaudePremium();
        plano.setValor(100f);
        assertThrows(IllegalArgumentException.class, () -> plano.conseguePagarPlano(0f));
        assertThrows(IllegalArgumentException.class, () -> plano.conseguePagarPlano(-10f));
    }
}

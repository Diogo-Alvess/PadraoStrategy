package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void deveAplicarDescontoNatal() {
        Compra compra = new Compra();
        compra.aplicarDescontoNatal(100.0f);
        assertEquals(90.0f, compra.getValorFinal());
    }

    @Test
    void deveAplicarDescontoBlackFriday() {
        Compra compra = new Compra();
        compra.aplicarDescontoBlackFriday(100.0f);
        assertEquals(70.0f, compra.getValorFinal());
    }

    @Test
    void deveAplicarDescontoAniversario() {
        Compra compra = new Compra();
        compra.aplicarDescontoAniversario(200.0f);
        assertEquals(170.0f, compra.getValorFinal());
    }

    @Test
    void naoDeveAplicarDesconto() {
        Compra compra = new Compra();
        compra.aplicarSemDesconto(100.0f);
        assertEquals(100.0f, compra.getValorFinal());
    }
}

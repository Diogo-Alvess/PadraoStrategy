package org.example;

public class Loja {
    public float aplicarDesconto(Desconto desconto, float valor) {
        return desconto.calcular(valor);
    }
}

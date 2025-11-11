package org.example;

public class DescontoBlackFriday implements Desconto {
    @Override
    public float calcular(float valor) {
        return valor * 0.70f; // 30% de desconto
    }
}
package org.example;

public class DescontoAniversario implements Desconto {
    @Override
    public float calcular(float valor) {
        return valor * 0.85f; // 15% de desconto
    }
}
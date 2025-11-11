package org.example;

public class DescontoNatal implements Desconto {
    @Override
    public float calcular(float valor) {
        return valor * 0.90f; // 10% de desconto
    }
}
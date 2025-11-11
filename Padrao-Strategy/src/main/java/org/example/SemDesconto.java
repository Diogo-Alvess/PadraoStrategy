package org.example;

public class SemDesconto implements Desconto {
    @Override
    public float calcular(float valor) {
        return valor; // sem desconto
    }
}
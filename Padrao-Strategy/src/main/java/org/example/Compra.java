package org.example;

public class Compra {

    private float valorFinal;

    public void aplicarDescontoNatal(float valor) {
        Loja loja = new Loja();
        this.valorFinal = loja.aplicarDesconto(new DescontoNatal(), valor);
    }

    public void aplicarDescontoBlackFriday(float valor) {
        Loja loja = new Loja();
        this.valorFinal = loja.aplicarDesconto(new DescontoBlackFriday(), valor);
    }

    public void aplicarDescontoAniversario(float valor) {
        Loja loja = new Loja();
        this.valorFinal = loja.aplicarDesconto(new DescontoAniversario(), valor);
    }

    public void aplicarSemDesconto(float valor) {
        Loja loja = new Loja();
        this.valorFinal = loja.aplicarDesconto(new SemDesconto(), valor);
    }

    public float getValorFinal() {
        return valorFinal;
    }
}
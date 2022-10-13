package br.edu.utfpr.veiculos;

public class Motor {
    // A UML usa "qtdPst" isso não é claro sobre o que se trata. [Clean Code]
    private Integer quantidadePistoes;
    private Integer potencia;

    public Motor() {
        this.potencia = 0;
        this.quantidadePistoes = 0;
    }

    public Integer getQuantidadePistoes() {
        return quantidadePistoes;
    }

    public void setQuantidadePistoes(Integer quantidadePistoes) {
        this.quantidadePistoes = quantidadePistoes;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }
}

package br.edu.utfpr;

public abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    // A UML usa velocMax porém o nome por extenso aumenta a clareza.
    private float velocidadeMaxima;
    // A UML usa qtdRodas porém o nome por extenso aumenta a clareza.
    private int quantidadeRodas;
    private Motor motor;

    public Veiculo() {
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.velocidadeMaxima = 0.0f;
        this.quantidadeRodas = 0;
        this.motor = new Motor();
    }

    public String getPlaca() {
        return placa;
    }

    public final void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public final void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public final void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public final void setCor(String cor) {
        this.cor = cor;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public final void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public final void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public Motor getMotor() {
        return motor;
    }

    public final void setMotor(Motor motor) {
        this.motor = motor;
    }

    public final void setMotor(Integer potencia, Integer quantidadePistoes) {
        Motor novoMotor = new Motor();
        novoMotor.setPotencia(potencia);
        novoMotor.setQuantidadePistoes(quantidadePistoes);
        this.motor = novoMotor;
    }

    public abstract float calculaVelocidade(float velocidadeMaxima);

    // O problema dizia em avisos que poderíamos implementar novos métodos.
    // Princípio de Substituição de Liskov para imprimir os dados como método substituivel da classe por seu subtipo.
    public abstract void imprimeDados();
}

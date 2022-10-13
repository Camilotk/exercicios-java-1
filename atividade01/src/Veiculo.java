package br.edu.utfpr;

public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    // A UML usa velocMax porém o nome por extenso aumenta a clareza.
    private Float velocidadeMaxima;
    // A UML usa qtdRodas porém o nome por extenso aumenta a clareza.
    private Float quantidadeRodas;
    private Motor motor;

    public Veiculo() {
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.velocidadeMaxima = 0F;
        this.quantidadeRodas = 0F;
        this.motor = new Motor();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Float getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(Float quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setMotor(Integer potencia, Integer quantidadePistoes) {
        Motor novoMotor = new Motor();
        novoMotor.setPotencia(potencia);
        novoMotor.setQuantidadePistoes(quantidadePistoes);
        this.motor = novoMotor;
    }
}

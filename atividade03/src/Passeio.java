package br.edu.utfpr;

public final class Passeio extends Veiculo {
    private int quantidadePassageiros;

    public Passeio() {
        super();
        this.quantidadePassageiros = 0;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    /**
     * Retorna a velocidade máxima passada convertida no valor utilizado pelo Veículo de Passeio.
     *
     * @param velocidadeMaxima valor em KM/h
     * @return valor da velocidade máxima em m/h
     */
    @Override
    public float calculaVelocidade(float velocidadeMaxima) {
        float velocidadeMaxPasseio = velocidadeMaxima * 1000;
        return velocidadeMaxPasseio;
    }

    // O problema dizia em avisos que poderíamos implementar novos métodos.
    @Override
    public void imprimeDados() {
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.printf("Velocidade Máxima: \n\t %.2f KM/h \n\t %.2f m/h\n",
                this.getVelocidadeMaxima(),
                this.calculaVelocidade(this.getVelocidadeMaxima()));
        System.out.println("Quantidade de Rodas: " + this.getQuantidadeRodas());
        System.out.println("Motor: \n\t"+"" +
                "Potência: " + this.getMotor().getPotencia() +
                "\n\tQuantidade de Pistões: " + this.getMotor().getQuantidadePistoes());
        System.out.println("Quantidade de Passageiros: " + this.getQuantidadePassageiros());
    }
}
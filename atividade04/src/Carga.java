package br.edu.utfpr;

/**
 * @author camilo de azevedo
 */
public final class Carga extends Veiculo implements Calcular {
    private int cargaMaxima;
    private int tara;

    public Carga() {
        super();
        this.cargaMaxima = 0;
        this.tara = 0;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    /**
     * Retorna a velocidade máxima passada convertida no valor utilizado pelo Veículo de Carga.
     *
     * @param velocidadeMaxima valor em KM/h
     * @return valor da velocidade máxima em cm/h
     */
    @Override
    public float calculaVelocidade(float velocidadeMaxima) {
        float velocidadeMaxCarga = velocidadeMaxima * 100000;
        return velocidadeMaxCarga;
    }

    @Override
    public int calcular() {
        return (this.getTara() + this.getCargaMaxima() + this.getQuantidadeRodas() + Math.round(this.getVelocidadeMaxima()));
    }

    // O problema dizia em avisos que poderíamos implementar novos métodos.
    @Override
    public void imprimeDados() {
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.printf("Velocidade Máxima: \n\t %.2f KM/h \n\t %.2f cm/h\n",
                this.getVelocidadeMaxima(),
                this.calculaVelocidade(this.getVelocidadeMaxima()));
        System.out.println("Quantidade de Rodas: " + this.getQuantidadeRodas());
        System.out.println("Motor: \n\t"+"" +
                "Potência: " + this.getMotor().getPotencia() +
                "\n\tQuantidade de Pistões: " + this.getMotor().getQuantidadePistoes());
        System.out.println("Carga Máxima: " + this.getCargaMaxima());
        System.out.println("Tara: " + this.getTara());
        System.out.println("Cálculo: " + this.calcular());
    }
}

package br.edu.utfpr;

import java.util.Arrays;
import java.util.stream.Stream;

public class Teste {
    public static void imprimeCarros(Veiculo... veiculos) {
        for(Veiculo veiculo : veiculos) {
            System.out.println("###################################");
            System.out.println("INFORMAÇÕES SOBRE " + veiculo.getModelo().toUpperCase());
            System.out.print("Placa: ");
            System.out.println(veiculo.getPlaca());
            System.out.print("Cor: ");
            System.out.println(veiculo.getCor());
            System.out.print("Marca: ");
            System.out.println(veiculo.getMarca());
            System.out.print("Quantidade de Rodas: ");
            System.out.println(veiculo.getQuantidadeRodas());
            System.out.print("Modelo: ");
            System.out.println(veiculo.getModelo());
            System.out.print("Velocidade Máxima: ");
            System.out.println(veiculo.getVelocidadeMaxima());
            System.out.print("Potência do Motor: ");
            System.out.println(veiculo.getMotor().getPotencia());
            System.out.print("Quantidade Pistões Motor: ");
            System.out.println(veiculo.getMotor().getQuantidadePistoes());
        }
    }

    public static void main(String[] args) {

        Veiculo celta = new Veiculo();
        celta.setPlaca("ALH-1098");
        celta.setCor("Branco");
        celta.setMarca("Chevrolet");
        celta.setQuantidadeRodas(4.0F);
        celta.setModelo("Celta Hatchback");
        celta.setVelocidadeMaxima(161.0F);
        celta.setMotor(68, 4);

        Veiculo gol = new Veiculo();
        gol.setPlaca("BCV-0079");
        gol.setCor("Vermelho");
        gol.setMarca("Volkswagen");
        gol.setQuantidadeRodas(4.0F);
        gol.setModelo("Gol Terceira Geração");
        gol.setVelocidadeMaxima(185.0F);
        gol.setMotor(82, 6);

        Veiculo uno = new Veiculo();
        uno.setPlaca("AKS-7148");
        uno.setCor("Branco");
        uno.setMarca("Fiat");
        uno.setQuantidadeRodas(4.0F);
        uno.setModelo("Uno Mile com escada em cima");
        uno.setVelocidadeMaxima(8001.0F);
        uno.setMotor(8001, 50);

        Veiculo etios = new Veiculo();
        etios.setPlaca("AWB-4391");
        etios.setCor("Prata");
        etios.setMarca("Toyota");
        etios.setQuantidadeRodas(4.0F);
        etios.setModelo("Etios Sedan");
        etios.setVelocidadeMaxima(186.0F);
        etios.setMotor(102, 10);

        Veiculo hb20 = new Veiculo();
        hb20.setPlaca("ADH-6000");
        hb20.setCor("Branco");
        hb20.setMarca("Hyundai");
        hb20.setQuantidadeRodas(4.0F);
        hb20.setModelo("HB20 Monstra");
        hb20.setVelocidadeMaxima(193.0F);
        hb20.setMotor(120, 10);

        imprimeCarros(celta, gol, uno, etios, hb20);
    }
}
package br.edu.utfpr;

import java.util.Arrays;
import java.util.stream.Stream;

public class Teste {
    public static void imprimeVeiculos(Veiculo... veiculos) {
        System.out.println("IMPRESSÃO DE VEÍCULOS: ");
        System.out.println();
        for(Veiculo veiculo : veiculos) {
            veiculo.imprimeDados();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        var johnDeere = new Carga();
        johnDeere.setPlaca("FGH-6789");
        johnDeere.setCor("Verde");
        johnDeere.setMarca("John Deere");
        johnDeere.setQuantidadeRodas(4);
        johnDeere.setModelo("T7200J");
        johnDeere.setVelocidadeMaxima(80.0f);
        johnDeere.setMotor(60, 5);
        johnDeere.setCargaMaxima(1900);
        johnDeere.setTara(200);

        var scania = new Carga();
        scania.setPlaca("KLB-0007");
        scania.setCor("Prata");
        scania.setMarca("Scania");
        scania.setQuantidadeRodas(6);
        scania.setModelo("S-SLEEPER Perfil Alto");
        scania.setVelocidadeMaxima(160.5f);
        scania.setMotor(120, 10);
        scania.setCargaMaxima(20000);
        scania.setTara(450);

        var caterpillar = new Carga();
        caterpillar.setPlaca("NYP-9090");
        caterpillar.setCor("Amarelo");
        caterpillar.setMarca("Caterpillar");
        caterpillar.setQuantidadeRodas(2);
        caterpillar.setModelo("Miniescavadeira 302.CR");
        caterpillar.setVelocidadeMaxima(80.0f);
        caterpillar.setMotor(60, 5);
        caterpillar.setCargaMaxima(500);
        caterpillar.setTara(350);

        var celta = new Passeio();
        celta.setPlaca("ALH-1098");
        celta.setCor("Branco");
        celta.setMarca("Chevrolet");
        celta.setQuantidadeRodas(4);
        celta.setModelo("Celta Hatchback");
        celta.setVelocidadeMaxima(161.0F);
        celta.setMotor(68, 4);
        celta.setQuantidadePassageiros(4);

        var honda = new Passeio();
        honda.setPlaca("SVR-1278");
        honda.setCor("Vermelho");
        honda.setMarca("Honda");
        honda.setQuantidadeRodas(2);
        honda.setModelo("Titan");
        honda.setVelocidadeMaxima(130.0F);
        honda.setMotor(60, 2);
        honda.setQuantidadePassageiros(2);

        var marcoPolo = new Passeio();
        marcoPolo.setPlaca("FNW-6725");
        marcoPolo.setCor("Branco");
        marcoPolo.setMarca("Marco Polo");
        marcoPolo.setQuantidadeRodas(4);
        marcoPolo.setModelo("Torino");
        marcoPolo.setVelocidadeMaxima(120.0f);
        marcoPolo.setMotor(75, 6);
        marcoPolo.setQuantidadePassageiros(30);

        imprimeVeiculos(johnDeere, scania, caterpillar, celta, honda, marcoPolo);

        System.out.println();

    }
}
package br.edu.utfpr;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Teste {
    public static void imprimeVeiculos(Veiculo[] veiculos)  {
        Arrays.stream(veiculos)
                .filter(Objects::nonNull)
                .forEach(veiculo -> {
                    veiculo.imprimeDados();
                    System.out.println();
                });
    }

    public static <T extends Veiculo> List<T> buscaVeiculo(T[] veiculos, String placa) throws VeicExistException {
        List<T> resultado = Arrays.stream(veiculos)
                .filter(veiculo -> veiculo != null)
                .filter(veiculo -> veiculo.getPlaca().equals(placa))
                .toList();

        if (resultado.size() != 0) {
            throw new VeicExistException();
        }

        return resultado;
    }

    public static void main(String[] args) {
        var veiculosPasseio = new Passeio[5];
        var veiculosCarga = new Carga[5];
        int[] counter = { 0, 0 };
        int opcao = 0;


        try {
            while (opcao != 7) {
                opcao = Leitura.entradaDados(Leitura.Tipo.MENU);

                switch (opcao) {
                    case 1:
                        if(counter[0] < veiculosPasseio.length) {
                            Passeio carro = new Passeio();
                            System.out.println("Cadastro de Veículo de Passeio");
                            System.out.println();
                            System.out.print("Entre a placa: ");
                            carro.setPlaca(Leitura.entradaDados(Leitura.Tipo.STRING));
                            try {
                                Teste.<Passeio>buscaVeiculo(veiculosPasseio, carro.getPlaca());
                            } catch (VeicExistException vee) {
                                System.out.println("Veiculo com placa " + carro.getPlaca() + " já cadastrado!");
                                break;
                            }
                            System.out.print("Entre a marca: ");
                            carro.setMarca(Leitura.entradaDados(Leitura.Tipo.STRING));
                            System.out.print("Entre a modelo: ");
                            carro.setModelo(Leitura.entradaDados(Leitura.Tipo.STRING));
                            System.out.print("Entre a cor: ");
                            carro.setCor(Leitura.entradaDados(Leitura.Tipo.STRING));
                            System.out.print("Entre a velocidade máxima: ");
                            try {
                                carro.setVelocidadeMaxima(Leitura.entradaDados(Leitura.Tipo.FLOAT));
                            } catch (VelocException ve) {
                                System.out.println("Veículo fora dos padrões brasileiros!");
                                break;
                            }
                            System.out.print("Entre a quantidade de rodas: ");
                            carro.setQuantidadeRodas(Leitura.entradaDados(Leitura.Tipo.INTEGER));
                            System.out.print("Entre a quantidade de passageiros: ");
                            carro.setQuantidadePassageiros(Leitura.entradaDados(Leitura.Tipo.INTEGER));
                            System.out.print("Entre a potência do motor: ");
                            carro.getMotor().setPotencia(Leitura.entradaDados(Leitura.Tipo.INTEGER));
                            System.out.print("Entre a quantidade de pistões do motor: ");
                            carro.getMotor().setQuantidadePistoes(Leitura.entradaDados(Leitura.Tipo.INTEGER));
                            veiculosPasseio[counter[0]] = carro;
                            counter[0]++;
                            System.out.println("Carro " + carro.getPlaca() + " cadastrado!");
                        } else {
                            System.out.println("Limite de veículos cadastrados já atingido!");
                        }
                        break;
                    case 2:
                        String repetir = "sim";
                        while(repetir.equals("sim")) {
                            if (counter[1] < veiculosPasseio.length) {
                                Carga carga = new Carga();
                                System.out.println("Cadastro de Veículo de Carga");
                                System.out.println();
                                System.out.print("Entre a placa: ");
                                carga.setPlaca(Leitura.entradaDados(Leitura.Tipo.STRING));
                                try {
                                    Teste.<Carga>buscaVeiculo(veiculosCarga, carga.getPlaca());
                                } catch (VeicExistException vee) {
                                    System.out.println("Veiculo com placa " + carga.getPlaca() + " já cadastrado!");
                                    break;
                                }
                                System.out.print("Entre a marca: ");
                                carga.setMarca(Leitura.entradaDados(Leitura.Tipo.STRING));
                                System.out.print("Entre a modelo: ");
                                carga.setModelo(Leitura.entradaDados(Leitura.Tipo.STRING));
                                System.out.print("Entre a cor: ");
                                carga.setCor(Leitura.entradaDados(Leitura.Tipo.STRING));
                                System.out.print("Entre a velocidade máxima: ");
                                try {
                                    carga.setVelocidadeMaxima(Leitura.entradaDados(Leitura.Tipo.FLOAT));
                                } catch (VelocException ve) {
                                    System.out.println("Veículo fora dos padrões brasileiros!");
                                    break;
                                }
                                System.out.print("Entre a quantidade de rodas: ");
                                carga.setQuantidadeRodas(Leitura.entradaDados(Leitura.Tipo.INTEGER));
                                System.out.print("Entre a carga máxima: ");
                                carga.setCargaMaxima(Leitura.entradaDados(Leitura.Tipo.INTEGER));
                                System.out.print("Entre a tara: ");
                                carga.setTara(Leitura.entradaDados(Leitura.Tipo.INTEGER));
                                System.out.print("Entre a potência do motor: ");
                                carga.getMotor().setPotencia(Leitura.entradaDados(Leitura.Tipo.INTEGER));
                                System.out.print("Entre a quantidade de pistões do motor: ");
                                carga.getMotor().setQuantidadePistoes(Leitura.entradaDados(Leitura.Tipo.INTEGER));
                                veiculosCarga[counter[1]] = carga;
                                counter[1]++;
                                System.out.println("Carro " + carga.getPlaca() + " cadastrado!");
                                System.out.println("Deseja cadastrar outro veículo? Sim/Não");
                                repetir = Leitura.entradaDados(Leitura.Tipo.STRING);
                                repetir = repetir.toLowerCase();
                            } else {
                                System.out.println("Limite de veículos cadastrados já atingido!");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Veículos de Passeio Cadastrados: ");
                        System.out.println();
                        imprimeVeiculos(veiculosPasseio);
                        break;
                    case 4:
                        System.out.println("Veiculos de Carga Cadastrados");
                        System.out.println();
                        imprimeVeiculos(veiculosCarga);
                        break;
                    case 5:
                        System.out.print("Digite a placa do veículo de passeio que deseja buscar: ");
                        String buscaPasseio = Leitura.entradaDados(Leitura.Tipo.STRING);
                        try {
                            List<Passeio> resultadoBuscaPasseio = Teste.<Passeio>buscaVeiculo(veiculosPasseio, buscaPasseio);
                            resultadoBuscaPasseio.get(0).imprimeDados();
                            break;
                        } catch (VeicExistException vee) {
                            System.out.println("Veiculo não encontrado");
                            break;
                        }
                    case 6:
                        System.out.print("Digite a placa do veículo de carga que deseja buscar: ");
                        String buscaCarga = Leitura.entradaDados(Leitura.Tipo.STRING);
                        try {
                            List<Carga> resultadoBuscaCarga = Teste.<Carga>buscaVeiculo(veiculosCarga, buscaCarga);
                            resultadoBuscaCarga.get(0).imprimeDados();
                            break;
                        } catch (VeicExistException e) {
                            System.out.println("Veiculo não encontrado");
                            break;
                        }
                }
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante a execução do programa!");
            e.printStackTrace();
        }

        System.out.println("Obrigado por usar nosso Sistema!");

    }
}
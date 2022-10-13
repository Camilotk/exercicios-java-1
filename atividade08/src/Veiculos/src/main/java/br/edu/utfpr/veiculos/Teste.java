package br.edu.utfpr.veiculos;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Teste {
    public static Veiculo buscaVeiculo(BDVeiculos veiculos, String placa, Boolean ret) throws VeicExistException, Exception {
        Carga veiculoCarga = veiculos.getListaCarga()
                .stream()
                .filter(veiculo -> veiculo.getPlaca().equals(placa))
                .findFirst()
                .orElse(null);

        Passeio veiculoPasseio = veiculos.getListaPasseio()
                .stream()
                .filter(veiculo -> veiculo.getPlaca().equals(placa))
                .findFirst()
                .orElse(null);

        if ((veiculoCarga != null || veiculoPasseio != null) && !ret) {
            throw new VeicExistException();
        }

        if ((veiculoCarga != null && veiculoPasseio == null) && ret) {
            return veiculoCarga;
        }

        if ((veiculoPasseio != null && veiculoCarga == null) && ret) {
            return veiculoPasseio;
        }

        return new Passeio();
    }

    public static BDVeiculos excluiVeiculo(String placa, BDVeiculos veiculos) {
        List<Carga> veiculosCargaFiltrados = veiculos.getListaCarga()
                .stream()
                .filter(carga -> carga.getPlaca() != placa)
                .collect(Collectors.toList());

        List<Passeio> veiculosPasseioFiltrados = veiculos.getListaPasseio()
                .stream()
                .filter(passeio -> passeio.getPlaca() != placa)
                .collect(Collectors.toList());
                // .toList();

        BDVeiculos novoBD = new BDVeiculos();
        novoBD.setListaCarga(veiculosCargaFiltrados);
        novoBD.setListaPasseio(veiculosPasseioFiltrados);

        int tamanhoAntes = veiculos.getListaCarga().size() + veiculos.getListaPasseio().size();
        int tamanhoDepois = novoBD.getListaPasseio().size() + novoBD.getListaCarga().size();

        if (tamanhoAntes != tamanhoDepois) {
            System.out.println("Veiculo excluído com sucesso!");
        } else {
            System.out.println("Veículo não encontrado!");
        }

        return novoBD;
    }

    public static void main(String[] args) {
        // var veiculosPasseio = new Passeio[5];
        // var veiculosCarga = new Carga[5];
        // int[] counter = { 0, 0 };

        int opcao = 0;
        String repetir = "sim";
        BDVeiculos bancoDados = new BDVeiculos();


        try {
            while (opcao != 9) {
                opcao = Leitura.entradaDados(Leitura.Tipo.MENU);

                switch (opcao) {
                    case 1:
                        repetir = "sim";
                        while(repetir.equals("sim")) {
                            Passeio carro = new Passeio();
                            System.out.println("Cadastro de Veículo de Passeio");
                            System.out.println();
                            System.out.print("Entre a placa: ");
                            carro.setPlaca(Leitura.entradaDados(Leitura.Tipo.STRING));
                            try {
                                buscaVeiculo(bancoDados, carro.getPlaca(), false);
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
                            List<Passeio> listaPasseio = bancoDados.getListaPasseio();
                            listaPasseio.add(carro);
                            bancoDados.setListaPasseio(listaPasseio);
                            System.out.println("Carro " + carro.getPlaca() + " cadastrado!");
                            System.out.println("Deseja cadastrar outro veículo? Sim/Não");
                            repetir = Leitura.entradaDados(Leitura.Tipo.STRING);
                            repetir = repetir.toLowerCase();
                        }
                        break;
                    case 2:
                        repetir = "sim";
                        while(repetir.equals("sim")) {
                            Carga carga = new Carga();
                            System.out.println("Cadastro de Veículo de Carga");
                            System.out.println();
                            System.out.print("Entre a placa: ");
                            carga.setPlaca(Leitura.entradaDados(Leitura.Tipo.STRING));
                            try {
                                buscaVeiculo(bancoDados, carga.getPlaca(), false);
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

                            List<Carga> listaCarga = bancoDados.getListaCarga();
                            listaCarga.add(carga);
                            bancoDados.setListaCarga(listaCarga);

                            System.out.println("Carro " + carga.getPlaca() + " cadastrado!");
                            System.out.println("Deseja cadastrar outro veículo? Sim/Não");
                            repetir = Leitura.entradaDados(Leitura.Tipo.STRING);
                            repetir = repetir.toLowerCase();
                        }
                        break;
                    case 3:
                        System.out.println("Veículos de Passeio Cadastrados: ");
                        System.out.println();
                        bancoDados.getListaPasseio().forEach(passeio -> {
                            passeio.imprimeDados();
                            System.out.println();
                        });
                        break;
                    case 4:
                        System.out.println("Veiculos de Carga Cadastrados");
                        System.out.println();
                        bancoDados.getListaCarga().forEach(carga -> {
                            carga.imprimeDados();
                            System.out.println();
                        });
                        break;
                    case 5:
                        System.out.print("Digite a placa do veículo de passeio que deseja buscar: ");
                        String buscaPasseio = Leitura.entradaDados(Leitura.Tipo.STRING);
                        try {
                            Passeio resultadoBuscaPasseio = (Passeio) buscaVeiculo(bancoDados, buscaPasseio, true);
                            resultadoBuscaPasseio.imprimeDados();
                            break;
                        } catch (Exception | VeicExistException e) {
                            System.out.println("Veiculo não encontrado");
                            break;
                        }
                    case 6:
                        System.out.print("Digite a placa do veículo de carga que deseja buscar: ");
                        String buscaCarga = Leitura.entradaDados(Leitura.Tipo.STRING);
                        try {
                            Carga resultadoBuscaCarga = (Carga) buscaVeiculo(bancoDados, buscaCarga, true);
                            resultadoBuscaCarga.imprimeDados();
                            break;
                        } catch (Exception | VeicExistException e) {
                            System.out.println("Veiculo não encontrado");
                            break;
                        }
                    case 7:
                        System.out.print("Digite a placa do veículo de carga que deseja excluir: ");
                        String excluiPasseio = Leitura.entradaDados(Leitura.Tipo.STRING);
                        bancoDados = excluiVeiculo(excluiPasseio, bancoDados);
                    case 8:
                        System.out.print("Digite a placa do veículo de carga que deseja excluir: ");
                        String excluiCarga = Leitura.entradaDados(Leitura.Tipo.STRING);
                        bancoDados = excluiVeiculo(excluiCarga, bancoDados);
                }
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante a execução do programa!");
            e.printStackTrace();
        }

        System.out.println("Obrigado por usar nosso Sistema!");

    }
}
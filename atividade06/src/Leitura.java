package br.edu.utfpr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
    public enum Tipo {
        STRING,
        FLOAT,
        INTEGER,
        MENU
    }

    public static <T> T entradaDados(Tipo tipo) throws Exception {
        String escolha = "";
        Integer opcao = 0;
        var entrada = new BufferedReader(new InputStreamReader(System.in));
        var menu = """
                        Sistema de Gestão de Veículos - Menu Inicial
                                                 
                        \t1. Cadastrar Veículo de Passeio
                        \t2. Cadastrar Veículo de Carga
                        \t3. Imprimir Todos os Veículos de Passeio
                        \t4. Imprimir Todos os Veículos de Carga
                        \t5. Imprimir Veículo de Passeio pela Placa
                        \t6. Imprimir Veículo de Carga pela Placa
                        \t7. Sair do Sistema
                        """;


        switch (tipo) {
            case MENU:
                System.out.println(menu);
                System.out.print("Digite a opção escolhida: ");

                try {
                    escolha = entrada.readLine();
                    opcao = Integer.parseInt(escolha);
                    if(opcao < 1 || opcao > 7){
                        throw new NumberFormatException();
                    }
                } catch (IOException error) {
                    System.out.println("Erro de entrada.");
                    error.printStackTrace();
                    System.exit(0);
                } catch (NumberFormatException error) {
                    System.out.println("Você digitou \"" + escolha + "\" porém, isso não é uma opção válida (as escolhas são de 1-7)");
                    System.exit(0);
                }

                return (T) opcao;

            case STRING:
                String leitura = entrada.readLine();
                return (T) leitura;

            case INTEGER:
                Integer numero = 0;
                try {
                     numero = Integer.parseInt(entrada.readLine());
                } catch (NumberFormatException erro) {
                    System.out.println("Você digitou um valor que não pode ser convertido para" +
                            " inteiro na entrada de dados.");
                    erro.printStackTrace();
                    System.exit(0);
                }
                return (T) numero;

            case FLOAT:
                Float decimal = 0f;
                try {
                    decimal = Float.parseFloat(entrada.readLine());
                } catch (NumberFormatException erro) {
                    System.out.println("Você digitou um valor que não pode ser convertido para" +
                            " float na entrada de dados.");
                    erro.printStackTrace();
                    System.exit(0);
                }
                return (T) decimal;
            default:
                throw new Exception("Opção Inválida");
        }
    }
}

package Exercicio_14Pensionato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        Pessoa[] pensionato = new Pessoa[10];

        do {
            System.out.println("O que o senhor deseja fazer? ");
            System.out.println("1 - Alugar um quarto");
            System.out.println("2 - Informações sobre quartos ocupado");
            System.out.println("3 - Sair do menu");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Escolha o número do seu quarto. De 0 a 9");
                    int quarto = scanner.nextInt();
                    scanner.nextLine();

                    if (pensionato[quarto] == null){
                        System.out.println("Digite seu nome: ");
                        String nome = scanner.nextLine();

                        System.out.println("Digite seu e-mail: ");
                        String email = scanner.nextLine();

                        Pessoa pessoa = new Pessoa(nome, email);
                        pensionato[quarto] = pessoa;
                    }else {
                        System.out.println("Quarto ocupado");
                    }

                    break;
                case 2:
                    System.out.println("Qual número o senhor tem interesse em saber as informações. De 0 a 9");
                    int quartoInformacao = scanner.nextInt();
                    if (pensionato[quartoInformacao] != null){
                        System.out.println("Dados do ocupante: ");
                        System.out.println("Nome:" + pensionato[quartoInformacao].getNome());
                        System.out.println("E-mail:" + pensionato[quartoInformacao].getEmail());

                    }else {
                        System.out.println("este quarto está livre para ocupamento");
                    }

                    break;
                case 3:
                    continuar = false;
                    System.out.println("Encerrando menu...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (continuar);
    }
}

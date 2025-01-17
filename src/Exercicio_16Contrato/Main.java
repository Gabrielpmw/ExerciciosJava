package Exercicio_16Contrato;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Trabalhador> trabalhadoresRegistrado = new ArrayList();
        boolean loopDo = true;

        label43:
        do {
            System.out.println("1 - Registrar");
            System.out.println("2 - Adicionar contrato");
            System.out.println("3 - Remover contrato");
            System.out.println("4 - Calcular renda por contrato");
            System.out.println("5 - Fechar");
            System.out.print("Escolha uma opção: ");
            Integer opcao = scanner.nextInt();
            scanner.nextLine();
            boolean encontrado;
            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeFuncionario = scanner.nextLine();
                    System.out.print("Salário base: ");
                    Double baseSalarial = scanner.nextDouble();
                    scanner.nextLine();
                    Trabalhador trabalhador = new Trabalhador(nomeFuncionario, NivelTrabalho.SENIOR, baseSalarial);
                    trabalhadoresRegistrado.add(trabalhador);
                    System.out.println("Trabalhador registrado.");
                    break;
                case 2:
                    System.out.print("Qual funcionário irá adicionar contrato: ");
                    String funcionarioNome = scanner.nextLine();
                    encontrado = false;
                    Iterator var14 = trabalhadoresRegistrado.iterator();

                    while(var14.hasNext()) {
                        Trabalhador trabalhador1 = (Trabalhador)var14.next();
                        if (funcionarioNome.equals(trabalhador1.getNome())) {
                            trabalhador1.adicionarContrato();
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Funcionário não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Opção de remover contrato ainda não implementada.");
                    break;
                case 4:
                    System.out.print("Qual funcionário irá calcular a renda: ");
                    String funcionarioRenda = scanner.nextLine();
                    boolean encontrar = false;
                    Iterator var12 = trabalhadoresRegistrado.iterator();

                    Trabalhador trabalhador1;
                    do {
                        if (!var12.hasNext()) {
                            continue label43;
                        }

                        trabalhador1 = (Trabalhador)var12.next();
                    } while(!funcionarioRenda.equals(trabalhador1.getNome()));

                    trabalhador1.calcularRenda();
                    encontrado = true;
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    loopDo = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while(loopDo);

        scanner.close();
    }
}

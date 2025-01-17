package Exercicio_15AumentoSalario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        boolean idExistente;

        System.out.println("Quantos funcionario irá registrar? ");
        int quantFuncionario = scanner.nextInt();
        scanner.nextLine();

        for (int x = 0; x < quantFuncionario; x++) {
            System.out.println("Qual o nome? ");
            String nome = scanner.nextLine();

            System.out.println("Qual o salário? ");
            Double salario = scanner.nextDouble();


            Integer identificador;
            do {
                System.out.println("Qual o identificador? ");
                identificador = scanner.nextInt();
                scanner.nextLine();

                idExistente = false;
                for (Funcionario funcionario : funcionarios) {
                    if (funcionario.getId().equals(identificador)) {
                        System.out.println("Identificador já está atribuido a funcionário.");
                        return;
                    }
                }
            } while (idExistente);
            Funcionario funcionario = new Funcionario(nome, salario, identificador);
            funcionarios.add(funcionario);
        }

        System.out.println("Funcionários cadastrados com sucesso. Confira: ");
        for (Funcionario funcionario : funcionarios){
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Id: " + funcionario.getId());
        }

        System.out.println("Digite o identificador do funcionario que irá aumentar o salário: ");
        Integer promocao = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Quantos porcento? ");
        Integer porcentagem = scanner.nextInt();
        scanner.nextLine();

        Funcionario funcionarioPromovido = null;
        for (Funcionario funcionario : funcionarios){
            if (funcionario.getId().equals(promocao)){
                funcionarioPromovido = funcionario;
                break;
            }else {
                System.out.println("Funcionário inexistente");
            }
        }

        funcionarioPromovido.setSalario(funcionarioPromovido.getSalario() * (1 + porcentagem / 100.0));

        System.out.println("Reajuste de salário do funcionário " + funcionarioPromovido.getNome());
        System.out.println("Nome: " + funcionarioPromovido.getNome());
        System.out.println("Salário: " + funcionarioPromovido.getSalario());
        System.out.println("Id: " + funcionarioPromovido.getId());
    }
}

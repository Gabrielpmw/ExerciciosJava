package Exercicio_16Contrato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        String nomeFuncionario = scanner.nextLine();

        System.out.println("Level: ");
        String status = scanner.nextLine();

        System.out.println("Salário base: ");
        Double baseSalario = scanner.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeFuncionario, status, baseSalario);

        
    }
}

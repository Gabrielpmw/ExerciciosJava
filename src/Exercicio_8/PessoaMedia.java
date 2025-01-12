package Exercicio_8;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class PessoaMedia {
    public void relatorioPessoa(){
        Scanner scanner = new Scanner(System.in);
        int tamanhoVetor;
        System.out.println("Quantas pessoas serão? ");
        tamanhoVetor = scanner.nextInt();

        String[] nome = new String[tamanhoVetor];
        int[] idade = new int[tamanhoVetor];
        double[] altura = new double[tamanhoVetor];
        double alturaMedia = 0;

        scanner.nextLine();

        for (int x = 0; x < tamanhoVetor; x++){
            System.out.println("Nome: ");
            nome[x] = scanner.nextLine();

            System.out.println("Idade: ");
            idade[x] = scanner.nextInt();

            System.out.println("Altura: ");
            altura[x] = scanner.nextDouble();

            scanner.nextLine();

            alturaMedia += altura[x];
        }

        alturaMedia /= altura.length;
        System.out.println("Altura média das pessoas: " + alturaMedia);
    }
}

package Exercicio_8.Correcao;


/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/

import java.util.Scanner;

//  https://github.com/acenelio/curso-algoritmos/blob/master/java/alturas.java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Serão quantas pessoas? ");
        int quantidadePessoa = scanner.nextInt();
        scanner.nextLine();

        String[] nome = new String[quantidadePessoa];
        int[] idade = new int[quantidadePessoa];
        double[] altura = new double[quantidadePessoa];

        for (int x = 0; x < quantidadePessoa; x++){
            System.out.println("Nome: ");
            nome[x] = scanner.nextLine();

            System.out.println("Idade: ");
            idade[x] = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Altura: ");
            altura[x] = scanner.nextDouble();
            scanner.nextLine();
        }

        double alturaMedia = 0;
        for (int numero : idade){
            alturaMedia += numero;
        }
        System.out.println("Altura média: " + alturaMedia);

        int quantPessoaMenor = 0;
        for (int x = 0;x < quantidadePessoa; x++){
            if (idade[x] < 16){
                quantPessoaMenor++;
            }
        }
        double porcentagem = ((double) quantPessoaMenor / quantidadePessoa) * 100;

        System.out.println("Porcentagem de pessoas menores de 16: " + porcentagem + "%");
        for (int x = 0; x < quantidadePessoa; x++){
            if (idade[x] < 16){
                System.out.println(nome[x]);
            }
        }
    }
}

package Exercicio_13MaisVelho;

/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.*/

import java.util.Scanner;

//https://github.com/acenelio/curso-algoritmos/blob/master/java/mais_velho.java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanntas pessoas irão fazer o teste? ");
        int tamanhoVetor = scanner.nextInt();
        scanner.nextLine();

        String[] nomes = new String[tamanhoVetor];
        int[] idades = new int[tamanhoVetor];
        int maiorIdade = 0;
        String maisVelho = null;

        for (int x = 0; x < tamanhoVetor; x++){
            System.out.println("Digite o nome: ");
            nomes[x] = scanner.nextLine();

            System.out.println("Digite a idade: ");
            idades[x] = scanner.nextInt();
            scanner.nextLine();

            if (idades[x] > maiorIdade){
                maiorIdade = idades[x];
                maisVelho = nomes[x];
            }
        }

        System.out.println("Pessoa mais velha: " + maisVelho + " "  + maiorIdade + " anos");
    }
}

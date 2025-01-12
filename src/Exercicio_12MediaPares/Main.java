package Exercicio_12MediaPares;

/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

import java.util.Scanner;

//https://github.com/acenelio/curso-algoritmos/blob/master/java/media_pares.java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual será o tamanho do vetor? ");
        int tamanhoVetor = scanner.nextInt();

        int[] vetor = new int[tamanhoVetor];
        int somaPares = 0;
        int quantidadePares = 0;

        for (int x = 0; x < vetor.length; x++){
            System.out.println("Digite um número: ");
            int num = scanner.nextInt();
            vetor[x] = num;

            if (vetor[x] % 2 == 0){
                somaPares += vetor[x];
                quantidadePares++;
            }
        }

        if (quantidadePares == 0){
            System.out.println("Nenhum número par.");
        }else {
            somaPares /= quantidadePares;
            System.out.println("Média dos números pares: " + somaPares);
        }
    }
}

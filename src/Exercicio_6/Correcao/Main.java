package Exercicio_6.Correcao;

import java.util.Scanner;

/*
* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
* */

// https://github.com/acenelio/curso-algoritmos/blob/master/java/negativos.java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você vai digitas");
        int tamanhoVetor = scanner.nextInt();
        int[] numeros = new int[tamanhoVetor];

        for (int x = 0; x < tamanhoVetor; x++){
            System.out.println("Digite um número: " );
            numeros[x] = scanner.nextInt();
        }

        System.out.println("Números negativos: ");
        for (int x = 0; x < tamanhoVetor; x++){
            if (numeros[x] < 0){
                System.out.print(numeros[x] + " ");
            }
        }
    }
}

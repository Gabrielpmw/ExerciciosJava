package Exercicio_7.Correcao;


/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
 */

import java.util.Scanner;

//https://github.com/acenelio/curso-algoritmos/blob/master/java/soma_vetor.java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Serão quantos números? ");
        int tamanhoVetor = scanner.nextInt();
        int[] numeros = new int[tamanhoVetor];
        double  total = 0;
        for (int x = 0; x < tamanhoVetor; x++){
            System.out.println("Digite um número");
            numeros[x] = scanner.nextInt();
            total += numeros[x];
        }

        System.out.println("Valores: ");
        for (int x = 0; x < tamanhoVetor; x++){
            System.out.print(numeros[x] + " ");
        }
        System.out.println(" ");
        System.out.println("Soma total dos números: " + total);

        total /= numeros.length;
        System.out.println("Média: " + total);
    }
}

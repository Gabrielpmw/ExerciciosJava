package Exercicio_10MaiorNumero;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero)*/


import java.util.Scanner;

// https://github.com/acenelio/curso-algoritmos/blob/master/java/maior_posicao.java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual será o tamanho do conjunto?");
        int[] numeros = new int[scanner.nextInt()];

        for (int x = 0; x < numeros.length; x++){
            System.out.println("Posição do número " + (x + 1) + ":");
            numeros[x] = scanner.nextInt();
        }

        int maiorNumero = numeros[0];
        for (int numero : numeros){
            if (numero >= maiorNumero){
                maiorNumero = numero;
            }
        }

        int posicao = 0;
        System.out.println("Maior número: " + maiorNumero);
        for (int x = 0; x < numeros.length; x++){
            if (numeros[x] == maiorNumero){
                System.out.println("Posição do número: " + (posicao + 1));
            }
            posicao++;
        }
    }
}

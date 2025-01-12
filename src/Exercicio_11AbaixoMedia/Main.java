package Exercicio_11AbaixoMedia;

/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/

import java.util.Scanner;

//https://github.com/acenelio/curso-algoritmos/blob/master/java/abaixo_da_media.java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor: ");
        int tamanhoVetor = scanner.nextInt();
        double media = 0;
        int[] vetor = new int[tamanhoVetor];
        for (int x = 0; x < tamanhoVetor; x++){
            System.out.println("Digite um número: ");
            vetor[x] = scanner.nextInt();
            media += vetor[x];
        }

        media /= vetor.length;
        System.out.println("Media do vetor: " + media);

        System.out.println("Elementos abaixo da media: ");
        for (int x = 0; x < tamanhoVetor; x++){
            if (vetor[x] < media){
                System.out.println(vetor[x]);
            }
        }
    }
}

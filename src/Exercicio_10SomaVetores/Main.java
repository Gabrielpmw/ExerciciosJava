package Exercicio_10SomaVetores;


/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.*/

import java.util.Scanner;

//https://github.com/acenelio/curso-algoritmos/blob/master/java/soma_vetores.java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual será o tamanho dos dois vetores?");
        int tamanhoVetor = scanner.nextInt();
        int[] vetorA = new int[tamanhoVetor];
        int[] vetorB = new int[tamanhoVetor];
        int[] vetorTotal = new int[tamanhoVetor];

        System.out.println("Vamos decidir o tamanho os números do vetor A");
        for (int x = 0; x < tamanhoVetor; x++){
            System.out.println("Digite um número: ");
            vetorA[x] = scanner.nextInt();
        }

        System.out.println("Vamos decidir o tamanho os números do vetor B");
        for (int x = 0; x < tamanhoVetor; x++){
            System.out.println("Digite um número: ");
            vetorB[x] = scanner.nextInt();
        }
        System.out.println("Valores dos vetores: ");
        for (int numero : vetorA){
            System.out.print(numero + " ");
        }

        System.out.println();

        for (int numero : vetorB){
            System.out.print(numero + " ");
        }

        for (int x = 0; x < tamanhoVetor; x++){
            vetorTotal[x] = vetorA[x] + vetorB[x];
        }

        System.out.println();

        System.out.println("Soma dos valores entre os vetores: ");
        for (int numero : vetorTotal){
            System.out.print(numero + " ");
        }
    }
}

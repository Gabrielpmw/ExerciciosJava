package Exercicio_7;

import java.util.Scanner;

public class Soma_vetor {
    private int n;
    private int[] vetor;
    Scanner scanner = new Scanner(System.in);

    public void somaVetor(int n){
        this.n = n;
        vetor = new int[n];

        for (int x = 0; x < vetor.length; ++x){
            System.out.print("Digite um número: ");
            vetor[x] = scanner.nextInt();
        }
        System.out.println();

        System.out.print("Valores: ");
        for (int numero : vetor){
            System.out.print(numero + " ");
        }

        System.out.println();

        int soma = 0;
        System.out.print("Soma de todos os valores: ");
        for (int numero : vetor){
            soma += numero;
        }
        System.out.print(soma + " ");
        System.out.println(" ");


        soma /= vetor.length;
        System.out.println("Média: " + soma);
    }
}

package Exercicio_9NumerosPares;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Será quantos números? ");
        int quantidadeNumero = scanner.nextInt();

        int[] numeros = new int[quantidadeNumero];
        int quantipares = 0;

        for (int x = 0; x < quantidadeNumero; x++){
            System.out.println("Digite um número: ");
            numeros[x] = scanner.nextInt();;
            if (numeros[x] % 2 == 0){
                quantipares++;
            }
        }

        System.out.println("Números pares: ");
        for (int x = 0; x < quantidadeNumero; x++){
            if (numeros[x] % 2 == 0){
                System.out.print(numeros[x] + " ");
            }
        }
        System.out.println("Quantidade de números pares: " + quantipares);
    }
}

/*
* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos
* */

package Exercicio_6.Dominio;

import java.util.Scanner;

public class Numeros {
    protected static int[] numeros = new int[9];
    protected static int[] negativos = new int[9];

    public static void numerosNegativos(){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            int num = scanner.nextInt();
            numeros[i] = num;
            if (numeros[i] < 0){
                negativos[i] = numeros[i];
            }
        }

        for(int numeros : negativos){
            System.out.println(numeros);
        }
    }

    //ChatGpt

    public static void numerosNegativos2() {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            int num = scanner.nextInt();
            numeros[i] = num;
            if (numeros[i] < 0) {
                negativos[contador] = numeros[i];
                contador++;
            }
        }

        System.out.println("Números negativos:");
        for (int i = 0; i < contador; i++) {
            System.out.println(negativos[i]);
        }
    }

    public static void main(String[] args) {
        numerosNegativos();
    }
}

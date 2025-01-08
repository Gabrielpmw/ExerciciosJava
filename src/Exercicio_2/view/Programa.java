package Exercicio_2.view;

import Exercicio_2.dominio.Funcioario;

public class Programa {
    public static void main(String[] args) {
        Funcioario funcioario = new Funcioario("Gabriel Vieira Ribeiro", 6000, 1000);
        funcioario.exibirInformacao();
        funcioario.aumentarSalario(10);
    }
}

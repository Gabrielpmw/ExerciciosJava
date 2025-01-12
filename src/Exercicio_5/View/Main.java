package Exercicio_5.View;

import Exercicio_5.Dominio.Conta;
import Exercicio_5.Servico.ServicoBanco;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Gabriel Vieira Ribeiro", 123, 500);

        ServicoBanco.depositar(conta, 200);
        ServicoBanco.saque(conta, 300);

    }
}

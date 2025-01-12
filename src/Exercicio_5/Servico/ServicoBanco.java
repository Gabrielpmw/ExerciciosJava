package Exercicio_5.Servico;

import Exercicio_5.Dominio.Conta;

public class ServicoBanco {
    public static void exibirInformacao(Conta conta){
        System.out.println("Nome do titular: " + conta.getNome());
        System.out.println("Número de acesso: " + conta.getNumeroAcesso());
        System.out.println("Depósito atual: " + conta.getDepositoInicial());
    }

    public static void saque(Conta conta, double valor){
        double deposito = conta.getDepositoInicial() - 5;
        deposito -= valor;
        conta.setDepositoInicial(deposito);
        exibirInformacao(conta);
    }

    public static void depositar(Conta conta, double valor){
        double deposito = conta.getDepositoInicial();
        deposito += valor;
        conta.setDepositoInicial(deposito);
        exibirInformacao(conta);
    }
}

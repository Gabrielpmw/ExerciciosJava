package Exercicio_5.Dominio;

public class Conta {
    private String nome;
    private int numeroAcesso;
    private double depositoInicial;

    public Conta(String nome, int numeroAcesso, double depositoInicial) {
        this.nome = nome;
        this.numeroAcesso = numeroAcesso;
        this.depositoInicial = depositoInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroAcesso() {
        return numeroAcesso;
    }


    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }
}

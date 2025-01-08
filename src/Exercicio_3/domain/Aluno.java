package Exercicio_3.domain;

public class Aluno {
    public String nome;
    public double[] notas = new double[3];
    public double total;

    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public void situacaoAluno(){
        for (double notasAluno : notas){
            total += notasAluno;
        }

        double missing = 60 - total;

        if (total >= 60){
            System.out.println("Nota total: " + this.total);
            System.out.println("Situação: PASS" );
        }else {
            System.out.println("Nota total: " + this.total);
            System.out.println("Situação: FAILED");
            System.out.println("Missing: " + missing);
        }
    }
}

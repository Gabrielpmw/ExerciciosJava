package Exercicio_3.view;

import Exercicio_3.domain.Aluno;

public class Main {
    public static void main(String[] args) {
        double[] notasAluno1 = {27, 31, 32};
        double[] notasAluno2 = {17, 20, 15};

        Aluno aluno1 = new Aluno("Gabriel Vieira Ribeiro", notasAluno1);
        Aluno aluno2 = new Aluno("Milena Almeida Alves da Silva", notasAluno2);

        aluno1.situacaoAluno();
        System.out.println();
        aluno2.situacaoAluno();
    }
}

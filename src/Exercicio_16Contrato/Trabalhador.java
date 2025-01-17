package Exercicio_16Contrato;

import java.util.ArrayList;
import java.util.Scanner;

public class Trabalhador {
    private String nome;
    private String nivelTrabalho;
    private Double salarioBase;
    private ArrayList<ContratoHora> contratos = new ArrayList<ContratoHora>();

    Scanner scanner = new Scanner(System.in);

    public Trabalhador(String nome, String nivelTrabalho, Double salarioBase) {
        this.nome = nome;
        this.nivelTrabalho = nivelTrabalho;
        this.salarioBase = salarioBase;
    }

    public void adicionarContrato(){
        System.out.println("Quantos contratos o senhor irá adicionar? ");
        Integer quantidadeContrato = scanner.nextInt();
        scanner.nextLine();


        for (int x = 0; x < quantidadeContrato; x++){
            System.out.println("Ano do contrato: ");
            Integer anoContrato = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Mês do contrato: ");
            Integer mesContrato = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Valor por hora: ");
            Double horaValor = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Quantidade de horas: ");
            Integer quantidadeHoras = scanner.nextInt();
            scanner.nextLine();

            ContratoHora contrato = new ContratoHora(anoContrato, mesContrato, horaValor, quantidadeHoras);
            contratos.add(contrato);
        }
        System.out.println("Contrato adicionado com sucesso");
    }

    public void removerContrato(){
        System.out.println("Ano do contrato: ");
        Integer anoContrato = scanner.nextInt();

        System.out.println("Mês do contrato: ");
        Integer mesContrato = scanner.nextInt();

        for (int x = 0; x < contratos.size(); x++){
            ContratoHora contrato = contratos.get(x);
            if (contrato.getAno().equals(anoContrato) && contrato.getMes().equals(mesContrato)){
                contratos.remove(x);
                System.out.println("Contrato removido com sucessor");
                return;
            }
        }
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivelTrabalho() {
        return nivelTrabalho;
    }

    public void setNivelTrabalho(String nivelTrabalho) {
        this.nivelTrabalho = nivelTrabalho;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public ArrayList<ContratoHora> getContratos() {
        return contratos;
    }

    public void setContratos(ArrayList<ContratoHora> contratos) {
        this.contratos = contratos;
    }
}

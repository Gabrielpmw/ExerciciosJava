package Exercicio_16Contrato;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Trabalhador {
    private String nome;
    private NivelTrabalho nivel;
    private Double salarioBase;
    private ArrayList<ContratoHora> contratos = new ArrayList();
    Scanner scanner;

    public Trabalhador(String nom, NivelTrabalho nivel, Double salarioBas) {
        this.scanner = new Scanner(System.in);
        this.nome = nom;
        this.nivel = nivel;
        this.salarioBase = salarioBas;
    }

    public Trabalhador() {
        this.scanner = new Scanner(System.in);
    }

    public void adicionarContrato() {
        System.out.println("Quantos contrato irá adicionar? ");
        Integer quantContrato = this.scanner.nextInt();

        for(int x = 0; x < quantContrato; ++x) {
            System.out.println("Ano: ");
            Integer anoContrato = this.scanner.nextInt();
            this.scanner.nextLine();
            System.out.println("Mês: ");
            Integer mesContrato = this.scanner.nextInt();
            this.scanner.nextLine();
            System.out.println("Valor por hora: ");
            Double valorHora = this.scanner.nextDouble();
            this.scanner.nextLine();
            System.out.println("Quantidade de horas: ");
            Integer horaMes = this.scanner.nextInt();
            this.scanner.nextLine();
            ContratoHora contrato = new ContratoHora(anoContrato, mesContrato, valorHora, horaMes);
            this.contratos.add(contrato);
        }

        System.out.println("Processo conclu[ido");
    }

    public void calcularRenda() {
        new ContratoHora();
        System.out.println("Ano do contrato: ");
        Integer anoCalculo = this.scanner.nextInt();
        this.scanner.nextLine();
        System.out.println("Mês do contrato: ");
        Integer mesCalculo = this.scanner.nextInt();
        this.scanner.nextLine();
        Iterator var4 = this.contratos.iterator();

        while(var4.hasNext()) {
            ContratoHora contratoHora = (ContratoHora)var4.next();
            if (anoCalculo.equals(contratoHora.getAno()) && mesCalculo.equals(contratoHora.getMes())) {
                Double valorTotal = contratoHora.calcularRenda();
                this.salarioBase = this.salarioBase + valorTotal;
                this.exibirInformacao();
                System.out.println("Reajuse de salário para: " + this.salarioBase);
            }
        }

    }

    public void exibirInformacao() {
        System.out.println("Nome: " + this.nome);
        System.out.println("N[ivel de trabalho: " + String.valueOf(NivelTrabalho.SENIOR));
        System.out.println("Salário base: " + this.salarioBase);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nom) {
        this.nome = nom;
    }

    public NivelTrabalho getNivel() {
        return this.nivel;
    }

    public void setNivel(NivelTrabalho nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBas() {
        return this.salarioBase;
    }

    public void setSalarioBas(Double salarioBas) {
        this.salarioBase = salarioBas;
    }
}
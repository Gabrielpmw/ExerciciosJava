package Exercicio_2.dominio;

public class Funcioario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public Funcioario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public double calcularSalarioLiquido(){
        return salarioBruto - imposto;
    }

    public void exibirInformacao(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário líquido: " + calcularSalarioLiquido());
    }

    public void aumentarSalario(int porcentagem){
        double aumento = salarioBruto * porcentagem / 100;
        salarioBruto += aumento;
        System.out.println("Reajuste de salário em: " + porcentagem + "%");
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário bruto: " + this.salarioBruto);
        System.out.println("Salário líquido: " + calcularSalarioLiquido());
    }
}

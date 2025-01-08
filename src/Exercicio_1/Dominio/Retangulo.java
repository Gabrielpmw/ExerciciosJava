package Exercicio_1.Dominio;

public class Retangulo {
    public double altura;
    public double comprimento;

    public void calcularArea(double altura, double comprimento){
        double area = altura * comprimento;
        System.out.println("Área retângulo: " + area);
    }

    public void calcularPerimetro(double altura, double comprimento){
        double perimetro = 2 * (altura + comprimento);
        System.out.println("Perímetro retângulo: " + perimetro);
    }

    public void calcularDiagonal(double altura, double comprimento){
        double diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(comprimento, 2));
        System.out.println("Diagonal retângulo: " + diagonal);
    }

    public void calcularRetangulo(double altura, double comprimento){
        calcularArea(altura, comprimento);
        calcularPerimetro(altura, comprimento);
        calcularDiagonal(altura, comprimento);
    }
}

package Exercicio_4;

public class CotacaoDolar {
    private static final double dollar = 3.10;

    public static void calcularDolar(double quantidadeDolar){
        double valorReais = quantidadeDolar * dollar * (1 + 0.06);
        System.out.println("Valor a ser pago por " + quantidadeDolar + " dólares é de " + valorReais + "R$");
    }
}

package Exercicio_16Contrato;

public class ContratoHora {
    private Integer ano;
    private Integer mes;
    private Double valorHora;
    private Integer hora;

    public ContratoHora(Integer ano, Integer mes, Double valorHora, Integer hora) {
        this.ano = ano;
        this.mes = mes;
        this.valorHora = valorHora;
        this.hora = hora;
    }

    public ContratoHora() {
    }

    public double calcularRenda() {
        return this.valorHora * (double)this.hora;
    }

    public double valorTotal() {
        return this.valorHora * (double)this.hora;
    }

    public Integer getAno() {
        return this.ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getMes() {
        return this.mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Double getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getHora() {
        return this.hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }
}

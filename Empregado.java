package com.mycompany.pooempregado;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    
    Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return this.salarioMensal;
    }
    
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    public double salarioAnual() { // retorna valor do salário anual (salário anual * mensal);
        return this.salarioMensal * 12;
    }
    
    public void aumentoSalarial() { // realiza acão de aumentar o salário mensal em 10% -- sem retorno
        this.salarioMensal = this.salarioMensal * 0.10 + this.salarioMensal;
    }
}

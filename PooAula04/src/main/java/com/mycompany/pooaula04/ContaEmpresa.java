package com.mycompany.pooaula04;

public class ContaEmpresa extends Conta {
    private double emprestimoLimite;
    
    public ContaEmpresa(int codigo, String titular, double saldo, double limite) {
        //super.setCodigo(codigo); // super para acessar os atributos de Conta herdados
        //super.setTitular(titular);
        //super.setSaldo(saldo);
        super(codigo, titular, saldo); // atributos da superclasse
        this.emprestimoLimite = limite;
    }

    public double getEmprestimoLimite() {
        return emprestimoLimite;
    }

    public void setEmprestimoLimite(double emprestimoLimite) {
        this.emprestimoLimite = emprestimoLimite;
    }
}

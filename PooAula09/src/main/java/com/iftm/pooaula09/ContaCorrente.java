package com.iftm.pooaula09;


public class ContaCorrente extends Conta{
    private double taxaTransacao;

    public ContaCorrente(double taxaTransacao, int numero, String titular, double saldo) {
        super(numero, titular, saldo);
        this.taxaTransacao = taxaTransacao;
    }
    
    

    public double getTaxaTransacao() {
        return taxaTransacao;
    }

    public void setTaxaTransacao(double taxaTransacao) {
        this.taxaTransacao = taxaTransacao;
    }
    
    public void depositar() {
        
    }
    
    
    public void sacar() {
        
    }
}

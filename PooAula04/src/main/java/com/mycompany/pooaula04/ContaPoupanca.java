package com.mycompany.pooaula04;

public class ContaPoupanca extends Conta {
    private double taxaJuros;
    
    public ContaPoupanca(int codigo, String titular, double saldo, double taxaJuros) {
        super(codigo, titular, saldo);
        this.setTaxaJuros(taxaJuros);
    }
    
    public double getTaxaJuros() {
        return this.taxaJuros;
    }
    
    //Métodos abstratos
    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }
    
    @Override
    public void sacar(double valor) {
        this.setSaldo(this.getSaldo() - valor);
    }
    
    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
    public void atualizarSaldo(double saldo) {
        this.setSaldo(this.getSaldo() + saldo);
    }
}

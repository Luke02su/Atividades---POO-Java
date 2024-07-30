package com.iftm.pooaula09;

public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(double rendimento, int numero, String titular, double saldo) {
        super(numero, titular, saldo);
        this.rendimento = rendimento;
    }
    
    
    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
  
    
    @Override
    public void depositar() {
        
    }
    
    
    public void sacar() {
        
    }
}

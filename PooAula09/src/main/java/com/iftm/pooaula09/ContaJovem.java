package com.iftm.pooaula09;

public class ContaJovem extends Conta implements ContaRestrita { // implemetar mais de uma interface, passar vírgula
    private String beneficiario;

    public ContaJovem(String beneficiario, int numero, String titular, double saldo) {
        super(numero, titular, saldo);
        this.beneficiario = beneficiario;
    }
    
    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }
    
    @Override
    public void depositar() {
        
    }
    
    @Override
    public void sacar() {
    
    }
    
    @Override
    public void saqueEspecial() {
        
    }
}

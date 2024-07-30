package com.iftm.pooaula09;

public class ContaPagamentos extends Conta implements ContaRestrita {
    private String nomeEmpresa;

    public ContaPagamentos(String nomeEmpresa, int numero, String titular, double saldo) {
        super(numero, titular, saldo);
        this.nomeEmpresa = nomeEmpresa;
    }
    
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
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

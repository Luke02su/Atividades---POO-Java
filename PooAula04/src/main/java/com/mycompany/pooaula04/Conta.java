package com.mycompany.pooaula04;

public class Conta {
    private int codigo;
    private String titular;
    private double saldo;
    
    public Conta() {
    
    }; // construtor vazio para usar na ContaEmpresa (Java já faz isso automático)

   public Conta(int codigo, String titular, double saldo) { // este construtor sobreescreve o vazio
        this.codigo = codigo;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }
    
    public void sacar(double valor) {
        this.setSaldo(this.getSaldo() - valor);
    }   
}

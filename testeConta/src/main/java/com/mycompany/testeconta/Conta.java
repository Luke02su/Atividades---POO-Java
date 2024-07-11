package com.mycompany.testeconta;

public class Conta {
    private int codigo;
    private String titular;
    private double saldo;

    public Conta(int codigo, String titular, double saldo) {
        this.codigo = codigo;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(int valor) {
        this.setSaldo(this.getSaldo() + valor);
    }
    
    public void sacar(int valor) {
        if (this.getSaldo() <= valor) {
            this.setSaldo(this.getSaldo() - valor);
        }
    }
    
    public void imprimir() {
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Titular: " + this.getTitular());
        System.out.println("saldo: " + this.getSaldo());
    }
}

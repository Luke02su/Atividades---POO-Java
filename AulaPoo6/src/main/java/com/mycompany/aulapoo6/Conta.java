package com.mycompany.aulapoo6;

public class Conta { // para gerar class statict todos os atributos e métodos devem ser estáticos, não gera objeto
    private static int numTotalContas = 0; // atributo estático (não é mais do objeto x instanciado, mas da classe toda). Quando fizer uma modificação neste objeto x, os demais também serão modificados.
    private String titular;
    private double saldo;
    public static final String NOME_BANCO = "NuBank"; // statict e não poderá ser alterado. Valor final do atributo. Não necessariamente preisa ser estático. Quando é final usa esse tipo de nomenclatura.

    public Conta(String titular, double saldo) { // construtor não pediu para preencher numTotalcontas
        this.titular = titular;
        this.saldo = saldo;
        numTotalContas++;
    }

    public int getNumTotalContas() {
        return numTotalContas;
    }

    public void setNumTotalContas(int numTotalContas) {
        this.numTotalContas = numTotalContas;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public static void totalContas() { // método da classe
        System.out.println("Total de contas: " + numTotalContas);
    }
    
    
}

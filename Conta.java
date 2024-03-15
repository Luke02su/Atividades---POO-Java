package atividade2;

public class Conta {
    private int numero;
    private String titular;
    private double valor;

    public Conta(int numero, String titular, double valor) {
        this.numero = numero;
        this.titular = titular;
        this.valor = valor;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getTitular() {
        return this.titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getValor() {
        return this.valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
}
    

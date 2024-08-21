package com.mycompany.testeconta;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(int codigo, String titular, double saldo, double taxaJuros) {
        super(codigo, titular, saldo);
        this.taxaJuros = taxaJuros;
    }
    
    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
    @Override
    public void imprimir() { // Polimorfismo de sobreposição
        super.imprimir();
        System.out.println("Taxa de juros: " + this.getTaxaJuros());
    }
    
    public void gerarRendimento() { // Polimorfismo de sobrecarga
        super.setSaldo(super.getSaldo() + (super.getSaldo() * this.getTaxaJuros()));
    }
    
    public void gerarRendimento(double taxa) {  // Polimorfismo de sobrecarga
        super.setSaldo(super.getSaldo() + (super.getSaldo() * taxa));
    }
    
    public void gerarRendimento(int porcentagem) {  // Polimorfismo de sobrecarga
        super.setSaldo(super.getSaldo() + (super.getSaldo() * ((double) (porcentagem / 100.00)))); // casting -> convertendo para double = porcentagem / 100.00
    }
}

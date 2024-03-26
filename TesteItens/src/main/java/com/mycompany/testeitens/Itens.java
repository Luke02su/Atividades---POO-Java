package com.mycompany.testeitens;

public class Itens {
    private String numero;
    private String descricao;
    private int qtd; 
    private double preco;

    public Itens(String numero, String descricao, int qtd, double preco) {
       this.setNumero(numero);
       this.setDescricao(descricao);
       this.setQtd(qtd);
       this.setPreco(preco);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        if(qtd > 0) {
            this.qtd = qtd;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco >= 0) {
            this.preco = preco;
        } 
    }
    
    public double getTotalItens() {
        return getPreco() * getQtd();
    }
    
    public void aumentarQuantidade(int qtd) {
        if(qtd > 0) {
            this.setQtd(this.getQtd() + qtd);
            System.out.println("Quantidade aumentada: " + this.getQtd());
        } else {
            System.out.println("A quantidade acrescentada deve ser maior que 0: " + qtd);
        }
    }
    
    public void diminuirQuantidade(int qtd) {
        if(this.getQtd() - qtd > 0) {
            this.setQtd(this.getQtd() - qtd);
            System.out.println("Quantidade diminuída: " + this.getQtd());
        } else {
            System.out.println("A quantidade deve ser maior que 1: " + (this.getQtd() - qtd));
        }
    }
    
}
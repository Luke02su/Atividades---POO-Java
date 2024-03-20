package com.mycompany.testeitens;

public class Itens {
    private String numero;
    private String descricao;
    private int qtd; 
    private double preco;
    
    public Itens(String numero, String descricao, int qtd, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtd = qtd;
        this.preco = preco;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int getQtd() {
        return this.qtd;
    }
    
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double getTotalItens() {
        return this.qtd * this.preco;
    }
    
    public void aumentarQuantidade(int qtd) {
        if(qtd > 0) {
            this.qtd += qtd;
        } else {
            System.out.println("Aumentar: quantidade deve ser maior que 1 para algum dos três itens.\n");
        }
    }
    
    public void diminuirQuantidade(int qtd) {
        if(this.qtd - qtd >= 0) {
            this.qtd -= qtd;
        } else {
            System.out.println("Diminuir: quantidade deve ser maior que 0 para algum dos três itens.\n");
        }
    }
}

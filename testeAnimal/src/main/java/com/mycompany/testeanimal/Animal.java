package com.mycompany.testeanimal;

public abstract class Animal {
    private String cor;
    private int qtdPatas;
    private int qtdOlhos;
    private String alimentacao;
    private int idade;
    
    public Animal(String cor, int qtdPatas, int qtdOlhos, String alimentacao, int idade) {
        this.setCor(cor);
        this.setQtdPatas(qtdPatas);
        this.setQtdOlhos(qtdOlhos);
        this.setAlimentacao(alimentacao);
        this.setIdade(idade);
    }

    public abstract void locomover ();
    
    public abstract void comer ();
    
    public abstract void emitirSom ();
    
    public abstract void imprimirCaracteristicas();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }

    public int getQtdOlhos() {
        return qtdOlhos;
    }

    public void setQtdOlhos(int qtdOlhos) {
        this.qtdOlhos = qtdOlhos;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

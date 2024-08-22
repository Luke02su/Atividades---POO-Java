package com.mycompany.lsd.ava2;

public class Pesquisador extends Pessoa {
    private double bolsa;
    private String areaAtuacao;
    

    public Pesquisador(double bolsa, String areaAtuacao, int codigo, String nome, int cpf, char sexo) {
        super(codigo, nome, cpf, sexo);
        this.bolsa = bolsa;
        this.areaAtuacao = areaAtuacao;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Bolsa: " + this.getBolsa());
        System.out.println("Área de atuação: " + this.getAreaAtuacao());
    }
    
}

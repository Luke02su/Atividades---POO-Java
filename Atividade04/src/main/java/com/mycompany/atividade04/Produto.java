package com.mycompany.atividade04;

abstract public class Produto {
    private int codigo;
    private String nome;
    private double precoCusto;
    private int margemLucro;
    private double precoVenda;
    private String marcaVeiculo;
    private String modeloVeiculo;
    private int anoInicial;
    private int anoFinal;
    
    public Produto () {};

    public Produto(int codigo, String nome, double precoCusto, int margemLucro, double precoVenda, String marcaVeiculo, String modeloVeiculo, int anoInicial, int anoFinal) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.margemLucro = margemLucro;
        this.precoVenda = precoVenda;
        this.marcaVeiculo = marcaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.anoInicial = anoInicial;
        this.anoFinal = anoFinal;
    }
    
    //Métodos especiais
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public int getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(int margemLucro) {
        this.margemLucro = margemLucro;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
         this.precoVenda = getPrecoCusto() + (getPrecoVenda() * (getMargemLucro() / 100.00)); //O preço de venda é o preço de custo + % margem de lucro.
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public int getAnoInicial() {
        return anoInicial;
    }

    public void setAnoInicial(int anoInicial) {
        this.anoInicial = anoInicial;
    }

    public int getAnoFinal() {
        return anoFinal;
    }

    public void setAnoFinal(int anoFinal) {
        this.anoFinal = anoFinal;
    }
    
    //Método normal
    public void imprimir() {
        
    }
    //Métodos abstratos declarados
    abstract public void calcularPrecoVenda();
    
    abstract public void imprimirValorDetalhado();
}
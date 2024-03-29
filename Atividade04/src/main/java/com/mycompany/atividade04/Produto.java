package com.mycompany.atividade04;

abstract public class Produto { // classe produto abstrata (superclasse) será usada pelas subclasses peça e peça importada (herança)
    private int codigo; // abstração das características (atributos) e encapsulamento (privado)
    private String nome;
    private double precoCusto;
    private int margemLucro;
    private double precoVenda;
    private String marcaVeiculo;
    private String modeloVeiculo;
    private int anoInicial;
    private int anoFinal;
    
    public Produto () { // construtor vazio criado para ser substituído pelo construtor seguinte com parâmetros/assinaturas
    
    };

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
         this.precoVenda = precoVenda;
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
    
    //Método da própria classe
    public void imprimir() {
        System.out.println("----- PRODUTO -----");
        System.out.println("Código da peça: " + this.getCodigo());
        System.out.println("Nome da peça: " + this.getNome());
        System.out.println("Preço de  custo: R$" + this.getPrecoCusto());
        System.out.println("Margem de lucro: " + this.getMargemLucro() + "%");
        System.out.println("Preço de venda: R$" + this.getPrecoVenda());
        System.out.println("Marca do veículo: " + this.getMarcaVeiculo());
        System.out.println("Modelo do veículo: " + this.getModeloVeiculo());
        System.out.println("Ano inicial de produção: " + this.getAnoInicial());
        System.out.println("Ano final de produção: " + this.getAnoFinal());
        
        System.out.println();
    }
    //Métodos abstratos declarados
    abstract public void calcularPrecoVenda(); // polimorfismo (usado de uma forma diferente nas subclasses peça e peça importada
    
    abstract public void imprimirValorDetalhado(); // polimorfismo (usado de uma forma diferente nas subclasses peça e peça importada
}